package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: xH reason: default package and case insensitive filesystem */
public class C3350xH implements a {
    private final BlockingQueue<Runnable> a = new LinkedBlockingQueue();
    private final ThreadPoolExecutor b;
    private final ArrayDeque<C3330wH> c = new ArrayDeque<>();
    private C3330wH d = null;

    public C3350xH() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.a);
        this.b = threadPoolExecutor;
    }

    private void a() {
        this.d = (C3330wH) this.c.poll();
        C3330wH wHVar = this.d;
        if (wHVar != null) {
            wHVar.a(this.b);
        }
    }

    public void a(C3330wH wHVar) {
        this.d = null;
        a();
    }

    public void b(C3330wH wHVar) {
        wHVar.a((a) this);
        this.c.add(wHVar);
        if (this.d == null) {
            a();
        }
    }
}
