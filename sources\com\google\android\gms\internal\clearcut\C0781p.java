package com.google.android.gms.internal.clearcut;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.clearcut.p reason: case insensitive filesystem */
public final class C0781p {
    /* access modifiers changed from: private */
    public final String a;
    /* access modifiers changed from: private */
    public final Uri b;
    /* access modifiers changed from: private */
    public final String c;
    /* access modifiers changed from: private */
    public final String d;
    /* access modifiers changed from: private */
    public final boolean e;
    /* access modifiers changed from: private */
    public final boolean f;

    public C0781p(Uri uri) {
        this(null, uri, "", "", false, false);
    }

    private C0781p(String str, Uri uri, String str2, String str3, boolean z, boolean z2) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
    }

    public final <T> C0751f<T> a(String str, T t, C0778o<T> oVar) {
        return C0751f.b(this, str, t, oVar);
    }

    public final C0751f<String> a(String str, String str2) {
        return C0751f.b(this, str, (String) null);
    }

    public final C0751f<Boolean> a(String str, boolean z) {
        return C0751f.b(this, str, false);
    }

    public final C0781p a(String str) {
        boolean z = this.e;
        if (!z) {
            C0781p pVar = new C0781p(this.a, this.b, str, this.d, z, this.f);
            return pVar;
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final C0781p b(String str) {
        C0781p pVar = new C0781p(this.a, this.b, this.c, str, this.e, this.f);
        return pVar;
    }
}
