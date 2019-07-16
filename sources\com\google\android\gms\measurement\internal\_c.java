package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

final class _c implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ zzjn b;
    private final /* synthetic */ zzn c;
    private final /* synthetic */ Yc d;

    _c(Yc yc, boolean z, zzjn zzjn, zzn zzn) {
        this.d = yc;
        this.a = z;
        this.b = zzjn;
        this.c = zzn;
    }

    public final void run() {
        _a d2 = this.d.d;
        if (d2 == null) {
            this.d.e().s().a("Discarding data. Failed to set user attribute");
            return;
        }
        this.d.a(d2, (AbstractSafeParcelable) this.a ? null : this.b, this.c);
        this.d.I();
    }
}
