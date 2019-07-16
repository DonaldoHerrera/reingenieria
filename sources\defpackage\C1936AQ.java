package defpackage;

import com.appboy.ui.inappmessage.InAppMessageOperation;
import com.appboy.ui.inappmessage.listeners.IInAppMessageManagerListener;

/* renamed from: AQ reason: default package and case insensitive filesystem */
/* compiled from: AppboyInAppMessageListenerFactory */
final class C1936AQ {
    private C1936AQ() {
    }

    static IInAppMessageManagerListener a() {
        return a(InAppMessageOperation.DISPLAY_LATER);
    }

    static IInAppMessageManagerListener b() {
        return a(InAppMessageOperation.DISPLAY_NOW);
    }

    private static IInAppMessageManagerListener a(InAppMessageOperation inAppMessageOperation) {
        return new C3399zQ(inAppMessageOperation);
    }
}
