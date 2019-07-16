package defpackage;

import java.util.Set;

/* renamed from: maa reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_UrnStateChangedEvent */
final class C3820maa extends C3490aba {
    private final a a;
    private final Set<C3508cda> b;

    C3820maa(a aVar, Set<C3508cda> set) {
        if (aVar != null) {
            this.a = aVar;
            if (set != null) {
                this.b = set;
                return;
            }
            throw new NullPointerException("Null urns");
        }
        throw new NullPointerException("Null kind");
    }

    public a d() {
        return this.a;
    }

    public Set<C3508cda> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3490aba)) {
            return false;
        }
        C3490aba aba = (C3490aba) obj;
        if (!this.a.equals(aba.d()) || !this.b.equals(aba.e())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UrnStateChangedEvent{kind=");
        sb.append(this.a);
        sb.append(", urns=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
