package com.appboy.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.ViewSwitcher.ViewFactory;
import com.appboy.h;
import com.appboy.ui.AppboyNavigator;
import com.appboy.ui.R$drawable;
import com.appboy.ui.R$id;
import com.appboy.ui.actions.ActionFactory;
import com.appboy.ui.actions.IAction;
import com.appboy.ui.actions.UriAction;
import com.appboy.ui.feed.AppboyFeedManager;
import com.appboy.ui.feed.AppboyImageSwitcher;
import com.appboy.ui.support.FrescoLibraryUtils;
import com.appboy.ui.support.ViewUtils;
import com.facebook.drawee.view.SimpleDraweeView;
import defpackage.C1662rg;
import java.util.Observable;
import java.util.Observer;

public abstract class BaseCardView<T extends C1662rg> extends RelativeLayout implements Observer {
    private static final String TAG = Hg.a(BaseCardView.class);
    private static Boolean unreadCardVisualIndicatorOn;
    private final boolean mCanUseFresco;
    protected T mCard;
    protected final Context mContext;
    protected AppboyImageSwitcher mImageSwitcher = ((AppboyImageSwitcher) findViewById(R$id.com_appboy_newsfeed_item_read_indicator_image_switcher));

    public BaseCardView(Context context) {
        super(context);
        this.mCanUseFresco = FrescoLibraryUtils.canUseFresco(context);
        this.mContext = context;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResource(), this);
        AppboyImageSwitcher appboyImageSwitcher = this.mImageSwitcher;
        if (appboyImageSwitcher != null) {
            appboyImageSwitcher.setFactory(new ViewFactory() {
                public View makeView() {
                    return new ImageView(BaseCardView.this.mContext.getApplicationContext());
                }
            });
        }
        if (unreadCardVisualIndicatorOn == null) {
            unreadCardVisualIndicatorOn = Boolean.valueOf(new Bf(context).n());
        }
        if (!unreadCardVisualIndicatorOn.booleanValue()) {
            AppboyImageSwitcher appboyImageSwitcher2 = this.mImageSwitcher;
            if (appboyImageSwitcher2 != null) {
                appboyImageSwitcher2.setVisibility(8);
            }
        }
    }

    protected static UriAction getUriActionForCard(C1662rg rgVar) {
        Bundle bundle = new Bundle();
        for (String str : rgVar.getExtras().keySet()) {
            bundle.putString(str, (String) rgVar.getExtras().get(str));
        }
        return ActionFactory.createUriActionFromUrlString(rgVar.k(), bundle, rgVar.getOpenUriInWebView(), Hf.NEWS_FEED);
    }

    protected static void handleCardClick(Context context, C1662rg rgVar, IAction iAction, String str) {
        handleCardClick(context, rgVar, iAction, str, true);
    }

    @TargetApi(16)
    private void setBackgroundNew(Drawable drawable) {
        setBackground(drawable);
    }

    private void setCardViewedIndicator() {
        if (getCard() == null) {
            Hg.a(TAG, "The card is null.");
        } else if (this.mImageSwitcher != null) {
            Hg.d(TAG, "Setting the read/unread indicator for the card.");
            if (getCard().n()) {
                if (this.mImageSwitcher.getReadIcon() != null) {
                    AppboyImageSwitcher appboyImageSwitcher = this.mImageSwitcher;
                    appboyImageSwitcher.setImageDrawable(appboyImageSwitcher.getReadIcon());
                } else {
                    this.mImageSwitcher.setImageResource(R$drawable.icon_read);
                }
                this.mImageSwitcher.setTag("icon_read");
            } else if (this.mImageSwitcher.getUnReadIcon() != null) {
                AppboyImageSwitcher appboyImageSwitcher2 = this.mImageSwitcher;
                appboyImageSwitcher2.setImageDrawable(appboyImageSwitcher2.getUnReadIcon());
            } else {
                this.mImageSwitcher.setImageResource(R$drawable.icon_unread);
                this.mImageSwitcher.setTag("icon_unread");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean canUseFresco() {
        return this.mCanUseFresco;
    }

    public C1662rg getCard() {
        return this.mCard;
    }

    /* access modifiers changed from: protected */
    public abstract int getLayoutResource();

    /* access modifiers changed from: 0000 */
    public View getProperViewFromInflatedStub(int i) {
        ((ViewStub) findViewById(i)).inflate();
        if (this.mCanUseFresco) {
            return findViewById(R$id.com_appboy_stubbed_feed_drawee_view);
        }
        return findViewById(R$id.com_appboy_stubbed_feed_image_view);
    }

    /* access modifiers changed from: protected */
    public abstract void onSetCard(T t);

    /* access modifiers changed from: 0000 */
    public void safeSetBackground(Drawable drawable) {
        if (VERSION.SDK_INT < 16) {
            setBackgroundDrawable(drawable);
        } else {
            setBackgroundNew(drawable);
        }
    }

    public void setCard(T t) {
        this.mCard = t;
        onSetCard(t);
        t.addObserver(this);
        setCardViewedIndicator();
    }

    /* access modifiers changed from: 0000 */
    public void setImageViewToUrl(ImageView imageView, String str, float f) {
        setImageViewToUrl(imageView, str, f, true);
    }

    /* access modifiers changed from: 0000 */
    public void setOptionalTextView(TextView textView, String str) {
        String str2 = "";
        if (str == null || str.trim().equals(str2)) {
            textView.setText(str2);
            textView.setVisibility(8);
            return;
        }
        textView.setText(str);
        textView.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    public void setSimpleDraweeToUrl(SimpleDraweeView simpleDraweeView, String str, float f, boolean z) {
        if (str == null) {
            Hg.e(TAG, "The image url to render is null. Not setting the card image.");
        } else {
            FrescoLibraryUtils.setDraweeControllerHelper(simpleDraweeView, str, f, z);
        }
    }

    public void update(Observable observable, Object obj) {
        setCardViewedIndicator();
    }

    protected static void handleCardClick(Context context, C1662rg rgVar, IAction iAction, String str, boolean z) {
        if (z) {
            rgVar.a(true);
        }
        if (iAction != null) {
            if (rgVar.logClick()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Logged click for card ");
                sb.append(rgVar.i());
                Hg.a(str, sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Logging click failed for card ");
                sb2.append(rgVar.i());
                Hg.a(str, sb2.toString());
            }
            if (AppboyFeedManager.getInstance().getFeedCardClickActionListener().onFeedCardClicked(context, rgVar, iAction)) {
                return;
            }
            if (iAction instanceof UriAction) {
                AppboyNavigator.getAppboyNavigator().gotoUri(context, (UriAction) iAction);
            } else {
                iAction.execute(context);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void setImageViewToUrl(final ImageView imageView, String str, final float f, boolean z) {
        if (str == null) {
            Hg.e(TAG, "The image url to render is null. Not setting the card image.");
        } else if (f == 0.0f) {
            Hg.e(TAG, "The image aspect ratio is 0. Not setting the card image.");
        } else {
            if (!str.equals(imageView.getTag())) {
                if (f != 1.0f) {
                    ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                            public void onGlobalLayout() {
                                int width = imageView.getWidth();
                                imageView.setLayoutParams(new LayoutParams(width, (int) (((float) width) / f)));
                                ViewUtils.removeOnGlobalLayoutListenerSafe(imageView.getViewTreeObserver(), this);
                            }
                        });
                    }
                }
                imageView.setImageResource(17170445);
                h.a(getContext()).a(str, imageView, z);
                imageView.setTag(str);
            }
        }
    }
}
