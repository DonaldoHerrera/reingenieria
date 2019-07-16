package defpackage;

import com.soundcloud.android.foundation.ads.C3676c.a;

/* renamed from: OZ reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_AdDeliveryEvent */
final class C3449OZ extends C3478YY {
    C3449OZ(String str, long j, C3508cda cda, C4928GKa<C3508cda> gKa, String str2, boolean z, boolean z2, C4928GKa<a> gKa2) {
        super(str, j, cda, gKa, str2, z, z2, gKa2);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3410BZ)) {
            return false;
        }
        C3410BZ bz = (C3410BZ) obj;
        if (!i().equals(bz.i()) || !k().equals(bz.k()) || !h().equals(bz.h()) || j() != bz.j() || m() != bz.m() || !l().equals(bz.l())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((((i().hashCode() ^ 1000003) * 1000003) ^ k().hashCode()) * 1000003) ^ h().hashCode()) * 1000003) ^ (j() ? 1231 : 1237)) * 1000003;
        if (!m()) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ l().hashCode();
    }
}
