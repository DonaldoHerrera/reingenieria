package defpackage;

/* renamed from: aaa reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_PlayHistoryEvent */
final class C3489aaa extends Daa {
    private final int a;
    private final C3508cda b;

    C3489aaa(int i, C3508cda cda) {
        this.a = i;
        if (cda != null) {
            this.b = cda;
            return;
        }
        throw new NullPointerException("Null urn");
    }

    public int a() {
        return this.a;
    }

    public C3508cda c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Daa)) {
            return false;
        }
        Daa daa = (Daa) obj;
        if (this.a != daa.a() || !this.b.equals(daa.c())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayHistoryEvent{kind=");
        sb.append(this.a);
        sb.append(", urn=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
