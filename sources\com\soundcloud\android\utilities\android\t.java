package com.soundcloud.android.utilities.android;

import android.content.Context;

/* compiled from: WebViewHelper.kt */
public class t {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(t.class), "webviewUserAgent", "getWebviewUserAgent()Ljava/lang/String;"))};
    private final C7744yVa b = BVa.a(new s(this));
    private final Context c;
    private final n d;

    public t(Context context, n nVar) {
        C7471uYa.b(context, "context");
        C7471uYa.b(nVar, "userAgentFetcher");
        this.c = context;
        this.d = nVar;
    }

    /* access modifiers changed from: private */
    public String b() {
        try {
            return C7315sGa.b.d(this.d.a(this.c));
        } catch (Exception unused) {
            return null;
        }
    }

    public String a() {
        C7744yVa yva = this.b;
        DZa dZa = a[0];
        return (String) yva.getValue();
    }
}
