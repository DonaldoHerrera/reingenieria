package defpackage;

import com.soundcloud.android.foundation.playqueue.m;

/* renamed from: UZ reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_CollectionEvent */
final class C3467UZ extends C3755eZ {
    C3467UZ(String str, long j, b bVar, C4928GKa<String> gKa, C4928GKa<String> gKa2, C4928GKa<d> gKa3, String str2, C4928GKa<m> gKa4) {
        super(str, j, bVar, gKa, gKa2, gKa3, str2, gKa4);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3860raa)) {
            return false;
        }
        C3860raa raa = (C3860raa) obj;
        if (!h().equals(raa.h()) || !j().equals(raa.j()) || !m().equals(raa.m()) || !k().equals(raa.k()) || !l().equals(raa.l())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return ((((((((h().hashCode() ^ 1000003) * 1000003) ^ j().hashCode()) * 1000003) ^ m().hashCode()) * 1000003) ^ k().hashCode()) * 1000003) ^ l().hashCode();
    }
}
