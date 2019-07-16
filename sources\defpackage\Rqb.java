package defpackage;

/* renamed from: Rqb reason: default package */
/* compiled from: ImplicitClassReceiver.kt */
public class Rqb implements Sqb, Vqb {
    private final Rqb a;
    private final C5029Jcb b;
    private final C5029Jcb c;

    public Rqb(C5029Jcb jcb, Rqb rqb) {
        C7471uYa.b(jcb, "classDescriptor");
        this.c = jcb;
        if (rqb == null) {
            rqb = this;
        }
        this.a = rqb;
        this.b = this.c;
    }

    public final C5029Jcb A() {
        return this.c;
    }

    public boolean equals(Object obj) {
        C5029Jcb jcb = this.c;
        C5029Jcb jcb2 = null;
        if (!(obj instanceof Rqb)) {
            obj = null;
        }
        Rqb rqb = (Rqb) obj;
        if (rqb != null) {
            jcb2 = rqb.c;
        }
        return C7471uYa.a((Object) jcb, (Object) jcb2);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Class{");
        sb.append(getType());
        sb.append('}');
        return sb.toString();
    }

    public Etb getType() {
        Etb z = this.c.z();
        C7471uYa.a((Object) z, "classDescriptor.defaultType");
        return z;
    }
}
