package defpackage;

import com.soundcloud.android.foundation.events.J;

/* renamed from: saa reason: default package and case insensitive filesystem */
/* compiled from: ErrorAdEvent.kt */
public final class C3868saa extends J {
    private final C3508cda a;
    private final C3508cda b;

    public C3868saa(C3508cda cda, C3508cda cda2) {
        C7471uYa.b(cda, "adUrn");
        C7471uYa.b(cda2, "monetizableTrackUrn");
        this.a = cda;
        this.b = cda2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3868saa) {
                C3868saa saa = (C3868saa) obj;
                if (C7471uYa.a((Object) this.a, (Object) saa.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public long g() {
        return J.c();
    }

    public int hashCode() {
        C3508cda cda = this.a;
        int i = 0;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        C3508cda cda2 = this.b;
        if (cda2 != null) {
            i = cda2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ErrorAdEvent(adUrn=");
        sb.append(this.a);
        sb.append(", monetizableTrackUrn=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
