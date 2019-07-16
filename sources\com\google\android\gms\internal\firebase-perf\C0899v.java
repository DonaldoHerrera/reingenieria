package com.google.android.gms.internal.firebase-perf;

import android.util.Log;
import com.google.android.gms.internal.firebase-perf.C0857ka.a;
import com.google.android.gms.internal.firebase-perf.C0857ka.d;
import com.google.firebase.perf.internal.GaugeManager;
import com.google.firebase.perf.internal.SessionManager;
import com.google.firebase.perf.internal.b;
import com.google.firebase.perf.internal.c;
import com.google.firebase.perf.internal.y;
import com.google.firebase.perf.internal.zzq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-perf.v reason: case insensitive filesystem */
public final class C0899v extends b implements y {
    private final List<zzq> a;
    private final GaugeManager b;
    private c c;
    private final a d;
    private boolean e;
    private boolean f;
    private final WeakReference<y> g;

    private C0899v(c cVar) {
        this(cVar, com.google.firebase.perf.internal.a.a(), GaugeManager.zzbf());
    }

    public final void a(zzq zzq) {
        if (this.d.m() && !this.d.o()) {
            this.a.add(zzq);
        }
    }

    public final C0899v b(String str) {
        C0857ka.b bVar;
        if (str != null) {
            String upperCase = str.toUpperCase();
            char c2 = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c2 = 8;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    bVar = C0857ka.b.GET;
                    break;
                case 1:
                    bVar = C0857ka.b.PUT;
                    break;
                case 2:
                    bVar = C0857ka.b.POST;
                    break;
                case 3:
                    bVar = C0857ka.b.DELETE;
                    break;
                case 4:
                    bVar = C0857ka.b.HEAD;
                    break;
                case 5:
                    bVar = C0857ka.b.PATCH;
                    break;
                case 6:
                    bVar = C0857ka.b.OPTIONS;
                    break;
                case 7:
                    bVar = C0857ka.b.TRACE;
                    break;
                case 8:
                    bVar = C0857ka.b.CONNECT;
                    break;
                default:
                    bVar = C0857ka.b.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.d.a(bVar);
        }
        return this;
    }

    public final C0899v c(long j) {
        this.d.d(j);
        return this;
    }

    public final C0899v d(long j) {
        this.d.e(j);
        return this;
    }

    public final C0899v e(long j) {
        this.d.f(j);
        if (SessionManager.zzcf().zzcg().d()) {
            this.b.zzbh();
        }
        return this;
    }

    public final C0899v f(long j) {
        this.d.b(j);
        return this;
    }

    private C0899v(c cVar, com.google.firebase.perf.internal.a aVar, GaugeManager gaugeManager) {
        super(aVar);
        this.d = C0857ka.G();
        this.g = new WeakReference<>(this);
        this.c = cVar;
        this.b = gaugeManager;
        this.a = new ArrayList();
        zzay();
    }

    public final C0899v c(String str) {
        if (str == null) {
            this.d.p();
            return this;
        }
        boolean z = false;
        if (str.length() <= 128) {
            int i = 0;
            while (true) {
                if (i >= str.length()) {
                    z = true;
                    break;
                }
                char charAt = str.charAt(i);
                if (charAt <= 31 || charAt > 127) {
                    break;
                }
                i++;
            }
        }
        if (z) {
            this.d.b(str);
        } else {
            String str2 = "The content type of the response is not a valid content-type:";
            String valueOf = String.valueOf(str);
            Log.i("FirebasePerformance", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        return this;
    }

    public final C0857ka d() {
        SessionManager.zzcf().zzd(this.g);
        zzaz();
        C0892ta[] a2 = zzq.a(this.a);
        if (a2 != null) {
            this.d.a((Iterable<? extends C0892ta>) Arrays.asList(a2));
        }
        C0857ka kaVar = (C0857ka) this.d.b();
        if (!this.e) {
            c cVar = this.c;
            if (cVar != null) {
                cVar.a(kaVar, zzal());
            }
            this.e = true;
        } else if (this.f) {
            Log.i("FirebasePerformance", "This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
        }
        return kaVar;
    }

    public static C0899v a(c cVar) {
        return new C0899v(cVar);
    }

    public final C0899v a(String str) {
        if (str != null) {
            C7095oyb d2 = C7095oyb.d(str);
            if (d2 != null) {
                a i = d2.i();
                String str2 = "";
                i.g(str2);
                i.d(str2);
                i.e(null);
                i.b(null);
                str = i.toString();
            }
            a aVar = this.d;
            if (str.length() > 2000) {
                if (str.charAt(2000) != '/') {
                    C7095oyb d3 = C7095oyb.d(str);
                    if (d3 != null && d3.c().lastIndexOf(47) >= 0) {
                        int lastIndexOf = str.lastIndexOf(47, 1999);
                        if (lastIndexOf >= 0) {
                            str = str.substring(0, lastIndexOf);
                        }
                    }
                }
                str = str.substring(0, 2000);
            }
            aVar.a(str);
        }
        return this;
    }

    public final C0899v c() {
        this.d.a(d.GENERIC_CLIENT_ERROR);
        return this;
    }

    public final C0899v b(long j) {
        zzq zzcg = SessionManager.zzcf().zzcg();
        SessionManager.zzcf().zzc(this.g);
        this.d.c(j);
        this.a.add(zzcg);
        if (zzcg.d()) {
            this.b.zzbh();
        }
        return this;
    }

    public final C0899v a(int i) {
        this.d.a(i);
        return this;
    }

    public final boolean a() {
        return this.d.l();
    }

    public final C0899v a(long j) {
        this.d.a(j);
        return this;
    }

    public final long b() {
        return this.d.n();
    }
}
