package defpackage;

/* renamed from: Gtb reason: default package */
/* compiled from: TypeWithEnhancement.kt */
public final class Gtb extends C6607htb implements C5673bub {
    private final Etb a;
    private final C7706xtb b;

    public Gtb(Etb etb, C7706xtb xtb) {
        C7471uYa.b(etb, "delegate");
        C7471uYa.b(xtb, "enhancement");
        this.a = etb;
        this.b = xtb;
    }

    /* access modifiers changed from: protected */
    public Etb Ca() {
        return this.a;
    }

    public C7706xtb ua() {
        return this.b;
    }

    public C6405eub wa() {
        return Ca();
    }

    public Etb a(C6723jeb jeb) {
        C7471uYa.b(jeb, "newAnnotations");
        C6405eub b2 = C6269cub.b(wa().a(jeb), ua());
        if (b2 != null) {
            return (Etb) b2;
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
    }

    public Etb a(boolean z) {
        C6405eub b2 = C6269cub.b(wa().a(z), ua().Ba().a(z));
        if (b2 != null) {
            return (Etb) b2;
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
    }
}
