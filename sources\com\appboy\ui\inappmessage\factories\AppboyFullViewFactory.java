package com.appboy.ui.inappmessage.factories;

import android.app.Activity;
import android.widget.RelativeLayout.LayoutParams;
import com.appboy.ui.R$layout;
import com.appboy.ui.inappmessage.IInAppMessageViewFactory;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageFullView;
import com.appboy.ui.support.FrescoLibraryUtils;
import com.appboy.ui.support.ViewUtils;

public class AppboyFullViewFactory implements IInAppMessageViewFactory {
    /* access modifiers changed from: 0000 */
    public AppboyInAppMessageFullView getAppropriateFullView(Activity activity, boolean z) {
        if (z) {
            return (AppboyInAppMessageFullView) activity.getLayoutInflater().inflate(R$layout.com_appboy_inappmessage_full_graphic, null);
        }
        return (AppboyInAppMessageFullView) activity.getLayoutInflater().inflate(R$layout.com_appboy_inappmessage_full, null);
    }

    /* access modifiers changed from: 0000 */
    public boolean resetLayoutParamsIfAppropriate(Activity activity, C0522cg cgVar, AppboyInAppMessageFullView appboyInAppMessageFullView) {
        LayoutParams layoutParams;
        if (!(!ViewUtils.isRunningOnTablet(activity) || cgVar.getOrientation() == null || cgVar.getOrientation() == Uf.ANY)) {
            int longEdge = appboyInAppMessageFullView.getLongEdge();
            int shortEdge = appboyInAppMessageFullView.getShortEdge();
            if (longEdge > 0 && shortEdge > 0) {
                if (cgVar.getOrientation() == Uf.LANDSCAPE) {
                    layoutParams = new LayoutParams(longEdge, shortEdge);
                } else {
                    layoutParams = new LayoutParams(shortEdge, longEdge);
                }
                layoutParams.addRule(13, -1);
                appboyInAppMessageFullView.getMessageBackgroundObject().setLayoutParams(layoutParams);
                return true;
            }
        }
        return false;
    }

    public AppboyInAppMessageFullView createInAppMessageView(Activity activity, C0522cg cgVar) {
        C1356hg hgVar = (C1356hg) cgVar;
        boolean equals = hgVar.u().equals(Sf.GRAPHIC);
        AppboyInAppMessageFullView appropriateFullView = getAppropriateFullView(activity, equals);
        appropriateFullView.inflateStubViews(activity, hgVar);
        if (FrescoLibraryUtils.canUseFresco(activity.getApplicationContext())) {
            appropriateFullView.setMessageSimpleDrawee(hgVar);
        } else {
            appropriateFullView.setMessageImageView(hgVar.getBitmap());
        }
        appropriateFullView.getFrameView().setOnClickListener(null);
        appropriateFullView.setMessageBackgroundColor(hgVar.getBackgroundColor());
        appropriateFullView.setFrameColor(hgVar.c());
        appropriateFullView.setMessageButtons(hgVar.v());
        appropriateFullView.setMessageCloseButtonColor(hgVar.b());
        if (!equals) {
            appropriateFullView.setMessage(hgVar.getMessage());
            appropriateFullView.setMessageTextColor(hgVar.getMessageTextColor());
            appropriateFullView.setMessageHeaderText(hgVar.d());
            appropriateFullView.setMessageHeaderTextColor(hgVar.f());
            appropriateFullView.setMessageHeaderTextAlignment(hgVar.e());
            appropriateFullView.setMessageTextAlign(hgVar.getMessageTextAlign());
            appropriateFullView.resetMessageMargins(hgVar.getImageDownloadSuccessful());
        }
        resetLayoutParamsIfAppropriate(activity, hgVar, appropriateFullView);
        return appropriateFullView;
    }
}
