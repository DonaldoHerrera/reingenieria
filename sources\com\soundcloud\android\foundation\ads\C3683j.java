package com.soundcloud.android.foundation.ads;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.soundcloud.android.foundation.ads.j reason: case insensitive filesystem */
/* compiled from: ApiAdTracking.kt */
public final class C3683j {
    private final List<Y> a;
    private final List<Y> b;
    private final List<Y> c;
    private final List<Y> d;
    private final List<Y> e;
    private final List<Y> f;
    private final List<Y> g;
    private final List<Y> h;
    private final List<Y> i;
    private final List<Y> j;
    private final List<Y> k;
    private final List<Y> l;
    private final List<Y> m;
    private final List<Y> n;

    @JsonCreator
    public C3683j() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    @JsonCreator
    public C3683j(@JsonProperty("click_urls") List<Y> list, @JsonProperty("impression_urls") List<Y> list2, @JsonProperty("skip_urls") List<Y> list3, @JsonProperty("start_urls") List<Y> list4, @JsonProperty("first_quartile_urls") List<Y> list5, @JsonProperty("second_quartile_urls") List<Y> list6, @JsonProperty("third_quartile_urls") List<Y> list7, @JsonProperty("finish_urls") List<Y> list8, @JsonProperty("pause_urls") List<Y> list9, @JsonProperty("resume_urls") List<Y> list10, @JsonProperty("mute") List<Y> list11, @JsonProperty("unmute") List<Y> list12, @JsonProperty("fullscreen_urls") List<Y> list13, @JsonProperty("exit_fullscreen_urls") List<Y> list14) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        this.f = list6;
        this.g = list7;
        this.h = list8;
        this.i = list9;
        this.j = list10;
        this.k = list11;
        this.l = list12;
        this.m = list13;
        this.n = list14;
    }

    @JsonProperty("click_urls")
    public final List<Y> a() {
        return this.a;
    }

    @JsonProperty("exit_fullscreen_urls")
    public final List<Y> b() {
        return this.n;
    }

    @JsonProperty("finish_urls")
    public final List<Y> c() {
        return this.h;
    }

    @JsonProperty("first_quartile_urls")
    public final List<Y> d() {
        return this.e;
    }

    @JsonProperty("fullscreen_urls")
    public final List<Y> e() {
        return this.m;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.n, (java.lang.Object) r3.n) != false) goto L_0x0097;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3683j) {
                C3683j jVar = (C3683j) obj;
                if (C7471uYa.a((Object) this.a, (Object) jVar.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) jVar.b)) {
                        if (C7471uYa.a((Object) this.c, (Object) jVar.c)) {
                            if (C7471uYa.a((Object) this.d, (Object) jVar.d)) {
                                if (C7471uYa.a((Object) this.e, (Object) jVar.e)) {
                                    if (C7471uYa.a((Object) this.f, (Object) jVar.f)) {
                                        if (C7471uYa.a((Object) this.g, (Object) jVar.g)) {
                                            if (C7471uYa.a((Object) this.h, (Object) jVar.h)) {
                                                if (C7471uYa.a((Object) this.i, (Object) jVar.i)) {
                                                    if (C7471uYa.a((Object) this.j, (Object) jVar.j)) {
                                                        if (C7471uYa.a((Object) this.k, (Object) jVar.k)) {
                                                            if (C7471uYa.a((Object) this.l, (Object) jVar.l)) {
                                                                if (C7471uYa.a((Object) this.m, (Object) jVar.m)) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
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

    @JsonProperty("impression_urls")
    public final List<Y> f() {
        return this.b;
    }

    @JsonProperty("mute")
    public final List<Y> g() {
        return this.k;
    }

    @JsonProperty("pause_urls")
    public final List<Y> h() {
        return this.i;
    }

    public int hashCode() {
        List<Y> list = this.a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Y> list2 = this.b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<Y> list3 = this.c;
        int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<Y> list4 = this.d;
        int hashCode4 = (hashCode3 + (list4 != null ? list4.hashCode() : 0)) * 31;
        List<Y> list5 = this.e;
        int hashCode5 = (hashCode4 + (list5 != null ? list5.hashCode() : 0)) * 31;
        List<Y> list6 = this.f;
        int hashCode6 = (hashCode5 + (list6 != null ? list6.hashCode() : 0)) * 31;
        List<Y> list7 = this.g;
        int hashCode7 = (hashCode6 + (list7 != null ? list7.hashCode() : 0)) * 31;
        List<Y> list8 = this.h;
        int hashCode8 = (hashCode7 + (list8 != null ? list8.hashCode() : 0)) * 31;
        List<Y> list9 = this.i;
        int hashCode9 = (hashCode8 + (list9 != null ? list9.hashCode() : 0)) * 31;
        List<Y> list10 = this.j;
        int hashCode10 = (hashCode9 + (list10 != null ? list10.hashCode() : 0)) * 31;
        List<Y> list11 = this.k;
        int hashCode11 = (hashCode10 + (list11 != null ? list11.hashCode() : 0)) * 31;
        List<Y> list12 = this.l;
        int hashCode12 = (hashCode11 + (list12 != null ? list12.hashCode() : 0)) * 31;
        List<Y> list13 = this.m;
        int hashCode13 = (hashCode12 + (list13 != null ? list13.hashCode() : 0)) * 31;
        List<Y> list14 = this.n;
        if (list14 != null) {
            i2 = list14.hashCode();
        }
        return hashCode13 + i2;
    }

    @JsonProperty("resume_urls")
    public final List<Y> i() {
        return this.j;
    }

    @JsonProperty("second_quartile_urls")
    public final List<Y> j() {
        return this.f;
    }

    @JsonProperty("skip_urls")
    public final List<Y> k() {
        return this.c;
    }

    @JsonProperty("start_urls")
    public final List<Y> l() {
        return this.d;
    }

    @JsonProperty("third_quartile_urls")
    public final List<Y> m() {
        return this.g;
    }

    @JsonProperty("unmute")
    public final List<Y> n() {
        return this.l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiAdTracking(clickUrls=");
        sb.append(this.a);
        sb.append(", impressionUrls=");
        sb.append(this.b);
        sb.append(", skipUrls=");
        sb.append(this.c);
        sb.append(", startUrls=");
        sb.append(this.d);
        sb.append(", firstQuartileUrls=");
        sb.append(this.e);
        sb.append(", secondQuartileUrls=");
        sb.append(this.f);
        sb.append(", thirdQuartileUrls=");
        sb.append(this.g);
        sb.append(", finishUrls=");
        sb.append(this.h);
        sb.append(", pauseUrls=");
        sb.append(this.i);
        sb.append(", resumeUrls=");
        sb.append(this.j);
        sb.append(", muteUrls=");
        sb.append(this.k);
        sb.append(", unmuteUrls=");
        sb.append(this.l);
        sb.append(", fullScreenUrls=");
        sb.append(this.m);
        sb.append(", exitFullScreenUrls=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }

    @JsonCreator
    public /* synthetic */ C3683j(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, int i2, C7264rYa rya) {
        int i3 = i2;
        List a2 = (i3 & 1) != 0 ? C6918mWa.a() : list;
        this(a2, (i3 & 2) != 0 ? C6918mWa.a() : list2, (i3 & 4) != 0 ? C6918mWa.a() : list3, (i3 & 8) != 0 ? C6918mWa.a() : list4, (i3 & 16) != 0 ? C6918mWa.a() : list5, (i3 & 32) != 0 ? C6918mWa.a() : list6, (i3 & 64) != 0 ? C6918mWa.a() : list7, (i3 & 128) != 0 ? C6918mWa.a() : list8, (i3 & 256) != 0 ? C6918mWa.a() : list9, (i3 & 512) != 0 ? C6918mWa.a() : list10, (i3 & 1024) != 0 ? C6918mWa.a() : list11, (i3 & 2048) != 0 ? C6918mWa.a() : list12, (i3 & 4096) != 0 ? C6918mWa.a() : list13, (i3 & 8192) != 0 ? C6918mWa.a() : list14);
    }
}
