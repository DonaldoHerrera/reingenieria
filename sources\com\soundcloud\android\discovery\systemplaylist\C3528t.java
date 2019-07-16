package com.soundcloud.android.discovery.systemplaylist;

import java.util.Date;

/* renamed from: com.soundcloud.android.discovery.systemplaylist.t reason: case insensitive filesystem */
/* compiled from: SystemPlaylistItem.kt */
public final class C3528t extends C3532x {
    private final C3508cda d;
    private final C3508cda e;
    private final String f;
    private final String g;
    private final String h;
    private final Vca i;
    private final int j;
    private final long k;
    private final Date l;
    private final boolean m;

    public C3528t(C3508cda cda, C3508cda cda2, String str, String str2, String str3, Vca vca, int i2, long j2, Date date, boolean z) {
        C7471uYa.b(cda, "systemPlaylistUrn");
        super(cda, cda2, str, null);
        this.d = cda;
        this.e = cda2;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = vca;
        this.j = i2;
        this.k = j2;
        this.l = date;
        this.m = z;
    }

    public C3508cda a() {
        return this.e;
    }

    public C3508cda b() {
        return this.d;
    }

    public String c() {
        return this.f;
    }

    public final String d() {
        return this.h;
    }

    public final Vca e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3528t) {
                C3528t tVar = (C3528t) obj;
                if (C7471uYa.a((Object) b(), (Object) tVar.b()) && C7471uYa.a((Object) a(), (Object) tVar.a()) && C7471uYa.a((Object) c(), (Object) tVar.c()) && C7471uYa.a((Object) this.g, (Object) tVar.g) && C7471uYa.a((Object) this.h, (Object) tVar.h) && C7471uYa.a((Object) this.i, (Object) tVar.i)) {
                    if (this.j == tVar.j) {
                        if ((this.k == tVar.k) && C7471uYa.a((Object) this.l, (Object) tVar.l)) {
                            if (this.m == tVar.m) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long f() {
        return this.k;
    }

    public final boolean g() {
        return this.m;
    }

    public final String h() {
        return this.g;
    }

    public int hashCode() {
        C3508cda b = b();
        int i2 = 0;
        int hashCode = (b != null ? b.hashCode() : 0) * 31;
        C3508cda a = a();
        int hashCode2 = (hashCode + (a != null ? a.hashCode() : 0)) * 31;
        String c = c();
        int hashCode3 = (hashCode2 + (c != null ? c.hashCode() : 0)) * 31;
        String str = this.g;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.h;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Vca vca = this.i;
        int hashCode6 = (((hashCode5 + (vca != null ? vca.hashCode() : 0)) * 31) + this.j) * 31;
        long j2 = this.k;
        int i3 = (hashCode6 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Date date = this.l;
        if (date != null) {
            i2 = date.hashCode();
        }
        int i4 = (i3 + i2) * 31;
        boolean z = this.m;
        if (z) {
            z = true;
        }
        return i4 + (z ? 1 : 0);
    }

    public final int i() {
        return this.j;
    }

    public final Date j() {
        return this.l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SystemPlaylistHeaderItem(systemPlaylistUrn=");
        sb.append(b());
        sb.append(", queryUrn=");
        sb.append(a());
        sb.append(", trackingFeatureName=");
        sb.append(c());
        sb.append(", title=");
        sb.append(this.g);
        sb.append(", description=");
        sb.append(this.h);
        sb.append(", imageResource=");
        sb.append(this.i);
        sb.append(", tracksSize=");
        sb.append(this.j);
        sb.append(", playlistDuration=");
        sb.append(this.k);
        sb.append(", updatedAt=");
        sb.append(this.l);
        sb.append(", shouldShowPlayButton=");
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }
}
