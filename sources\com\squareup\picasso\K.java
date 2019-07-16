package com.squareup.picasso;

import android.graphics.Bitmap.Config;
import android.net.Uri;
import com.squareup.picasso.E.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Request */
public final class K {
    private static final long a = TimeUnit.SECONDS.toNanos(5);
    int b;
    long c;
    int d;
    public final Uri e;
    public final int f;
    public final String g;
    public final List<U> h;
    public final int i;
    public final int j;
    public final boolean k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final float o;
    public final float p;
    public final float q;
    public final boolean r;
    public final boolean s;
    public final Config t;
    public final e u;

    /* compiled from: Request */
    public static final class a {
        private Uri a;
        private int b;
        private String c;
        private int d;
        private int e;
        private boolean f;
        private int g;
        private boolean h;
        private boolean i;
        private float j;
        private float k;
        private float l;
        private boolean m;
        private boolean n;
        private List<U> o;
        private Config p;
        private e q;

        a(Uri uri, int i2, Config config) {
            this.a = uri;
            this.b = i2;
            this.p = config;
        }

        public a a(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i3 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i3 == 0 && i2 == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.d = i2;
                this.e = i3;
                return this;
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean b() {
            return (this.a == null && this.b == 0) ? false : true;
        }

        /* access modifiers changed from: 0000 */
        public boolean c() {
            return (this.d == 0 && this.e == 0) ? false : true;
        }

        public a a(Config config) {
            if (config != null) {
                this.p = config;
                return this;
            }
            throw new IllegalArgumentException("config == null");
        }

        public a a(e eVar) {
            if (eVar == null) {
                throw new IllegalArgumentException("Priority invalid.");
            } else if (this.q == null) {
                this.q = eVar;
                return this;
            } else {
                throw new IllegalStateException("Priority already set.");
            }
        }

        public a a(U u) {
            if (u == null) {
                throw new IllegalArgumentException("Transformation must not be null.");
            } else if (u.a() != null) {
                if (this.o == null) {
                    this.o = new ArrayList(2);
                }
                this.o.add(u);
                return this;
            } else {
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
        }

        public K a() {
            if (this.h && this.f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (this.f && this.d == 0 && this.e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (this.h && this.d == 0 && this.e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (this.q == null) {
                    this.q = e.NORMAL;
                }
                K k2 = r2;
                K k3 = new K(this.a, this.b, this.c, this.o, this.d, this.e, this.f, this.h, this.g, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q);
                return k2;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public String a() {
        Uri uri = this.e;
        if (uri != null) {
            return String.valueOf(uri.getPath());
        }
        return Integer.toHexString(this.f);
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        return this.h != null;
    }

    public boolean c() {
        return (this.i == 0 && this.j == 0) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    public String d() {
        long nanoTime = System.nanoTime() - this.c;
        if (nanoTime > a) {
            StringBuilder sb = new StringBuilder();
            sb.append(g());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toSeconds(nanoTime));
            sb.append('s');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g());
        sb2.append('+');
        sb2.append(TimeUnit.NANOSECONDS.toMillis(nanoTime));
        sb2.append("ms");
        return sb2.toString();
    }

    /* access modifiers changed from: 0000 */
    public boolean e() {
        return c() || this.o != 0.0f;
    }

    /* access modifiers changed from: 0000 */
    public boolean f() {
        return e() || b();
    }

    /* access modifiers changed from: 0000 */
    public String g() {
        StringBuilder sb = new StringBuilder();
        sb.append("[R");
        sb.append(this.b);
        sb.append(']');
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i2 = this.f;
        if (i2 > 0) {
            sb.append(i2);
        } else {
            sb.append(this.e);
        }
        List<U> list = this.h;
        if (list != null && !list.isEmpty()) {
            for (U u2 : this.h) {
                sb.append(' ');
                sb.append(u2.a());
            }
        }
        if (this.g != null) {
            sb.append(" stableKey(");
            sb.append(this.g);
            sb.append(')');
        }
        if (this.i > 0) {
            sb.append(" resize(");
            sb.append(this.i);
            sb.append(',');
            sb.append(this.j);
            sb.append(')');
        }
        if (this.k) {
            sb.append(" centerCrop");
        }
        if (this.m) {
            sb.append(" centerInside");
        }
        if (this.o != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.o);
            if (this.r) {
                sb.append(" @ ");
                sb.append(this.p);
                sb.append(',');
                sb.append(this.q);
            }
            sb.append(')');
        }
        if (this.s) {
            sb.append(" purgeable");
        }
        if (this.t != null) {
            sb.append(' ');
            sb.append(this.t);
        }
        sb.append('}');
        return sb.toString();
    }

    private K(Uri uri, int i2, String str, List<U> list, int i3, int i4, boolean z, boolean z2, int i5, boolean z3, float f2, float f3, float f4, boolean z4, boolean z5, Config config, e eVar) {
        this.e = uri;
        this.f = i2;
        this.g = str;
        if (list == null) {
            this.h = null;
        } else {
            this.h = Collections.unmodifiableList(list);
        }
        this.i = i3;
        this.j = i4;
        this.k = z;
        this.m = z2;
        this.l = i5;
        this.n = z3;
        this.o = f2;
        this.p = f3;
        this.q = f4;
        this.r = z4;
        this.s = z5;
        this.t = config;
        this.u = eVar;
    }
}
