package defpackage;

/* renamed from: eaa reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_PolicyUpdateFailureEvent */
final class C3756eaa extends C3811lZ {
    C3756eaa(String str, long j, b bVar, a aVar) {
        super(str, j, bVar, aVar);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Oaa)) {
            return false;
        }
        Oaa oaa = (Oaa) obj;
        if (!i().equals(oaa.i()) || !h().equals(oaa.h())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return ((i().hashCode() ^ 1000003) * 1000003) ^ h().hashCode();
    }
}
