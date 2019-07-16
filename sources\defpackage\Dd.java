package defpackage;

/* renamed from: Dd reason: default package */
/* compiled from: Palette */
class Dd implements b {
    Dd() {
    }

    private boolean b(float[] fArr) {
        return fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f;
    }

    private boolean c(float[] fArr) {
        return fArr[2] >= 0.95f;
    }

    public boolean a(int i, float[] fArr) {
        return !c(fArr) && !a(fArr) && !b(fArr);
    }

    private boolean a(float[] fArr) {
        return fArr[2] <= 0.05f;
    }
}
