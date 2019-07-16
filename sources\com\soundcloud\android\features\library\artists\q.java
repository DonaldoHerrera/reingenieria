package com.soundcloud.android.features.library.artists;

/* compiled from: ArtistsPresenter.kt */
public final class q {
    private final C3508cda a;
    private final Yca b;

    public q(C3508cda cda, Yca yca) {
        C7471uYa.b(cda, "userUrn");
        C7471uYa.b(yca, "screen");
        this.a = cda;
        this.b = yca;
    }

    public final Yca a() {
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
            if (obj instanceof q) {
                q qVar = (q) obj;
                if (C7471uYa.a((Object) this.a, (Object) qVar.a)) {
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
        Yca yca = this.b;
        if (yca != null) {
            i = yca.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserItemClickParams(userUrn=");
        sb.append(this.a);
        sb.append(", screen=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
