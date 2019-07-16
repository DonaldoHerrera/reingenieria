package defpackage;

import com.soundcloud.android.foundation.ads.C3676c.a;
import java.util.List;

/* renamed from: oaa reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_VisualAdImpressionEvent */
final class C3836oaa extends C3891vZ {
    C3836oaa(String str, long j, String str2, String str3, String str4, C4928GKa<C3508cda> gKa, C4928GKa<String> gKa2, List<String> list, a aVar, a aVar2) {
        super(str, j, str2, str3, str4, gKa, gKa2, list, aVar, aVar2);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3506cba)) {
            return false;
        }
        C3506cba cba = (C3506cba) obj;
        if (!o().equals(cba.o()) || !n().equals(cba.n()) || !m().equals(cba.m()) || !i().equals(cba.i()) || !h().equals(cba.h()) || !k().equals(cba.k()) || !j().equals(cba.j()) || !l().equals(cba.l())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return ((((((((((((((o().hashCode() ^ 1000003) * 1000003) ^ n().hashCode()) * 1000003) ^ m().hashCode()) * 1000003) ^ i().hashCode()) * 1000003) ^ h().hashCode()) * 1000003) ^ k().hashCode()) * 1000003) ^ j().hashCode()) * 1000003) ^ l().hashCode();
    }
}
