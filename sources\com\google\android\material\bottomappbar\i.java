package com.google.android.material.bottomappbar;

/* compiled from: BottomAppBarTopEdgeTreatment */
public class i extends C0481bA {
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;

    public i(float f, float f2, float f3) {
        this.b = f;
        this.a = f2;
        this.d = f3;
        if (f3 >= 0.0f) {
            this.e = 0.0f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    public void a(float f, float f2, C1223dA dAVar) {
        float f3 = f;
        C1223dA dAVar2 = dAVar;
        float f4 = this.c;
        if (f4 == 0.0f) {
            dAVar2.a(f3, 0.0f);
            return;
        }
        float f5 = ((this.b * 2.0f) + f4) / 2.0f;
        float f6 = f2 * this.a;
        float f7 = (f3 / 2.0f) + this.e;
        float f8 = (this.d * f2) + ((1.0f - f2) * f5);
        if (f8 / f5 >= 1.0f) {
            dAVar2.a(f3, 0.0f);
            return;
        }
        float f9 = f5 + f6;
        float f10 = f8 + f6;
        float sqrt = (float) Math.sqrt((double) ((f9 * f9) - (f10 * f10)));
        float f11 = f7 - sqrt;
        float f12 = f7 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f10)));
        float f13 = 90.0f - degrees;
        float f14 = f11 - f6;
        dAVar2.a(f14, 0.0f);
        float f15 = f6 * 2.0f;
        float f16 = degrees;
        dAVar.a(f14, 0.0f, f11 + f6, f15, 270.0f, degrees);
        dAVar.a(f7 - f5, (-f5) - f8, f7 + f5, f5 - f8, 180.0f - f13, (f13 * 2.0f) - 180.0f);
        dAVar.a(f12 - f6, 0.0f, f12 + f6, f15, 270.0f - f16, f16);
        dAVar2.a(f3, 0.0f);
    }

    /* access modifiers changed from: 0000 */
    public float b() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public float c() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public float d() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public void e(float f) {
        this.e = f;
    }

    /* access modifiers changed from: 0000 */
    public void b(float f) {
        this.b = f;
    }

    /* access modifiers changed from: 0000 */
    public void c(float f) {
        this.a = f;
    }

    /* access modifiers changed from: 0000 */
    public void d(float f) {
        this.c = f;
    }

    /* access modifiers changed from: 0000 */
    public float e() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public float a() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public void a(float f) {
        this.d = f;
    }
}
