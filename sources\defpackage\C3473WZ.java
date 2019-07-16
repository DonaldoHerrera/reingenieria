package defpackage;

/* renamed from: WZ reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_GoOnboardingTooltipEvent */
final class C3473WZ extends C3763fZ {
    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3908xaa)) {
            return false;
        }
        C3908xaa xaa = (C3908xaa) obj;
        if (!h().equals(xaa.h()) || !k().equals(xaa.k()) || !l().equals(xaa.l()) || !i().equals(xaa.i()) || !j().equals(xaa.j())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return ((((((((h().hashCode() ^ 1000003) * 1000003) ^ k().hashCode()) * 1000003) ^ l().hashCode()) * 1000003) ^ i().hashCode()) * 1000003) ^ j().hashCode();
    }
}
