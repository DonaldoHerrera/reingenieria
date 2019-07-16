package defpackage;

/* renamed from: PZ reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_AdImageErrorEvent */
final class C3452PZ extends C3481ZY {
    C3452PZ(String str, long j, C3508cda cda, C3508cda cda2) {
        super(str, j, cda, cda2);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3419EZ)) {
            return false;
        }
        C3419EZ ez = (C3419EZ) obj;
        if (!i().equals(ez.i()) || !h().equals(ez.h())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return ((i().hashCode() ^ 1000003) * 1000003) ^ h().hashCode();
    }
}
