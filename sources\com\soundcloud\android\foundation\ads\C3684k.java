package com.soundcloud.android.foundation.ads;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.soundcloud.android.foundation.ads.C3691s.b;
import com.soundcloud.android.foundation.ads.C3693u.a;

/* renamed from: com.soundcloud.android.foundation.ads.k reason: case insensitive filesystem */
/* compiled from: ApiAdWrapper.kt */
public final class C3684k {
    private final a a;
    private final aa.a b;
    private final P.a c;
    private final C3692t.a d;
    private final ea.a e;
    private final X.a f;
    private final C3691s.a g;
    private final b h;

    @JsonCreator
    public C3684k() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @JsonCreator
    public C3684k(@JsonProperty("audio_ad") a aVar, @JsonProperty("video") aa.a aVar2, @JsonProperty("interstitial") P.a aVar3, @JsonProperty("app_install") C3692t.a aVar4, @JsonProperty("display") ea.a aVar5, @JsonProperty("sponsored_session") X.a aVar6, @JsonProperty("error_audio_ad") C3691s.a aVar7, @JsonProperty("error_video_ad") b bVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.g = aVar7;
        this.h = bVar;
    }

    public final C3692t.a a() {
        return this.d;
    }

    public final a b() {
        return this.a;
    }

    public final C3691s.a c() {
        return this.g;
    }

    public final b d() {
        return this.h;
    }

    public final P.a e() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.h, (java.lang.Object) r3.h) != false) goto L_0x005b;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3684k) {
                C3684k kVar = (C3684k) obj;
                if (C7471uYa.a((Object) this.a, (Object) kVar.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) kVar.b)) {
                        if (C7471uYa.a((Object) this.c, (Object) kVar.c)) {
                            if (C7471uYa.a((Object) this.d, (Object) kVar.d)) {
                                if (C7471uYa.a((Object) this.e, (Object) kVar.e)) {
                                    if (C7471uYa.a((Object) this.f, (Object) kVar.f)) {
                                        if (C7471uYa.a((Object) this.g, (Object) kVar.g)) {
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

    public final X.a f() {
        return this.f;
    }

    public final aa.a g() {
        return this.b;
    }

    public final ea.a h() {
        return this.e;
    }

    public int hashCode() {
        a aVar = this.a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        aa.a aVar2 = this.b;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        P.a aVar3 = this.c;
        int hashCode3 = (hashCode2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        C3692t.a aVar4 = this.d;
        int hashCode4 = (hashCode3 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        ea.a aVar5 = this.e;
        int hashCode5 = (hashCode4 + (aVar5 != null ? aVar5.hashCode() : 0)) * 31;
        X.a aVar6 = this.f;
        int hashCode6 = (hashCode5 + (aVar6 != null ? aVar6.hashCode() : 0)) * 31;
        C3691s.a aVar7 = this.g;
        int hashCode7 = (hashCode6 + (aVar7 != null ? aVar7.hashCode() : 0)) * 31;
        b bVar = this.h;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiAdWrapper(audioAd=");
        sb.append(this.a);
        sb.append(", videoAd=");
        sb.append(this.b);
        sb.append(", interstitial=");
        sb.append(this.c);
        sb.append(", appInstall=");
        sb.append(this.d);
        sb.append(", visualPrestitial=");
        sb.append(this.e);
        sb.append(", sponsoredSession=");
        sb.append(this.f);
        sb.append(", errorAudioAd=");
        sb.append(this.g);
        sb.append(", errorVideoAd=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    @JsonCreator
    public /* synthetic */ C3684k(a aVar, aa.a aVar2, P.a aVar3, C3692t.a aVar4, ea.a aVar5, X.a aVar6, C3691s.a aVar7, b bVar, int i, C7264rYa rya) {
        int i2 = i;
        b bVar2 = null;
        a aVar8 = (i2 & 1) != 0 ? null : aVar;
        aa.a aVar9 = (i2 & 2) != 0 ? null : aVar2;
        P.a aVar10 = (i2 & 4) != 0 ? null : aVar3;
        C3692t.a aVar11 = (i2 & 8) != 0 ? null : aVar4;
        ea.a aVar12 = (i2 & 16) != 0 ? null : aVar5;
        X.a aVar13 = (i2 & 32) != 0 ? null : aVar6;
        C3691s.a aVar14 = (i2 & 64) != 0 ? null : aVar7;
        if ((i2 & 128) == 0) {
            bVar2 = bVar;
        }
        this(aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, bVar2);
    }
}
