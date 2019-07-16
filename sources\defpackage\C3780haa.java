package defpackage;

/* renamed from: haa reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_PurchaseEvent */
final class C3780haa extends C3843pZ {
    C3780haa(String str, long j, a aVar, String str2, String str3) {
        super(str, j, aVar, str2, str3);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Raa)) {
            return false;
        }
        Raa raa = (Raa) obj;
        if (!k().equals(raa.k()) || !j().equals(raa.j()) || !i().equals(raa.i())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return ((((k().hashCode() ^ 1000003) * 1000003) ^ j().hashCode()) * 1000003) ^ i().hashCode();
    }
}
