package defpackage;

/* renamed from: laa reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_UpgradeFunnelEvent */
final class C3812laa extends C3883uZ {
    C3812laa(String str, long j, g gVar, e eVar, C4928GKa<String> gKa, C4928GKa<String> gKa2, C4928GKa<d> gKa3, C4928GKa<c> gKa4, C4928GKa<String> gKa5, C4928GKa<f> gKa6, C4928GKa<String> gKa7, C4928GKa<String> gKa8, C4928GKa<a> gKa9) {
        super(str, j, gVar, eVar, gKa, gKa2, gKa3, gKa4, gKa5, gKa6, gKa7, gKa8, gKa9);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Waa)) {
            return false;
        }
        Waa waa = (Waa) obj;
        if (!W().equals(waa.W()) || !l().equals(waa.l()) || !X().equals(waa.X()) || !Y().equals(waa.Y()) || !j().equals(waa.j()) || !i().equals(waa.i()) || !k().equals(waa.k()) || !U().equals(waa.U()) || !T().equals(waa.T()) || !V().equals(waa.V()) || !h().equals(waa.h())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return ((((((((((((((((((((W().hashCode() ^ 1000003) * 1000003) ^ l().hashCode()) * 1000003) ^ X().hashCode()) * 1000003) ^ Y().hashCode()) * 1000003) ^ j().hashCode()) * 1000003) ^ i().hashCode()) * 1000003) ^ k().hashCode()) * 1000003) ^ U().hashCode()) * 1000003) ^ T().hashCode()) * 1000003) ^ V().hashCode()) * 1000003) ^ h().hashCode();
    }
}
