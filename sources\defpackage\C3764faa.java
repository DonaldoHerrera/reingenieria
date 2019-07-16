package defpackage;

import java.util.List;

/* renamed from: faa reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_PrestitialAdImpressionEvent */
final class C3764faa extends C3819mZ {
    C3764faa(String str, long j, C3508cda cda, String str2, List<String> list, String str3) {
        super(str, j, cda, str2, list, str3);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Paa)) {
            return false;
        }
        Paa paa = (Paa) obj;
        if (!k().equals(paa.k()) || !h().equals(paa.h()) || !i().equals(paa.i()) || !j().equals(paa.j())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return ((((((k().hashCode() ^ 1000003) * 1000003) ^ h().hashCode()) * 1000003) ^ i().hashCode()) * 1000003) ^ j().hashCode();
    }
}
