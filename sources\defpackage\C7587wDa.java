package defpackage;

/* renamed from: wDa reason: default package and case insensitive filesystem */
/* compiled from: MediaStreamsRepository.kt */
public final class C7587wDa {
    private final C3508cda a;
    private final Zda b;

    public C7587wDa(C3508cda cda, Zda zda) {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(zda, "media");
        this.a = cda;
        this.b = zda;
    }

    public final Zda a() {
        return this.b;
    }

    public final C3508cda b() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7587wDa) {
                C7587wDa wda = (C7587wDa) obj;
                if (C7471uYa.a((Object) this.a, (Object) wda.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3508cda cda = this.a;
        int i = 0;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        Zda zda = this.b;
        if (zda != null) {
            i = zda.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaStreamsEntry(urn=");
        sb.append(this.a);
        sb.append(", media=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
