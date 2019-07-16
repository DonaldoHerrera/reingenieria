package defpackage;

import java.util.Map;

/* renamed from: Zxa reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_StorageCleanupEvent */
final class C5516Zxa extends C5487Yxa {
    C5516Zxa(String str, long j, int i, int i2, int i3, Map<String, Integer> map, Map<String, Integer> map2, Map<String, Integer> map3) {
        super(str, j, i, i2, i3, map, map2, map3);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7784yya)) {
            return false;
        }
        C7784yya yya = (C7784yya) obj;
        if (l() != yya.l() || j() != yya.j() || h() != yya.h() || !m().equals(yya.m()) || !k().equals(yya.k()) || !i().equals(yya.i())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return ((((((((((l() ^ 1000003) * 1000003) ^ j()) * 1000003) ^ h()) * 1000003) ^ m().hashCode()) * 1000003) ^ k().hashCode()) * 1000003) ^ i().hashCode();
    }
}
