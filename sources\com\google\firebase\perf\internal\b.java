package com.google.firebase.perf.internal;

import com.google.android.gms.internal.firebase-perf.V;
import com.google.firebase.perf.internal.a.C0053a;
import java.lang.ref.WeakReference;

public class b implements C0053a {
    private a zzcj;
    private V zzck;
    private boolean zzcl;
    private WeakReference<C0053a> zzcm;

    protected b() {
        this(a.a());
    }

    public void zza(V v) {
        V v2 = this.zzck;
        V v3 = V.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (v2 == v3) {
            this.zzck = v;
            return;
        }
        if (!(v2 == v || v == v3)) {
            this.zzck = V.FOREGROUND_BACKGROUND;
        }
    }

    public final V zzal() {
        return this.zzck;
    }

    /* access modifiers changed from: protected */
    public final void zzay() {
        if (!this.zzcl) {
            this.zzck = this.zzcj.c();
            this.zzcj.a(this.zzcm);
            this.zzcl = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzaz() {
        if (this.zzcl) {
            this.zzcj.b(this.zzcm);
            this.zzcl = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzc(int i) {
        this.zzcj.a(1);
    }

    protected b(a aVar) {
        this.zzck = V.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.zzcl = false;
        this.zzcj = aVar;
        this.zzcm = new WeakReference<>(this);
    }
}
