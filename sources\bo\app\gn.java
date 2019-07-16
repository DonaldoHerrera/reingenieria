package bo.app;

import android.graphics.Bitmap;
import android.os.Handler;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

final class gn implements bo.app.hq.a, Runnable {
    final String a;
    final hi b;
    final gi c;
    final hl d;
    final hm e;
    private final gl f;
    private final gm g;
    private final Handler h;
    /* access modifiers changed from: private */
    public final gk i;
    private final hh j;
    private final hh k;
    private final hh l;
    private final hc m;
    private final String n;
    private final gt o;
    private final boolean p;
    private gu q = gu.NETWORK;

    class a extends Exception {
        a() {
        }
    }

    public gn(gl glVar, gm gmVar, Handler handler) {
        this.f = glVar;
        this.g = gmVar;
        this.h = handler;
        this.i = glVar.a;
        gk gkVar = this.i;
        this.j = gkVar.p;
        this.k = gkVar.s;
        this.l = gkVar.t;
        this.m = gkVar.q;
        this.a = gmVar.a;
        this.n = gmVar.b;
        this.b = gmVar.c;
        this.o = gmVar.d;
        this.c = gmVar.e;
        this.d = gmVar.f;
        this.e = gmVar.g;
        this.p = this.c.s();
    }

    private boolean b() {
        AtomicBoolean a2 = this.f.a();
        if (a2.get()) {
            synchronized (this.f.b()) {
                if (a2.get()) {
                    hr.a("ImageLoader is paused. Waiting...  [%s]", this.n);
                    try {
                        this.f.b().wait();
                        hr.a(".. Resume loading [%s]", this.n);
                    } catch (InterruptedException unused) {
                        hr.d("Task was interrupted [%s]", this.n);
                        return true;
                    }
                }
            }
        }
        return j();
    }

    private boolean c() {
        if (!this.c.f()) {
            return false;
        }
        hr.a("Delay %d ms before loading...  [%s]", Integer.valueOf(this.c.l()), this.n);
        try {
            Thread.sleep((long) this.c.l());
            return j();
        } catch (InterruptedException unused) {
            hr.d("Task was interrupted [%s]", this.n);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r1.getHeight() > 0) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cd, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cc A[ExcHandler: a (r0v1 'e' bo.app.gn$a A[CUSTOM_DECLARE]), Splitter:B:1:0x0001] */
    private Bitmap d() {
        Bitmap bitmap;
        try {
            File a2 = this.i.o.a(this.a);
            if (a2 == null || !a2.exists() || a2.length() <= 0) {
                bitmap = null;
            } else {
                hr.a("Load image from disk cache [%s]", this.n);
                this.q = gu.DISC_CACHE;
                i();
                bitmap = a(bo.app.hh.a.FILE.b(a2.getAbsolutePath()));
            }
            if (bitmap != null) {
                if (bitmap.getWidth() > 0) {
                }
            }
            hr.a("Load image from network [%s]", this.n);
            this.q = gu.NETWORK;
            String str = this.a;
            if (this.c.i() && e()) {
                File a3 = this.i.o.a(this.a);
                if (a3 != null) {
                    str = bo.app.hh.a.FILE.b(a3.getAbsolutePath());
                }
            }
            i();
            bitmap = a(str);
            if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
                a(bo.app.gq.a.DECODING_ERROR, (Throwable) null);
            }
        } catch (IllegalStateException unused) {
            bitmap = null;
            a(bo.app.gq.a.NETWORK_DENIED, (Throwable) null);
            return bitmap;
        } catch (a e2) {
        } catch (IOException e3) {
            Throwable th = e3;
            bitmap = null;
            Throwable e4 = th;
            hr.a(e4);
            a(bo.app.gq.a.IO_ERROR, e4);
            return bitmap;
        } catch (OutOfMemoryError e5) {
            Throwable th2 = e5;
            bitmap = null;
            Throwable e6 = th2;
            hr.a(e6);
            a(bo.app.gq.a.OUT_OF_MEMORY, e6);
            return bitmap;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            bitmap = null;
            Throwable th5 = th4;
            hr.a(th5);
            a(bo.app.gq.a.UNKNOWN, th5);
            return bitmap;
        }
        return bitmap;
    }

    private boolean e() {
        hr.a("Cache image on disk [%s]", this.n);
        try {
            boolean f2 = f();
            if (!f2) {
                return f2;
            }
            int i2 = this.i.d;
            int i3 = this.i.e;
            if (i2 <= 0 && i3 <= 0) {
                return f2;
            }
            hr.a("Resize image in disk cache [%s]", this.n);
            b(i2, i3);
            return f2;
        } catch (IOException e2) {
            hr.a((Throwable) e2);
            return false;
        }
    }

    private boolean f() {
        InputStream a2 = h().a(this.a, this.c.n());
        if (a2 == null) {
            hr.d("No stream for image [%s]", this.n);
            return false;
        }
        try {
            return this.i.o.a(this.a, a2, this);
        } finally {
            hq.a((Closeable) a2);
        }
    }

    private void g() {
        if (!this.p && !p()) {
            a(new Runnable() {
                public void run() {
                    gn gnVar = gn.this;
                    gnVar.d.b(gnVar.a, gnVar.b.d());
                }
            }, false, this.h, this.f);
        }
    }

    private hh h() {
        if (this.f.c()) {
            return this.k;
        }
        if (this.f.d()) {
            return this.l;
        }
        return this.j;
    }

    private void i() {
        k();
        m();
    }

    private boolean j() {
        return l() || n();
    }

    private void k() {
        if (l()) {
            throw new a();
        }
    }

    private boolean l() {
        if (!this.b.e()) {
            return false;
        }
        hr.a("ImageAware was collected by GC. Task is cancelled. [%s]", this.n);
        return true;
    }

    private void m() {
        if (n()) {
            throw new a();
        }
    }

    private boolean n() {
        if (!(!this.n.equals(this.f.a(this.b)))) {
            return false;
        }
        hr.a("ImageAware is reused for another image. Task is cancelled. [%s]", this.n);
        return true;
    }

    private void o() {
        if (p()) {
            throw new a();
        }
    }

    private boolean p() {
        if (!Thread.interrupted()) {
            return false;
        }
        hr.a("Task was interrupted [%s]", this.n);
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:41|42|43|44) */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fb, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0103, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0104, code lost:
        r0.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0107, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00fd */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d2 A[Catch:{ a -> 0x00fd }] */
    public void run() {
        if (!b() && !c()) {
            ReentrantLock reentrantLock = this.g.h;
            hr.a("Start display image task [%s]", this.n);
            if (reentrantLock.isLocked()) {
                hr.a("Image already is loading. Waiting... [%s]", this.n);
            }
            reentrantLock.lock();
            i();
            Bitmap a2 = this.i.n.a(this.n);
            if (a2 != null) {
                if (!a2.isRecycled()) {
                    this.q = gu.MEMORY_CACHE;
                    hr.a("...Get cached bitmap from memory after waiting. [%s]", this.n);
                    if (a2 != null && this.c.e()) {
                        hr.a("PostProcess image before displaying [%s]", this.n);
                        a2 = this.c.p().a(a2);
                        if (a2 == null) {
                            hr.d("Post-processor returned null [%s]", this.n);
                        }
                    }
                    i();
                    o();
                    reentrantLock.unlock();
                    a(new gh(a2, this.g, this.f, this.q), this.p, this.h, this.f);
                }
            }
            a2 = d();
            if (a2 == null) {
                reentrantLock.unlock();
                return;
            }
            i();
            o();
            if (this.c.d()) {
                hr.a("PreProcess image before caching in memory [%s]", this.n);
                a2 = this.c.o().a(a2);
                if (a2 == null) {
                    hr.d("Pre-processor returned null [%s]", this.n);
                }
            }
            if (a2 != null && this.c.h()) {
                hr.a("Cache image in memory [%s]", this.n);
                this.i.n.a(this.n, a2);
            }
            hr.a("PostProcess image before displaying [%s]", this.n);
            a2 = this.c.p().a(a2);
            if (a2 == null) {
            }
            i();
            o();
            reentrantLock.unlock();
            a(new gh(a2, this.g, this.f, this.q), this.p, this.h, this.f);
        }
    }

    private Bitmap a(String str) {
        String str2 = str;
        hd hdVar = new hd(this.n, str2, this.a, this.o, this.b.c(), h(), this.c);
        return this.m.a(hdVar);
    }

    public boolean a(int i2, int i3) {
        return this.p || c(i2, i3);
    }

    private void a(final bo.app.gq.a aVar, final Throwable th) {
        if (!this.p && !p() && !j()) {
            a(new Runnable() {
                public void run() {
                    if (gn.this.c.c()) {
                        gn gnVar = gn.this;
                        gnVar.b.a(gnVar.c.c(gnVar.i.a));
                    }
                    gn gnVar2 = gn.this;
                    gnVar2.d.a(gnVar2.a, gnVar2.b.d(), new gq(aVar, th));
                }
            }, false, this.h, this.f);
        }
    }

    private boolean c(final int i2, final int i3) {
        if (p() || j()) {
            return false;
        }
        if (this.e != null) {
            a(new Runnable() {
                public void run() {
                    gn gnVar = gn.this;
                    gnVar.e.a(gnVar.a, gnVar.b.d(), i2, i3);
                }
            }, false, this.h, this.f);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public String a() {
        return this.a;
    }

    static void a(Runnable runnable, boolean z, Handler handler, gl glVar) {
        if (z) {
            runnable.run();
        } else if (handler == null) {
            glVar.a(runnable);
        } else {
            handler.post(runnable);
        }
    }

    private boolean b(int i2, int i3) {
        File a2 = this.i.o.a(this.a);
        if (a2 == null || !a2.exists()) {
            return false;
        }
        hd hdVar = new hd(this.n, bo.app.hh.a.FILE.b(a2.getAbsolutePath()), this.a, new gt(i2, i3), gw.FIT_INSIDE, h(), new bo.app.gi.a().a(this.c).a(gs.IN_SAMPLE_INT).a());
        Bitmap a3 = this.m.a(hdVar);
        if (!(a3 == null || this.i.f == null)) {
            hr.a("Process image before cache on disk [%s]", this.n);
            a3 = this.i.f.a(a3);
            if (a3 == null) {
                hr.d("Bitmap processor for disk cache returned null [%s]", this.n);
            }
        }
        if (a3 == null) {
            return false;
        }
        boolean a4 = this.i.o.a(this.a, a3);
        a3.recycle();
        return a4;
    }
}
