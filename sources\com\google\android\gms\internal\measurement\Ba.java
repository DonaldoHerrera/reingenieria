package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;

public final class Ba {
    private final String a;
    /* access modifiers changed from: private */
    public final Uri b;
    /* access modifiers changed from: private */
    public final String c;
    /* access modifiers changed from: private */
    public final String d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final Fa<Context, Boolean> i;

    public Ba(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final C1047ua<Long> a(String str, long j) {
        return C1047ua.b(this, str, j);
    }

    private Ba(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, Fa<Context, Boolean> fa) {
        this.a = null;
        this.b = uri;
        this.c = str2;
        this.d = str3;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = null;
    }

    public final C1047ua<Boolean> a(String str, boolean z) {
        return C1047ua.b(this, str, z);
    }

    public final C1047ua<Double> a(String str, double d2) {
        return C1047ua.b(this, str, -3.0d);
    }

    public final C1047ua<String> a(String str, String str2) {
        return C1047ua.b(this, str, str2);
    }
}
