package com.soundcloud.android.deeplinks;

/* compiled from: AutoValue_ChartDetails */
final class a extends b {
    private final C2151LP a;
    private final C3508cda b;

    a(C2151LP lp, C3508cda cda) {
        if (lp != null) {
            this.a = lp;
            if (cda != null) {
                this.b = cda;
                return;
            }
            throw new NullPointerException("Null genre");
        }
        throw new NullPointerException("Null type");
    }

    public C3508cda a() {
        return this.b;
    }

    public C2151LP b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.a.equals(bVar.b()) || !this.b.equals(bVar.a())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChartDetails{type=");
        sb.append(this.a);
        sb.append(", genre=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
