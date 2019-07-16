package com.appboy.ui.inappmessage;

import android.app.Activity;
import android.view.View;

public interface IInAppMessageViewWrapper {
    void close();

    C0522cg getInAppMessage();

    View getInAppMessageView();

    boolean getIsAnimatingClose();

    void open(Activity activity);
}
