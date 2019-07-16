package defpackage;

/* renamed from: TYa reason: default package */
/* compiled from: MathJVM.kt */
class TYa extends SYa {
    public static int a(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
