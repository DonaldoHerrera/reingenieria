package com.soundcloud.android.collections.data;

/* compiled from: UpdateLikeParams.kt */
public final class ga {
    private final C3508cda a;
    private final boolean b;

    public ga(C3508cda cda, boolean z) {
        C7471uYa.b(cda, "targetUrn");
        this.a = cda;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public final C3508cda b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ga) {
                ga gaVar = (ga) obj;
                if (C7471uYa.a((Object) this.a, (Object) gaVar.a)) {
                    if (this.b == gaVar.b) {
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
        sb.append("UpdateLikeParams(targetUrn=");
        sb.append(this.a);
        sb.append(", addLike=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
