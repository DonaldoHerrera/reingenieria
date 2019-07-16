package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: hd reason: default package and case insensitive filesystem */
/* compiled from: AsyncTaskLoader */
public abstract class C1353hd<D> extends C1384id<D> {
    private final Executor j;
    volatile a k;
    volatile a l;
    long m;
    long n;
    Handler o;

    /* renamed from: hd$a */
    /* compiled from: AsyncTaskLoader */
    final class a extends C1538nd<Void, Void, D> implements Runnable {
        private final CountDownLatch k = new CountDownLatch(1);
        boolean l;

        a() {
        }

        /* access modifiers changed from: protected */
        public void b(D d) {
            try {
                C1353hd.this.a(this, d);
            } finally {
                this.k.countDown();
            }
        }

        /* access modifiers changed from: protected */
        public void c(D d) {
            try {
                C1353hd.this.b(this, d);
            } finally {
                this.k.countDown();
            }
        }

        public void run() {
            this.l = false;
            C1353hd.this.s();
        }

        /* access modifiers changed from: protected */
        public D a(Void... voidArr) {
            try {
                return C1353hd.this.u();
            } catch (C1747ub e) {
                if (a()) {
                    return null;
                }
                throw e;
            }
        }
    }

    public C1353hd(Context context) {
        this(context, C1538nd.c);
    }

    /* access modifiers changed from: 0000 */
    public void a(a aVar, D d) {
        c(d);
        if (this.l == aVar) {
            o();
            this.n = SystemClock.uptimeMillis();
            this.l = null;
            d();
            s();
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(a aVar, D d) {
        if (this.k != aVar) {
            a(aVar, d);
        } else if (f()) {
            c(d);
        } else {
            c();
            this.n = SystemClock.uptimeMillis();
            this.k = null;
            b(d);
        }
    }

    public void c(D d) {
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        if (this.k == null) {
            return false;
        }
        if (!this.e) {
            this.h = true;
        }
        if (this.l != null) {
            if (this.k.l) {
                this.k.l = false;
                this.o.removeCallbacks(this.k);
            }
            this.k = null;
            return false;
        } else if (this.k.l) {
            this.k.l = false;
            this.o.removeCallbacks(this.k);
            this.k = null;
            return false;
        } else {
            boolean a2 = this.k.a(false);
            if (a2) {
                this.l = this.k;
                r();
            }
            this.k = null;
            return a2;
        }
    }

    /* access modifiers changed from: protected */
    public void j() {
        super.j();
        b();
        this.k = new a<>();
        s();
    }

    public void r() {
    }

    /* access modifiers changed from: 0000 */
    public void s() {
        if (this.l == null && this.k != null) {
            if (this.k.l) {
                this.k.l = false;
                this.o.removeCallbacks(this.k);
            }
            if (this.m <= 0 || SystemClock.uptimeMillis() >= this.n + this.m) {
                this.k.a(this.j, null);
            } else {
                this.k.l = true;
                this.o.postAtTime(this.k, this.n + this.m);
            }
        }
    }

    public abstract D t();

    /* access modifiers changed from: protected */
    public D u() {
        return t();
    }

    private C1353hd(Context context, Executor executor) {
        super(context);
        this.n = -10000;
        this.j = executor;
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        String str2 = " waiting=";
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.k);
            printWriter.print(str2);
            printWriter.println(this.k.l);
        }
        if (this.l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.l);
            printWriter.print(str2);
            printWriter.println(this.l.l);
        }
        if (this.m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C0268Vb.a(this.m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C0268Vb.a(this.n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
