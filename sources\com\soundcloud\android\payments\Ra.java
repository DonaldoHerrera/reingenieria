package com.soundcloud.android.payments;

import android.webkit.JavascriptInterface;

/* compiled from: WebCheckoutInterface */
class Ra {
    private final a a;

    /* compiled from: WebCheckoutInterface */
    interface a {
        void a(String str);

        void o();

        void u();
    }

    Ra(a aVar) {
        this.a = aVar;
    }

    @JavascriptInterface
    public void onPaymentError(String str) {
        this.a.a(str);
    }

    @JavascriptInterface
    public void onPaymentSuccess() {
        this.a.u();
    }

    @JavascriptInterface
    public void onWebAppReady() {
        this.a.o();
    }
}
