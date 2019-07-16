package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.appboy.ui.R$color;
import com.appboy.ui.inappmessage.IInAppMessageImmersiveView;
import com.appboy.ui.support.ViewUtils;
import java.util.List;

public abstract class AppboyInAppMessageImmersiveBaseView extends AppboyInAppMessageBaseView implements IInAppMessageImmersiveView {
    public AppboyInAppMessageImmersiveBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abstract View getFrameView();

    public abstract List<View> getMessageButtonViews();

    public abstract View getMessageButtonsView();

    public abstract TextView getMessageHeaderTextView();

    public abstract TextView getMessageTextView();

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        return true;
    }

    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        if (Ng.d(getMessageTextView().getText().toString())) {
            ViewUtils.removeViewFromParent(getMessageTextView());
        }
        if (Ng.d(getMessageHeaderTextView().getText().toString())) {
            ViewUtils.removeViewFromParent(getMessageHeaderTextView());
        }
        InAppMessageViewUtils.resetMessageMarginsIfNecessary(getMessageTextView(), getMessageHeaderTextView());
    }

    public void setFrameColor(Integer num) {
        InAppMessageViewUtils.setFrameColor(getFrameView(), num);
    }

    public void setMessageButtons(List<C1541ng> list) {
        InAppMessageViewUtils.setButtons(getMessageButtonViews(), getMessageButtonsView(), getContext().getResources().getColor(R$color.com_appboy_inappmessage_button_bg_light), list);
        InAppMessageViewUtils.resetButtonSizesIfNecessary(getMessageButtonViews(), list);
    }

    public void setMessageCloseButtonColor(int i) {
        InAppMessageViewUtils.setViewBackgroundColorFilter(getMessageCloseButtonView(), i, getContext().getResources().getColor(R$color.com_appboy_inappmessage_button_close_light));
    }

    public void setMessageHeaderText(String str) {
        getMessageHeaderTextView().setText(str);
    }

    public void setMessageHeaderTextAlignment(Wf wf) {
        InAppMessageViewUtils.setTextAlignment(getMessageHeaderTextView(), wf);
    }

    public void setMessageHeaderTextColor(int i) {
        InAppMessageViewUtils.setTextViewColor(getMessageHeaderTextView(), i);
    }
}
