package com.soundcloud.android.foundation.events;

/* compiled from: StationsSourceInfo.kt */
public final class H {
    private final C3508cda a;

    public H(C3508cda cda) {
        C7471uYa.b(cda, "queryUrn");
        this.a = cda;
    }

    public final C3508cda a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.foundation.events.H) r2).a) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3508cda cda = this.a;
        if (cda != null) {
            return cda.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StationsSourceInfo(queryUrn=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
