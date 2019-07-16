package defpackage;

import android.webkit.WebView;

/* renamed from: ZG reason: default package and case insensitive filesystem */
class C2404ZG implements Runnable {
    final /* synthetic */ WebView a;
    final /* synthetic */ String b;
    final /* synthetic */ C2423_G c;

    C2404ZG(C2423_G _g, WebView webView, String str) {
        this.c = _g;
        this.a = webView;
        this.b = str;
    }

    public void run() {
        this.a.loadUrl(this.b);
    }
}
