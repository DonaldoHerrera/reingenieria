package com.evernote.android.job;

import android.content.Context;
import android.os.Bundle;
import com.evernote.android.job.s.d;
import java.lang.ref.WeakReference;

/* compiled from: Job */
public abstract class c {
    private static final Dj a = new Dj("Job");
    private a b;
    private WeakReference<Context> c;
    private Context d;
    private volatile boolean e;
    private volatile boolean f;
    private volatile long g = -1;
    private b h = b.FAILURE;
    private final Object i = new Object();

    /* compiled from: Job */
    public static final class a {
        private final s a;
        private Bundle b;

        /* synthetic */ a(s sVar, Bundle bundle, b bVar) {
            this(sVar, bundle);
        }

        public int a() {
            return this.a.k();
        }

        /* access modifiers changed from: 0000 */
        public s b() {
            return this.a;
        }

        public String c() {
            return this.a.p();
        }

        public boolean d() {
            return this.a.u();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return this.a.equals(((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        private a(s sVar, Bundle bundle) {
            this.a = sVar;
            this.b = bundle;
        }
    }

    /* compiled from: Job */
    public enum b {
        SUCCESS,
        FAILURE,
        RESCHEDULE
    }

    /* access modifiers changed from: protected */
    public abstract b a(a aVar);

    /* access modifiers changed from: 0000 */
    public final c a(s sVar, Bundle bundle) {
        this.b = new a(sVar, bundle, null);
        return this;
    }

    /* access modifiers changed from: protected */
    public void a(int i2) {
    }

    /* access modifiers changed from: 0000 */
    public boolean b(boolean z) {
        if (z && !d().b().z()) {
            return true;
        }
        if (!i()) {
            a.d("Job requires charging, reschedule");
            return false;
        } else if (!j()) {
            a.d("Job requires device to be idle, reschedule");
            return false;
        } else if (!k()) {
            a.d("Job requires network to be %s, but was %s", d().b().y(), Cj.b(b()));
            return false;
        } else if (!h()) {
            a.d("Job requires battery not be low, reschedule");
            return false;
        } else if (l()) {
            return true;
        } else {
            a.d("Job requires storage not be low, reschedule");
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final long c() {
        long j;
        synchronized (this.i) {
            j = this.g;
        }
        return j;
    }

    /* access modifiers changed from: protected */
    public final a d() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final b e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.b.equals(((c) obj).b);
    }

    /* access modifiers changed from: 0000 */
    public final boolean f() {
        boolean z;
        synchronized (this.i) {
            z = this.f;
        }
        return z;
    }

    public final boolean g() {
        boolean z;
        synchronized (this.i) {
            z = this.g > 0;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return !d().b().A() || !Cj.a(b()).a();
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    /* access modifiers changed from: protected */
    public boolean i() {
        return !d().b().B() || Cj.a(b()).b();
    }

    /* access modifiers changed from: protected */
    public boolean j() {
        return !d().b().C() || Cj.c(b());
    }

    /* access modifiers changed from: protected */
    public boolean k() {
        d y = d().b().y();
        boolean z = true;
        if (y == d.ANY) {
            return true;
        }
        d b2 = Cj.b(b());
        int i2 = b.a[y.ordinal()];
        if (i2 == 1) {
            if (b2 == d.ANY) {
                z = false;
            }
            return z;
        } else if (i2 == 2) {
            if (!(b2 == d.NOT_ROAMING || b2 == d.UNMETERED || b2 == d.METERED)) {
                z = false;
            }
            return z;
        } else if (i2 == 3) {
            if (b2 != d.UNMETERED) {
                z = false;
            }
            return z;
        } else if (i2 == 4) {
            if (!(b2 == d.CONNECTED || b2 == d.NOT_ROAMING)) {
                z = false;
            }
            return z;
        } else {
            throw new IllegalStateException("not implemented");
        }
    }

    /* access modifiers changed from: protected */
    public boolean l() {
        return !d().b().D() || !Cj.a();
    }

    /* access modifiers changed from: protected */
    public void m() {
    }

    /* access modifiers changed from: 0000 */
    public final b n() {
        try {
            if (b(true)) {
                this.h = a(d());
            } else {
                this.h = d().d() ? b.FAILURE : b.RESCHEDULE;
            }
            b bVar = this.h;
            this.g = System.currentTimeMillis();
            return bVar;
        } catch (Throwable th) {
            this.g = System.currentTimeMillis();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("job{id=");
        sb.append(this.b.a());
        sb.append(", finished=");
        sb.append(g());
        sb.append(", result=");
        sb.append(this.h);
        sb.append(", canceled=");
        sb.append(this.e);
        sb.append(", periodic=");
        sb.append(this.b.d());
        sb.append(", class=");
        sb.append(getClass().getSimpleName());
        sb.append(", tag=");
        sb.append(this.b.c());
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final c a(Context context) {
        this.c = new WeakReference<>(context);
        this.d = context.getApplicationContext();
        return this;
    }

    public final void a() {
        a(false);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(boolean z) {
        synchronized (this.i) {
            if (g()) {
                return false;
            }
            if (!this.e) {
                this.e = true;
                m();
            }
            this.f = z | this.f;
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final Context b() {
        Context context = (Context) this.c.get();
        return context == null ? this.d : context;
    }
}
