package defpackage;

/* renamed from: Qe reason: default package */
/* compiled from: SystemIdInfo */
public class Qe {
    public final String a;
    public final int b;

    public Qe(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Qe.class != obj.getClass()) {
            return false;
        }
        Qe qe = (Qe) obj;
        if (this.b != qe.b) {
            return false;
        }
        return this.a.equals(qe.a);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
