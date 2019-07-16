package com.appboy.ui.widget;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.appboy.ui.R$id;
import com.appboy.ui.R$layout;
import com.appboy.ui.R$string;
import com.appboy.ui.actions.GooglePlayAppDetailsAction;
import com.appboy.ui.actions.IAction;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.text.NumberFormat;
import java.util.Locale;

public class CrossPromotionSmallCardView extends BaseCardView<C1692sg> {
    /* access modifiers changed from: private */
    public static final String TAG = Hg.a(CrossPromotionSmallCardView.class);
    private final float mAspectRatio;
    private final TextView mCaption;
    private SimpleDraweeView mDrawee;
    private ImageView mImage;
    private final Button mPrice;
    /* access modifiers changed from: private */
    public IAction mPriceAction;
    private final TextView mReviewCount;
    private final StarRatingView mStarRating;
    private final TextView mSubtitle;
    private final TextView mTitle;

    public CrossPromotionSmallCardView(Context context) {
        this(context, null);
    }

    private String getPriceString(double d) {
        if (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return this.mContext.getString(R$string.com_appboy_recommendation_free);
        }
        return NumberFormat.getCurrencyInstance(Locale.US).format(d);
    }

    /* access modifiers changed from: protected */
    public int getLayoutResource() {
        return R$layout.com_appboy_cross_promotion_small_card;
    }

    public CrossPromotionSmallCardView(Context context, C1692sg sgVar) {
        super(context);
        this.mAspectRatio = 1.0f;
        this.mTitle = (TextView) findViewById(R$id.com_appboy_cross_promotion_small_card_title);
        this.mSubtitle = (TextView) findViewById(R$id.com_appboy_cross_promotion_small_card_subtitle);
        this.mReviewCount = (TextView) findViewById(R$id.com_appboy_cross_promotion_small_card_review_count);
        this.mCaption = (TextView) findViewById(R$id.com_appboy_cross_promotion_small_card_recommendation_tab);
        this.mStarRating = (StarRatingView) findViewById(R$id.com_appboy_cross_promotion_small_card_star_rating);
        this.mPrice = (Button) findViewById(R$id.com_appboy_cross_promotion_small_card_price);
        if (canUseFresco()) {
            this.mDrawee = getProperViewFromInflatedStub(R$id.com_appboy_cross_promotion_small_card_drawee_stub);
        } else {
            this.mImage = (ImageView) getProperViewFromInflatedStub(R$id.com_appboy_cross_promotion_small_card_imageview_stub);
            this.mImage.setScaleType(ScaleType.CENTER_CROP);
            this.mImage.setAdjustViewBounds(true);
        }
        if (sgVar != null) {
            setCard(sgVar);
        }
    }

    public void onSetCard(final C1692sg sgVar) {
        this.mTitle.setText(sgVar.A());
        if (sgVar.z() == null || sgVar.z().toUpperCase(Locale.getDefault()).equals("NULL")) {
            this.mSubtitle.setVisibility(8);
        } else {
            this.mSubtitle.setText(sgVar.z().toUpperCase(Locale.getDefault()));
        }
        this.mCaption.setText(sgVar.p().toUpperCase(Locale.getDefault()));
        if (sgVar.x() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.mReviewCount.setVisibility(8);
            this.mStarRating.setVisibility(8);
        } else {
            TextView textView = this.mReviewCount;
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(NumberFormat.getInstance().format((long) sgVar.y()));
            sb.append(")");
            textView.setText(sb.toString());
            this.mStarRating.setRating((float) sgVar.x());
        }
        if (!Ng.d(sgVar.q())) {
            this.mPrice.setText(sgVar.q());
        } else {
            this.mPrice.setText(getPriceString(sgVar.w()));
        }
        GooglePlayAppDetailsAction googlePlayAppDetailsAction = new GooglePlayAppDetailsAction(sgVar.t(), sgVar.getOpenUriInWebView(), sgVar.o(), sgVar.s(), Hf.NEWS_FEED);
        this.mPriceAction = googlePlayAppDetailsAction;
        this.mPrice.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                CrossPromotionSmallCardView crossPromotionSmallCardView = CrossPromotionSmallCardView.this;
                BaseCardView.handleCardClick(crossPromotionSmallCardView.mContext, sgVar, crossPromotionSmallCardView.mPriceAction, CrossPromotionSmallCardView.TAG);
            }
        });
        if (canUseFresco()) {
            setSimpleDraweeToUrl(this.mDrawee, sgVar.r(), 1.0f, true);
        } else {
            setImageViewToUrl(this.mImage, sgVar.r(), 1.0f);
        }
    }
}
