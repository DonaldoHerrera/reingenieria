package com.appboy.ui.inappmessage.listeners;

import com.appboy.ui.inappmessage.InAppMessageCloser;
import com.appboy.ui.inappmessage.InAppMessageOperation;

public class AppboyDefaultInAppMessageManagerListener implements IInAppMessageManagerListener {
    public InAppMessageOperation beforeInAppMessageDisplayed(C0522cg cgVar) {
        return InAppMessageOperation.DISPLAY_NOW;
    }

    public boolean onInAppMessageButtonClicked(C1541ng ngVar, InAppMessageCloser inAppMessageCloser) {
        return false;
    }

    public boolean onInAppMessageClicked(C0522cg cgVar, InAppMessageCloser inAppMessageCloser) {
        return false;
    }

    public void onInAppMessageDismissed(C0522cg cgVar) {
    }

    @Deprecated
    public boolean onInAppMessageReceived(C0522cg cgVar) {
        return false;
    }
}
