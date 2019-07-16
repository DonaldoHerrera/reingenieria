package defpackage;

/* renamed from: ZZ reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_OfflinePerformanceEvent */
final class C3482ZZ extends C3795jZ {
    C3482ZZ(String str, long j, a aVar, C3508cda cda, C3508cda cda2, boolean z, boolean z2) {
        super(str, j, aVar, cda, cda2, z, z2);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Aaa)) {
            return false;
        }
        Aaa aaa = (Aaa) obj;
        if (!i().equals(aaa.i()) || !l().equals(aaa.l()) || !k().equals(aaa.k()) || j() != aaa.j() || h() != aaa.h()) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((((i().hashCode() ^ 1000003) * 1000003) ^ l().hashCode()) * 1000003) ^ k().hashCode()) * 1000003) ^ (j() ? 1231 : 1237)) * 1000003;
        if (!h()) {
            i = 1237;
        }
        return hashCode ^ i;
    }
}
