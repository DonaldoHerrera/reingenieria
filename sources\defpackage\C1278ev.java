package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: ev reason: default package and case insensitive filesystem */
public final class C1278ev {
    private static final Map<String, C1278ev> a = new HashMap();
    private static final Executor b = C1401iv.a;
    private final ExecutorService c;
    private final C1737tv d;
    private Wy<C1432jv> e = null;

    private C1278ev(ExecutorService executorService, C1737tv tvVar) {
        this.c = executorService;
        this.d = tvVar;
    }

    private final synchronized void d(C1432jv jvVar) {
        this.e = Zy.a(jvVar);
    }

    public final Wy<C1432jv> a(C1432jv jvVar) {
        d(jvVar);
        return a(jvVar, false);
    }

    public final C1432jv b() {
        return a(5);
    }

    public final synchronized Wy<C1432jv> c() {
        if (this.e == null || (this.e.d() && !this.e.e())) {
            ExecutorService executorService = this.c;
            C1737tv tvVar = this.d;
            tvVar.getClass();
            this.e = Zy.a((Executor) executorService, C1309fv.a(tvVar));
        }
        return this.e;
    }

    public final Wy<C1432jv> b(C1432jv jvVar) {
        return a(jvVar, true);
    }

    /* JADX INFO: used method not loaded: Wy.a(java.util.concurrent.Executor, Ty):null, types can be incorrect */
    /* JADX INFO: used method not loaded: Wy.a(java.util.concurrent.Executor, Sy):null, types can be incorrect */
    /* JADX INFO: used method not loaded: Wy.a(java.util.concurrent.Executor, Qy):null, types can be incorrect */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r6 = c();
        r0 = java.util.concurrent.TimeUnit.SECONDS;
        r1 = new defpackage.C1463kv(null);
        r6.a(b, (defpackage.Ty) r1);
        r6.a(b, (defpackage.Sy) r1);
        r6.a(b, (defpackage.Qy) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r1.a(5, r0) == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r6.e() == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        return (defpackage.C1432jv) r6.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        throw new java.util.concurrent.ExecutionException(r6.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        throw new java.util.concurrent.TimeoutException("Task await timed out.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        android.util.Log.d("ConfigCacheClient", "Reading from storage file failed.", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        return null;
     */
    public final C1432jv a(long j) {
        synchronized (this) {
            if (this.e != null && this.e.e()) {
                C1432jv jvVar = (C1432jv) this.e.b();
                return jvVar;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Void c(C1432jv jvVar) throws Exception {
        return this.d.a(jvVar);
    }

    public final Wy<C1432jv> a(C1432jv jvVar, boolean z) {
        return Zy.a((Executor) this.c, (Callable<TResult>) new C1247dv<TResult>(this, jvVar)).a((Executor) this.c, (Vy<TResult, TContinuationResult>) new C1340gv<TResult,TContinuationResult>(this, z, jvVar));
    }

    public final void a() {
        synchronized (this) {
            this.e = Zy.a(null);
        }
        this.d.c();
    }

    public static synchronized C1278ev a(ExecutorService executorService, C1737tv tvVar) {
        C1278ev evVar;
        synchronized (C1278ev.class) {
            String a2 = tvVar.a();
            if (!a.containsKey(a2)) {
                a.put(a2, new C1278ev(executorService, tvVar));
            }
            evVar = (C1278ev) a.get(a2);
        }
        return evVar;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Wy a(boolean z, C1432jv jvVar, Void voidR) throws Exception {
        if (z) {
            d(jvVar);
        }
        return Zy.a(jvVar);
    }
}
