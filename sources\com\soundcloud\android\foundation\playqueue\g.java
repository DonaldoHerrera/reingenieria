package com.soundcloud.android.foundation.playqueue;

/* compiled from: AutoValue_PlayableWithReposter */
final class g extends u {
    private final C3508cda a;
    private final C4928GKa<C3508cda> b;

    g(C3508cda cda, C4928GKa<C3508cda> gKa) {
        if (cda != null) {
            this.a = cda;
            if (gKa != null) {
                this.b = gKa;
                return;
            }
            throw new NullPointerException("Null reposterUrn");
        }
        throw new NullPointerException("Null urn");
    }

    public C4928GKa<C3508cda> a() {
        return this.b;
    }

    public C3508cda b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (!this.a.equals(uVar.b()) || !this.b.equals(uVar.a())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayableWithReposter{urn=");
        sb.append(this.a);
        sb.append(", reposterUrn=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
