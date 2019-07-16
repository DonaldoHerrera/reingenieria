package com.google.android.gms.internal.firebase-perf;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.firebase-perf.z reason: case insensitive filesystem */
public final class C0915z {
    private final Bundle a;

    public C0915z() {
        this(new Bundle());
    }

    public final boolean a(String str) {
        return this.a.containsKey(str);
    }

    public C0915z(Bundle bundle) {
        this.a = (Bundle) bundle.clone();
    }

    public final boolean a(String str, boolean z) {
        return this.a.getBoolean(str, z);
    }

    public final int a(String str, int i) {
        return this.a.getInt(str, i);
    }

    public final float a(String str, float f) {
        return this.a.getFloat(str, f);
    }
}
