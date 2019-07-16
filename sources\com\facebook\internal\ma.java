package com.facebook.internal;

import android.content.Context;
import android.webkit.WebView;

/* compiled from: WebDialog */
class ma extends WebView {
    final /* synthetic */ oa a;

    ma(oa oaVar, Context context) {
        this.a = oaVar;
        super(context);
    }

    public void onWindowFocusChanged(boolean z) {
        try {
            super.onWindowFocusChanged(z);
        } catch (NullPointerException unused) {
        }
    }
}
