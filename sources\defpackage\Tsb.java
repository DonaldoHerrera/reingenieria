package defpackage;

/* renamed from: Tsb reason: default package */
/* compiled from: SpecialTypes.kt */
public final class Tsb extends C6607htb {
    private final Etb a;
    private final Etb b;

    public Tsb(Etb etb, Etb etb2) {
        C7471uYa.b(etb, "delegate");
        C7471uYa.b(etb2, "abbreviation");
        this.a = etb;
        this.b = etb2;
    }

    /* access modifiers changed from: protected */
    public Etb Ca() {
        return this.a;
    }

    public final Etb Da() {
        return this.b;
    }

    public final Etb fa() {
        return Ca();
    }

    public Tsb a(C6723jeb jeb) {
        C7471uYa.b(jeb, "newAnnotations");
        return new Tsb(Ca().a(jeb), this.b);
    }

    public Tsb a(boolean z) {
        return new Tsb(Ca().a(z), this.b.a(z));
    }
}
