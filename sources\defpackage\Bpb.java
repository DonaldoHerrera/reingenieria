package defpackage;

import java.util.List;

/* renamed from: Bpb reason: default package */
/* compiled from: CapturedTypeConstructor.kt */
public final class Bpb extends Etb implements Mtb {
    private final Stb a;
    private final Cpb b;
    private final boolean c;
    private final C6723jeb d;

    public /* synthetic */ Bpb(Stb stb, Cpb cpb, boolean z, C6723jeb jeb, int i, C7264rYa rya) {
        if ((i & 2) != 0) {
            cpb = new Dpb(stb);
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            jeb = C6723jeb.c.a();
        }
        this(stb, cpb, z, jeb);
    }

    public boolean Aa() {
        return this.c;
    }

    public boolean b(C7706xtb xtb) {
        C7471uYa.b(xtb, C1325gg.TYPE);
        return za() == xtb.za();
    }

    public C6723jeb getAnnotations() {
        return this.d;
    }

    public Eqb ha() {
        Eqb a2 = C7154ptb.a("No member resolution should be done on captured type, it used only during constraint system resolution", true);
        C7471uYa.a((Object) a2, "ErrorUtils.createErrorSc…solution\", true\n        )");
        return a2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Captured(");
        sb.append(this.a);
        sb.append(')');
        sb.append(Aa() ? "?" : "");
        return sb.toString();
    }

    public C7706xtb va() {
        C6473fub fub = C6473fub.IN_VARIANCE;
        Etb u = Fub.b(this).u();
        C7471uYa.a((Object) u, "builtIns.nothingType");
        return a(fub, u);
    }

    public C7706xtb xa() {
        C6473fub fub = C6473fub.OUT_VARIANCE;
        Etb v = Fub.b(this).v();
        C7471uYa.a((Object) v, "builtIns.nullableAnyType");
        return a(fub, v);
    }

    public List<Stb> ya() {
        return C6918mWa.a();
    }

    public Cpb za() {
        return this.b;
    }

    public Bpb(Stb stb, Cpb cpb, boolean z, C6723jeb jeb) {
        C7471uYa.b(stb, "typeProjection");
        C7471uYa.b(cpb, "constructor");
        C7471uYa.b(jeb, "annotations");
        this.a = stb;
        this.b = cpb;
        this.c = z;
        this.d = jeb;
    }

    private final C7706xtb a(C6473fub fub, C7706xtb xtb) {
        if (this.a.b() == fub) {
            xtb = this.a.getType();
        }
        C7471uYa.a((Object) xtb, "if (typeProjection.proje…jection.type else default");
        return xtb;
    }

    public Bpb a(boolean z) {
        if (z == Aa()) {
            return this;
        }
        return new Bpb(this.a, za(), z, getAnnotations());
    }

    public Bpb a(C6723jeb jeb) {
        C7471uYa.b(jeb, "newAnnotations");
        return new Bpb(this.a, za(), Aa(), jeb);
    }
}
