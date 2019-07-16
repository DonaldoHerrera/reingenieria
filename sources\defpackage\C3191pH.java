package defpackage;

import android.webkit.WebView;

/* renamed from: pH reason: default package and case insensitive filesystem */
class C3191pH implements Runnable {
    private WebView a = this.b.f;
    final /* synthetic */ C3210qH b;

    C3191pH(C3210qH qHVar) {
        this.b = qHVar;
    }

    public void run() {
        this.a.destroy();
    }
}
