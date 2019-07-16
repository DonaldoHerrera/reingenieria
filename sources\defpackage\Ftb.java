package defpackage;

import java.util.List;

/* renamed from: Ftb reason: default package */
/* compiled from: KotlinTypeFactory.kt */
final class Ftb extends Etb {
    private final Ptb a;
    private final List<Stb> b;
    private final boolean c;
    private final Eqb d;

    public Ftb(Ptb ptb, List<? extends Stb> list, boolean z, Eqb eqb) {
        C7471uYa.b(ptb, "constructor");
        C7471uYa.b(list, "arguments");
        C7471uYa.b(eqb, "memberScope");
        this.a = ptb;
        this.b = list;
        this.c = z;
        this.d = eqb;
        if (ha() instanceof b) {
            StringBuilder sb = new StringBuilder();
            sb.append("SimpleTypeImpl should not be created for error type: ");
            sb.append(ha());
            sb.append(10);
            sb.append(za());
            throw new IllegalStateException(sb.toString());
        }
    }

    public boolean Aa() {
        return this.c;
    }

    public C6723jeb getAnnotations() {
        return C6723jeb.c.a();
    }

    public Eqb ha() {
        return this.d;
    }

    public List<Stb> ya() {
        return this.b;
    }

    public Ptb za() {
        return this.a;
    }

    public Etb a(C6723jeb jeb) {
        C7471uYa.b(jeb, "newAnnotations");
        if (jeb.isEmpty()) {
            return this;
        }
        return new C6267ctb(this, jeb);
    }

    public Etb a(boolean z) {
        if (z == Aa()) {
            return this;
        }
        if (z) {
            return new Ctb(this);
        }
        return new Btb(this);
    }
}
