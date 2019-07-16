package com.appboy.ui.inappmessage.factories;

import android.app.Activity;
import com.appboy.ui.R$layout;
import com.appboy.ui.inappmessage.IInAppMessageViewFactory;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageModalView;
import com.appboy.ui.support.FrescoLibraryUtils;

public class AppboyModalViewFactory implements IInAppMessageViewFactory {
    /* access modifiers changed from: 0000 */
    public AppboyInAppMessageModalView getAppropriateModalView(Activity activity, boolean z) {
        if (z) {
            return (AppboyInAppMessageModalView) activity.getLayoutInflater().inflate(R$layout.com_appboy_inappmessage_modal_graphic, null);
        }
        return (AppboyInAppMessageModalView) activity.getLayoutInflater().inflate(R$layout.com_appboy_inappmessage_modal, null);
    }

    public AppboyInAppMessageModalView createInAppMessageView(Activity activity, C0522cg cgVar) {
        C1479lg lgVar = (C1479lg) cgVar;
        boolean equals = lgVar.u().equals(Sf.GRAPHIC);
        AppboyInAppMessageModalView appropriateModalView = getAppropriateModalView(activity, equals);
        appropriateModalView.inflateStubViews(activity, lgVar);
        if (FrescoLibraryUtils.canUseFresco(activity.getApplicationContext())) {
            appropriateModalView.setMessageSimpleDrawee(lgVar, activity);
        } else {
            appropriateModalView.setMessageImageView(lgVar.getBitmap());
        }
        appropriateModalView.getFrameView().setOnClickListener(null);
        appropriateModalView.setMessageBackgroundColor(cgVar.getBackgroundColor());
        appropriateModalView.setFrameColor(lgVar.c());
        appropriateModalView.setMessageButtons(lgVar.v());
        appropriateModalView.setMessageCloseButtonColor(lgVar.b());
        if (!equals) {
            appropriateModalView.setMessage(cgVar.getMessage());
            appropriateModalView.setMessageTextColor(cgVar.getMessageTextColor());
            appropriateModalView.setMessageHeaderText(lgVar.d());
            appropriateModalView.setMessageHeaderTextColor(lgVar.f());
            appropriateModalView.setMessageIcon(cgVar.getIcon(), cgVar.getIconColor(), cgVar.getIconBackgroundColor());
            appropriateModalView.setMessageHeaderTextAlignment(lgVar.e());
            appropriateModalView.setMessageTextAlign(lgVar.getMessageTextAlign());
            appropriateModalView.resetMessageMargins(cgVar.getImageDownloadSuccessful());
        }
        return appropriateModalView;
    }
}
