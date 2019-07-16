package defpackage;

import com.soundcloud.android.foundation.ads.C3676c.a;

/* renamed from: YZ reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_OfflineInteractionEvent */
final class C3479YZ extends C3787iZ {
    C3479YZ(String str, long j, b bVar, C4928GKa<String> gKa, C4928GKa<String> gKa2, C4928GKa<c> gKa3, C4928GKa<c> gKa4, C4928GKa<String> gKa5, C4928GKa<C3508cda> gKa6, C4928GKa<String> gKa7, C4928GKa<a> gKa8, C4928GKa<C3508cda> gKa9, C4928GKa<d> gKa10, C4928GKa<Boolean> gKa11, boolean z) {
        super(str, j, bVar, gKa, gKa2, gKa3, gKa4, gKa5, gKa6, gKa7, gKa8, gKa9, gKa10, gKa11, z);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3924zaa)) {
            return false;
        }
        C3924zaa zaa = (C3924zaa) obj;
        if (!l().equals(zaa.l()) || !q().equals(zaa.q()) || !i().equals(zaa.i()) || !r().equals(zaa.r()) || !j().equals(zaa.j()) || !v().equals(zaa.v()) || !k().equals(zaa.k()) || !h().equals(zaa.h()) || !t().equals(zaa.t()) || !w().equals(zaa.w()) || !u().equals(zaa.u()) || !s().equals(zaa.s()) || x() != zaa.x()) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((l().hashCode() ^ 1000003) * 1000003) ^ q().hashCode()) * 1000003) ^ i().hashCode()) * 1000003) ^ r().hashCode()) * 1000003) ^ j().hashCode()) * 1000003) ^ v().hashCode()) * 1000003) ^ k().hashCode()) * 1000003) ^ h().hashCode()) * 1000003) ^ t().hashCode()) * 1000003) ^ w().hashCode()) * 1000003) ^ u().hashCode()) * 1000003) ^ s().hashCode()) * 1000003) ^ (x() ? 1231 : 1237);
    }
}
