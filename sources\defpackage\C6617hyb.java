package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: hyb reason: default package and case insensitive filesystem */
/* compiled from: Dispatcher */
public final class C6617hyb {
    private int a = 64;
    private int b = 5;
    private Runnable c;
    private ExecutorService d;
    private final Deque<a> e = new ArrayDeque();
    private final Deque<a> f = new ArrayDeque();
    private final Deque<C7578vyb> g = new ArrayDeque();

    private boolean c() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a aVar = (a) it.next();
                if (this.f.size() >= this.a) {
                    break;
                } else if (aVar.c().get() < this.b) {
                    it.remove();
                    aVar.c().incrementAndGet();
                    arrayList.add(aVar);
                    this.f.add(aVar);
                }
            }
            z = b() > 0;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((a) arrayList.get(i)).a(a());
        }
        return z;
    }

    public synchronized ExecutorService a() {
        if (this.d == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), Kyb.a("OkHttp Dispatcher", false));
            this.d = threadPoolExecutor;
        }
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public void b(a aVar) {
        aVar.c().decrementAndGet();
        a(this.f, aVar);
    }

    /* access modifiers changed from: 0000 */
    public void b(C7578vyb vyb) {
        a(this.g, vyb);
    }

    public synchronized int b() {
        return this.f.size() + this.g.size();
    }

    /* access modifiers changed from: 0000 */
    public void a(a aVar) {
        synchronized (this) {
            this.e.add(aVar);
            if (!aVar.d().d) {
                a a2 = a(aVar.e());
                if (a2 != null) {
                    aVar.a(a2);
                }
            }
        }
        c();
    }

    private a a(String str) {
        for (a aVar : this.f) {
            if (aVar.e().equals(str)) {
                return aVar;
            }
        }
        for (a aVar2 : this.e) {
            if (aVar2.e().equals(str)) {
                return aVar2;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public synchronized void a(C7578vyb vyb) {
        this.g.add(vyb);
    }

    private <T> void a(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!c() && runnable != null) {
            runnable.run();
        }
    }
}
