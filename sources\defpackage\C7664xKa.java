package defpackage;

@Deprecated
/* renamed from: xKa reason: default package and case insensitive filesystem */
/* compiled from: Pair */
public final class C7664xKa<A, B> {
    private final A a;
    private final B b;

    C7664xKa(A a2, B b2) {
        if (a2 == null) {
            throw new NullPointerException();
        } else if (b2 != null) {
            this.a = a2;
            this.b = b2;
        } else {
            throw new NullPointerException();
        }
    }

    public static <A, B> C7664xKa<A, B> a(A a2, B b2) {
        return new C7664xKa<>(a2, b2);
    }

    public B b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7664xKa) {
            C7664xKa xka = (C7664xKa) obj;
            if (C4804CKa.a(this.a, xka.a) && C4804CKa.a(this.b, xka.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(this.a);
        sb.append("=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public A a() {
        return this.a;
    }
}
