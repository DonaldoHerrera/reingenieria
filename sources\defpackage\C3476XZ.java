package defpackage;

import java.util.List;

/* renamed from: XZ reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_InlayAdImpressionEvent */
final class C3476XZ extends C3771gZ {
    C3476XZ(String str, long j, C3508cda cda, int i, List<String> list) {
        super(str, j, cda, i, list);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3916yaa)) {
            return false;
        }
        C3916yaa yaa = (C3916yaa) obj;
        if (!h().equals(yaa.h()) || i() != yaa.i() || !j().equals(yaa.j())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return ((((h().hashCode() ^ 1000003) * 1000003) ^ i()) * 1000003) ^ j().hashCode();
    }
}
