package defpackage;

/* renamed from: Ttb reason: default package */
/* compiled from: TypeProjectionBase */
public abstract class Ttb implements Stb {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stb)) {
            return false;
        }
        Stb stb = (Stb) obj;
        return a() == stb.a() && b() == stb.b() && getType().equals(stb.getType());
    }

    public int hashCode() {
        return (b().hashCode() * 31) + (a() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (a()) {
            return "*";
        }
        if (b() == C6473fub.INVARIANT) {
            return getType().toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b());
        sb.append(" ");
        sb.append(getType());
        return sb.toString();
    }
}
