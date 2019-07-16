package com.soundcloud.android.comments;

/* compiled from: CommentsPresenter.kt */
public final class Ma {
    private final C3508cda a;
    private final C3508cda b;

    public Ma(C3508cda cda, C3508cda cda2) {
        C7471uYa.b(cda, "commentUrn");
        C7471uYa.b(cda2, "trackUrn");
        this.a = cda;
        this.b = cda2;
    }

    public final C3508cda a() {
        return this.a;
    }

    public final C3508cda b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Ma) {
                Ma ma = (Ma) obj;
                if (C7471uYa.a((Object) this.a, (Object) ma.a)) {
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
        C3508cda cda2 = this.b;
        if (cda2 != null) {
            i = cda2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeleteCommentParams(commentUrn=");
        sb.append(this.a);
        sb.append(", trackUrn=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
