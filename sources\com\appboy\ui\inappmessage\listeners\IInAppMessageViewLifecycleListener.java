package com.appboy.ui.inappmessage.listeners;

import android.view.View;
import com.appboy.ui.inappmessage.InAppMessageCloser;

public interface IInAppMessageViewLifecycleListener {
    void afterClosed(C0522cg cgVar);

    void afterOpened(View view, C0522cg cgVar);

    void beforeClosed(View view, C0522cg cgVar);

    void beforeOpened(View view, C0522cg cgVar);

    void onButtonClicked(InAppMessageCloser inAppMessageCloser, C1541ng ngVar, C1263eg egVar);

    void onClicked(InAppMessageCloser inAppMessageCloser, View view, C0522cg cgVar);

    void onDismissed(View view, C0522cg cgVar);
}
