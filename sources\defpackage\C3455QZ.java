package defpackage;

import java.util.List;

/* renamed from: QZ reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_AdOverlayTrackingEvent */
final class C3455QZ extends C3484_Y {
    C3455QZ(String str, long j, b bVar, List<String> list, C3508cda cda, C3508cda cda2, C4928GKa<String> gKa, C4928GKa<String> gKa2, C3508cda cda3, C4928GKa<c> gKa3, C4928GKa<String> gKa4, C4928GKa<String> gKa5, C4928GKa<C3508cda> gKa6, C4928GKa<c> gKa7, C4928GKa<C3508cda> gKa8) {
        super(str, j, bVar, list, cda, cda2, gKa, gKa2, cda3, gKa3, gKa4, gKa5, gKa6, gKa7, gKa8);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3425GZ)) {
            return false;
        }
        C3425GZ gz = (C3425GZ) obj;
        if (!m().equals(gz.m()) || !s().equals(gz.s()) || !t().equals(gz.t()) || !p().equals(gz.p()) || !h().equals(gz.h()) || !r().equals(gz.r()) || !i().equals(gz.i()) || !q().equals(gz.q()) || !j().equals(gz.j()) || !l().equals(gz.l()) || !k().equals(gz.k()) || !n().equals(gz.n()) || !o().equals(gz.o())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((m().hashCode() ^ 1000003) * 1000003) ^ s().hashCode()) * 1000003) ^ t().hashCode()) * 1000003) ^ p().hashCode()) * 1000003) ^ h().hashCode()) * 1000003) ^ r().hashCode()) * 1000003) ^ i().hashCode()) * 1000003) ^ q().hashCode()) * 1000003) ^ j().hashCode()) * 1000003) ^ l().hashCode()) * 1000003) ^ k().hashCode()) * 1000003) ^ n().hashCode()) * 1000003) ^ o().hashCode();
    }
}
