package bo.app;

import java.util.concurrent.ThreadFactory;

public class l implements r {
    /* access modifiers changed from: private */
    public static final String a = Hg.a(l.class);
    private final Bf b;
    private final ct c;
    /* access modifiers changed from: private */
    public final p d;
    private final Object e = new Object();
    private volatile boolean f = false;
    private volatile Thread g;
    /* access modifiers changed from: private */
    public volatile boolean h = true;
    private cu i;
    private boolean j = false;

    class a implements Runnable {
        private a() {
        }

        public void run() {
            while (l.this.h) {
                try {
                    l.this.b(l.this.d.b());
                } catch (InterruptedException e) {
                    String b = l.a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Automatic thread interrupted! [");
                    sb.append(e.getMessage());
                    sb.append("]");
                    Hg.a(b, sb.toString());
                }
            }
        }
    }

    public l(Bf bf, ab abVar, ct ctVar, p pVar, ThreadFactory threadFactory, boolean z) {
        this.b = bf;
        this.c = ctVar;
        this.d = pVar;
        this.g = threadFactory.newThread(new a());
        this.i = new cu(abVar);
        this.j = z;
    }

    private cn c() {
        return new cn(this.b.f());
    }

    private void c(cr crVar) {
        if (crVar.i() || this.j) {
            this.i.b(crVar);
        } else {
            this.c.b(crVar);
        }
    }

    public void a(bo boVar) {
        this.d.a(boVar);
    }

    public void b(bo boVar) {
        this.d.b(boVar);
    }

    /* access modifiers changed from: private */
    public void b(cr crVar) {
        if (crVar.i() || this.j) {
            this.i.a(crVar);
        } else {
            this.c.a(crVar);
        }
    }

    public void a(cr crVar) {
        this.d.a(crVar);
    }

    public void a(bv bvVar) {
        this.d.a(bvVar);
    }

    public void a(aa aaVar) {
        synchronized (this.e) {
            this.h = false;
            this.g.interrupt();
            this.g = null;
        }
        if (!this.d.a()) {
            this.d.a((cr) c());
        }
        cr c2 = this.d.c();
        if (c2 != null) {
            c(c2);
        }
        aaVar.a();
    }

    public void a() {
        synchronized (this.e) {
            if (this.f) {
                Hg.a(a, "Automatic request execution start was previously requested, continuing without action.");
                return;
            }
            if (this.g != null) {
                this.g.start();
            }
            this.f = true;
        }
    }
}
