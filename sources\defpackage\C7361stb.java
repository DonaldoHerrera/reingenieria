package defpackage;

/* renamed from: stb reason: default package and case insensitive filesystem */
/* compiled from: TypeWithEnhancement.kt */
public final class C7361stb extends C7223qtb implements C5673bub {
    private final C7223qtb c;
    private final C7706xtb d;

    public C7361stb(C7223qtb qtb, C7706xtb xtb) {
        C7471uYa.b(qtb, "origin");
        C7471uYa.b(xtb, "enhancement");
        super(qtb.Da(), qtb.Ea());
        this.c = qtb;
        this.d = xtb;
    }

    public Etb Ca() {
        return wa().Ca();
    }

    public C6405eub a(C6723jeb jeb) {
        C7471uYa.b(jeb, "newAnnotations");
        return C6269cub.b(wa().a(jeb), ua());
    }

    public C7706xtb ua() {
        return this.d;
    }

    public C6405eub a(boolean z) {
        return C6269cub.b(wa().a(z), ua().Ba().a(z));
    }

    public C7223qtb wa() {
        return this.c;
    }

    public String a(Cob cob, Pob pob) {
        C7471uYa.b(cob, "renderer");
        C7471uYa.b(pob, "options");
        if (pob.a()) {
            return cob.a(ua());
        }
        return wa().a(cob, pob);
    }
}
