package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appboy.ui.R$id;
import com.appboy.ui.inappmessage.AppboyInAppMessageSimpleDraweeView;
import com.appboy.ui.inappmessage.IInAppMessageView;
import com.appboy.ui.support.FrescoLibraryUtils;
import com.appboy.ui.support.ViewUtils;

public abstract class AppboyInAppMessageBaseView extends RelativeLayout implements IInAppMessageView {
    final boolean mCanUseFresco;

    public AppboyInAppMessageBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCanUseFresco = FrescoLibraryUtils.canUseFresco(context);
        setLayerType(1, null);
    }

    public String getAppropriateImageUrl(C0522cg cgVar) {
        if (!Ng.d(cgVar.getLocalImageUrl())) {
            return cgVar.getLocalImageUrl();
        }
        return cgVar.getRemoteImageUrl();
    }

    public abstract Object getMessageBackgroundObject();

    public View getMessageClickableView() {
        return this;
    }

    public abstract TextView getMessageIconView();

    public abstract ImageView getMessageImageView();

    public abstract View getMessageSimpleDraweeView();

    public abstract TextView getMessageTextView();

    /* access modifiers changed from: 0000 */
    public View getProperViewFromInflatedStub(int i) {
        ((ViewStub) findViewById(i)).inflate();
        if (this.mCanUseFresco) {
            return findViewById(R$id.com_appboy_stubbed_inappmessage_drawee_view);
        }
        return findViewById(R$id.com_appboy_stubbed_inappmessage_image_view);
    }

    public void resetMessageMargins(boolean z) {
        RelativeLayout relativeLayout;
        View view;
        if (this.mCanUseFresco) {
            view = getMessageSimpleDraweeView();
            relativeLayout = (RelativeLayout) findViewById(R$id.com_appboy_stubbed_inappmessage_drawee_view_parent);
        } else {
            view = getMessageImageView();
            relativeLayout = (RelativeLayout) findViewById(R$id.com_appboy_stubbed_inappmessage_image_view_parent);
        }
        if (view != null) {
            if (!z) {
                ViewUtils.removeViewFromParent(view);
                if (relativeLayout != null) {
                    ViewUtils.removeViewFromParent(relativeLayout);
                }
            } else {
                ViewUtils.removeViewFromParent(getMessageIconView());
            }
        }
        if (getMessageIconView() != null && Ng.d((String) getMessageIconView().getText())) {
            ViewUtils.removeViewFromParent(getMessageIconView());
        }
    }

    public void setMessage(String str) {
        getMessageTextView().setText(str);
    }

    public void setMessageBackgroundColor(int i) {
        InAppMessageViewUtils.setViewBackgroundColor((View) getMessageBackgroundObject(), i);
    }

    public void setMessageIcon(String str, int i, int i2) {
        if (getMessageIconView() != null) {
            InAppMessageViewUtils.setIcon(getContext(), str, i, i2, getMessageIconView());
        }
    }

    public void setMessageImageView(Bitmap bitmap) {
        InAppMessageViewUtils.setImage(bitmap, getMessageImageView());
    }

    public void setMessageSimpleDrawee(C0522cg cgVar) {
        FrescoLibraryUtils.setDraweeControllerHelper((AppboyInAppMessageSimpleDraweeView) getMessageSimpleDraweeView(), getAppropriateImageUrl(cgVar), 0.0f, false);
    }

    public void setMessageTextAlign(Wf wf) {
        InAppMessageViewUtils.setTextAlignment(getMessageTextView(), wf);
    }

    public void setMessageTextColor(int i) {
        InAppMessageViewUtils.setTextViewColor(getMessageTextView(), i);
    }
}
