package defpackage;

import com.soundcloud.android.foundation.ads.C3676c.a;
import com.soundcloud.android.playback.C4298dd;

/* renamed from: RZ reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_AdRichMediaSessionEvent */
final class C3458RZ extends C3496bZ {
    C3458RZ(String str, long j, String str2, a aVar, C3508cda cda, C4928GKa<C3508cda> gKa, a aVar2, String str3, c cVar, C4928GKa<C4298dd.a> gKa2, long j2, String str4, C4928GKa<String> gKa3, String str5, long j3, C4928GKa<String> gKa4, C4928GKa<String> gKa5, C4928GKa<C3508cda> gKa6, C4928GKa<Integer> gKa7, C4928GKa<C3508cda> gKa8, C4928GKa<C3508cda> gKa9, C4928GKa<Integer> gKa10, C4928GKa<C3508cda> gKa11) {
        super(str, j, str2, aVar, cda, gKa, aVar2, str3, cVar, gKa2, j2, str4, gKa3, str5, j3, gKa4, gKa5, gKa6, gKa7, gKa8, gKa9, gKa10, gKa11);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3440LZ)) {
            return false;
        }
        C3440LZ lz = (C3440LZ) obj;
        if (!k().equals(lz.k()) || !h().equals(lz.h()) || !i().equals(lz.i()) || !m().equals(lz.m()) || !n().equals(lz.n()) || !o().equals(lz.o()) || !B().equals(lz.B()) || !z().equals(lz.z()) || q() != lz.q() || !j().equals(lz.j()) || !s().equals(lz.s()) || !p().equals(lz.p()) || A() != lz.A() || !w().equals(lz.w()) || !y().equals(lz.y()) || !l().equals(lz.l()) || !r().equals(lz.r()) || !v().equals(lz.v()) || !u().equals(lz.u()) || !t().equals(lz.t()) || !x().equals(lz.x())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return (((((((((((((((((int) (((long) ((((((j().hashCode() ^ (((int) (((long) ((((((((((((((((k().hashCode() ^ 1000003) * 1000003) ^ h().hashCode()) * 1000003) ^ i().hashCode()) * 1000003) ^ m().hashCode()) * 1000003) ^ n().hashCode()) * 1000003) ^ o().hashCode()) * 1000003) ^ B().hashCode()) * 1000003) ^ z().hashCode()) * 1000003)) ^ ((q() >>> 32) ^ q()))) * 1000003)) * 1000003) ^ s().hashCode()) * 1000003) ^ p().hashCode()) * 1000003)) ^ ((A() >>> 32) ^ A()))) * 1000003) ^ w().hashCode()) * 1000003) ^ y().hashCode()) * 1000003) ^ l().hashCode()) * 1000003) ^ r().hashCode()) * 1000003) ^ v().hashCode()) * 1000003) ^ u().hashCode()) * 1000003) ^ t().hashCode()) * 1000003) ^ x().hashCode();
    }
}
