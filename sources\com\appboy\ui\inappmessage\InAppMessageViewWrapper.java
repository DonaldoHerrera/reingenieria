package com.appboy.ui.inappmessage;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.appboy.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.appboy.ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks;
import com.appboy.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener;
import com.appboy.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener.ITouchListener;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageHtmlBaseView;
import com.appboy.ui.support.ViewUtils;
import java.util.List;

public class InAppMessageViewWrapper implements IInAppMessageViewWrapper {
    /* access modifiers changed from: private */
    public static final String TAG = Hg.a(InAppMessageViewWrapper.class);
    /* access modifiers changed from: private */
    public List<View> mButtons;
    private View mClickableInAppMessageView;
    private View mCloseButton;
    private final Animation mClosingAnimation;
    /* access modifiers changed from: private */
    public Runnable mDismissRunnable;
    /* access modifiers changed from: private */
    public final C0522cg mInAppMessage;
    /* access modifiers changed from: private */
    public final View mInAppMessageView;
    /* access modifiers changed from: private */
    public final IInAppMessageViewLifecycleListener mInAppMessageViewLifecycleListener;
    private boolean mIsAnimatingClose;
    private final Animation mOpeningAnimation;

    public InAppMessageViewWrapper(View view, C0522cg cgVar, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, Animation animation, Animation animation2, View view2) {
        this.mInAppMessageView = view;
        this.mInAppMessage = cgVar;
        this.mInAppMessageViewLifecycleListener = iInAppMessageViewLifecycleListener;
        this.mIsAnimatingClose = false;
        if (view2 != null) {
            this.mClickableInAppMessageView = view2;
        } else {
            this.mClickableInAppMessageView = this.mInAppMessageView;
        }
        if (this.mInAppMessage instanceof C1510mg) {
            TouchAwareSwipeDismissTouchListener touchAwareSwipeDismissTouchListener = new TouchAwareSwipeDismissTouchListener(view, null, createDismissCallbacks());
            touchAwareSwipeDismissTouchListener.setTouchListener(createTouchAwareListener());
            this.mClickableInAppMessageView.setOnTouchListener(touchAwareSwipeDismissTouchListener);
        }
        this.mOpeningAnimation = animation;
        this.mClosingAnimation = animation2;
        this.mClickableInAppMessageView.setOnClickListener(createClickListener());
    }

    /* access modifiers changed from: private */
    public void addDismissRunnable() {
        if (this.mDismissRunnable == null) {
            this.mDismissRunnable = new Runnable() {
                public void run() {
                    AppboyInAppMessageManager.getInstance().hideCurrentlyDisplayingInAppMessage(true);
                }
            };
            this.mInAppMessageView.postDelayed(this.mDismissRunnable, (long) this.mInAppMessage.getDurationInMilliseconds());
        }
    }

    /* access modifiers changed from: private */
    public void announceForAccessibilityIfNecessary() {
        if (VERSION.SDK_INT > 16) {
            View view = this.mInAppMessageView;
            if (view instanceof IInAppMessageImmersiveView) {
                view.announceForAccessibility(this.mInAppMessage.getMessage());
            } else if (view instanceof AppboyInAppMessageHtmlBaseView) {
                view.announceForAccessibility("In-app message displayed.");
            }
        }
    }

    /* access modifiers changed from: private */
    public void closeInAppMessageView() {
        Hg.a(TAG, "Closing in-app message view");
        ViewUtils.removeViewFromParent(this.mInAppMessageView);
        View view = this.mInAppMessageView;
        if (view instanceof AppboyInAppMessageHtmlBaseView) {
            AppboyInAppMessageHtmlBaseView appboyInAppMessageHtmlBaseView = (AppboyInAppMessageHtmlBaseView) view;
            if (appboyInAppMessageHtmlBaseView.getMessageWebView() != null) {
                Hg.a(TAG, "Called destroy on the AppboyInAppMessageHtmlBaseView WebView");
                appboyInAppMessageHtmlBaseView.getMessageWebView().destroy();
            }
        }
        this.mInAppMessageViewLifecycleListener.afterClosed(this.mInAppMessage);
    }

    private AnimationListener createAnimationListener(boolean z) {
        if (z) {
            return new AnimationListener() {
                public void onAnimationEnd(Animation animation) {
                    if (InAppMessageViewWrapper.this.mInAppMessage.getDismissType() == Rf.AUTO_DISMISS) {
                        InAppMessageViewWrapper.this.addDismissRunnable();
                    }
                    Hg.a(InAppMessageViewWrapper.TAG, "In-app message animated into view.");
                    InAppMessageViewWrapper.this.mInAppMessageView.setFocusableInTouchMode(true);
                    InAppMessageViewWrapper.this.mInAppMessageView.requestFocus();
                    InAppMessageViewWrapper.this.announceForAccessibilityIfNecessary();
                    InAppMessageViewWrapper.this.mInAppMessageViewLifecycleListener.afterOpened(InAppMessageViewWrapper.this.mInAppMessageView, InAppMessageViewWrapper.this.mInAppMessage);
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }
            };
        }
        return new AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                InAppMessageViewWrapper.this.mInAppMessageView.clearAnimation();
                InAppMessageViewWrapper.this.mInAppMessageView.setVisibility(8);
                InAppMessageViewWrapper.this.closeInAppMessageView();
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        };
    }

    private OnClickListener createButtonClickListener() {
        return new OnClickListener() {
            public void onClick(View view) {
                C1263eg egVar = (C1263eg) InAppMessageViewWrapper.this.mInAppMessage;
                for (int i = 0; i < InAppMessageViewWrapper.this.mButtons.size(); i++) {
                    if (view.getId() == ((View) InAppMessageViewWrapper.this.mButtons.get(i)).getId()) {
                        InAppMessageViewWrapper.this.mInAppMessageViewLifecycleListener.onButtonClicked(new InAppMessageCloser(InAppMessageViewWrapper.this), (C1541ng) egVar.v().get(i), egVar);
                        return;
                    }
                }
            }
        };
    }

    private OnClickListener createClickListener() {
        return new OnClickListener() {
            public void onClick(View view) {
                if (InAppMessageViewWrapper.this.mInAppMessage instanceof C1263eg) {
                    C1263eg egVar = (C1263eg) InAppMessageViewWrapper.this.mInAppMessage;
                    if (egVar.v() == null || egVar.v().size() == 0) {
                        InAppMessageViewWrapper.this.mInAppMessageViewLifecycleListener.onClicked(new InAppMessageCloser(InAppMessageViewWrapper.this), InAppMessageViewWrapper.this.mInAppMessageView, InAppMessageViewWrapper.this.mInAppMessage);
                        return;
                    }
                    return;
                }
                InAppMessageViewWrapper.this.mInAppMessageViewLifecycleListener.onClicked(new InAppMessageCloser(InAppMessageViewWrapper.this), InAppMessageViewWrapper.this.mInAppMessageView, InAppMessageViewWrapper.this.mInAppMessage);
            }
        };
    }

    private OnClickListener createCloseInAppMessageClickListener() {
        return new OnClickListener() {
            public void onClick(View view) {
                AppboyInAppMessageManager.getInstance().hideCurrentlyDisplayingInAppMessage(true);
            }
        };
    }

    private DismissCallbacks createDismissCallbacks() {
        return new DismissCallbacks() {
            public boolean canDismiss(Object obj) {
                return true;
            }

            public void onDismiss(View view, Object obj) {
                InAppMessageViewWrapper.this.mInAppMessage.setAnimateOut(false);
                AppboyInAppMessageManager.getInstance().hideCurrentlyDisplayingInAppMessage(true);
            }
        };
    }

    private ITouchListener createTouchAwareListener() {
        return new ITouchListener() {
            public void onTouchEnded() {
                if (InAppMessageViewWrapper.this.mInAppMessage.getDismissType() == Rf.AUTO_DISMISS) {
                    InAppMessageViewWrapper.this.addDismissRunnable();
                }
            }

            public void onTouchStartedOrContinued() {
                InAppMessageViewWrapper.this.mInAppMessageView.removeCallbacks(InAppMessageViewWrapper.this.mDismissRunnable);
            }
        };
    }

    private LayoutParams getLayoutParams(FrameLayout frameLayout, int i) {
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        C0522cg cgVar = this.mInAppMessage;
        if (cgVar instanceof C1510mg) {
            layoutParams.gravity = ((C1510mg) cgVar).c() == Vf.TOP ? 48 : 80;
        }
        if (i > 0 && i == frameLayout.getHeight()) {
            int topVisibleCoordinate = ViewUtils.getTopVisibleCoordinate(frameLayout);
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Detected status bar height of ");
            sb.append(topVisibleCoordinate);
            sb.append(".");
            Hg.a(str, sb.toString());
            layoutParams.setMargins(0, topVisibleCoordinate, 0, 0);
        }
        return layoutParams;
    }

    private void setAndStartAnimation(boolean z) {
        Animation animation;
        if (z) {
            animation = this.mOpeningAnimation;
        } else {
            animation = this.mClosingAnimation;
        }
        animation.setAnimationListener(createAnimationListener(z));
        this.mInAppMessageView.clearAnimation();
        this.mInAppMessageView.setAnimation(animation);
        animation.startNow();
        this.mInAppMessageView.invalidate();
    }

    public void close() {
        this.mInAppMessageView.removeCallbacks(this.mDismissRunnable);
        this.mInAppMessageViewLifecycleListener.beforeClosed(this.mInAppMessageView, this.mInAppMessage);
        if (this.mInAppMessage.getAnimateOut()) {
            this.mIsAnimatingClose = true;
            setAndStartAnimation(false);
            return;
        }
        closeInAppMessageView();
    }

    public C0522cg getInAppMessage() {
        return this.mInAppMessage;
    }

    public View getInAppMessageView() {
        return this.mInAppMessageView;
    }

    public boolean getIsAnimatingClose() {
        return this.mIsAnimatingClose;
    }

    public void open(Activity activity) {
        final FrameLayout frameLayout = (FrameLayout) activity.getWindow().getDecorView().findViewById(16908290);
        int height = frameLayout.getHeight();
        final int displayHeight = ViewUtils.getDisplayHeight(activity);
        if (height == 0) {
            ViewTreeObserver viewTreeObserver = frameLayout.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        String access$000 = InAppMessageViewWrapper.TAG;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Detected root view height of ");
                        sb.append(frameLayout.getHeight());
                        sb.append(", display height of ");
                        sb.append(displayHeight);
                        sb.append(" in onGlobalLayout");
                        Hg.a(access$000, sb.toString());
                        frameLayout.removeView(InAppMessageViewWrapper.this.mInAppMessageView);
                        InAppMessageViewWrapper.this.open(frameLayout, displayHeight);
                        ViewUtils.removeOnGlobalLayoutListenerSafe(frameLayout.getViewTreeObserver(), this);
                    }
                });
                return;
            }
            return;
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Detected root view height of ");
        sb.append(height);
        sb.append(", display height of ");
        sb.append(displayHeight);
        Hg.a(str, sb.toString());
        open(frameLayout, displayHeight);
    }

    /* access modifiers changed from: private */
    public void open(FrameLayout frameLayout, int i) {
        this.mInAppMessageViewLifecycleListener.beforeOpened(this.mInAppMessageView, this.mInAppMessage);
        Hg.a(TAG, "Adding In-app message view to root FrameLayout.");
        frameLayout.addView(this.mInAppMessageView, getLayoutParams(frameLayout, i));
        if (this.mInAppMessage.getAnimateIn()) {
            Hg.a(TAG, "In-app message view will animate into the visible area.");
            setAndStartAnimation(true);
            return;
        }
        Hg.a(TAG, "In-app message view will be placed instantly into the visible area.");
        if (this.mInAppMessage.getDismissType() == Rf.AUTO_DISMISS) {
            addDismissRunnable();
        }
        this.mInAppMessageView.setFocusableInTouchMode(true);
        this.mInAppMessageView.requestFocus();
        announceForAccessibilityIfNecessary();
        this.mInAppMessageViewLifecycleListener.afterOpened(this.mInAppMessageView, this.mInAppMessage);
    }

    public InAppMessageViewWrapper(View view, C0522cg cgVar, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, Animation animation, Animation animation2, View view2, List<View> list, View view3) {
        this(view, cgVar, iInAppMessageViewLifecycleListener, animation, animation2, view2);
        if (view3 != null) {
            this.mCloseButton = view3;
            this.mCloseButton.setOnClickListener(createCloseInAppMessageClickListener());
        }
        if (list != null) {
            this.mButtons = list;
            for (View onClickListener : this.mButtons) {
                onClickListener.setOnClickListener(createButtonClickListener());
            }
        }
    }
}
