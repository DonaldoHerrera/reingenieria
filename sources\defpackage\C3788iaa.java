package defpackage;

import java.util.List;

/* renamed from: iaa reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_ScrollDepthEvent */
final class C3788iaa extends C3859rZ {
    C3788iaa(String str, long j, Yca yca, a aVar, int i, List<c> list, List<c> list2) {
        super(str, j, yca, aVar, i, list, list2);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Saa)) {
            return false;
        }
        Saa saa = (Saa) obj;
        if (!n().equals(saa.n()) || !h().equals(saa.h()) || i() != saa.i() || !k().equals(saa.k()) || !m().equals(saa.m())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return ((((((((n().hashCode() ^ 1000003) * 1000003) ^ h().hashCode()) * 1000003) ^ i()) * 1000003) ^ k().hashCode()) * 1000003) ^ m().hashCode();
    }
}
