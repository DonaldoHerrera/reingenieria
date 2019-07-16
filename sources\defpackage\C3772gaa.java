package defpackage;

import java.util.List;

/* renamed from: gaa reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_PromotedTrackingEvent */
final class C3772gaa extends C3835oZ {
    C3772gaa(String str, long j, c cVar, List<String> list, String str2, String str3, String str4, C4928GKa<C3508cda> gKa, C4928GKa<b> gKa2, C4928GKa<C3508cda> gKa3, C4928GKa<C3508cda> gKa4, C4928GKa<C3508cda> gKa5, C4928GKa<String> gKa6, C4928GKa<Integer> gKa7) {
        super(str, j, cVar, list, str2, str3, str4, gKa, gKa2, gKa3, gKa4, gKa5, gKa6, gKa7);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Qaa)) {
            return false;
        }
        Qaa qaa = (Qaa) obj;
        if (!n().equals(qaa.n()) || !s().equals(qaa.s()) || !o().equals(qaa.o()) || !h().equals(qaa.h()) || !p().equals(qaa.p()) || !m().equals(qaa.m()) || !l().equals(qaa.l()) || !q().equals(qaa.q()) || !j().equals(qaa.j()) || !k().equals(qaa.k()) || !i().equals(qaa.i()) || !r().equals(qaa.r())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((n().hashCode() ^ 1000003) * 1000003) ^ s().hashCode()) * 1000003) ^ o().hashCode()) * 1000003) ^ h().hashCode()) * 1000003) ^ p().hashCode()) * 1000003) ^ m().hashCode()) * 1000003) ^ l().hashCode()) * 1000003) ^ q().hashCode()) * 1000003) ^ j().hashCode()) * 1000003) ^ k().hashCode()) * 1000003) ^ i().hashCode()) * 1000003) ^ r().hashCode();
    }
}
