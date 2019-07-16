package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.i reason: case insensitive filesystem */
final /* synthetic */ class C0760i implements C0775n {
    private final String a;
    private final boolean b = false;

    C0760i(String str, boolean z) {
        this.a = str;
    }

    public final Object a() {
        return Boolean.valueOf(xc.a(C0751f.b.getContentResolver(), this.a, this.b));
    }
}
