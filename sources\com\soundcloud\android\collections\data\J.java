package com.soundcloud.android.collections.data;

/* compiled from: LikeStatus.kt */
public final class J {
    private final C3508cda a;
    private final boolean b;

    public J(C3508cda cda, boolean z) {
        C7471uYa.b(cda, "urn");
        this.a = cda;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof J) {
                J j = (J) obj;
                if (C7471uYa.a((Object) this.a, (Object) j.a)) {
                    if (this.b == j.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3508cda cda = this.a;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LikeStatus(urn=");
        sb.append(this.a);
        sb.append(", isUserLike=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
