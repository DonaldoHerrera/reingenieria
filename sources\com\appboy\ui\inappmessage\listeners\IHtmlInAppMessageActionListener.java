package com.appboy.ui.inappmessage.listeners;

import android.os.Bundle;

public interface IHtmlInAppMessageActionListener {
    void onCloseClicked(C0522cg cgVar, String str, Bundle bundle);

    boolean onCustomEventFired(C0522cg cgVar, String str, Bundle bundle);

    boolean onNewsfeedClicked(C0522cg cgVar, String str, Bundle bundle);

    boolean onOtherUrlAction(C0522cg cgVar, String str, Bundle bundle);
}
