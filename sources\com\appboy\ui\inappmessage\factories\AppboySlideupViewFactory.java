package com.appboy.ui.inappmessage.factories;

import android.app.Activity;
import com.appboy.ui.R$layout;
import com.appboy.ui.inappmessage.IInAppMessageViewFactory;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageSlideupView;
import com.appboy.ui.support.FrescoLibraryUtils;

public class AppboySlideupViewFactory implements IInAppMessageViewFactory {
    public AppboyInAppMessageSlideupView createInAppMessageView(Activity activity, C0522cg cgVar) {
        C1510mg mgVar = (C1510mg) cgVar;
        AppboyInAppMessageSlideupView appboyInAppMessageSlideupView = (AppboyInAppMessageSlideupView) activity.getLayoutInflater().inflate(R$layout.com_appboy_inappmessage_slideup, null);
        appboyInAppMessageSlideupView.inflateStubViews(cgVar);
        if (FrescoLibraryUtils.canUseFresco(activity.getApplicationContext())) {
            appboyInAppMessageSlideupView.setMessageSimpleDrawee(cgVar);
        } else {
            appboyInAppMessageSlideupView.setMessageImageView(mgVar.getBitmap());
        }
        appboyInAppMessageSlideupView.setMessageBackgroundColor(mgVar.getBackgroundColor());
        appboyInAppMessageSlideupView.setMessage(mgVar.getMessage());
        appboyInAppMessageSlideupView.setMessageTextColor(mgVar.getMessageTextColor());
        appboyInAppMessageSlideupView.setMessageTextAlign(mgVar.getMessageTextAlign());
        appboyInAppMessageSlideupView.setMessageIcon(mgVar.getIcon(), mgVar.getIconColor(), mgVar.getIconBackgroundColor());
        appboyInAppMessageSlideupView.setMessageChevron(mgVar.b(), mgVar.getClickAction());
        appboyInAppMessageSlideupView.resetMessageMargins(cgVar.getImageDownloadSuccessful());
        return appboyInAppMessageSlideupView;
    }
}
