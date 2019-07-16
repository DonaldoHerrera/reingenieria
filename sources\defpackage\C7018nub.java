package defpackage;

import java.util.List;

/* renamed from: nub reason: default package and case insensitive filesystem */
/* compiled from: NewCapturedType.kt */
public final class C7018nub implements Cpb {
    private final Stb a;
    private List<? extends C6405eub> b;

    public C7018nub(Stb stb, List<? extends C6405eub> list) {
        C7471uYa.b(stb, "projection");
        this.a = stb;
        this.b = list;
    }

    public C5301Sbb E() {
        C7706xtb type = a().getType();
        C7471uYa.a((Object) type, "projection.type");
        return Fub.b(type);
    }

    public Stb a() {
        return this.a;
    }

    public C5122Mcb c() {
        return null;
    }

    public boolean d() {
        return false;
    }

    public List<C4905Fdb> getParameters() {
        return C6918mWa.a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CapturedType(");
        sb.append(a());
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ C7018nub(Stb stb, List list, int i, C7264rYa rya) {
        if ((i & 2) != 0) {
            list = null;
        }
        this(stb, list);
    }

    public final void a(List<? extends C6405eub> list) {
        C7471uYa.b(list, "supertypes");
        boolean z = this.b == null;
        if (!TVa.a || z) {
            this.b = list;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Already initialized! oldValue = ");
        sb.append(this.b);
        sb.append(", newValue = ");
        sb.append(list);
        throw new AssertionError(sb.toString());
    }

    public List<C6405eub> b() {
        List<? extends C6405eub> list = this.b;
        return list != null ? list : C6918mWa.a();
    }
}
