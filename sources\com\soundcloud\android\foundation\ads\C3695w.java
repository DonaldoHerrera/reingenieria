package com.soundcloud.android.foundation.ads;

import com.soundcloud.android.foundation.ads.C3676c.a;
import java.util.List;

/* renamed from: com.soundcloud.android.foundation.ads.w reason: case insensitive filesystem */
/* compiled from: AutoValue_AppInstallAd */
final class C3695w extends C3692t {
    private final long e;
    private final int f;
    private final C3508cda g;
    private final a h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final float m;
    private final int n;
    private final List<Y> o;
    private final List<Y> p;

    C3695w(long j2, int i2, C3508cda cda, a aVar, String str, String str2, String str3, String str4, float f2, int i3, List<Y> list, List<Y> list2) {
        this.e = j2;
        this.f = i2;
        if (cda != null) {
            this.g = cda;
            if (aVar != null) {
                this.h = aVar;
                if (str != null) {
                    this.i = str;
                    if (str2 != null) {
                        this.j = str2;
                        if (str3 != null) {
                            this.k = str3;
                            if (str4 != null) {
                                this.l = str4;
                                this.m = f2;
                                this.n = i3;
                                if (list != null) {
                                    this.o = list;
                                    if (list2 != null) {
                                        this.p = list2;
                                        return;
                                    }
                                    throw new NullPointerException("Null clickUrls");
                                }
                                throw new NullPointerException("Null impressionUrls");
                            }
                            throw new NullPointerException("Null imageUrl");
                        }
                        throw new NullPointerException("Null clickThroughUrl");
                    }
                    throw new NullPointerException("Null ctaButtonText");
                }
                throw new NullPointerException("Null name");
            }
            throw new NullPointerException("Null getMonetizationType");
        }
        throw new NullPointerException("Null getAdUrn");
    }

    public long b() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3692t)) {
            return false;
        }
        C3692t tVar = (C3692t) obj;
        if (this.e != tVar.b() || this.f != tVar.e() || !this.g.equals(tVar.f()) || !this.h.equals(tVar.k()) || !this.i.equals(tVar.t()) || !this.j.equals(tVar.o()) || !this.k.equals(tVar.m()) || !this.l.equals(tVar.r()) || Float.floatToIntBits(this.m) != Float.floatToIntBits(tVar.v()) || this.n != tVar.u() || !this.o.equals(tVar.s()) || !this.p.equals(tVar.n())) {
            z = false;
        }
        return z;
    }

    public C3508cda f() {
        return this.g;
    }

    public int hashCode() {
        long j2 = this.e;
        return this.p.hashCode() ^ ((((((((((((((((((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ Float.floatToIntBits(this.m)) * 1000003) ^ this.n) * 1000003) ^ this.o.hashCode()) * 1000003);
    }

    public a k() {
        return this.h;
    }

    public String m() {
        return this.k;
    }

    public List<Y> n() {
        return this.p;
    }

    public String o() {
        return this.j;
    }

    public String r() {
        return this.l;
    }

    public List<Y> s() {
        return this.o;
    }

    public String t() {
        return this.i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppInstallAd{getCreatedAt=");
        sb.append(this.e);
        sb.append(", getExpiryInMins=");
        sb.append(this.f);
        sb.append(", getAdUrn=");
        sb.append(this.g);
        sb.append(", getMonetizationType=");
        sb.append(this.h);
        sb.append(", name=");
        sb.append(this.i);
        sb.append(", ctaButtonText=");
        sb.append(this.j);
        sb.append(", clickThroughUrl=");
        sb.append(this.k);
        sb.append(", imageUrl=");
        sb.append(this.l);
        sb.append(", rating=");
        sb.append(this.m);
        sb.append(", ratersCount=");
        sb.append(this.n);
        sb.append(", impressionUrls=");
        sb.append(this.o);
        sb.append(", clickUrls=");
        sb.append(this.p);
        sb.append("}");
        return sb.toString();
    }

    public int u() {
        return this.n;
    }

    public float v() {
        return this.m;
    }
}
