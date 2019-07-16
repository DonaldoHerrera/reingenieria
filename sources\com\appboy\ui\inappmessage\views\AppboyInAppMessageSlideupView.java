package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.ui.R$color;
import com.appboy.ui.R$id;
import com.appboy.ui.inappmessage.AppboyInAppMessageImageView;
import com.appboy.ui.inappmessage.AppboyInAppMessageSimpleDraweeView;

public class AppboyInAppMessageSlideupView extends AppboyInAppMessageBaseView {
    private AppboyInAppMessageImageView mAppboyInAppMessageImageView;
    private View mSimpleDraweeView;

    /* renamed from: com.appboy.ui.inappmessage.views.AppboyInAppMessageSlideupView$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$appboy$enums$inappmessage$ClickAction = new int[Pf.values().length];

        static {
            try {
                $SwitchMap$com$appboy$enums$inappmessage$ClickAction[Pf.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public AppboyInAppMessageSlideupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public View getMessageChevronView() {
        return findViewById(R$id.com_appboy_inappmessage_slideup_chevron);
    }

    public TextView getMessageIconView() {
        return (TextView) findViewById(R$id.com_appboy_inappmessage_slideup_icon);
    }

    public ImageView getMessageImageView() {
        return this.mAppboyInAppMessageImageView;
    }

    public View getMessageSimpleDraweeView() {
        return this.mSimpleDraweeView;
    }

    public TextView getMessageTextView() {
        return (TextView) findViewById(R$id.com_appboy_inappmessage_slideup_message);
    }

    public void inflateStubViews(C0522cg cgVar) {
        if (this.mCanUseFresco) {
            this.mSimpleDraweeView = getProperViewFromInflatedStub(R$id.com_appboy_inappmessage_slideup_drawee_stub);
            ((AppboyInAppMessageSimpleDraweeView) this.mSimpleDraweeView).setInAppMessageImageCropType(cgVar.getCropType());
            return;
        }
        this.mAppboyInAppMessageImageView = (AppboyInAppMessageImageView) getProperViewFromInflatedStub(R$id.com_appboy_inappmessage_slideup_imageview_stub);
        this.mAppboyInAppMessageImageView.setInAppMessageImageCropType(cgVar.getCropType());
    }

    public void setMessageChevron(int i, Pf pf) {
        if (AnonymousClass1.$SwitchMap$com$appboy$enums$inappmessage$ClickAction[pf.ordinal()] != 1) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(getMessageChevronView(), i, getContext().getResources().getColor(R$color.com_appboy_inappmessage_chevron));
        } else {
            getMessageChevronView().setVisibility(8);
        }
    }

    public View getMessageBackgroundObject() {
        return findViewById(R$id.com_appboy_inappmessage_slideup);
    }
}
