package defpackage;

/* renamed from: Ybb reason: default package and case insensitive filesystem */
/* compiled from: UnsignedType.kt */
public enum C5476Ybb {
    UBYTE(r2),
    USHORT(r2),
    UINT(r2),
    ULONG(r2);
    
    private final C7694xnb f;
    private final C7280rnb g;
    private final C7280rnb h;

    private C5476Ybb(C7280rnb rnb) {
        this.h = rnb;
        C7694xnb f2 = this.h.f();
        C7471uYa.a((Object) f2, "classId.shortClassName");
        this.f = f2;
        C7349snb d = this.h.d();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f.a());
        sb.append("Array");
        this.g = new C7280rnb(d, C7694xnb.b(sb.toString()));
    }

    public final C7280rnb a() {
        return this.g;
    }

    public final C7280rnb b() {
        return this.h;
    }

    public final C7694xnb c() {
        return this.f;
    }
}
