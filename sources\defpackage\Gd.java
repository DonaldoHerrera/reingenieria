package defpackage;

/* renamed from: Gd reason: default package */
/* compiled from: Target */
public final class Gd {
    public static final Gd a = new Gd();
    public static final Gd b = new Gd();
    public static final Gd c = new Gd();
    public static final Gd d = new Gd();
    public static final Gd e = new Gd();
    public static final Gd f = new Gd();
    final float[] g = new float[3];
    final float[] h = new float[3];
    final float[] i = new float[3];
    boolean j = true;

    static {
        b(a);
        e(a);
        d(b);
        e(b);
        a(c);
        e(c);
        b(d);
        c(d);
        d(e);
        c(e);
        a(f);
        c(f);
    }

    Gd() {
        a(this.g);
        a(this.h);
        l();
    }

    private void l() {
        float[] fArr = this.i;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    public float a() {
        return this.i[1];
    }

    public float b() {
        return this.h[2];
    }

    public float c() {
        return this.g[2];
    }

    public float d() {
        return this.h[0];
    }

    public float e() {
        return this.g[0];
    }

    public float f() {
        return this.i[2];
    }

    public float g() {
        return this.i[0];
    }

    public float h() {
        return this.h[1];
    }

    public float i() {
        return this.g[1];
    }

    public boolean j() {
        return this.j;
    }

    /* access modifiers changed from: 0000 */
    public void k() {
        float f2 = 0.0f;
        for (float f3 : this.i) {
            if (f3 > 0.0f) {
                f2 += f3;
            }
        }
        if (f2 != 0.0f) {
            int length = this.i.length;
            for (int i2 = 0; i2 < length; i2++) {
                float[] fArr = this.i;
                if (fArr[i2] > 0.0f) {
                    fArr[i2] = fArr[i2] / f2;
                }
            }
        }
    }

    private static void a(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    private static void b(Gd gd) {
        float[] fArr = gd.h;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void c(Gd gd) {
        float[] fArr = gd.g;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    private static void d(Gd gd) {
        float[] fArr = gd.h;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void e(Gd gd) {
        float[] fArr = gd.g;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private static void a(Gd gd) {
        float[] fArr = gd.h;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }
}
