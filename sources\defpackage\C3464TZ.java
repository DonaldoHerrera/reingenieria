package defpackage;

/* renamed from: TZ reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_AttributionEvent */
final class C3464TZ extends C3504cZ {
    C3464TZ(String str, long j, C4928GKa<String> gKa, C4928GKa<String> gKa2, C4928GKa<String> gKa3, C4928GKa<String> gKa4) {
        super(str, j, gKa, gKa2, gKa3, gKa4);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3446NZ)) {
            return false;
        }
        C3446NZ nz = (C3446NZ) obj;
        if (!k().equals(nz.k()) || !i().equals(nz.i()) || !h().equals(nz.h()) || !j().equals(nz.j())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return ((((((k().hashCode() ^ 1000003) * 1000003) ^ i().hashCode()) * 1000003) ^ h().hashCode()) * 1000003) ^ j().hashCode();
    }
}
