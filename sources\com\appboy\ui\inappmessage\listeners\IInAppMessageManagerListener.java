package com.appboy.ui.inappmessage.listeners;

import com.appboy.ui.inappmessage.InAppMessageCloser;
import com.appboy.ui.inappmessage.InAppMessageOperation;

public interface IInAppMessageManagerListener {
    InAppMessageOperation beforeInAppMessageDisplayed(C0522cg cgVar);

    boolean onInAppMessageButtonClicked(C1541ng ngVar, InAppMessageCloser inAppMessageCloser);

    boolean onInAppMessageClicked(C0522cg cgVar, InAppMessageCloser inAppMessageCloser);

    void onInAppMessageDismissed(C0522cg cgVar);

    @Deprecated
    boolean onInAppMessageReceived(C0522cg cgVar);
}
