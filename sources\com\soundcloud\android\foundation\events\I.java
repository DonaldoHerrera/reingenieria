package com.soundcloud.android.foundation.events;

/* compiled from: TrackSourceInfo.kt */
public final class I {
    private final String a;
    private final boolean b;
    private C3508cda c;
    private SearchQuerySourceInfo d;
    private PromotedSourceInfo e;
    private B f;
    private String g;
    private String h;
    private C3508cda i;
    private C3508cda j;
    private C3508cda k;
    private int l;
    private H m;

    public I(String str, boolean z) {
        this(str, z, null, null, null, null, null, null, null, null, null, 0, null, 8188, null);
    }

    public I(String str, boolean z, C3508cda cda, SearchQuerySourceInfo searchQuerySourceInfo, PromotedSourceInfo promotedSourceInfo, B b2, String str2, String str3, C3508cda cda2, C3508cda cda3, C3508cda cda4, int i2, H h2) {
        C7471uYa.b(str, "originScreen");
        C7471uYa.b(cda, "reposter");
        C7471uYa.b(cda2, "collectionUrn");
        C7471uYa.b(cda3, "playlistOwnerUrn");
        C7471uYa.b(cda4, "pageUrn");
        this.a = str;
        this.b = z;
        this.c = cda;
        this.d = searchQuerySourceInfo;
        this.e = promotedSourceInfo;
        this.f = b2;
        this.g = str2;
        this.h = str3;
        this.i = cda2;
        this.j = cda3;
        this.k = cda4;
        this.l = i2;
        this.m = h2;
    }

    public final void a(C3508cda cda) {
        C7471uYa.b(cda, "<set-?>");
        this.c = cda;
    }

    public final String b() {
        return this.a;
    }

    public final C3508cda c() {
        return this.k;
    }

    public final C3508cda d() {
        return this.j;
    }

    public final int e() {
        return this.l;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof I) {
                I i2 = (I) obj;
                if (C7471uYa.a((Object) this.a, (Object) i2.a)) {
                    if ((this.b == i2.b) && C7471uYa.a((Object) this.c, (Object) i2.c) && C7471uYa.a((Object) this.d, (Object) i2.d) && C7471uYa.a((Object) this.e, (Object) i2.e) && C7471uYa.a((Object) this.f, (Object) i2.f) && C7471uYa.a((Object) this.g, (Object) i2.g) && C7471uYa.a((Object) this.h, (Object) i2.h) && C7471uYa.a((Object) this.i, (Object) i2.i) && C7471uYa.a((Object) this.j, (Object) i2.j) && C7471uYa.a((Object) this.k, (Object) i2.k)) {
                        if (!(this.l == i2.l) || !C7471uYa.a((Object) this.m, (Object) i2.m)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final PromotedSourceInfo f() {
        return this.e;
    }

    public final B g() {
        return this.f;
    }

    public final C3508cda h() {
        return this.c;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i3 = (hashCode + (z ? 1 : 0)) * 31;
        C3508cda cda = this.c;
        int hashCode2 = (i3 + (cda != null ? cda.hashCode() : 0)) * 31;
        SearchQuerySourceInfo searchQuerySourceInfo = this.d;
        int hashCode3 = (hashCode2 + (searchQuerySourceInfo != null ? searchQuerySourceInfo.hashCode() : 0)) * 31;
        PromotedSourceInfo promotedSourceInfo = this.e;
        int hashCode4 = (hashCode3 + (promotedSourceInfo != null ? promotedSourceInfo.hashCode() : 0)) * 31;
        B b2 = this.f;
        int hashCode5 = (hashCode4 + (b2 != null ? b2.hashCode() : 0)) * 31;
        String str2 = this.g;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.h;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        C3508cda cda2 = this.i;
        int hashCode8 = (hashCode7 + (cda2 != null ? cda2.hashCode() : 0)) * 31;
        C3508cda cda3 = this.j;
        int hashCode9 = (hashCode8 + (cda3 != null ? cda3.hashCode() : 0)) * 31;
        C3508cda cda4 = this.k;
        int hashCode10 = (((hashCode9 + (cda4 != null ? cda4.hashCode() : 0)) * 31) + this.l) * 31;
        H h2 = this.m;
        if (h2 != null) {
            i2 = h2.hashCode();
        }
        return hashCode10 + i2;
    }

    public final SearchQuerySourceInfo i() {
        return this.d;
    }

    public final String j() {
        return this.g;
    }

    public final String k() {
        return this.h;
    }

    public final H l() {
        return this.m;
    }

    public final boolean m() {
        return this.f != null;
    }

    public final boolean n() {
        return this.c != C3508cda.a;
    }

    public final boolean o() {
        String str = this.g;
        return str != null && (Cxb.a(str) ^ true);
    }

    public final boolean p() {
        C3508cda cda = this.i;
        return cda != C3508cda.a && cda.u();
    }

    public final boolean q() {
        return this.e != null;
    }

    public final boolean r() {
        return this.d != null;
    }

    public final boolean s() {
        C3508cda cda = this.i;
        return cda != C3508cda.a && cda.v();
    }

    public final boolean t() {
        C3508cda cda = this.i;
        return cda != C3508cda.a && cda.w();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackSourceInfo(originScreen=");
        sb.append(this.a);
        sb.append(", isUserTriggered=");
        sb.append(this.b);
        sb.append(", reposter=");
        sb.append(this.c);
        sb.append(", searchQuerySourceInfo=");
        sb.append(this.d);
        sb.append(", promotedSourceInfo=");
        sb.append(this.e);
        sb.append(", querySourceInfo=");
        sb.append(this.f);
        sb.append(", source=");
        sb.append(this.g);
        sb.append(", sourceVersion=");
        sb.append(this.h);
        sb.append(", collectionUrn=");
        sb.append(this.i);
        sb.append(", playlistOwnerUrn=");
        sb.append(this.j);
        sb.append(", pageUrn=");
        sb.append(this.k);
        sb.append(", playlistPosition=");
        sb.append(this.l);
        sb.append(", stationsSourceInfo=");
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }

    public final boolean u() {
        return this.b;
    }

    public /* synthetic */ I(String str, boolean z, C3508cda cda, SearchQuerySourceInfo searchQuerySourceInfo, PromotedSourceInfo promotedSourceInfo, B b2, String str2, String str3, C3508cda cda2, C3508cda cda3, C3508cda cda4, int i2, H h2, int i3, C7264rYa rya) {
        C3508cda cda5;
        C3508cda cda6;
        C3508cda cda7;
        C3508cda cda8;
        int i4 = i3;
        String str4 = "Urn.NOT_SET";
        if ((i4 & 4) != 0) {
            C3508cda cda9 = C3508cda.a;
            C7471uYa.a((Object) cda9, str4);
            cda5 = cda9;
        } else {
            cda5 = cda;
        }
        SearchQuerySourceInfo searchQuerySourceInfo2 = (i4 & 8) != 0 ? null : searchQuerySourceInfo;
        PromotedSourceInfo promotedSourceInfo2 = (i4 & 16) != 0 ? null : promotedSourceInfo;
        B b3 = (i4 & 32) != 0 ? null : b2;
        String str5 = (i4 & 64) != 0 ? null : str2;
        String str6 = (i4 & 128) != 0 ? null : str3;
        if ((i4 & 256) != 0) {
            C3508cda cda10 = C3508cda.a;
            C7471uYa.a((Object) cda10, str4);
            cda6 = cda10;
        } else {
            cda6 = cda2;
        }
        if ((i4 & 512) != 0) {
            C3508cda cda11 = C3508cda.a;
            C7471uYa.a((Object) cda11, str4);
            cda7 = cda11;
        } else {
            cda7 = cda3;
        }
        if ((i4 & 1024) != 0) {
            C3508cda cda12 = C3508cda.a;
            C7471uYa.a((Object) cda12, str4);
            cda8 = cda12;
        } else {
            cda8 = cda4;
        }
        this(str, z, cda5, searchQuerySourceInfo2, promotedSourceInfo2, b3, str5, str6, cda6, cda7, cda8, (i4 & 2048) != 0 ? 0 : i2, (i4 & 4096) != 0 ? null : h2);
    }

    public final void a(SearchQuerySourceInfo searchQuerySourceInfo) {
        this.d = searchQuerySourceInfo;
    }

    public final void a(PromotedSourceInfo promotedSourceInfo) {
        this.e = promotedSourceInfo;
    }

    public final void a(B b2) {
        this.f = b2;
    }

    public final C3508cda a() {
        return this.i;
    }

    public final void a(String str, String str2) {
        C7471uYa.b(str, "source");
        C7471uYa.b(str2, "sourceVersion");
        this.g = str;
        this.h = str2;
    }

    public final void a(C3508cda cda, int i2, C3508cda cda2) {
        C7471uYa.b(cda, "playlistUrn");
        C7471uYa.b(cda2, "playlistOwnerUrn");
        this.i = cda;
        this.l = i2;
        this.j = cda2;
    }

    public final void a(C3508cda cda, int i2) {
        C7471uYa.b(cda, "systemPlaylistUrn");
        this.i = cda;
        this.k = cda;
        this.l = i2;
    }

    public final void a(C3508cda cda, H h2) {
        C7471uYa.b(cda, "stationUrn");
        C7471uYa.b(h2, "sourceInfo");
        this.i = cda;
        this.m = h2;
    }
}
