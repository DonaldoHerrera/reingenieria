package com.soundcloud.android.likes;

import com.soundcloud.android.likes.la.a;

/* compiled from: TrackLikesUniflowItem.kt */
public final class S extends la {
    private final int b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final C3823mda f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;

    public /* synthetic */ S(int i2, boolean z, boolean z2, boolean z3, C3823mda mda, boolean z4, boolean z5, boolean z6, boolean z7, int i3, C7264rYa rya) {
        boolean z8;
        boolean z9;
        int i4 = i2;
        boolean z10 = false;
        if ((i3 & 2) != 0) {
            z8 = i4 > 0;
        } else {
            z8 = z;
        }
        if ((i3 & 64) != 0) {
            if (i4 > 1) {
                z10 = true;
            }
            z9 = z10;
        } else {
            z9 = z5;
        }
        this(i2, z8, z2, z3, mda, z4, z9, z6, z7);
    }

    public final boolean b() {
        return this.e;
    }

    public final int c() {
        return this.b;
    }

    public final C3823mda d() {
        return this.f;
    }

    public final boolean e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S) {
                S s = (S) obj;
                if (this.b == s.b) {
                    if (this.c == s.c) {
                        if (this.d == s.d) {
                            if ((this.e == s.e) && C7471uYa.a((Object) this.f, (Object) s.f)) {
                                if (this.g == s.g) {
                                    if (this.h == s.h) {
                                        if (this.i == s.i) {
                                            if (this.j == s.j) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f() {
        return this.j;
    }

    public final boolean g() {
        return this.i;
    }

    public final boolean h() {
        return this.h;
    }

    public int hashCode() {
        int i2 = this.b * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.d;
        if (z2) {
            z2 = true;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.e;
        if (z3) {
            z3 = true;
        }
        int i5 = (i4 + (z3 ? 1 : 0)) * 31;
        C3823mda mda = this.f;
        int hashCode = (i5 + (mda != null ? mda.hashCode() : 0)) * 31;
        boolean z4 = this.g;
        if (z4) {
            z4 = true;
        }
        int i6 = (hashCode + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.h;
        if (z5) {
            z5 = true;
        }
        int i7 = (i6 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.i;
        if (z6) {
            z6 = true;
        }
        int i8 = (i7 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.j;
        if (z7) {
            z7 = true;
        }
        return i8 + (z7 ? 1 : 0);
    }

    public final boolean i() {
        return this.g;
    }

    public final boolean j() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackLikesHeaderUniflowItem(likedTracksCount=");
        sb.append(this.b);
        sb.append(", showHeader=");
        sb.append(this.c);
        sb.append(", isOfflineContentEnabled=");
        sb.append(this.d);
        sb.append(", areLikesOfflineSynced=");
        sb.append(this.e);
        sb.append(", offlineState=");
        sb.append(this.f);
        sb.append(", upsellOfflineContent=");
        sb.append(this.g);
        sb.append(", showShuffleButton=");
        sb.append(this.h);
        sb.append(", showNoWifiOfflineState=");
        sb.append(this.i);
        sb.append(", showNoConnectionOfflineState=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }

    public S(int i2, boolean z, boolean z2, boolean z3, C3823mda mda, boolean z4, boolean z5, boolean z6, boolean z7) {
        C7471uYa.b(mda, "offlineState");
        super(a.HEADER, null);
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = mda;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
    }
}
