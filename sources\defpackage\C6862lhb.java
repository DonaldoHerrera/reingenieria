package defpackage;

import java.util.Collection;

/* renamed from: lhb reason: default package and case insensitive filesystem */
/* compiled from: context.kt */
public final class C6862lhb {
    private final C6864ljb a;
    private final Collection<a> b;

    public C6862lhb(C6864ljb ljb, Collection<? extends a> collection) {
        C7471uYa.b(ljb, "nullabilityQualifier");
        C7471uYa.b(collection, "qualifierApplicabilityTypes");
        this.a = ljb;
        this.b = collection;
    }

    public final C6864ljb a() {
        return this.a;
    }

    public final Collection<a> b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6862lhb) {
                C6862lhb lhb = (C6862lhb) obj;
                if (C7471uYa.a((Object) this.a, (Object) lhb.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C6864ljb ljb = this.a;
        int i = 0;
        int hashCode = (ljb != null ? ljb.hashCode() : 0) * 31;
        Collection<a> collection = this.b;
        if (collection != null) {
            i = collection.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NullabilityQualifierWithApplicability(nullabilityQualifier=");
        sb.append(this.a);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
