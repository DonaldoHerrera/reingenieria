package com.appboy.ui.inappmessage.listeners;

import android.os.Bundle;

public interface IInAppMessageWebViewClientListener {
    void onCloseAction(C0522cg cgVar, String str, Bundle bundle);

    void onCustomEventAction(C0522cg cgVar, String str, Bundle bundle);

    void onNewsfeedAction(C0522cg cgVar, String str, Bundle bundle);

    void onOtherUrlAction(C0522cg cgVar, String str, Bundle bundle);
}
