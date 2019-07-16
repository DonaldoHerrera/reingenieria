package com.google.firebase.perf.internal;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.firebase-perf.V;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Keep
public class SessionManager extends b {
    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager zzfi = new SessionManager();
    private final GaugeManager zzbl;
    private final a zzcx;
    private final Set<WeakReference<y>> zzfj;
    private zzq zzfk;

    private SessionManager() {
        this(GaugeManager.zzbf(), zzq.b(), a.a());
    }

    public static SessionManager zzcf() {
        return zzfi;
    }

    public final void zza(V v) {
        super.zza(v);
        if (!this.zzcx.b()) {
            if (v == V.FOREGROUND) {
                zzc(v);
                return;
            }
            if (!zzch()) {
                zzd(v);
            }
        }
    }

    public final void zzc(V v) {
        this.zzfk = zzq.b();
        synchronized (this.zzfj) {
            Iterator it = this.zzfj.iterator();
            while (it.hasNext()) {
                y yVar = (y) ((WeakReference) it.next()).get();
                if (yVar != null) {
                    yVar.a(this.zzfk);
                } else {
                    it.remove();
                }
            }
        }
        if (this.zzfk.d()) {
            this.zzbl.zzc(this.zzfk.c(), v);
        }
        zzd(v);
    }

    public final zzq zzcg() {
        return this.zzfk;
    }

    /* access modifiers changed from: 0000 */
    public final boolean zzch() {
        if (!this.zzfk.a()) {
            return false;
        }
        zzc(this.zzcx.c());
        return true;
    }

    public final void zzd(WeakReference<y> weakReference) {
        synchronized (this.zzfj) {
            this.zzfj.remove(weakReference);
        }
    }

    @VisibleForTesting
    private SessionManager(GaugeManager gaugeManager, zzq zzq, a aVar) {
        this.zzfj = new HashSet();
        this.zzbl = gaugeManager;
        this.zzfk = zzq;
        this.zzcx = aVar;
        zzay();
    }

    private final void zzd(V v) {
        if (this.zzfk.d()) {
            this.zzbl.zza(this.zzfk.c(), v);
        } else {
            this.zzbl.zzbg();
        }
    }

    public final void zzc(WeakReference<y> weakReference) {
        synchronized (this.zzfj) {
            this.zzfj.add(weakReference);
        }
    }
}
