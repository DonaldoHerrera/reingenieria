package defpackage;

import java.util.List;

/* renamed from: mtb reason: default package and case insensitive filesystem */
/* compiled from: ErrorType.kt */
public class C6947mtb extends Etb {
    private final Ptb a;
    private final Eqb b;
    private final List<Stb> c;
    private final boolean d;

    public C6947mtb(Ptb ptb, Eqb eqb) {
        this(ptb, eqb, null, false, 12, null);
    }

    public /* synthetic */ C6947mtb(Ptb ptb, Eqb eqb, List list, boolean z, int i, C7264rYa rya) {
        if ((i & 4) != 0) {
            list = C6918mWa.a();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        this(ptb, eqb, list, z);
    }

    public boolean Aa() {
        return this.d;
    }

    public Etb a(C6723jeb jeb) {
        C7471uYa.b(jeb, "newAnnotations");
        return this;
    }

    public C6723jeb getAnnotations() {
        return C6723jeb.c.a();
    }

    public Eqb ha() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(za().toString());
        sb.append(ya().isEmpty() ? "" : C7676xWa.a(ya(), ", ", "<", ">", -1, "...", null));
        return sb.toString();
    }

    public List<Stb> ya() {
        return this.c;
    }

    public Ptb za() {
        return this.a;
    }

    public C6947mtb(Ptb ptb, Eqb eqb, List<? extends Stb> list, boolean z) {
        C7471uYa.b(ptb, "constructor");
        C7471uYa.b(eqb, "memberScope");
        C7471uYa.b(list, "arguments");
        this.a = ptb;
        this.b = eqb;
        this.c = list;
        this.d = z;
    }

    public Etb a(boolean z) {
        return new C6947mtb(za(), ha(), ya(), z);
    }
}
