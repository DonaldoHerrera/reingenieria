package defpackage;

/* renamed from: itb reason: default package and case insensitive filesystem */
/* compiled from: KotlinTypeFactory.kt */
public abstract class C6675itb extends C6607htb {
    private final Etb a;

    public C6675itb(Etb etb) {
        C7471uYa.b(etb, "delegate");
        this.a = etb;
    }

    /* access modifiers changed from: protected */
    public Etb Ca() {
        return this.a;
    }

    public C6675itb a(C6723jeb jeb) {
        C7471uYa.b(jeb, "newAnnotations");
        return jeb != getAnnotations() ? new C6267ctb(this, jeb) : this;
    }

    public Etb a(boolean z) {
        if (z == Aa()) {
            return this;
        }
        return Ca().a(z).a(getAnnotations());
    }
}
