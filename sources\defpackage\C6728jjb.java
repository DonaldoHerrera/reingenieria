package defpackage;

/* renamed from: jjb reason: default package and case insensitive filesystem */
/* compiled from: typeEnhancement.kt */
public final class C6728jjb extends C6607htb implements C6403etb {
    private final Etb a;

    public C6728jjb(Etb etb) {
        C7471uYa.b(etb, "delegate");
        this.a = etb;
    }

    public boolean Aa() {
        return false;
    }

    /* access modifiers changed from: protected */
    public Etb Ca() {
        return this.a;
    }

    public boolean ta() {
        return true;
    }

    public C7706xtb a(C7706xtb xtb) {
        C7706xtb xtb2;
        C7471uYa.b(xtb, "replacement");
        C6405eub Ba = xtb.Ba();
        if (!C5605aub.g(Ba) && !Fub.d(Ba)) {
            return Ba;
        }
        if (Ba instanceof Etb) {
            xtb2 = a((Etb) Ba);
        } else if (Ba instanceof C7223qtb) {
            C7223qtb qtb = (C7223qtb) Ba;
            xtb2 = C6269cub.b(C7775ytb.a(a(qtb.Da()), a(qtb.Ea())), C6269cub.a(Ba));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Incorrect type: ");
            sb.append(Ba);
            throw new IllegalStateException(sb.toString().toString());
        }
        return xtb2;
    }

    private final Etb a(Etb etb) {
        Etb a2 = etb.a(false);
        if (!Fub.d(etb)) {
            return a2;
        }
        return new C6728jjb(a2);
    }

    public C6728jjb a(C6723jeb jeb) {
        C7471uYa.b(jeb, "newAnnotations");
        return new C6728jjb(Ca().a(jeb));
    }

    public Etb a(boolean z) {
        return z ? Ca().a(true) : this;
    }
}
