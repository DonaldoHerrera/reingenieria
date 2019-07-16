package com.soundcloud.android.trackinfo;

/* compiled from: NewTrackInfoPresenter.kt */
public final class z {
    private final C3508cda a;
    private final Long b;

    public z(C3508cda cda, Long l) {
        C7471uYa.b(cda, "trackUrn");
        this.a = cda;
        this.b = l;
    }

    public final C3508cda a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z) {
                z zVar = (z) obj;
                if (C7471uYa.a((Object) this.a, (Object) zVar.a)) {
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
        Long l = this.b;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackInfoParams(trackUrn=");
        sb.append(this.a);
        sb.append(", commentPosition=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
