package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.SparseBooleanArray;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: Fd reason: default package */
/* compiled from: Palette */
public final class Fd {
    static final b a = new Dd();
    private final List<d> b;
    private final List<Gd> c;
    private final Map<Gd, d> d = new T();
    private final SparseBooleanArray e = new SparseBooleanArray();
    private final d f = e();

    /* renamed from: Fd$a */
    /* compiled from: Palette */
    public static final class a {
        private final List<d> a;
        private final Bitmap b;
        private final List<Gd> c = new ArrayList();
        private int d = 16;
        private int e = 12544;
        private int f = -1;
        private final List<b> g = new ArrayList();
        private Rect h;

        public a(Bitmap bitmap) {
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            this.g.add(Fd.a);
            this.b = bitmap;
            this.a = null;
            this.c.add(Gd.a);
            this.c.add(Gd.b);
            this.c.add(Gd.c);
            this.c.add(Gd.d);
            this.c.add(Gd.e);
            this.c.add(Gd.f);
        }

        private Bitmap b(Bitmap bitmap) {
            double d2 = -1.0d;
            if (this.e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i = this.e;
                if (width > i) {
                    d2 = Math.sqrt(((double) i) / ((double) width));
                }
            } else if (this.f > 0) {
                int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
                int i2 = this.f;
                if (max > i2) {
                    d2 = ((double) i2) / ((double) max);
                }
            }
            if (d2 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return bitmap;
            }
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * d2), (int) Math.ceil(((double) bitmap.getHeight()) * d2), false);
        }

        public a a(int i) {
            this.d = i;
            return this;
        }

        public Fd a() {
            List<d> list;
            b[] bVarArr;
            Bitmap bitmap = this.b;
            if (bitmap != null) {
                Bitmap b2 = b(bitmap);
                Rect rect = this.h;
                if (!(b2 == this.b || rect == null)) {
                    double width = ((double) b2.getWidth()) / ((double) this.b.getWidth());
                    rect.left = (int) Math.floor(((double) rect.left) * width);
                    rect.top = (int) Math.floor(((double) rect.top) * width);
                    rect.right = Math.min((int) Math.ceil(((double) rect.right) * width), b2.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width), b2.getHeight());
                }
                int[] a2 = a(b2);
                int i = this.d;
                if (this.g.isEmpty()) {
                    bVarArr = null;
                } else {
                    List<b> list2 = this.g;
                    bVarArr = (b[]) list2.toArray(new b[list2.size()]);
                }
                Cd cd = new Cd(a2, i, bVarArr);
                if (b2 != this.b) {
                    b2.recycle();
                }
                list = cd.a();
            } else {
                list = this.a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            Fd fd = new Fd(list, this.c);
            fd.a();
            return fd;
        }

        public AsyncTask<Bitmap, Void, Fd> a(c cVar) {
            if (cVar != null) {
                return new Ed(this, cVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{this.b});
            }
            throw new IllegalArgumentException("listener can not be null");
        }

        private int[] a(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[(width * height)];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.h.height();
            int[] iArr2 = new int[(width2 * height2)];
            for (int i = 0; i < height2; i++) {
                Rect rect2 = this.h;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }
    }

    /* renamed from: Fd$b */
    /* compiled from: Palette */
    public interface b {
        boolean a(int i, float[] fArr);
    }

    /* renamed from: Fd$c */
    /* compiled from: Palette */
    public interface c {
        void a(Fd fd);
    }

    /* renamed from: Fd$d */
    /* compiled from: Palette */
    public static final class d {
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private boolean f;
        private int g;
        private int h;
        private float[] i;

        public d(int i2, int i3) {
            this.a = Color.red(i2);
            this.b = Color.green(i2);
            this.c = Color.blue(i2);
            this.d = i2;
            this.e = i3;
        }

        private void f() {
            int i2;
            int i3;
            if (!this.f) {
                int a2 = C0301ab.a(-1, this.d, 4.5f);
                int a3 = C0301ab.a(-1, this.d, 3.0f);
                if (a2 == -1 || a3 == -1) {
                    int a4 = C0301ab.a(-16777216, this.d, 4.5f);
                    int a5 = C0301ab.a(-16777216, this.d, 3.0f);
                    if (a4 == -1 || a5 == -1) {
                        if (a2 != -1) {
                            i2 = C0301ab.c(-1, a2);
                        } else {
                            i2 = C0301ab.c(-16777216, a4);
                        }
                        this.h = i2;
                        if (a3 != -1) {
                            i3 = C0301ab.c(-1, a3);
                        } else {
                            i3 = C0301ab.c(-16777216, a5);
                        }
                        this.g = i3;
                        this.f = true;
                    } else {
                        this.h = C0301ab.c(-16777216, a4);
                        this.g = C0301ab.c(-16777216, a5);
                        this.f = true;
                    }
                } else {
                    this.h = C0301ab.c(-1, a2);
                    this.g = C0301ab.c(-1, a3);
                    this.f = true;
                }
            }
        }

        public int a() {
            f();
            return this.h;
        }

        public float[] b() {
            if (this.i == null) {
                this.i = new float[3];
            }
            C0301ab.a(this.a, this.b, this.c, this.i);
            return this.i;
        }

        public int c() {
            return this.e;
        }

        public int d() {
            return this.d;
        }

        public int e() {
            f();
            return this.g;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (!(this.e == dVar.e && this.d == dVar.d)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.d * 31) + this.e;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(d.class.getSimpleName());
            sb.append(" [RGB: #");
            sb.append(Integer.toHexString(d()));
            sb.append(']');
            sb.append(" [HSL: ");
            sb.append(Arrays.toString(b()));
            sb.append(']');
            sb.append(" [Population: ");
            sb.append(this.e);
            sb.append(']');
            sb.append(" [Title Text: #");
            sb.append(Integer.toHexString(e()));
            sb.append(']');
            sb.append(" [Body Text: #");
            sb.append(Integer.toHexString(a()));
            sb.append(']');
            return sb.toString();
        }
    }

    Fd(List<d> list, List<Gd> list2) {
        this.b = list;
        this.c = list2;
    }

    public static a a(Bitmap bitmap) {
        return new a(bitmap);
    }

    private d e() {
        int size = this.b.size();
        int i = Integer.MIN_VALUE;
        d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar2 = (d) this.b.get(i2);
            if (dVar2.c() > i) {
                i = dVar2.c();
                dVar = dVar2;
            }
        }
        return dVar;
    }

    public d b() {
        return a(Gd.f);
    }

    public d c() {
        return a(Gd.c);
    }

    public List<d> d() {
        return Collections.unmodifiableList(this.b);
    }

    private d c(Gd gd) {
        int size = this.b.size();
        float f2 = 0.0f;
        d dVar = null;
        for (int i = 0; i < size; i++) {
            d dVar2 = (d) this.b.get(i);
            if (b(dVar2, gd)) {
                float a2 = a(dVar2, gd);
                if (dVar == null || a2 > f2) {
                    dVar = dVar2;
                    f2 = a2;
                }
            }
        }
        return dVar;
    }

    public int a(int i) {
        return a(Gd.f, i);
    }

    public int b(int i) {
        return a(Gd.d, i);
    }

    private d b(Gd gd) {
        d c2 = c(gd);
        if (c2 != null && gd.j()) {
            this.e.append(c2.d(), true);
        }
        return c2;
    }

    public d a(Gd gd) {
        return (d) this.d.get(gd);
    }

    public int a(Gd gd, int i) {
        d a2 = a(gd);
        return a2 != null ? a2.d() : i;
    }

    private boolean b(d dVar, Gd gd) {
        float[] b2 = dVar.b();
        if (b2[1] < gd.e() || b2[1] > gd.c() || b2[2] < gd.d() || b2[2] > gd.b() || this.e.get(dVar.d())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            Gd gd = (Gd) this.c.get(i);
            gd.k();
            this.d.put(gd, b(gd));
        }
        this.e.clear();
    }

    private float a(d dVar, Gd gd) {
        float[] b2 = dVar.b();
        d dVar2 = this.f;
        int c2 = dVar2 != null ? dVar2.c() : 1;
        float f2 = 0.0f;
        float abs = gd.g() > 0.0f ? (1.0f - Math.abs(b2[1] - gd.i())) * gd.g() : 0.0f;
        float a2 = gd.a() > 0.0f ? gd.a() * (1.0f - Math.abs(b2[2] - gd.h())) : 0.0f;
        if (gd.f() > 0.0f) {
            f2 = gd.f() * (((float) dVar.c()) / ((float) c2));
        }
        return abs + a2 + f2;
    }
}
