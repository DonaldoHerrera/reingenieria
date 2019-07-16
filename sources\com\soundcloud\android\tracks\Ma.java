package com.soundcloud.android.tracks;

import com.soundcloud.android.tracks.C6155ca.b;
import com.soundcloud.android.tracks.C6155ca.c;
import com.soundcloud.android.tracks.C6155ca.d;

@EVa(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\u0006\u0010\f\u001a\u00020\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÂ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003JE\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0006\u0010\u0018\u001a\u00020\u0003J\u0006\u0010\u0019\u001a\u00020\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/soundcloud/android/tracks/TrackOverflowMenuActions;", "", "isAddableToAPlaylist", "", "repostability", "Lcom/soundcloud/android/tracks/Repostability;", "isShareable", "isStationable", "isCommentable", "isPlayableNext", "(ZLcom/soundcloud/android/tracks/Repostability;ZZZZ)V", "()Z", "canToggleRepost", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "isRepostable", "isUnrepostable", "toString", "", "updateRepostability", "isAlreadyReposted", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: TrackOverflowMenuActionsFactory.kt */
public final class Ma {
    public static final Ma a;
    public static final a b = new a(null);
    private final boolean c;
    private final C6155ca d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;

    /* compiled from: TrackOverflowMenuActionsFactory.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    static {
        Ma ma = new Ma(false, b.b, false, false, false, false);
        a = ma;
    }

    public Ma(boolean z, C6155ca caVar, boolean z2, boolean z3, boolean z4, boolean z5) {
        C7471uYa.b(caVar, "repostability");
        this.c = z;
        this.d = caVar;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }

    public static /* synthetic */ Ma a(Ma ma, boolean z, C6155ca caVar, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ma.c;
        }
        if ((i & 2) != 0) {
            caVar = ma.d;
        }
        C6155ca caVar2 = caVar;
        if ((i & 4) != 0) {
            z2 = ma.e;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            z3 = ma.f;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            z4 = ma.g;
        }
        boolean z8 = z4;
        if ((i & 32) != 0) {
            z5 = ma.h;
        }
        return ma.a(z, caVar2, z6, z7, z8, z5);
    }

    public final Ma a(boolean z) {
        return a(this, false, C6155ca.a.a(!C7471uYa.a((Object) this.d, (Object) b.b), z), false, false, false, false, 61, null);
    }

    public final Ma a(boolean z, C6155ca caVar, boolean z2, boolean z3, boolean z4, boolean z5) {
        C7471uYa.b(caVar, "repostability");
        Ma ma = new Ma(z, caVar, z2, z3, z4, z5);
        return ma;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.g;
    }

    public final boolean d() {
        return this.h;
    }

    public final boolean e() {
        return C7471uYa.a((Object) this.d, (Object) c.b);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Ma) {
                Ma ma = (Ma) obj;
                if ((this.c == ma.c) && C7471uYa.a((Object) this.d, (Object) ma.d)) {
                    if (this.e == ma.e) {
                        if (this.f == ma.f) {
                            if (this.g == ma.g) {
                                if (this.h == ma.h) {
                                    return true;
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
        return this.e;
    }

    public final boolean g() {
        return this.f;
    }

    public final boolean h() {
        return C7471uYa.a((Object) this.d, (Object) d.b);
    }

    public int hashCode() {
        boolean z = this.c;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        C6155ca caVar = this.d;
        int hashCode = (i2 + (caVar != null ? caVar.hashCode() : 0)) * 31;
        boolean z2 = this.e;
        if (z2) {
            z2 = true;
        }
        int i3 = (hashCode + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.f;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.g;
        if (z4) {
            z4 = true;
        }
        int i5 = (i4 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.h;
        if (!z5) {
            i = z5;
        }
        return i5 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackOverflowMenuActions(isAddableToAPlaylist=");
        sb.append(this.c);
        sb.append(", repostability=");
        sb.append(this.d);
        sb.append(", isShareable=");
        sb.append(this.e);
        sb.append(", isStationable=");
        sb.append(this.f);
        sb.append(", isCommentable=");
        sb.append(this.g);
        sb.append(", isPlayableNext=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public final boolean a() {
        return !C7471uYa.a((Object) this.d, (Object) b.b);
    }
}
