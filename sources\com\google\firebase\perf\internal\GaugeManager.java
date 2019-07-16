package com.google.firebase.perf.internal;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.internal.firebase-perf.C0819ba;
import com.google.android.gms.internal.firebase-perf.C0837fa;
import com.google.android.gms.internal.firebase-perf.C0880q;
import com.google.android.gms.internal.firebase-perf.C0895u;
import com.google.android.gms.internal.firebase-perf.P;
import com.google.android.gms.internal.firebase-perf.V;
import com.google.android.gms.internal.firebase-perf.W;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@Keep
public class GaugeManager {
    private static GaugeManager zzdn = new GaugeManager();
    private final FeatureControl zzcy;
    private final ScheduledExecutorService zzdo;
    private final C0880q zzdp;
    private final C0895u zzdq;
    private c zzdr;
    private p zzds;
    private V zzdt;
    private String zzdu;
    private ScheduledFuture zzdv;
    private final ConcurrentLinkedQueue<a> zzdw;

    class a {
        /* access modifiers changed from: private */
        public final C0837fa a;
        /* access modifiers changed from: private */
        public final V b;

        a(GaugeManager gaugeManager, C0837fa faVar, V v) {
            this.a = faVar;
            this.b = v;
        }
    }

    private GaugeManager() {
        this(Executors.newSingleThreadScheduledExecutor(), null, FeatureControl.zzao(), null, C0880q.a(), C0895u.e());
    }

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final void zze(String str, V v) {
        com.google.android.gms.internal.firebase-perf.C0837fa.a u = C0837fa.u();
        while (!this.zzdp.h.isEmpty()) {
            u.a((W) this.zzdp.h.poll());
        }
        while (!this.zzdq.c.isEmpty()) {
            u.a((P) this.zzdq.c.poll());
        }
        u.a(str);
        zzc((C0837fa) u.b(), v);
    }

    public static synchronized GaugeManager zzbf() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = zzdn;
        }
        return gaugeManager;
    }

    public static void zzbi() {
        zza(true, true, C0880q.a(), C0895u.e());
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00af  */
    public final void zza(String str, V v) {
        long j;
        boolean z;
        int i;
        long j2;
        if (this.zzdu != null) {
            zzbg();
        }
        int i2 = n.a[v.ordinal()];
        if (i2 == 1) {
            j = this.zzcy.zzav();
        } else if (i2 != 2) {
            j = -1;
        } else {
            j = this.zzcy.zzat();
        }
        if (j == -1 || j <= 0) {
            j = -1;
        }
        boolean z2 = false;
        String str2 = "FirebasePerformance";
        if (!this.zzcy.zzaq()) {
            Log.d(str2, "Cpu Metrics collection is disabled. Did not collect Cpu Metrics.");
        } else if (j == -1) {
            Log.d(str2, "Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
        } else {
            this.zzdp.a(j);
            z = true;
            if (!z) {
                j = -1;
            }
            i = n.a[v.ordinal()];
            if (i != 1) {
                j2 = this.zzcy.zzaw();
            } else if (i != 2) {
                j2 = -1;
            } else {
                j2 = this.zzcy.zzau();
            }
            if (j2 == -1 || j2 <= 0) {
                j2 = -1;
            }
            if (this.zzcy.zzar()) {
                Log.d(str2, "Memory Metrics collection is disabled. Did not collect Memory Metrics.");
            } else if (j2 == -1) {
                Log.d(str2, "Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            } else {
                this.zzdq.a(j2);
                z2 = true;
            }
            if (z2) {
                if (j != -1) {
                    j2 = Math.min(j, j2);
                }
                j = j2;
            }
            if (j != -1) {
                Log.w(str2, "Invalid gauge collection frequency. Unable to start collecting Gauges.");
                return;
            }
            this.zzdu = str;
            this.zzdt = v;
            try {
                long j3 = j * 20;
                this.zzdv = this.zzdo.scheduleAtFixedRate(new m(this, str, v), j3, j3, TimeUnit.MILLISECONDS);
                return;
            } catch (RejectedExecutionException e) {
                String str3 = "Unable to start collecting Gauges: ";
                String valueOf = String.valueOf(e.getMessage());
                Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                return;
            }
        }
        z = false;
        if (!z) {
        }
        i = n.a[v.ordinal()];
        if (i != 1) {
        }
        j2 = -1;
        if (this.zzcy.zzar()) {
        }
        if (z2) {
        }
        if (j != -1) {
        }
    }

    public final void zzbg() {
        String str = this.zzdu;
        if (str != null) {
            V v = this.zzdt;
            this.zzdp.b();
            this.zzdq.c();
            ScheduledFuture scheduledFuture = this.zzdv;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.zzdo.schedule(new o(this, str, v), 20, TimeUnit.MILLISECONDS);
            this.zzdu = null;
            this.zzdt = V.APPLICATION_PROCESS_STATE_UNKNOWN;
        }
    }

    public final void zzbh() {
        zza(this.zzcy.zzaq(), this.zzcy.zzar(), this.zzdp, this.zzdq);
    }

    /* access modifiers changed from: 0000 */
    public final boolean zzc(String str, V v) {
        if (this.zzds == null) {
            return false;
        }
        com.google.android.gms.internal.firebase-perf.C0837fa.a u = C0837fa.u();
        u.a(str);
        com.google.android.gms.internal.firebase-perf.C0819ba.a p = C0819ba.p();
        p.a(this.zzds.a());
        p.a(this.zzds.d());
        p.b(this.zzds.b());
        p.c(this.zzds.c());
        u.a((C0819ba) p.b());
        zzc((C0837fa) u.b(), v);
        return true;
    }

    public final void zze(Context context) {
        this.zzds = new p(context);
    }

    private GaugeManager(ScheduledExecutorService scheduledExecutorService, c cVar, FeatureControl featureControl, p pVar, C0880q qVar, C0895u uVar) {
        this.zzdt = V.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.zzdu = null;
        this.zzdv = null;
        this.zzdw = new ConcurrentLinkedQueue<>();
        this.zzdo = scheduledExecutorService;
        this.zzdr = null;
        this.zzcy = featureControl;
        this.zzds = null;
        this.zzdp = qVar;
        this.zzdq = uVar;
    }

    private final void zzc(C0837fa faVar, V v) {
        c cVar = this.zzdr;
        if (cVar == null) {
            cVar = c.a();
        }
        this.zzdr = cVar;
        c cVar2 = this.zzdr;
        if (cVar2 != null) {
            cVar2.a(faVar, v);
            while (!this.zzdw.isEmpty()) {
                a aVar = (a) this.zzdw.poll();
                this.zzdr.a(aVar.a, aVar.b);
            }
            return;
        }
        this.zzdw.add(new a(this, faVar, v));
    }

    private static void zza(boolean z, boolean z2, C0880q qVar, C0895u uVar) {
        String str = "FirebasePerformance";
        if (z) {
            qVar.c();
        } else {
            Log.d(str, "Cpu Metrics collection is disabled. Did not collect Cpu Metric.");
        }
        if (z2) {
            uVar.d();
        } else {
            Log.d(str, "Memory Metrics collection is disabled. Did not collect Memory Metric.");
        }
    }
}
