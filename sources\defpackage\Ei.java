package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@C5445XNa({Ji.class})
/* renamed from: Ei reason: default package */
/* compiled from: CrashlyticsCore */
public class Ei extends C5531_Ma<Void> {
    private final long g;
    private final ConcurrentHashMap<String, String> h;
    /* access modifiers changed from: private */
    public Fi i;
    private Fi j;
    private Hi k;
    private C1874yi l;
    private String m;
    private String n;
    private String o;
    private float p;
    private boolean q;
    private final C1297fj r;
    private C4839DOa s;
    private Wh t;
    private Ji u;

    /* renamed from: Ei$a */
    /* compiled from: CrashlyticsCore */
    public static class a {
        private float a = -1.0f;
        private Hi b;
        private C1297fj c;
        private boolean d = false;

        public a a(Hi hi) {
            if (hi == null) {
                throw new IllegalArgumentException("listener must not be null.");
            } else if (this.b == null) {
                this.b = hi;
                return this;
            } else {
                throw new IllegalStateException("listener already set.");
            }
        }

        public Ei a() {
            if (this.a < 0.0f) {
                this.a = 1.0f;
            }
            return new Ei(this.a, this.b, this.c, this.d);
        }
    }

    /* renamed from: Ei$b */
    /* compiled from: CrashlyticsCore */
    private static final class b implements Callable<Boolean> {
        private final Fi a;

        public b(Fi fi) {
            this.a = fi;
        }

        public Boolean call() throws Exception {
            if (!this.a.b()) {
                return Boolean.FALSE;
            }
            C5328TMa.e().d("CrashlyticsCore", "Found previous crash marker.");
            this.a.c();
            return Boolean.TRUE;
        }
    }

    /* renamed from: Ei$c */
    /* compiled from: CrashlyticsCore */
    private static final class c implements Hi {
        private c() {
        }

        public void a() {
        }

        /* synthetic */ c(Bi bi) {
            this();
        }
    }

    public Ei() {
        this(1.0f, null, null, false);
    }

    public static Ei O() {
        return (Ei) C5328TMa.a(Ei.class);
    }

    private void V() {
        if (Boolean.TRUE.equals((Boolean) this.t.b(new b(this.j)))) {
            try {
                this.k.a();
            } catch (Exception e) {
                C5328TMa.e().e("CrashlyticsCore", "Exception thrown by CrashlyticsListener while notifying of previous crash.", e);
            }
        }
    }

    private void W() {
        Bi bi = new Bi(this);
        for (C6434fOa a2 : f()) {
            bi.a(a2);
        }
        Future submit = g().b().submit(bi);
        String str = "CrashlyticsCore";
        C5328TMa.e().d(str, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            C5328TMa.e().e(str, "Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            C5328TMa.e().e(str, "Problem encountered during Crashlytics initialization.", e2);
        } catch (TimeoutException e3) {
            C5328TMa.e().e(str, "Crashlytics timed out during initialization.", e3);
        }
    }

    private void b(int i2, String str, String str2) {
        if (!this.q && b("prior to logging messages.")) {
            this.l.a(System.currentTimeMillis() - this.g, c(i2, str, str2));
        }
    }

    private static String c(int i2, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(C7391tNa.a(i2));
        sb.append("/");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public boolean K() {
        return a(super.e());
    }

    /* access modifiers changed from: 0000 */
    public void L() {
        this.j.a();
    }

    /* access modifiers changed from: 0000 */
    public boolean M() {
        return this.i.b();
    }

    /* access modifiers changed from: 0000 */
    public Map<String, String> N() {
        return Collections.unmodifiableMap(this.h);
    }

    /* access modifiers changed from: 0000 */
    public Ii P() {
        Ji ji = this.u;
        if (ji != null) {
            return ji.b();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public String Q() {
        if (u().a()) {
            return this.n;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public String R() {
        if (u().a()) {
            return this.m;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public String S() {
        if (u().a()) {
            return this.o;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void T() {
        this.t.a((Callable<T>) new Di<T>(this));
    }

    /* access modifiers changed from: 0000 */
    public void U() {
        this.t.b(new Ci(this));
    }

    public String v() {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    public String x() {
        return "2.7.0.33";
    }

    Ei(float f, Hi hi, C1297fj fjVar, boolean z) {
        this(f, hi, fjVar, z, C4807CNa.a("Crashlytics Exception Handler"));
    }

    private static String c(String str) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > 1024 ? trim.substring(0, 1024) : trim;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Context context) {
        Context context2 = context;
        String str = "CrashlyticsCore";
        if (!C7598wNa.a(context).a()) {
            C5328TMa.e().d(str, "Crashlytics is disabled, because data collection is disabled by Firebase.");
            this.q = true;
        }
        if (this.q) {
            return false;
        }
        String d = new C7184qNa().d(context2);
        if (d == null) {
            return false;
        }
        String n2 = C7391tNa.n(context);
        if (a(n2, C7391tNa.a(context2, "com.crashlytics.RequireBuildId", true))) {
            try {
                C5701cNa e = C5328TMa.e();
                StringBuilder sb = new StringBuilder();
                sb.append("Initializing Crashlytics Core ");
                sb.append(x());
                e.i(str, sb.toString());
                C5025JOa jOa = new C5025JOa(this);
                this.j = new Fi("crash_marker", jOa);
                this.i = new Fi("initialization_marker", jOa);
                C1328gj a2 = C1328gj.a(new C5088LOa(e(), "com.crashlytics.android.core.CrashlyticsCore"), this);
                C4901FOa ki = this.r != null ? new Ki(this.r) : null;
                this.s = new C7737yOa(C5328TMa.e());
                this.s.a(ki);
                C4931GNa u2 = u();
                Gh a3 = Gh.a(context2, u2, d, n2);
                C1874yi yiVar = r1;
                C1874yi yiVar2 = new C1874yi(this, this.t, this.s, u2, a2, jOa, a3, new C1575oj(context2, new Zi(context2, a3.d)), new Pi(this), C1295fh.a(context));
                this.l = yiVar;
                boolean M = M();
                V();
                this.l.a(Thread.getDefaultUncaughtExceptionHandler(), new C4900FNa().e(context2));
                if (!M || !C7391tNa.b(context)) {
                    C5328TMa.e().d(str, "Exception handling initialization successful");
                    return true;
                }
                C5328TMa.e().d(str, "Crashlytics did not finish previous background initialization. Initializing synchronously.");
                W();
                return false;
            } catch (Exception e2) {
                C5328TMa.e().e(str, "Crashlytics was not started due to an exception during initialization", e2);
                this.l = null;
                return false;
            }
        } else {
            throw new C6502gOa("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        }
    }

    /* access modifiers changed from: protected */
    public Void d() {
        String str = "CrashlyticsCore";
        U();
        this.l.b();
        try {
            this.l.l();
            C6503gPa a2 = C6299dPa.b().a();
            if (a2 == null) {
                C5328TMa.e().w(str, "Received null settings, skipping report submission!");
                T();
                return null;
            }
            this.l.a(a2);
            if (!a2.d.c) {
                C5328TMa.e().d(str, "Collection of crash reports disabled in Crashlytics settings.");
                T();
                return null;
            } else if (!C7598wNa.a(e()).a()) {
                C5328TMa.e().d(str, "Automatic collection of crash reports disabled by Firebase settings.");
                T();
                return null;
            } else {
                Ii P = P();
                if (P != null && !this.l.a(P)) {
                    C5328TMa.e().d(str, "Could not finalize previous NDK sessions.");
                }
                if (!this.l.b(a2.b)) {
                    C5328TMa.e().d(str, "Could not finalize previous sessions.");
                }
                this.l.a(this.p, a2);
                T();
                return null;
            }
        } catch (Exception e) {
            C5328TMa.e().e(str, "Crashlytics encountered a problem during asynchronous initialization.", e);
        } catch (Throwable th) {
            T();
            throw th;
        }
    }

    Ei(float f, Hi hi, C1297fj fjVar, boolean z, ExecutorService executorService) {
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = f;
        if (hi == null) {
            hi = new c(null);
        }
        this.k = hi;
        this.r = fjVar;
        this.q = z;
        this.t = new Wh(executorService);
        this.h = new ConcurrentHashMap<>();
        this.g = System.currentTimeMillis();
    }

    public void b(String str, boolean z) {
        a(str, Boolean.toString(z));
    }

    private static boolean b(String str) {
        Ei O = O();
        if (O != null && O.l != null) {
            return true;
        }
        C5701cNa e = C5328TMa.e();
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics must be initialized by calling Fabric.with(Context) ");
        sb.append(str);
        e.e("CrashlyticsCore", sb.toString(), null);
        return false;
    }

    public void a(Throwable th) {
        if (this.q || !b("prior to logging exceptions.")) {
            return;
        }
        if (th == null) {
            C5328TMa.e().log(5, "CrashlyticsCore", "Crashlytics is ignoring a request to log a null exception.");
        } else {
            this.l.a(Thread.currentThread(), th);
        }
    }

    public void a(String str) {
        b(3, "CrashlyticsCore", str);
    }

    public void a(int i2, String str, String str2) {
        b(i2, str, str2);
        C5701cNa e = C5328TMa.e();
        StringBuilder sb = new StringBuilder();
        String str3 = "";
        sb.append(str3);
        sb.append(str);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str3);
        sb3.append(str2);
        e.a(i2, sb2, sb3.toString(), true);
    }

    public void a(String str, String str2) {
        String str3;
        if (!this.q && b("prior to setting keys.")) {
            String str4 = "CrashlyticsCore";
            if (str == null) {
                Context e = e();
                if (e == null || !C7391tNa.j(e)) {
                    C5328TMa.e().e(str4, "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            String c2 = c(str);
            if (this.h.size() < 64 || this.h.containsKey(c2)) {
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = c(str2);
                }
                this.h.put(c2, str3);
                this.l.a((Map<String, String>) this.h);
                return;
            }
            C5328TMa.e().d(str4, "Exceeded maximum number of custom attributes (64)");
        }
    }

    public void a(String str, int i2) {
        a(str, Integer.toString(i2));
    }

    public void a(String str, long j2) {
        a(str, Long.toString(j2));
    }

    /* access modifiers changed from: 0000 */
    public void a(Ji ji) {
        this.u = ji;
    }

    static boolean a(String str, boolean z) {
        String str2 = "CrashlyticsCore";
        if (!z) {
            C5328TMa.e().d(str2, "Configured not to require a build ID.");
            return true;
        } else if (!C7391tNa.b(str)) {
            return true;
        } else {
            String str3 = ".";
            Log.e(str2, str3);
            Log.e(str2, ".     |  | ");
            String str4 = ".     |  |";
            Log.e(str2, str4);
            Log.e(str2, str4);
            Log.e(str2, ".   \\ |  | /");
            Log.e(str2, ".    \\    /");
            Log.e(str2, ".     \\  /");
            Log.e(str2, ".      \\/");
            Log.e(str2, str3);
            Log.e(str2, "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
            Log.e(str2, str3);
            Log.e(str2, ".      /\\");
            Log.e(str2, ".     /  \\");
            Log.e(str2, ".    /    \\");
            Log.e(str2, ".   / |  | \\");
            Log.e(str2, str4);
            Log.e(str2, str4);
            Log.e(str2, str4);
            Log.e(str2, str3);
            return false;
        }
    }
}
