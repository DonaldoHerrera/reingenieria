package com.google.android.gms.internal.cast;

import android.text.TextUtils;

public class O {
    protected final C0710ia a;
    private final String b;
    private C0716la c;

    protected O(String str, String str2, String str3) {
        X.a(str);
        this.b = str;
        this.a = new C0710ia(str2);
        a(str3);
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.a.a(str);
        }
    }

    public void b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final long c() {
        return this.c.a();
    }

    public final String a() {
        return this.b;
    }

    public final void a(C0716la laVar) {
        this.c = laVar;
        if (this.c == null) {
            b();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str, long j, String str2) throws IllegalStateException {
        Object[] objArr = {str, null};
        this.c.a(this.b, str, j, null);
    }
}
