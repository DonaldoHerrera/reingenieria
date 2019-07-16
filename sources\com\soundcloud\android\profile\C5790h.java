package com.soundcloud.android.profile;

/* renamed from: com.soundcloud.android.profile.h reason: case insensitive filesystem */
/* compiled from: AutoValue_ApiPostSource */
final class C5790h extends C5780f {
    private final C4928GKa<C1995DP> a;
    private final C4928GKa<C2015EP> b;
    private final C4928GKa<C3338wP> c;
    private final C4928GKa<C3358xP> d;

    C5790h(C4928GKa<C1995DP> gKa, C4928GKa<C2015EP> gKa2, C4928GKa<C3338wP> gKa3, C4928GKa<C3358xP> gKa4) {
        if (gKa != null) {
            this.a = gKa;
            if (gKa2 != null) {
                this.b = gKa2;
                if (gKa3 != null) {
                    this.c = gKa3;
                    if (gKa4 != null) {
                        this.d = gKa4;
                        return;
                    }
                    throw new NullPointerException("Null playlistRepost");
                }
                throw new NullPointerException("Null playlistPost");
            }
            throw new NullPointerException("Null trackRepost");
        }
        throw new NullPointerException("Null trackPost");
    }

    public C4928GKa<C3338wP> b() {
        return this.c;
    }

    public C4928GKa<C3358xP> c() {
        return this.d;
    }

    public C4928GKa<C1995DP> d() {
        return this.a;
    }

    public C4928GKa<C2015EP> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5780f)) {
            return false;
        }
        C5780f fVar = (C5780f) obj;
        if (!this.a.equals(fVar.d()) || !this.b.equals(fVar.e()) || !this.c.equals(fVar.b()) || !this.d.equals(fVar.c())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiPostSource{trackPost=");
        sb.append(this.a);
        sb.append(", trackRepost=");
        sb.append(this.b);
        sb.append(", playlistPost=");
        sb.append(this.c);
        sb.append(", playlistRepost=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
