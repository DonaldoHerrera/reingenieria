package com.appboy.ui.widget;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.appboy.ui.R$drawable;
import com.appboy.ui.R$id;
import com.appboy.ui.R$layout;
import com.appboy.ui.actions.IAction;
import com.facebook.drawee.view.SimpleDraweeView;

public class BannerImageCardView extends BaseCardView<C1603pg> {
    /* access modifiers changed from: private */
    public static final String TAG = Hg.a(BannerImageCardView.class);
    private float mAspectRatio;
    /* access modifiers changed from: private */
    public IAction mCardAction;
    private SimpleDraweeView mDrawee;
    private ImageView mImage;

    public BannerImageCardView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public int getLayoutResource() {
        return R$layout.com_appboy_banner_image_card;
    }

    public BannerImageCardView(Context context, C1603pg pgVar) {
        super(context);
        this.mAspectRatio = 6.0f;
        if (canUseFresco()) {
            this.mDrawee = getProperViewFromInflatedStub(R$id.com_appboy_banner_image_card_drawee_stub);
        } else {
            this.mImage = (ImageView) getProperViewFromInflatedStub(R$id.com_appboy_banner_image_card_imageview_stub);
            this.mImage.setScaleType(ScaleType.CENTER_CROP);
            this.mImage.setAdjustViewBounds(true);
        }
        if (pgVar != null) {
            setCard(pgVar);
        }
        safeSetBackground(getResources().getDrawable(R$drawable.com_appboy_card_background));
    }

    public void onSetCard(final C1603pg pgVar) {
        boolean z;
        if (pgVar.o() != 0.0f) {
            this.mAspectRatio = pgVar.o();
            z = true;
        } else {
            z = false;
        }
        if (canUseFresco()) {
            setSimpleDraweeToUrl(this.mDrawee, pgVar.p(), this.mAspectRatio, z);
        } else {
            setImageViewToUrl(this.mImage, pgVar.p(), this.mAspectRatio, z);
        }
        this.mCardAction = BaseCardView.getUriActionForCard(pgVar);
        setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                BannerImageCardView bannerImageCardView = BannerImageCardView.this;
                BaseCardView.handleCardClick(bannerImageCardView.mContext, pgVar, bannerImageCardView.mCardAction, BannerImageCardView.TAG, false);
            }
        });
    }
}
