package com.soundcloud.android.image;

/* renamed from: com.soundcloud.android.image.c reason: case insensitive filesystem */
/* compiled from: AutoValue_SimpleImageResource */
final class C3722c extends va {
    private final C3508cda a;
    private final C4928GKa<String> b;

    C3722c(C3508cda cda, C4928GKa<String> gKa) {
        if (cda != null) {
            this.a = cda;
            if (gKa != null) {
                this.b = gKa;
                return;
            }
            throw new NullPointerException("Null imageUrlTemplate");
        }
        throw new NullPointerException("Null urn");
    }

    public C3508cda a() {
        return this.a;
    }

    public C4928GKa<String> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof va)) {
            return false;
        }
        va vaVar = (va) obj;
        if (!this.a.equals(vaVar.a()) || !this.b.equals(vaVar.b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SimpleImageResource{urn=");
        sb.append(this.a);
        sb.append(", imageUrlTemplate=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
