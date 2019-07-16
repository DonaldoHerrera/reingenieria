package bo.app;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.io.InputStream;
import java.util.concurrent.Executor;

public final class gk {
    final Resources a;
    final int b;
    final int c;
    final int d;
    final int e;
    final ho f;
    final Executor g;
    final Executor h;
    final boolean i;
    final boolean j;
    final int k;
    final int l;
    final gv m;
    final gd n;
    final ft o;
    final hh p;
    final hc q;
    final gi r;
    final hh s;
    final hh t;

    /* renamed from: bo.app.gk$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[bo.app.hh.a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            a[bo.app.hh.a.HTTP.ordinal()] = 1;
            a[bo.app.hh.a.HTTPS.ordinal()] = 2;
        }
    }

    public static class a {
        public static final gv a = gv.FIFO;
        /* access modifiers changed from: private */
        public Context b;
        /* access modifiers changed from: private */
        public int c = 0;
        /* access modifiers changed from: private */
        public int d = 0;
        /* access modifiers changed from: private */
        public int e = 0;
        /* access modifiers changed from: private */
        public int f = 0;
        /* access modifiers changed from: private */
        public ho g = null;
        /* access modifiers changed from: private */
        public Executor h = null;
        /* access modifiers changed from: private */
        public Executor i = null;
        /* access modifiers changed from: private */
        public boolean j = false;
        /* access modifiers changed from: private */
        public boolean k = false;
        /* access modifiers changed from: private */
        public int l = 3;
        /* access modifiers changed from: private */
        public int m = 3;
        private boolean n = false;
        /* access modifiers changed from: private */
        public gv o = a;
        private int p = 0;
        private long q = 0;
        private int r = 0;
        /* access modifiers changed from: private */
        public gd s = null;
        /* access modifiers changed from: private */
        public ft t = null;
        private ga u = null;
        /* access modifiers changed from: private */
        public hh v = null;
        /* access modifiers changed from: private */
        public hc w;
        /* access modifiers changed from: private */
        public gi x = null;
        /* access modifiers changed from: private */
        public boolean y = false;

        public a(Context context) {
            this.b = context.getApplicationContext();
        }

        public a a(int i2) {
            if (!(this.h == null && this.i == null)) {
                hr.c("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
            }
            if (i2 < 1) {
                this.m = 1;
            } else if (i2 > 10) {
                this.m = 10;
            } else {
                this.m = i2;
            }
            return this;
        }

        public a b(int i2) {
            if (i2 > 0) {
                if (this.s != null) {
                    hr.c("memoryCache() and memoryCacheSize() calls overlap each other", new Object[0]);
                }
                this.p = i2;
                return this;
            }
            throw new IllegalArgumentException("memoryCacheSize must be a positive number");
        }

        public a c(int i2) {
            if (i2 > 0) {
                if (this.t != null) {
                    hr.c("diskCache(), diskCacheSize() and diskCacheFileCount calls overlap each other", new Object[0]);
                }
                this.r = i2;
                return this;
            }
            throw new IllegalArgumentException("maxFileCount must be a positive number");
        }

        private void c() {
            if (this.h == null) {
                this.h = gg.a(this.l, this.m, this.o);
            } else {
                this.j = true;
            }
            if (this.i == null) {
                this.i = gg.a(this.l, this.m, this.o);
            } else {
                this.k = true;
            }
            if (this.t == null) {
                if (this.u == null) {
                    this.u = gg.b();
                }
                this.t = gg.a(this.b, this.u, this.q, this.r);
            }
            if (this.s == null) {
                this.s = gg.a(this.b, this.p);
            }
            if (this.n) {
                this.s = new ge(this.s, hs.a());
            }
            if (this.v == null) {
                this.v = gg.a(this.b);
            }
            if (this.w == null) {
                this.w = gg.a(this.y);
            }
            if (this.x == null) {
                this.x = gi.t();
            }
        }

        public gk b() {
            c();
            return new gk(this, null);
        }

        public a a() {
            this.n = true;
            return this;
        }

        public a a(gv gvVar) {
            if (!(this.h == null && this.i == null)) {
                hr.c("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
            }
            this.o = gvVar;
            return this;
        }

        public a a(ga gaVar) {
            if (this.t != null) {
                hr.c("diskCache() and diskCacheFileNameGenerator() calls overlap each other", new Object[0]);
            }
            this.u = gaVar;
            return this;
        }

        public a a(ft ftVar) {
            if (this.q > 0 || this.r > 0) {
                hr.c("diskCache(), diskCacheSize() and diskCacheFileCount calls overlap each other", new Object[0]);
            }
            if (this.u != null) {
                hr.c("diskCache() and diskCacheFileNameGenerator() calls overlap each other", new Object[0]);
            }
            this.t = ftVar;
            return this;
        }

        public a a(gi giVar) {
            this.x = giVar;
            return this;
        }
    }

    static class b implements hh {
        private final hh a;

        public b(hh hhVar) {
            this.a = hhVar;
        }

        public InputStream a(String str, Object obj) {
            int i = AnonymousClass1.a[bo.app.hh.a.a(str).ordinal()];
            if (i != 1 && i != 2) {
                return this.a.a(str, obj);
            }
            throw new IllegalStateException();
        }
    }

    static class c implements hh {
        private final hh a;

        public c(hh hhVar) {
            this.a = hhVar;
        }

        public InputStream a(String str, Object obj) {
            InputStream a2 = this.a.a(str, obj);
            int i = AnonymousClass1.a[bo.app.hh.a.a(str).ordinal()];
            if (i == 1 || i == 2) {
                return new gr(a2);
            }
            return a2;
        }
    }

    /* synthetic */ gk(a aVar, AnonymousClass1 r2) {
        this(aVar);
    }

    /* access modifiers changed from: 0000 */
    public gt a() {
        DisplayMetrics displayMetrics = this.a.getDisplayMetrics();
        int i2 = this.b;
        if (i2 <= 0) {
            i2 = displayMetrics.widthPixels;
        }
        int i3 = this.c;
        if (i3 <= 0) {
            i3 = displayMetrics.heightPixels;
        }
        return new gt(i2, i3);
    }

    private gk(a aVar) {
        this.a = aVar.b.getResources();
        this.b = aVar.c;
        this.c = aVar.d;
        this.d = aVar.e;
        this.e = aVar.f;
        this.f = aVar.g;
        this.g = aVar.h;
        this.h = aVar.i;
        this.k = aVar.l;
        this.l = aVar.m;
        this.m = aVar.o;
        this.o = aVar.t;
        this.n = aVar.s;
        this.r = aVar.x;
        this.p = aVar.v;
        this.q = aVar.w;
        this.i = aVar.j;
        this.j = aVar.k;
        this.s = new b(this.p);
        this.t = new c(this.p);
        hr.a(aVar.y);
    }
}
