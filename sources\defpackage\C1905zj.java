package defpackage;

/* renamed from: zj reason: default package and case insensitive filesystem */
/* compiled from: BatteryStatus */
public final class C1905zj {
    public static final C1905zj a = new C1905zj(false, 1.0f);
    private final boolean b;
    private final float c;

    C1905zj(boolean z, float f) {
        this.b = z;
        this.c = f;
    }

    public boolean a() {
        return this.c < 0.15f && !this.b;
    }

    public boolean b() {
        return this.b;
    }
}
