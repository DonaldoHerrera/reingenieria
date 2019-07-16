package defpackage;

/* renamed from: Ena reason: default package */
/* compiled from: VolumeInterpolator.kt */
public enum Ena {
    LINEAR,
    ACCELERATE,
    ACCELERATE_DECELERATE,
    DECELERATE;

    public final float a(float f) {
        int i = Dna.a[ordinal()];
        if (i == 1) {
            return f * f;
        }
        if (i == 2) {
            float f2 = 1.0f - f;
            return 1.0f - (f2 * f2);
        } else if (i == 3) {
            return ((float) (Math.cos(((double) (f + 1.0f)) * 3.141592653589793d) / ((double) 2.0f))) + 0.5f;
        } else {
            if (i == 4) {
                return f;
            }
            throw new FVa();
        }
    }

    public final float a(float f, float f2, float f3) {
        float a = a(f);
        return f2 >= f3 ? ((((float) 1) - a) * (f2 - f3)) + f3 : (a * (f3 - f2)) + f2;
    }
}
