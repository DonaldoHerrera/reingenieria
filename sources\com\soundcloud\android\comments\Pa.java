package com.soundcloud.android.comments;

/* compiled from: CommentsPresenter.kt */
public final class Pa {
    private final String a;
    private final long b;
    private final boolean c;
    private final C3508cda d;
    private final String e;

    public Pa(String str, long j, boolean z, C3508cda cda, String str2) {
        C7471uYa.b(str, "commentText");
        C7471uYa.b(cda, "trackUrn");
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = cda;
        this.e = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.e;
    }

    public final long c() {
        return this.b;
    }

    public final C3508cda d() {
        return this.d;
    }

    public final boolean e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Pa) {
                Pa pa = (Pa) obj;
                if (C7471uYa.a((Object) this.a, (Object) pa.a)) {
                    if (this.b == pa.b) {
                        if (!(this.c == pa.c) || !C7471uYa.a((Object) this.d, (Object) pa.d) || !C7471uYa.a((Object) this.e, (Object) pa.e)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.b;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        C3508cda cda = this.d;
        int hashCode2 = (i3 + (cda != null ? cda.hashCode() : 0)) * 31;
        String str2 = this.e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NewCommentParams(commentText=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", isReply=");
        sb.append(this.c);
        sb.append(", trackUrn=");
        sb.append(this.d);
        sb.append(", secretToken=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
