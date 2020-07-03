package com.getstream.sdk.chat.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import com.getstream.sdk.chat.R;
import com.getstream.sdk.chat.databinding.StreamViewChannelHeaderBinding;
import com.getstream.sdk.chat.utils.LlcMigrationUtils;
import com.getstream.sdk.chat.viewmodel.ChannelViewModel;

import java.util.Date;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;
import io.getstream.chat.android.client.models.Channel;
import io.getstream.chat.android.client.models.Member;

import static android.text.format.DateUtils.getRelativeTimeSpanString;

/*
ChannelHeaderView is used to show a header for a channel

it binds to ChannelViewModel view model and subscribe to channel data

Out of the box this view shows the following information:

- Channel title
- Online status of other members (using AvatarGroupView)
- Channel last activity from other users

 */
public class ChannelHeaderView extends RelativeLayout {

    final static String TAG = ChannelHeaderView.class.getSimpleName();

    // binding for this view
    private StreamViewChannelHeaderBinding binding;
    private ChannelHeaderViewStyle style;
    // our connection to the channel scope
    private ChannelViewModel viewModel;

    public ChannelHeaderView(Context context) {
        super(context);
        binding = initBinding(context);
    }

    public ChannelHeaderView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        parseAttr(context, attrs);
        binding = initBinding(context);
        applyStyle();
    }

    private void parseAttr(Context context, @Nullable AttributeSet attrs) {
        // parse the attributes
        style = new ChannelHeaderViewStyle(context, attrs);
    }

    public void setViewModel(ChannelViewModel model, LifecycleOwner lifecycleOwner) {
        this.viewModel = model;
        binding.setLifecycleOwner(lifecycleOwner);
        binding.setViewModel(viewModel);

        // TODO: update this once we cleanly handle channel vs channel data
        setHeaderTitle(viewModel.getChannel());
        //viewModel.getChannelState().observe(lifecycleOwner, this::setHeaderTitle);
        viewModel.getMembers().observe(lifecycleOwner, this::setHeaderLastActive);
        viewModel.getMembers().observe(lifecycleOwner, this::configHeaderAvatar);
    }

    protected void setHeaderTitle(Channel channel) {
        String channelName = LlcMigrationUtils.getChannelNameOrMembers(channel);
        binding.setChannelName(!TextUtils.isEmpty(channelName)? channelName : style.getChannelWithoutNameText());
    }

    protected void setHeaderLastActive(List<Member> members) {
        Date lastActive = LlcMigrationUtils.getLastActive(members);
        Date now = new Date();
        String timeAgo = getRelativeTimeSpanString(lastActive.getTime()).toString();

        if (now.getTime() - lastActive.getTime() < 60000) {
            timeAgo = getContext().getString(R.string.stream_channel_header_active_now);
        }

        binding.setChannelLastActive(String.format(getContext().getString(R.string.stream_channel_header_active), timeAgo));
    }

    protected void configHeaderAvatar(List<Member> members) {
        AvatarView avatarGroupView = binding.avatarGroup;
        avatarGroupView.setLastActiveUsers(LlcMigrationUtils.getOtherUsers(members), style);
    }

    private StreamViewChannelHeaderBinding initBinding(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        binding = StreamViewChannelHeaderBinding.inflate(inflater, this, true);
        // setup the onMessageClick listener for the back button
        binding.btnBack.setOnClickListener(view ->{
            if(viewModel.isThread())
                viewModel.resetThread();
            else
                ((Activity) getContext()).finish();
        });
        return binding;
    }

    public void setHeaderOptionsClickListener(MessageListView.HeaderOptionsClickListener headerOptionsClickListener) {
        binding.btnOption.setOnClickListener(view -> headerOptionsClickListener.onHeaderOptionsClick(viewModel.getChannel()));
    }

    public void setHeaderAvatarGroupClickListener(MessageListView.HeaderAvatarGroupClickListener headerOptionsClickListener) {
        binding.avatarGroup.setOnClickListener(view -> headerOptionsClickListener.onHeaderAvatarGroupClick(viewModel.getChannel()));
    }

    private void applyStyle() {
        // Title
        style.channelTitleText.apply(binding.tvChannelName);

        // Last Active
        style.lastActiveText.apply(binding.tvActive);
        binding.tvActive.setVisibility(style.isLastActiveShow() ? VISIBLE : GONE);
        // Back Button
        binding.btnBack.setVisibility(style.isBackButtonShow() ? VISIBLE : GONE);
        binding.btnBack.setBackground(style.getBackButtonBackground());
        // Avatar Group
        binding.avatarGroup.setVisibility(style.isAvatarGroupShow() ? VISIBLE : GONE);
        // Options Button
        binding.btnOption.setVisibility(style.isOptionsButtonShow() ? VISIBLE : GONE);
        binding.btnOption.setBackground(style.getOptionsButtonBackground());
        binding.btnOption.setTextSize(style.getOptionsButtonTextSize());
        binding.btnOption.setWidth(style.getOptionsButtonWidth());
        binding.btnOption.setHeight(style.getOptionsButtonHeight());
        // Active Badge
        if (!style.isAvatarGroupShow())
            binding.ivActiveBadge.setVisibility(GONE);
        else
            binding.ivActiveBadge.setVisibility(style.isActiveBadgeShow() ? VISIBLE : GONE);
        binding.setOfflineText(style.getOfflineText());
    }

}