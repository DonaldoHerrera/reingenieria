package defpackage;

import java.util.List;

/* renamed from: Pab reason: default package and case insensitive filesystem */
/* compiled from: KTypeParameterImpl.kt */
public final class C5210Pab implements IZa, M_a {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(C5210Pab.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    private final a b = C5300Sab.b(new C5180Oab(this));
    private final C4905Fdb c;

    public C5210Pab(C4905Fdb fdb) {
        C7471uYa.b(fdb, "descriptor");
        this.c = fdb;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5210Pab) && C7471uYa.a((Object) b(), (Object) ((C5210Pab) obj).b());
    }

    public List<HZa> getUpperBounds() {
        return (List) this.b.a(this, a[0]);
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return C5475Yab.b.a(b());
    }

    public C4905Fdb b() {
        return this.c;
    }
}
