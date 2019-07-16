package com.appboy.ui.inappmessage.listeners;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.appboy.h;
import com.appboy.ui.AppboyNavigator;
import com.appboy.ui.actions.ActionFactory;
import com.appboy.ui.actions.NewsfeedAction;
import com.appboy.ui.actions.UriAction;
import com.appboy.ui.inappmessage.AppboyInAppMessageManager;

public class AppboyInAppMessageWebViewClientListener implements IInAppMessageWebViewClientListener {
    private static final String TAG = Hg.a(AppboyInAppMessageWebViewClientListener.class);

    private AppboyInAppMessageManager getInAppMessageManager() {
        return AppboyInAppMessageManager.getInstance();
    }

    private void logHtmlInAppMessageClick(C0522cg cgVar, Bundle bundle) {
        if (bundle != null) {
            String str = "abButtonId";
            if (bundle.containsKey(str)) {
                ((C1233dg) cgVar).b(bundle.getString(str));
                return;
            }
        }
        cgVar.logClick();
    }

    static String parseCustomEventNameFromQueryBundle(Bundle bundle) {
        return bundle.getString("name");
    }

    static C1782vg parsePropertiesFromQueryBundle(Bundle bundle) {
        C1782vg vgVar = new C1782vg();
        for (String str : bundle.keySet()) {
            if (!str.equals("name")) {
                String string = bundle.getString(str, null);
                if (!Ng.d(string)) {
                    vgVar.a(str, string);
                }
            }
        }
        return vgVar;
    }

    static boolean parseUseWebViewFromQueryBundle(C0522cg cgVar, Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        String str = "abDeepLink";
        if (bundle.containsKey(str)) {
            z = Boolean.parseBoolean(bundle.getString(str));
            z2 = true;
        } else {
            z2 = false;
            z = false;
        }
        String str2 = "abExternalOpen";
        if (bundle.containsKey(str2)) {
            z3 = Boolean.parseBoolean(bundle.getString(str2));
            z2 = true;
        } else {
            z3 = false;
        }
        boolean openUriInWebView = cgVar.getOpenUriInWebView();
        if (z2) {
            return !z && !z3;
        }
        return openUriInWebView;
    }

    public void onCloseAction(C0522cg cgVar, String str, Bundle bundle) {
        Hg.a(TAG, "IInAppMessageWebViewClientListener.onCloseAction called.");
        logHtmlInAppMessageClick(cgVar, bundle);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
        getInAppMessageManager().getHtmlInAppMessageActionListener().onCloseClicked(cgVar, str, bundle);
    }

    public void onCustomEventAction(C0522cg cgVar, String str, Bundle bundle) {
        Hg.a(TAG, "IInAppMessageWebViewClientListener.onCustomEventAction called.");
        if (getInAppMessageManager().getActivity() == null) {
            Hg.e(TAG, "Can't perform custom event action because the activity is null.");
            return;
        }
        if (!getInAppMessageManager().getHtmlInAppMessageActionListener().onCustomEventFired(cgVar, str, bundle)) {
            String parseCustomEventNameFromQueryBundle = parseCustomEventNameFromQueryBundle(bundle);
            if (!Ng.d(parseCustomEventNameFromQueryBundle)) {
                h.a((Context) getInAppMessageManager().getActivity()).a(parseCustomEventNameFromQueryBundle, parsePropertiesFromQueryBundle(bundle));
            }
        }
    }

    public void onNewsfeedAction(C0522cg cgVar, String str, Bundle bundle) {
        Hg.a(TAG, "IInAppMessageWebViewClientListener.onNewsfeedAction called.");
        if (getInAppMessageManager().getActivity() == null) {
            Hg.e(TAG, "Can't perform news feed action because the cached activity is null.");
            return;
        }
        logHtmlInAppMessageClick(cgVar, bundle);
        if (!getInAppMessageManager().getHtmlInAppMessageActionListener().onNewsfeedClicked(cgVar, str, bundle)) {
            cgVar.setAnimateOut(false);
            getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
            AppboyNavigator.getAppboyNavigator().gotoNewsFeed(getInAppMessageManager().getActivity(), new NewsfeedAction(Ig.a(cgVar.getExtras()), Hf.INAPP_MESSAGE));
        }
    }

    public void onOtherUrlAction(C0522cg cgVar, String str, Bundle bundle) {
        Hg.a(TAG, "IInAppMessageWebViewClientListener.onOtherUrlAction called.");
        if (getInAppMessageManager().getActivity() == null) {
            Hg.e(TAG, "Can't perform other url action because the cached activity is null.");
            return;
        }
        logHtmlInAppMessageClick(cgVar, bundle);
        if (!getInAppMessageManager().getHtmlInAppMessageActionListener().onOtherUrlAction(cgVar, str, bundle)) {
            boolean parseUseWebViewFromQueryBundle = parseUseWebViewFromQueryBundle(cgVar, bundle);
            Bundle a = Ig.a(cgVar.getExtras());
            a.putAll(bundle);
            UriAction createUriActionFromUrlString = ActionFactory.createUriActionFromUrlString(str, a, parseUseWebViewFromQueryBundle, Hf.INAPP_MESSAGE);
            Uri uri = createUriActionFromUrlString.getUri();
            if (uri == null || !Fg.a(uri)) {
                cgVar.setAnimateOut(false);
                getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
                if (createUriActionFromUrlString != null) {
                    AppboyNavigator.getAppboyNavigator().gotoUri(getInAppMessageManager().getApplicationContext(), createUriActionFromUrlString);
                }
            } else {
                String str2 = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Not passing local URI to AppboyNavigator. Got local uri: ");
                sb.append(uri);
                Hg.e(str2, sb.toString());
            }
        }
    }
}
