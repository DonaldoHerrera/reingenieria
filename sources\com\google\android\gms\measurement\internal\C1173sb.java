package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.sb reason: case insensitive filesystem */
final class C1173sb implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ C1159pb b;

    C1173sb(C1159pb pbVar, boolean z) {
        this.b = pbVar;
        this.a = z;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
