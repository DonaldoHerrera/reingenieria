package com.appboy.ui.inappmessage.listeners;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import com.appboy.ui.AppboyNavigator;
import com.appboy.ui.actions.ActionFactory;
import com.appboy.ui.actions.NewsfeedAction;
import com.appboy.ui.inappmessage.AppboyInAppMessageManager;
import com.appboy.ui.inappmessage.InAppMessageCloser;

public class AppboyInAppMessageViewLifecycleListener implements IInAppMessageViewLifecycleListener {
    private static final String TAG = Hg.a(AppboyInAppMessageViewLifecycleListener.class);

    /* renamed from: com.appboy.ui.inappmessage.listeners.AppboyInAppMessageViewLifecycleListener$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$appboy$enums$inappmessage$ClickAction = new int[Pf.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            $SwitchMap$com$appboy$enums$inappmessage$ClickAction[Pf.NEWS_FEED.ordinal()] = 1;
            $SwitchMap$com$appboy$enums$inappmessage$ClickAction[Pf.URI.ordinal()] = 2;
            try {
                $SwitchMap$com$appboy$enums$inappmessage$ClickAction[Pf.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private AppboyInAppMessageManager getInAppMessageManager() {
        return AppboyInAppMessageManager.getInstance();
    }

    private void performClickAction(Pf pf, C0522cg cgVar, InAppMessageCloser inAppMessageCloser, Uri uri, boolean z) {
        if (getInAppMessageManager().getActivity() == null) {
            Hg.e(TAG, "Can't perform click action because the cached activity is null.");
            return;
        }
        int i = AnonymousClass2.$SwitchMap$com$appboy$enums$inappmessage$ClickAction[pf.ordinal()];
        if (i == 1) {
            inAppMessageCloser.close(false);
            AppboyNavigator.getAppboyNavigator().gotoNewsFeed(getInAppMessageManager().getActivity(), new NewsfeedAction(Ig.a(cgVar.getExtras()), Hf.INAPP_MESSAGE));
        } else if (i == 2) {
            inAppMessageCloser.close(false);
            AppboyNavigator.getAppboyNavigator().gotoUri(getInAppMessageManager().getActivity(), ActionFactory.createUriActionFromUri(uri, Ig.a(cgVar.getExtras()), z, Hf.INAPP_MESSAGE));
        } else if (i != 3) {
            inAppMessageCloser.close(false);
        } else {
            inAppMessageCloser.close(cgVar.getAnimateOut());
        }
    }

    private void performInAppMessageButtonClicked(C1541ng ngVar, C0522cg cgVar, InAppMessageCloser inAppMessageCloser) {
        performClickAction(ngVar.getClickAction(), cgVar, inAppMessageCloser, ngVar.getUri(), ngVar.i());
    }

    private void performInAppMessageClicked(C0522cg cgVar, InAppMessageCloser inAppMessageCloser) {
        performClickAction(cgVar.getClickAction(), cgVar, inAppMessageCloser, cgVar.getUri(), cgVar.getOpenUriInWebView());
    }

    private void startClearHtmlInAppMessageAssetsThread() {
        new Thread(new Runnable() {
            public void run() {
                Activity activity = AppboyInAppMessageManager.getInstance().getActivity();
                if (activity != null) {
                    Fg.a(Pg.a(activity));
                }
            }
        }).start();
    }

    public void afterClosed(C0522cg cgVar) {
        Hg.a(TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.afterClosed called.");
        getInAppMessageManager().resetAfterInAppMessageClose();
        if (cgVar instanceof C1233dg) {
            startClearHtmlInAppMessageAssetsThread();
        }
        cgVar.onAfterClosed();
    }

    public void afterOpened(View view, C0522cg cgVar) {
        Hg.a(TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.afterOpened called.");
    }

    public void beforeClosed(View view, C0522cg cgVar) {
        Hg.a(TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.beforeClosed called.");
    }

    public void beforeOpened(View view, C0522cg cgVar) {
        Hg.a(TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.beforeOpened called.");
        cgVar.logImpression();
    }

    public void onButtonClicked(InAppMessageCloser inAppMessageCloser, C1541ng ngVar, C1263eg egVar) {
        Hg.a(TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.onButtonClicked called.");
        egVar.a(ngVar);
        if (!getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageButtonClicked(ngVar, inAppMessageCloser)) {
            performInAppMessageButtonClicked(ngVar, egVar, inAppMessageCloser);
        }
    }

    public void onClicked(InAppMessageCloser inAppMessageCloser, View view, C0522cg cgVar) {
        Hg.a(TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.onClicked called.");
        cgVar.logClick();
        if (!getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageClicked(cgVar, inAppMessageCloser)) {
            performInAppMessageClicked(cgVar, inAppMessageCloser);
        }
    }

    public void onDismissed(View view, C0522cg cgVar) {
        Hg.a(TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.onDismissed called.");
        getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageDismissed(cgVar);
    }
}
