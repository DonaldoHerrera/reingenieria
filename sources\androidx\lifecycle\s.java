package androidx.lifecycle;

import android.os.Handler;

/* compiled from: ServiceLifecycleDispatcher */
public class s {
    private final j a;
    private final Handler b = new Handler();
    private a c;

    /* compiled from: ServiceLifecycleDispatcher */
    static class a implements Runnable {
        private final j a;
        final androidx.lifecycle.f.a b;
        private boolean c = false;

        a(j jVar, androidx.lifecycle.f.a aVar) {
            this.a = jVar;
            this.b = aVar;
        }

        public void run() {
            if (!this.c) {
                this.a.b(this.b);
                this.c = true;
            }
        }
    }

    public s(h hVar) {
        this.a = new j(hVar);
    }

    private void a(androidx.lifecycle.f.a aVar) {
        a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.run();
        }
        this.c = new a(this.a, aVar);
        this.b.postAtFrontOfQueue(this.c);
    }

    public void b() {
        a(androidx.lifecycle.f.a.ON_START);
    }

    public void c() {
        a(androidx.lifecycle.f.a.ON_CREATE);
    }

    public void d() {
        a(androidx.lifecycle.f.a.ON_STOP);
        a(androidx.lifecycle.f.a.ON_DESTROY);
    }

    public void e() {
        a(androidx.lifecycle.f.a.ON_START);
    }

    public f a() {
        return this.a;
    }
}
