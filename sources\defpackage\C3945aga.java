package defpackage;

import java.util.Collection;

/* renamed from: aga reason: default package and case insensitive filesystem */
/* compiled from: EnrichedResponse.kt */
public final class C3945aga<Key, NetworkModel> {
    private final Collection<Ufa<NetworkModel>> a;
    private final Collection<C4554fga<Key>> b;

    public C3945aga(Collection<Ufa<NetworkModel>> collection, Collection<C4554fga<Key>> collection2) {
        C7471uYa.b(collection, "models");
        C7471uYa.b(collection2, "tombstones");
        this.a = collection;
        this.b = collection2;
    }

    public final Collection<Ufa<NetworkModel>> a() {
        return this.a;
    }

    public final Collection<C4554fga<Key>> b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3945aga) {
                C3945aga aga = (C3945aga) obj;
                if (C7471uYa.a((Object) this.a, (Object) aga.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Collection<Ufa<NetworkModel>> collection = this.a;
        int i = 0;
        int hashCode = (collection != null ? collection.hashCode() : 0) * 31;
        Collection<C4554fga<Key>> collection2 = this.b;
        if (collection2 != null) {
            i = collection2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EnrichedResponse(models=");
        sb.append(this.a);
        sb.append(", tombstones=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
