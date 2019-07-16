package com.appboy.ui.inappmessage.factories;

import android.app.Activity;
import com.appboy.ui.R$layout;
import com.appboy.ui.inappmessage.IInAppMessageViewFactory;
import com.appboy.ui.inappmessage.InAppMessageWebViewClient;
import com.appboy.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageHtmlFullView;

public class AppboyHtmlFullViewFactory implements IInAppMessageViewFactory {
    private IInAppMessageWebViewClientListener mInAppMessageWebViewClientListener;

    public AppboyHtmlFullViewFactory(IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener) {
        this.mInAppMessageWebViewClientListener = iInAppMessageWebViewClientListener;
    }

    public AppboyInAppMessageHtmlFullView createInAppMessageView(Activity activity, C0522cg cgVar) {
        AppboyInAppMessageHtmlFullView appboyInAppMessageHtmlFullView = (AppboyInAppMessageHtmlFullView) activity.getLayoutInflater().inflate(R$layout.com_appboy_inappmessage_html_full, null);
        appboyInAppMessageHtmlFullView.setWebViewContent(cgVar.getMessage(), ((C1417jg) cgVar).c());
        appboyInAppMessageHtmlFullView.setInAppMessageWebViewClient(new InAppMessageWebViewClient(activity.getApplicationContext(), cgVar, this.mInAppMessageWebViewClientListener));
        return appboyInAppMessageHtmlFullView;
    }
}
