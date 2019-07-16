package defpackage;

import java.util.List;

/* renamed from: kaa reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_SponsoredSessionStartEvent */
final class C3804kaa extends C3867sZ {
    C3804kaa(String str, long j, C3508cda cda, String str2, Yca yca, String str3, List<String> list) {
        super(str, j, cda, str2, yca, str3, list);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Taa)) {
            return false;
        }
        Taa taa = (Taa) obj;
        if (!h().equals(taa.h()) || !i().equals(taa.i()) || !k().equals(taa.k()) || !j().equals(taa.j()) || !l().equals(taa.l())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return ((((((((h().hashCode() ^ 1000003) * 1000003) ^ i().hashCode()) * 1000003) ^ k().hashCode()) * 1000003) ^ j().hashCode()) * 1000003) ^ l().hashCode();
    }
}
