package com.google.firebase.perf.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.internal.firebase-perf.C0837fa;
import com.google.android.gms.internal.firebase-perf.C0857ka;
import com.google.android.gms.internal.firebase-perf.C0877pa;
import com.google.android.gms.internal.firebase-perf.C0907x;
import com.google.android.gms.internal.firebase-perf.Da;
import com.google.android.gms.internal.firebase-perf.L;
import com.google.android.gms.internal.firebase-perf.O;
import com.google.android.gms.internal.firebase-perf.T;
import com.google.android.gms.internal.firebase-perf.T.b;
import com.google.android.gms.internal.firebase-perf.V;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.perf.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class c {
    @SuppressLint({"StaticFieldLeak"})
    private static c a;
    private final ExecutorService b;
    private FirebaseApp c;
    private a d;
    private FirebaseInstanceId e;
    private Context f;
    private com.google.android.gms.clearcut.a g;
    private String h;
    private final b i = T.t();
    private r j;
    private a k;
    private FeatureControl l;
    private boolean m;

    private c(ExecutorService executorService, com.google.android.gms.clearcut.a aVar, r rVar, a aVar2, FirebaseInstanceId firebaseInstanceId, FeatureControl featureControl) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.b = threadPoolExecutor;
        this.g = null;
        this.j = null;
        this.k = null;
        this.e = null;
        this.l = null;
        this.b.execute(new f(this));
    }

    public static c a() {
        if (a == null) {
            synchronized (c.class) {
                if (a == null) {
                    try {
                        FirebaseApp.getInstance();
                        c cVar = new c(null, null, null, null, null, null);
                        a = cVar;
                    } catch (IllegalStateException unused) {
                        return null;
                    }
                }
            }
        }
        return a;
    }

    /* access modifiers changed from: private */
    public final void b(C0837fa faVar, V v) {
        if (b()) {
            String str = "FirebasePerformance";
            if (this.m) {
                Log.d(str, String.format("Logging GaugeMetric. Cpu Metrics: %d, Memory Metrics: %d, Has Metadata: %b, Session ID: %s", new Object[]{Integer.valueOf(faVar.s()), Integer.valueOf(faVar.t()), Boolean.valueOf(faVar.q()), faVar.p()}));
            }
            if (!this.l.zzap()) {
                if (this.m) {
                    Log.d(str, "Sessions are disabled. Not logging GaugeMetric.");
                }
                return;
            }
            C0877pa.a w = C0877pa.w();
            d();
            b bVar = this.i;
            bVar.a(v);
            w.a(bVar);
            w.a(faVar);
            a((C0877pa) w.b());
        }
    }

    /* access modifiers changed from: private */
    public final void c() {
        this.c = FirebaseApp.getInstance();
        this.d = a.b();
        this.f = this.c.b();
        this.h = this.c.d().b();
        b bVar = this.i;
        bVar.a(this.h);
        O.a q = O.q();
        q.a(this.f.getPackageName());
        q.b("1.0.0.249530108");
        q.c(a(this.f));
        bVar.a(q);
        d();
        if (this.g == null) {
            try {
                this.g = com.google.android.gms.clearcut.a.a(this.f, "FIREPERF");
            } catch (SecurityException e2) {
                String str = "Caught SecurityException while init ClearcutLogger: ";
                String valueOf = String.valueOf(e2.getMessage());
                Log.w("FirebasePerformance", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                this.g = null;
            }
        }
        r rVar = this.j;
        if (rVar == null) {
            rVar = new r(this.f, 100, 500);
        }
        this.j = rVar;
        a aVar = this.k;
        if (aVar == null) {
            aVar = a.a();
        }
        this.k = aVar;
        FeatureControl featureControl = this.l;
        if (featureControl == null) {
            featureControl = FeatureControl.zzao();
        }
        this.l = featureControl;
        this.m = L.a(this.f);
    }

    private final void d() {
        if (!this.i.l() && b()) {
            if (this.e == null) {
                this.e = FirebaseInstanceId.b();
            }
            String a2 = this.e.a();
            if (a2 != null && !a2.isEmpty()) {
                this.i.b(a2);
            }
        }
    }

    private final void e() {
        if (this.d == null) {
            this.d = this.c != null ? a.b() : null;
        }
    }

    public final void a(Da da, V v) {
        this.b.execute(new e(this, da, v));
        SessionManager.zzcf().zzch();
    }

    public final void a(C0857ka kaVar, V v) {
        this.b.execute(new h(this, kaVar, v));
        SessionManager.zzcf().zzch();
    }

    public final void a(C0837fa faVar, V v) {
        this.b.execute(new g(this, faVar, v));
        SessionManager.zzcf().zzch();
    }

    public final void a(boolean z) {
        this.b.execute(new j(this, z));
    }

    private final void a(C0877pa paVar) {
        if (this.g != null && b()) {
            String str = "FirebasePerformance";
            if (!paVar.p().p()) {
                Log.w(str, "App Instance ID is null or empty, dropping the log");
                return;
            }
            Context context = this.f;
            ArrayList arrayList = new ArrayList();
            if (paVar.q()) {
                arrayList.add(new k(paVar.r()));
            }
            if (paVar.s()) {
                arrayList.add(new l(paVar.t(), context));
            }
            if (paVar.o()) {
                arrayList.add(new d(paVar.p()));
            }
            if (paVar.u()) {
                arrayList.add(new i(paVar.v()));
            }
            boolean z = false;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = true;
                        break;
                    }
                    Object obj = arrayList.get(i2);
                    i2++;
                    if (!((q) obj).a()) {
                        break;
                    }
                }
            } else {
                Log.d(str, "No validators found for PerfMetric.");
            }
            if (!z) {
                Log.w(str, "Unable to process the PerfMetric due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.");
            } else if (!this.j.a(paVar)) {
                if (paVar.s()) {
                    this.k.a(C0907x.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1);
                } else if (paVar.q()) {
                    this.k.a(C0907x.TRACE_EVENT_RATE_LIMITED.toString(), 1);
                }
                if (this.m) {
                    if (paVar.s()) {
                        String str2 = "Rate Limited NetworkRequestMetric - ";
                        String valueOf = String.valueOf(paVar.t().o());
                        Log.i(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    } else if (paVar.q()) {
                        String str3 = "Rate Limited TraceMetric - ";
                        String valueOf2 = String.valueOf(paVar.r().p());
                        Log.i(str, valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
                    }
                }
            } else {
                try {
                    this.g.a(paVar.h()).a();
                } catch (SecurityException unused) {
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void b(Da da, V v) {
        Map map;
        if (b()) {
            String str = "FirebasePerformance";
            if (this.m) {
                Log.d(str, String.format("Logging TraceMetric - %s %dms", new Object[]{da.p(), Long.valueOf(da.o() / 1000)}));
            }
            if (!this.l.zzap()) {
                Da.b bVar = (Da.b) da.l();
                bVar.l();
                da = (Da) bVar.b();
                if (this.m) {
                    Log.d(str, String.format("Sessions are disabled. Dropping all sessions from Trace - %s", new Object[]{da.p()}));
                }
            }
            d();
            C0877pa.a w = C0877pa.w();
            b bVar2 = (b) this.i.clone();
            bVar2.a(v);
            e();
            a aVar = this.d;
            if (aVar != null) {
                map = aVar.a();
            } else {
                map = Collections.emptyMap();
            }
            bVar2.a(map);
            w.a(bVar2);
            w.a(da);
            a((C0877pa) w.b());
        }
    }

    /* access modifiers changed from: private */
    public final void b(C0857ka kaVar, V v) {
        long j2;
        if (b()) {
            String str = "FirebasePerformance";
            if (this.m) {
                long j3 = 0;
                if (!kaVar.D()) {
                    j2 = 0;
                } else {
                    j2 = kaVar.E();
                }
                if (kaVar.u()) {
                    j3 = kaVar.v();
                }
                Log.d(str, String.format("Logging NetworkRequestMetric - %s %db %dms,", new Object[]{kaVar.o(), Long.valueOf(j3), Long.valueOf(j2 / 1000)}));
            }
            if (!this.l.zzap()) {
                C0857ka.a aVar = (C0857ka.a) kaVar.l();
                aVar.q();
                kaVar = (C0857ka) aVar.b();
                if (this.m) {
                    Log.d(str, String.format("Sessions are disabled. Dropping all sessions from Network Request - %s", new Object[]{kaVar.o()}));
                }
            }
            d();
            C0877pa.a w = C0877pa.w();
            b bVar = this.i;
            bVar.a(v);
            w.a(bVar);
            w.a(kaVar);
            a((C0877pa) w.b());
        }
    }

    private static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException unused) {
            return "";
        }
    }

    public final void b(boolean z) {
        this.j.a(z);
    }

    private final boolean b() {
        e();
        a aVar = this.d;
        if (aVar != null) {
            return aVar.c();
        }
        return false;
    }
}
