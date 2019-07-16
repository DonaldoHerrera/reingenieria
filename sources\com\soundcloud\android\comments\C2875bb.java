package com.soundcloud.android.comments;

/* renamed from: com.soundcloud.android.comments.bb reason: case insensitive filesystem */
/* compiled from: CommentsPresenter.kt */
public final class C2875bb {
    private final C3508cda a;
    private final boolean b;

    public C2875bb(C3508cda cda, boolean z) {
        C7471uYa.b(cda, "commentUrn");
        this.a = cda;
        this.b = z;
    }

    public final C3508cda a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2875bb) {
                C2875bb bbVar = (C2875bb) obj;
                if (C7471uYa.a((Object) this.a, (Object) bbVar.a)) {
                    if (this.b == bbVar.b) {
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
        sb.append("ReportCommentParams(commentUrn=");
        sb.append(this.a);
        sb.append(", shouldDelete=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
