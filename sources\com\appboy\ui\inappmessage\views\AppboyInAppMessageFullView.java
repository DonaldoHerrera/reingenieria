package com.appboy.ui.inappmessage.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.ui.R$color;
import com.appboy.ui.R$id;
import com.appboy.ui.inappmessage.AppboyInAppMessageImageView;
import com.appboy.ui.inappmessage.AppboyInAppMessageSimpleDraweeView;
import com.appboy.ui.inappmessage.IInAppMessageImageView;
import com.appboy.ui.inappmessage.config.AppboyInAppMessageParams;
import com.appboy.ui.support.ViewUtils;
import java.util.ArrayList;
import java.util.List;

public class AppboyInAppMessageFullView extends AppboyInAppMessageImmersiveBaseView {
    /* access modifiers changed from: private */
    public static final String TAG = Hg.a(AppboyInAppMessageFullView.class);
    private AppboyInAppMessageImageView mAppboyInAppMessageImageView;
    private View mSimpleDraweeView;

    public AppboyInAppMessageFullView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void setInAppMessageImageViewAttributes(Activity activity, C1263eg egVar, IInAppMessageImageView iInAppMessageImageView) {
        iInAppMessageImageView.setInAppMessageImageCropType(egVar.getCropType());
        if (ViewUtils.isRunningOnTablet(activity)) {
            float convertDpToPixels = (float) ViewUtils.convertDpToPixels(activity, AppboyInAppMessageParams.getModalizedImageRadiusDp());
            if (egVar.u().equals(Sf.GRAPHIC)) {
                iInAppMessageImageView.setCornersRadiusPx(convertDpToPixels);
            } else {
                iInAppMessageImageView.setCornersRadiiPx(convertDpToPixels, convertDpToPixels, 0.0f, 0.0f);
            }
        } else {
            iInAppMessageImageView.setCornersRadiusPx(0.0f);
        }
    }

    public View getFrameView() {
        return findViewById(R$id.com_appboy_inappmessage_full_frame);
    }

    public int getLongEdge() {
        return findViewById(R$id.com_appboy_inappmessage_full).getLayoutParams().height;
    }

    public List<View> getMessageButtonViews() {
        ArrayList arrayList = new ArrayList();
        if (findViewById(R$id.com_appboy_inappmessage_full_button_one) != null) {
            arrayList.add(findViewById(R$id.com_appboy_inappmessage_full_button_one));
        }
        if (findViewById(R$id.com_appboy_inappmessage_full_button_two) != null) {
            arrayList.add(findViewById(R$id.com_appboy_inappmessage_full_button_two));
        }
        return arrayList;
    }

    public View getMessageButtonsView() {
        return findViewById(R$id.com_appboy_inappmessage_full_button_layout);
    }

    public View getMessageClickableView() {
        return findViewById(R$id.com_appboy_inappmessage_full);
    }

    public View getMessageCloseButtonView() {
        return findViewById(R$id.com_appboy_inappmessage_full_close_button);
    }

    public TextView getMessageHeaderTextView() {
        return (TextView) findViewById(R$id.com_appboy_inappmessage_full_header_text);
    }

    public TextView getMessageIconView() {
        return null;
    }

    public ImageView getMessageImageView() {
        return this.mAppboyInAppMessageImageView;
    }

    public View getMessageSimpleDraweeView() {
        return this.mSimpleDraweeView;
    }

    public TextView getMessageTextView() {
        return (TextView) findViewById(R$id.com_appboy_inappmessage_full_message);
    }

    public int getShortEdge() {
        return findViewById(R$id.com_appboy_inappmessage_full).getLayoutParams().width;
    }

    public void inflateStubViews(Activity activity, C1263eg egVar) {
        if (this.mCanUseFresco) {
            this.mSimpleDraweeView = getProperViewFromInflatedStub(R$id.com_appboy_inappmessage_full_drawee_stub);
            setInAppMessageImageViewAttributes(activity, egVar, (AppboyInAppMessageSimpleDraweeView) this.mSimpleDraweeView);
            return;
        }
        this.mAppboyInAppMessageImageView = (AppboyInAppMessageImageView) getProperViewFromInflatedStub(R$id.com_appboy_inappmessage_full_imageview_stub);
        setInAppMessageImageViewAttributes(activity, egVar, this.mAppboyInAppMessageImageView);
    }

    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        findViewById(R$id.com_appboy_inappmessage_full_text_layout).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Hg.a(AppboyInAppMessageFullView.TAG, "Passing scrollView click event to message clickable view.");
                AppboyInAppMessageFullView.this.getMessageClickableView().performClick();
            }
        });
    }

    public void setMessageBackgroundColor(int i) {
        if (getMessageBackgroundObject().getBackground() instanceof GradientDrawable) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(findViewById(R$id.com_appboy_inappmessage_full), i, getContext().getResources().getColor(R$color.com_appboy_inappmessage_background_light));
        } else {
            super.setMessageBackgroundColor(i);
        }
    }

    public View getMessageBackgroundObject() {
        return findViewById(R$id.com_appboy_inappmessage_full);
    }
}
