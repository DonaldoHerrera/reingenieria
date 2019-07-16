package com.appboy.ui.widget;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.appboy.ui.R$drawable;
import com.appboy.ui.R$id;
import com.appboy.ui.R$layout;
import com.appboy.ui.actions.IAction;
import com.facebook.drawee.view.SimpleDraweeView;

public class CaptionedImageCardView extends BaseCardView<C1633qg> {
    /* access modifiers changed from: private */
    public static final String TAG = Hg.a(CaptionedImageCardView.class);
    private float mAspectRatio;
    /* access modifiers changed from: private */
    public IAction mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private SimpleDraweeView mDrawee;
    private ImageView mImage;
    private final TextView mTitle;

    public CaptionedImageCardView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public int getLayoutResource() {
        return R$layout.com_appboy_captioned_image_card;
    }

    public CaptionedImageCardView(Context context, C1633qg qgVar) {
        super(context);
        this.mAspectRatio = 1.3333334f;
        if (canUseFresco()) {
            this.mDrawee = getProperViewFromInflatedStub(R$id.com_appboy_captioned_image_card_drawee_stub);
        } else {
            this.mImage = (ImageView) getProperViewFromInflatedStub(R$id.com_appboy_captioned_image_card_imageview_stub);
            this.mImage.setScaleType(ScaleType.CENTER_CROP);
            this.mImage.setAdjustViewBounds(true);
        }
        this.mTitle = (TextView) findViewById(R$id.com_appboy_captioned_image_title);
        this.mDescription = (TextView) findViewById(R$id.com_appboy_captioned_image_description);
        this.mDomain = (TextView) findViewById(R$id.com_appboy_captioned_image_card_domain);
        if (qgVar != null) {
            setCard(qgVar);
        }
        safeSetBackground(getResources().getDrawable(R$drawable.com_appboy_card_background));
    }

    public void onSetCard(final C1633qg qgVar) {
        boolean z;
        this.mTitle.setText(qgVar.s());
        this.mDescription.setText(qgVar.p());
        setOptionalTextView(this.mDomain, qgVar.q());
        this.mCardAction = BaseCardView.getUriActionForCard(qgVar);
        if (qgVar.o() != 0.0f) {
            this.mAspectRatio = qgVar.o();
            z = true;
        } else {
            z = false;
        }
        setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                CaptionedImageCardView captionedImageCardView = CaptionedImageCardView.this;
                BaseCardView.handleCardClick(captionedImageCardView.mContext, qgVar, captionedImageCardView.mCardAction, CaptionedImageCardView.TAG);
            }
        });
        if (canUseFresco()) {
            setSimpleDraweeToUrl(this.mDrawee, qgVar.r(), this.mAspectRatio, z);
        } else {
            setImageViewToUrl(this.mImage, qgVar.r(), this.mAspectRatio, z);
        }
    }
}
