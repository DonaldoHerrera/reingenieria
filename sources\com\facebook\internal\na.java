package com.facebook.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* compiled from: WebDialog */
class na implements OnTouchListener {
    final /* synthetic */ oa a;

    na(oa oaVar) {
        this.a = oaVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!view.hasFocus()) {
            view.requestFocus();
        }
        return false;
    }
}
