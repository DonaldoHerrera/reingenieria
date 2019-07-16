package com.soundcloud.android.trackinfo;

/* compiled from: NewTrackInfoPresenter.kt */
public final class B {
    private final int a;
    private final C3493aea b;
    private final C c;
    private final C d;
    private final C e;
    private final C f;

    public B(int i, C3493aea aea, C c2, C c3, C c4, C c5) {
        C7471uYa.b(aea, "fullTrack");
        C7471uYa.b(c2, "trackPlaysStats");
        C7471uYa.b(c3, "trackLikesStats");
        C7471uYa.b(c4, "trackCommentsStats");
        C7471uYa.b(c5, "trackRepostsStats");
        this.a = i;
        this.b = aea;
        this.c = c2;
        this.d = c3;
        this.e = c4;
        this.f = c5;
    }

    public final C3493aea a() {
        return this.b;
    }

    public final C b() {
        return this.e;
    }

    public final int c() {
        return this.a;
    }

    public final C d() {
        return this.d;
    }

    public final C e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof B) {
                B b2 = (B) obj;
                if (!(this.a == b2.a) || !C7471uYa.a((Object) this.b, (Object) b2.b) || !C7471uYa.a((Object) this.c, (Object) b2.c) || !C7471uYa.a((Object) this.d, (Object) b2.d) || !C7471uYa.a((Object) this.e, (Object) b2.e) || !C7471uYa.a((Object) this.f, (Object) b2.f)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C f() {
        return this.f;
    }

    public int hashCode() {
        int i = this.a * 31;
        C3493aea aea = this.b;
        int i2 = 0;
        int hashCode = (i + (aea != null ? aea.hashCode() : 0)) * 31;
        C c2 = this.c;
        int hashCode2 = (hashCode + (c2 != null ? c2.hashCode() : 0)) * 31;
        C c3 = this.d;
        int hashCode3 = (hashCode2 + (c3 != null ? c3.hashCode() : 0)) * 31;
        C c4 = this.e;
        int hashCode4 = (hashCode3 + (c4 != null ? c4.hashCode() : 0)) * 31;
        C c5 = this.f;
        if (c5 != null) {
            i2 = c5.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackInfoViewModel(trackInfoId=");
        sb.append(this.a);
        sb.append(", fullTrack=");
        sb.append(this.b);
        sb.append(", trackPlaysStats=");
        sb.append(this.c);
        sb.append(", trackLikesStats=");
        sb.append(this.d);
        sb.append(", trackCommentsStats=");
        sb.append(this.e);
        sb.append(", trackRepostsStats=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ B(int i, C3493aea aea, C c2, C c3, C c4, C c5, int i2, C7264rYa rya) {
        this((i2 & 1) != 0 ? 17 : i, aea, c2, c3, c4, c5);
    }
}
