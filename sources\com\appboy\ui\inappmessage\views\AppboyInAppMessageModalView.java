package com.appboy.ui.inappmessage.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.appboy.ui.R$color;
import com.appboy.ui.R$id;
import com.appboy.ui.inappmessage.AppboyInAppMessageImageView;
import com.appboy.ui.inappmessage.AppboyInAppMessageSimpleDraweeView;
import com.appboy.ui.inappmessage.IInAppMessageImageView;
import com.appboy.ui.inappmessage.config.AppboyInAppMessageParams;
import com.appboy.ui.support.FrescoLibraryUtils;
import com.appboy.ui.support.ViewUtils;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import java.util.ArrayList;
import java.util.List;

public class AppboyInAppMessageModalView extends AppboyInAppMessageImmersiveBaseView {
    /* access modifiers changed from: private */
    public static final String TAG = Hg.a(AppboyInAppMessageModalView.class);
    private AppboyInAppMessageImageView mAppboyInAppMessageImageView;
    private View mSimpleDraweeView;

    public AppboyInAppMessageModalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void resizeGraphicFrameIfAppropriate(Activity activity, C1263eg egVar, double d) {
        if (egVar.u().equals(Sf.GRAPHIC)) {
            double graphicModalMaxWidthDp = AppboyInAppMessageParams.getGraphicModalMaxWidthDp();
            double graphicModalMaxHeightDp = AppboyInAppMessageParams.getGraphicModalMaxHeightDp();
            LayoutParams layoutParams = (LayoutParams) findViewById(R$id.com_appboy_inappmessage_modal_graphic_bound).getLayoutParams();
            if (d >= graphicModalMaxWidthDp / graphicModalMaxHeightDp) {
                layoutParams.width = (int) ViewUtils.convertDpToPixels(activity, graphicModalMaxWidthDp);
                layoutParams.height = (int) (ViewUtils.convertDpToPixels(activity, graphicModalMaxWidthDp) / d);
            } else {
                layoutParams.width = (int) (ViewUtils.convertDpToPixels(activity, graphicModalMaxHeightDp) * d);
                layoutParams.height = (int) ViewUtils.convertDpToPixels(activity, graphicModalMaxHeightDp);
            }
            findViewById(R$id.com_appboy_inappmessage_modal_graphic_bound).setLayoutParams(layoutParams);
        }
    }

    private void setInAppMessageImageViewAttributes(Activity activity, C1263eg egVar, IInAppMessageImageView iInAppMessageImageView) {
        float convertDpToPixels = (float) ViewUtils.convertDpToPixels(activity, AppboyInAppMessageParams.getModalizedImageRadiusDp());
        if (egVar.u().equals(Sf.GRAPHIC)) {
            iInAppMessageImageView.setCornersRadiusPx(convertDpToPixels);
        } else {
            iInAppMessageImageView.setCornersRadiiPx(convertDpToPixels, convertDpToPixels, 0.0f, 0.0f);
        }
        iInAppMessageImageView.setInAppMessageImageCropType(egVar.getCropType());
    }

    public View getFrameView() {
        return findViewById(R$id.com_appboy_inappmessage_modal_frame);
    }

    public List<View> getMessageButtonViews() {
        ArrayList arrayList = new ArrayList();
        if (findViewById(R$id.com_appboy_inappmessage_modal_button_one) != null) {
            arrayList.add(findViewById(R$id.com_appboy_inappmessage_modal_button_one));
        }
        if (findViewById(R$id.com_appboy_inappmessage_modal_button_two) != null) {
            arrayList.add(findViewById(R$id.com_appboy_inappmessage_modal_button_two));
        }
        return arrayList;
    }

    public View getMessageButtonsView() {
        return findViewById(R$id.com_appboy_inappmessage_modal_button_layout);
    }

    public View getMessageClickableView() {
        return findViewById(R$id.com_appboy_inappmessage_modal);
    }

    public View getMessageCloseButtonView() {
        return findViewById(R$id.com_appboy_inappmessage_modal_close_button);
    }

    public TextView getMessageHeaderTextView() {
        return (TextView) findViewById(R$id.com_appboy_inappmessage_modal_header_text);
    }

    public TextView getMessageIconView() {
        return (TextView) findViewById(R$id.com_appboy_inappmessage_modal_icon);
    }

    public ImageView getMessageImageView() {
        return this.mAppboyInAppMessageImageView;
    }

    public View getMessageSimpleDraweeView() {
        return this.mSimpleDraweeView;
    }

    public TextView getMessageTextView() {
        return (TextView) findViewById(R$id.com_appboy_inappmessage_modal_message);
    }

    public void inflateStubViews(Activity activity, C1263eg egVar) {
        if (this.mCanUseFresco) {
            this.mSimpleDraweeView = getProperViewFromInflatedStub(R$id.com_appboy_inappmessage_modal_drawee_stub);
            setInAppMessageImageViewAttributes(activity, egVar, (AppboyInAppMessageSimpleDraweeView) this.mSimpleDraweeView);
            return;
        }
        this.mAppboyInAppMessageImageView = (AppboyInAppMessageImageView) getProperViewFromInflatedStub(R$id.com_appboy_inappmessage_modal_imageview_stub);
        setInAppMessageImageViewAttributes(activity, egVar, this.mAppboyInAppMessageImageView);
        if (egVar.u().equals(Sf.GRAPHIC) && egVar.getBitmap() != null) {
            resizeGraphicFrameIfAppropriate(activity, egVar, ((double) egVar.getBitmap().getWidth()) / ((double) egVar.getBitmap().getHeight()));
        }
    }

    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R$id.com_appboy_inappmessage_modal_image_layout);
        if ((z || getMessageIconView() != null) && relativeLayout != null) {
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            relativeLayout.setLayoutParams(layoutParams);
        }
        findViewById(R$id.com_appboy_inappmessage_modal_text_layout).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Hg.a(AppboyInAppMessageModalView.TAG, "Passing scrollView click event to message clickable view.");
                AppboyInAppMessageModalView.this.getMessageClickableView().performClick();
            }
        });
    }

    public void setMessageBackgroundColor(int i) {
        InAppMessageViewUtils.setViewBackgroundColorFilter(findViewById(R$id.com_appboy_inappmessage_modal), i, getContext().getResources().getColor(R$color.com_appboy_inappmessage_background_light));
    }

    public void setMessageSimpleDrawee(final C1263eg egVar, final Activity activity) {
        if (egVar.u().equals(Sf.GRAPHIC)) {
            FrescoLibraryUtils.setDraweeControllerHelper((AppboyInAppMessageSimpleDraweeView) getMessageSimpleDraweeView(), getAppropriateImageUrl(egVar), 0.0f, false, new BaseControllerListener<ImageInfo>() {
            });
            return;
        }
        setMessageSimpleDrawee(egVar);
    }

    public Drawable getMessageBackgroundObject() {
        return getMessageClickableView().getBackground();
    }
}
