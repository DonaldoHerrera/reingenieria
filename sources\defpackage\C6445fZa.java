package defpackage;

/* renamed from: fZa reason: default package and case insensitive filesystem */
/* compiled from: RangesJVM.kt */
final class C6445fZa implements C6513gZa<Float> {
    private final float a;
    private final float b;

    public C6445fZa(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return a(((Number) comparable).floatValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r2.b == r3.b) goto L_0x0025;
     */
    public boolean equals(Object obj) {
        if (obj instanceof C6445fZa) {
            if (!a() || !((C6445fZa) obj).a()) {
                C6445fZa fza = (C6445fZa) obj;
                if (this.a == fza.a) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (a()) {
            return -1;
        }
        return (Float.valueOf(this.a).hashCode() * 31) + Float.valueOf(this.b).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("..");
        sb.append(this.b);
        return sb.toString();
    }

    public boolean a(float f) {
        return f >= this.a && f <= this.b;
    }

    public Float f() {
        return Float.valueOf(this.a);
    }

    public Float g() {
        return Float.valueOf(this.b);
    }

    public boolean a() {
        return this.a > this.b;
    }
}
