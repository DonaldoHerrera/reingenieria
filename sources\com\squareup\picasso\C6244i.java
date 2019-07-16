package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.squareup.picasso.E.d;
import com.squareup.picasso.E.e;
import com.squareup.picasso.M.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.squareup.picasso.i reason: case insensitive filesystem */
/* compiled from: BitmapHunter */
class C6244i implements Runnable {
    private static final Object a = new Object();
    private static final ThreadLocal<StringBuilder> b = new C6238c();
    private static final AtomicInteger c = new AtomicInteger();
    private static final M d = new C6239d();
    final int e = c.incrementAndGet();
    final E f;
    final C6252q g;
    final C6246k h;
    final P i;
    final String j;
    final K k;
    final int l;
    int m;
    final M n;
    C6236a o;
    List<C6236a> p;
    Bitmap q;
    Future<?> r;
    d s;
    Exception t;
    int u;
    int v;
    e w;

    C6244i(E e2, C6252q qVar, C6246k kVar, P p2, C6236a aVar, M m2) {
        this.f = e2;
        this.g = qVar;
        this.h = kVar;
        this.i = p2;
        this.o = aVar;
        this.j = aVar.b();
        this.k = aVar.g();
        this.w = aVar.f();
        this.l = aVar.c();
        this.m = aVar.d();
        this.n = m2;
        this.v = m2.a();
    }

    static int a(int i2) {
        switch (i2) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    static Bitmap a(HAb hAb, K k2) throws IOException {
        C6961nAb a2 = C7720yAb.a(hAb);
        boolean a3 = W.a(a2);
        boolean z = k2.s && VERSION.SDK_INT < 21;
        Options b2 = M.b(k2);
        boolean a4 = M.a(b2);
        if (a3 || z) {
            byte[] o2 = a2.o();
            if (a4) {
                BitmapFactory.decodeByteArray(o2, 0, o2.length, b2);
                M.a(k2.i, k2.j, b2, k2);
            }
            return BitmapFactory.decodeByteArray(o2, 0, o2.length, b2);
        }
        InputStream t2 = a2.t();
        if (a4) {
            x xVar = new x(t2);
            xVar.a(false);
            long a5 = xVar.a(1024);
            BitmapFactory.decodeStream(xVar, null, b2);
            M.a(k2.i, k2.j, b2, k2);
            xVar.h(a5);
            xVar.a(true);
            t2 = xVar;
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(t2, null, b2);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    private static boolean a(boolean z, int i2, int i3, int i4, int i5) {
        return !z || (i4 != 0 && i2 > i4) || (i5 != 0 && i3 > i5);
    }

    static int b(int i2) {
        return (i2 == 2 || i2 == 7 || i2 == 4 || i2 == 5) ? -1 : 1;
    }

    private e o() {
        e eVar = e.LOW;
        List<C6236a> list = this.p;
        boolean z = true;
        boolean z2 = list != null && !list.isEmpty();
        if (this.o == null && !z2) {
            z = false;
        }
        if (!z) {
            return eVar;
        }
        C6236a aVar = this.o;
        if (aVar != null) {
            eVar = aVar.f();
        }
        if (z2) {
            int size = this.p.size();
            for (int i2 = 0; i2 < size; i2++) {
                e f2 = ((C6236a) this.p.get(i2)).f();
                if (f2.ordinal() > eVar.ordinal()) {
                    eVar = f2;
                }
            }
        }
        return eVar;
    }

    /* access modifiers changed from: 0000 */
    public void b(C6236a aVar) {
        boolean z;
        if (this.o == aVar) {
            this.o = null;
            z = true;
        } else {
            List<C6236a> list = this.p;
            z = list != null ? list.remove(aVar) : false;
        }
        if (z && aVar.f() == this.w) {
            this.w = o();
        }
        if (this.f.p) {
            W.a("Hunter", "removed", aVar.b.d(), W.a(this, "from "));
        }
    }

    /* access modifiers changed from: 0000 */
    public List<C6236a> c() {
        return this.p;
    }

    /* access modifiers changed from: 0000 */
    public K d() {
        return this.k;
    }

    /* access modifiers changed from: 0000 */
    public Exception e() {
        return this.t;
    }

    /* access modifiers changed from: 0000 */
    public String f() {
        return this.j;
    }

    /* access modifiers changed from: 0000 */
    public d g() {
        return this.s;
    }

    /* access modifiers changed from: 0000 */
    public int h() {
        return this.l;
    }

    /* access modifiers changed from: 0000 */
    public E i() {
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public e j() {
        return this.w;
    }

    /* access modifiers changed from: 0000 */
    public Bitmap k() {
        return this.q;
    }

    /* access modifiers changed from: 0000 */
    public Bitmap l() throws IOException {
        Bitmap bitmap;
        if (z.a(this.l)) {
            bitmap = this.h.a(this.j);
            if (bitmap != null) {
                this.i.b();
                this.s = d.MEMORY;
                if (this.f.p) {
                    W.a("Hunter", "decoded", this.k.d(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        this.m = this.v == 0 ? A.OFFLINE.e : this.m;
        a a2 = this.n.a(this.k, this.m);
        if (a2 != null) {
            this.s = a2.c();
            this.u = a2.b();
            bitmap = a2.a();
            if (bitmap == null) {
                HAb d2 = a2.d();
                try {
                    bitmap = a(d2, this.k);
                } finally {
                    try {
                        d2.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmap != null) {
            if (this.f.p) {
                W.a("Hunter", "decoded", this.k.d());
            }
            this.i.a(bitmap);
            if (this.k.f() || this.u != 0) {
                synchronized (a) {
                    if (this.k.e() || this.u != 0) {
                        bitmap = a(this.k, bitmap, this.u);
                        if (this.f.p) {
                            W.a("Hunter", "transformed", this.k.d());
                        }
                    }
                    if (this.k.b()) {
                        bitmap = a(this.k.h, bitmap);
                        if (this.f.p) {
                            W.a("Hunter", "transformed", this.k.d(), "from custom transformations");
                        }
                    }
                }
                if (bitmap != null) {
                    this.i.b(bitmap);
                }
            }
        }
        return bitmap;
    }

    /* access modifiers changed from: 0000 */
    public boolean m() {
        Future<?> future = this.r;
        return future != null && future.isCancelled();
    }

    /* access modifiers changed from: 0000 */
    public boolean n() {
        return this.n.b();
    }

    public void run() {
        String str = "Picasso-Idle";
        try {
            a(this.k);
            if (this.f.p) {
                W.a("Hunter", "executing", W.a(this));
            }
            this.q = l();
            if (this.q == null) {
                this.g.b(this);
            } else {
                this.g.a(this);
            }
        } catch (b e2) {
            if (!A.a(e2.b) || e2.a != 504) {
                this.t = e2;
            }
            this.g.b(this);
        } catch (IOException e3) {
            this.t = e3;
            this.g.c(this);
        } catch (OutOfMemoryError e4) {
            StringWriter stringWriter = new StringWriter();
            this.i.a().a(new PrintWriter(stringWriter));
            this.t = new RuntimeException(stringWriter.toString(), e4);
            this.g.b(this);
        } catch (Exception e5) {
            this.t = e5;
            this.g.b(this);
        } catch (Throwable th) {
            Thread.currentThread().setName(str);
            throw th;
        }
        Thread.currentThread().setName(str);
    }

    /* access modifiers changed from: 0000 */
    public C6236a b() {
        return this.o;
    }

    /* access modifiers changed from: 0000 */
    public void a(C6236a aVar) {
        boolean z = this.f.p;
        K k2 = aVar.b;
        String str = "to ";
        String str2 = "joined";
        String str3 = "Hunter";
        if (this.o == null) {
            this.o = aVar;
            if (z) {
                List<C6236a> list = this.p;
                if (list == null || list.isEmpty()) {
                    W.a(str3, str2, k2.d(), "to empty hunter");
                } else {
                    W.a(str3, str2, k2.d(), W.a(this, str));
                }
            }
            return;
        }
        if (this.p == null) {
            this.p = new ArrayList(3);
        }
        this.p.add(aVar);
        if (z) {
            W.a(str3, str2, k2.d(), W.a(this, str));
        }
        e f2 = aVar.f();
        if (f2.ordinal() > this.w.ordinal()) {
            this.w = f2;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        if (this.o != null) {
            return false;
        }
        List<C6236a> list = this.p;
        if (list != null && !list.isEmpty()) {
            return false;
        }
        Future<?> future = this.r;
        if (future == null || !future.cancel(false)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(boolean z, NetworkInfo networkInfo) {
        if (!(this.v > 0)) {
            return false;
        }
        this.v--;
        return this.n.a(z, networkInfo);
    }

    static void a(K k2) {
        String a2 = k2.a();
        StringBuilder sb = (StringBuilder) b.get();
        sb.ensureCapacity(a2.length() + 8);
        sb.replace(8, sb.length(), a2);
        Thread.currentThread().setName(sb.toString());
    }

    static C6244i a(E e2, C6252q qVar, C6246k kVar, P p2, C6236a aVar) {
        K g2 = aVar.g();
        List b2 = e2.b();
        int size = b2.size();
        for (int i2 = 0; i2 < size; i2++) {
            M m2 = (M) b2.get(i2);
            if (m2.a(g2)) {
                C6244i iVar = new C6244i(e2, qVar, kVar, p2, aVar, m2);
                return iVar;
            }
        }
        C6244i iVar2 = new C6244i(e2, qVar, kVar, p2, aVar, d);
        return iVar2;
    }

    static Bitmap a(List<U> list, Bitmap bitmap) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            U u2 = (U) list.get(i2);
            try {
                Bitmap a2 = u2.a(bitmap);
                if (a2 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(u2.a());
                    sb.append(" returned null after ");
                    sb.append(i2);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (U a3 : list) {
                        sb.append(a3.a());
                        sb.append(10);
                    }
                    E.a.post(new C6241f(sb));
                    return null;
                } else if (a2 == bitmap && bitmap.isRecycled()) {
                    E.a.post(new C6242g(u2));
                    return null;
                } else if (a2 == bitmap || bitmap.isRecycled()) {
                    i2++;
                    bitmap = a2;
                } else {
                    E.a.post(new C6243h(u2));
                    return null;
                }
            } catch (RuntimeException e2) {
                E.a.post(new C6240e(u2, e2));
                return null;
            }
        }
        return bitmap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:87:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0267  */
    static Bitmap a(K k2, Bitmap bitmap, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Matrix matrix;
        Bitmap createBitmap;
        Bitmap bitmap2;
        int i7;
        int i8;
        int i9;
        boolean z;
        int i10;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        int i11;
        int i12;
        float f10;
        float f11;
        float f12;
        int i13;
        int i14;
        int i15;
        float f13;
        boolean z2;
        int i16;
        K k3 = k2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z3 = k3.n;
        Matrix matrix2 = new Matrix();
        if (k2.e() || i2 != 0) {
            int i17 = k3.i;
            int i18 = k3.j;
            float f14 = k3.o;
            if (f14 != 0.0f) {
                double d2 = (double) f14;
                double cos = Math.cos(Math.toRadians(d2));
                double sin = Math.sin(Math.toRadians(d2));
                if (k3.r) {
                    matrix2.setRotate(f14, k3.p, k3.q);
                    float f15 = k3.p;
                    double d3 = 1.0d - cos;
                    double d4 = ((double) f15) * d3;
                    float f16 = k3.q;
                    i10 = height;
                    z = z3;
                    double d5 = d4 + (((double) f16) * sin);
                    double d6 = (((double) f16) * d3) - (((double) f15) * sin);
                    int i19 = k3.i;
                    double d7 = (((double) i19) * cos) + d5;
                    double d8 = d5;
                    double d9 = (((double) i19) * sin) + d6;
                    Matrix matrix3 = matrix2;
                    double d10 = d8 + (((double) i19) * cos);
                    int i20 = k3.j;
                    i9 = width;
                    double d11 = d10 - (((double) i20) * sin);
                    double d12 = (((double) i19) * sin) + d6 + (((double) i20) * cos);
                    double d13 = d8 - (((double) i20) * sin);
                    double d14 = d8;
                    double d15 = d9;
                    double d16 = (((double) i20) * cos) + d6;
                    i17 = (int) Math.floor(Math.max(d13, Math.max(d11, Math.max(d14, d7))) - Math.min(d13, Math.min(d11, Math.min(d14, d7))));
                    i18 = (int) Math.floor(Math.max(d16, Math.max(d12, Math.max(d6, d15))) - Math.min(d16, Math.min(d12, Math.min(d6, d15))));
                    matrix = matrix3;
                } else {
                    i9 = width;
                    i10 = height;
                    z = z3;
                    matrix = matrix2;
                    matrix.setRotate(f14);
                    K k4 = k2;
                    int i21 = k4.i;
                    double d17 = ((double) i21) * cos;
                    double d18 = ((double) i21) * sin;
                    double d19 = ((double) i21) * cos;
                    int i22 = k4.j;
                    double d20 = d19 - (((double) i22) * sin);
                    double d21 = (((double) i21) * sin) + (((double) i22) * cos);
                    double d22 = -(((double) i22) * sin);
                    double d23 = ((double) i22) * cos;
                    double max = Math.max(d22, Math.max(d20, Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, d17)));
                    double min = Math.min(d22, Math.min(d20, Math.min(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, d17)));
                    double d24 = d23;
                    i18 = (int) Math.floor(Math.max(d24, Math.max(d21, Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, d18))) - Math.min(d24, Math.min(d21, Math.min(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, d18))));
                    i17 = (int) Math.floor(max - min);
                }
            } else {
                i9 = width;
                i10 = height;
                z = z3;
                matrix = matrix2;
            }
            if (i2 != 0) {
                int a2 = a(i2);
                int b2 = b(i2);
                if (a2 != 0) {
                    matrix.preRotate((float) a2);
                    if (a2 == 90 || a2 == 270) {
                        int i23 = i18;
                        i18 = i17;
                        i17 = i23;
                    }
                }
                if (b2 != 1) {
                    matrix.postScale((float) b2, 1.0f);
                }
            }
            K k5 = k2;
            if (k5.k) {
                if (i17 != 0) {
                    i12 = i9;
                    f10 = ((float) i17) / ((float) i12);
                    i11 = i10;
                } else {
                    i12 = i9;
                    i11 = i10;
                    f10 = ((float) i18) / ((float) i11);
                }
                if (i18 != 0) {
                    f12 = (float) i18;
                    f11 = (float) i11;
                } else {
                    f12 = (float) i17;
                    f11 = (float) i12;
                }
                float f17 = f12 / f11;
                if (f10 > f17) {
                    int ceil = (int) Math.ceil((double) (((float) i11) * (f17 / f10)));
                    int i24 = k5.l;
                    i16 = (i24 & 48) == 48 ? 0 : (i24 & 80) == 80 ? i11 - ceil : (i11 - ceil) / 2;
                    f13 = ((float) i18) / ((float) ceil);
                    i15 = i12;
                    i14 = ceil;
                    i13 = 0;
                    f17 = f10;
                    z2 = z;
                } else if (f10 < f17) {
                    int ceil2 = (int) Math.ceil((double) (((float) i12) * (f10 / f17)));
                    int i25 = k5.l;
                    int i26 = (i25 & 3) == 3 ? 0 : (i25 & 5) == 5 ? i12 - ceil2 : (i12 - ceil2) / 2;
                    float f18 = ((float) i17) / ((float) ceil2);
                    i13 = i26;
                    i15 = ceil2;
                    i14 = i11;
                    z2 = z;
                    i16 = 0;
                    float f19 = f18;
                    f13 = f17;
                    f17 = f19;
                } else {
                    i15 = i12;
                    i14 = i11;
                    f13 = f17;
                    z2 = z;
                    i16 = 0;
                    i13 = 0;
                }
                if (a(z2, i12, i11, i17, i18)) {
                    matrix.preScale(f17, f13);
                }
                i5 = i16;
                i4 = i15;
                i3 = i14;
                i6 = i13;
                createBitmap = Bitmap.createBitmap(bitmap, i6, i5, i4, i3, matrix, true);
                bitmap2 = bitmap;
                if (createBitmap != bitmap2) {
                    return bitmap2;
                }
                bitmap.recycle();
                return createBitmap;
            }
            i7 = i10;
            boolean z4 = z;
            i8 = i9;
            if (k5.m) {
                if (i17 != 0) {
                    f7 = (float) i17;
                    f6 = (float) i8;
                } else {
                    f7 = (float) i18;
                    f6 = (float) i7;
                }
                float f20 = f7 / f6;
                if (i18 != 0) {
                    f9 = (float) i18;
                    f8 = (float) i7;
                } else {
                    f9 = (float) i17;
                    f8 = (float) i8;
                }
                float f21 = f9 / f8;
                if (f20 >= f21) {
                    f20 = f21;
                }
                if (a(z4, i8, i7, i17, i18)) {
                    matrix.preScale(f20, f20);
                }
            } else if (!((i17 == 0 && i18 == 0) || (i17 == i8 && i18 == i7))) {
                if (i17 != 0) {
                    f3 = (float) i17;
                    f2 = (float) i8;
                } else {
                    f3 = (float) i18;
                    f2 = (float) i7;
                }
                float f22 = f3 / f2;
                if (i18 != 0) {
                    f5 = (float) i18;
                    f4 = (float) i7;
                } else {
                    f5 = (float) i17;
                    f4 = (float) i8;
                }
                float f23 = f5 / f4;
                if (a(z4, i8, i7, i17, i18)) {
                    matrix.preScale(f22, f23);
                }
            }
        } else {
            i8 = width;
            i7 = height;
            matrix = matrix2;
        }
        i4 = i8;
        i3 = i7;
        i6 = 0;
        i5 = 0;
        createBitmap = Bitmap.createBitmap(bitmap, i6, i5, i4, i3, matrix, true);
        bitmap2 = bitmap;
        if (createBitmap != bitmap2) {
        }
    }
}
