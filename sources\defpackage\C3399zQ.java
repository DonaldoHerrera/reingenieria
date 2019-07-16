package defpackage;

import com.appboy.ui.inappmessage.InAppMessageCloser;
import com.appboy.ui.inappmessage.InAppMessageOperation;
import com.appboy.ui.inappmessage.listeners.IInAppMessageManagerListener;

/* renamed from: zQ reason: default package and case insensitive filesystem */
/* compiled from: AppboyInAppMessageListenerFactory */
class C3399zQ implements IInAppMessageManagerListener {
    final /* synthetic */ InAppMessageOperation a;

    C3399zQ(InAppMessageOperation inAppMessageOperation) {
        this.a = inAppMessageOperation;
    }

    public InAppMessageOperation beforeInAppMessageDisplayed(C0522cg cgVar) {
        return this.a;
    }

    public boolean onInAppMessageButtonClicked(C1541ng ngVar, InAppMessageCloser inAppMessageCloser) {
        return false;
    }

    public boolean onInAppMessageClicked(C0522cg cgVar, InAppMessageCloser inAppMessageCloser) {
        return false;
    }

    public void onInAppMessageDismissed(C0522cg cgVar) {
    }

    public boolean onInAppMessageReceived(C0522cg cgVar) {
        return false;
    }
}
