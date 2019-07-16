package bo.app;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

class gl {
    final gk a;
    /* access modifiers changed from: private */
    public Executor b;
    /* access modifiers changed from: private */
    public Executor c;
    private Executor d;
    private final Map<Integer, String> e = Collections.synchronizedMap(new HashMap());
    private final Map<String, ReentrantLock> f = new WeakHashMap();
    private final AtomicBoolean g = new AtomicBoolean(false);
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final AtomicBoolean i = new AtomicBoolean(false);
    private final Object j = new Object();

    gl(gk gkVar) {
        this.a = gkVar;
        this.b = gkVar.g;
        this.c = gkVar.h;
        this.d = gg.a();
    }

    /* access modifiers changed from: private */
    public void e() {
        if (!this.a.i && ((ExecutorService) this.b).isShutdown()) {
            this.b = f();
        }
        if (!this.a.j && ((ExecutorService) this.c).isShutdown()) {
            this.c = f();
        }
    }

    private Executor f() {
        gk gkVar = this.a;
        return gg.a(gkVar.k, gkVar.l, gkVar.m);
    }

    /* access modifiers changed from: 0000 */
    public boolean d() {
        return this.i.get();
    }

    /* access modifiers changed from: 0000 */
    public void a(final gn gnVar) {
        this.d.execute(new Runnable() {
            public void run() {
                File a2 = gl.this.a.o.a(gnVar.a());
                boolean z = a2 != null && a2.exists();
                gl.this.e();
                if (z) {
                    gl.this.c.execute(gnVar);
                } else {
                    gl.this.b.execute(gnVar);
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void b(hi hiVar) {
        this.e.remove(Integer.valueOf(hiVar.f()));
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return this.h.get();
    }

    /* access modifiers changed from: 0000 */
    public void a(go goVar) {
        e();
        this.c.execute(goVar);
    }

    /* access modifiers changed from: 0000 */
    public Object b() {
        return this.j;
    }

    /* access modifiers changed from: 0000 */
    public String a(hi hiVar) {
        return (String) this.e.get(Integer.valueOf(hiVar.f()));
    }

    /* access modifiers changed from: 0000 */
    public void a(hi hiVar, String str) {
        this.e.put(Integer.valueOf(hiVar.f()), str);
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        this.h.set(z);
    }

    /* access modifiers changed from: 0000 */
    public void a(Runnable runnable) {
        this.d.execute(runnable);
    }

    /* access modifiers changed from: 0000 */
    public ReentrantLock a(String str) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f.get(str);
        if (reentrantLock != null) {
            return reentrantLock;
        }
        ReentrantLock reentrantLock2 = new ReentrantLock();
        this.f.put(str, reentrantLock2);
        return reentrantLock2;
    }

    /* access modifiers changed from: 0000 */
    public AtomicBoolean a() {
        return this.g;
    }
}
