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

public class ShortNewsCardView extends BaseCardView<C1722tg> {
    /* access modifiers changed from: private */
    public static final String TAG = Hg.a(ShortNewsCardView.class);
    private final float mAspectRatio;
    /* access modifiers changed from: private */
    public IAction mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private SimpleDraweeView mDrawee;
    private ImageView mImage;
    private final TextView mTitle;

    public ShortNewsCardView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public int getLayoutResource() {
        return R$layout.com_appboy_short_news_card;
    }

    public ShortNewsCardView(Context context, C1722tg tgVar) {
        super(context);
        this.mAspectRatio = 1.0f;
        this.mDescription = (TextView) findViewById(R$id.com_appboy_short_news_card_description);
        this.mTitle = (TextView) findViewById(R$id.com_appboy_short_news_card_title);
        this.mDomain = (TextView) findViewById(R$id.com_appboy_short_news_card_domain);
        if (canUseFresco()) {
            this.mDrawee = getProperViewFromInflatedStub(R$id.com_appboy_short_news_card_drawee_stub);
        } else {
            this.mImage = (ImageView) getProperViewFromInflatedStub(R$id.com_appboy_short_news_card_imageview_stub);
            this.mImage.setScaleType(ScaleType.CENTER_CROP);
            this.mImage.setAdjustViewBounds(true);
        }
        if (tgVar != null) {
            setCard(tgVar);
        }
        safeSetBackground(getResources().getDrawable(R$drawable.com_appboy_card_background));
    }

    public void onSetCard(final C1722tg tgVar) {
        this.mDescription.setText(tgVar.o());
        setOptionalTextView(this.mTitle, tgVar.r());
        setOptionalTextView(this.mDomain, tgVar.p());
        this.mCardAction = BaseCardView.getUriActionForCard(tgVar);
        setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                ShortNewsCardView shortNewsCardView = ShortNewsCardView.this;
                BaseCardView.handleCardClick(shortNewsCardView.mContext, tgVar, shortNewsCardView.mCardAction, ShortNewsCardView.TAG);
            }
        });
        if (canUseFresco()) {
            setSimpleDraweeToUrl(this.mDrawee, tgVar.q(), 1.0f, true);
        } else {
            setImageViewToUrl(this.mImage, tgVar.q(), 1.0f);
        }
    }
}
