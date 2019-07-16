package com.soundcloud.android.discovery.systemplaylist;

import java.util.Date;
import java.util.List;

/* renamed from: com.soundcloud.android.discovery.systemplaylist.h reason: case insensitive filesystem */
/* compiled from: AutoValue_SystemPlaylist */
final class C3517h extends C3520k {
    private final C3508cda a;
    private final C4928GKa<C3508cda> b;
    private final C4928GKa<String> c;
    private final C4928GKa<String> d;
    private final C4928GKa<String> e;
    private final List<C3509cea> f;
    private final C4928GKa<Date> g;
    private final C4928GKa<String> h;

    C3517h(C3508cda cda, C4928GKa<C3508cda> gKa, C4928GKa<String> gKa2, C4928GKa<String> gKa3, C4928GKa<String> gKa4, List<C3509cea> list, C4928GKa<Date> gKa5, C4928GKa<String> gKa6) {
        if (cda != null) {
            this.a = cda;
            if (gKa != null) {
                this.b = gKa;
                if (gKa2 != null) {
                    this.c = gKa2;
                    if (gKa3 != null) {
                        this.d = gKa3;
                        if (gKa4 != null) {
                            this.e = gKa4;
                            if (list != null) {
                                this.f = list;
                                if (gKa5 != null) {
                                    this.g = gKa5;
                                    if (gKa6 != null) {
                                        this.h = gKa6;
                                        return;
                                    }
                                    throw new NullPointerException("Null trackingFeatureName");
                                }
                                throw new NullPointerException("Null lastUpdated");
                            }
                            throw new NullPointerException("Null tracks");
                        }
                        throw new NullPointerException("Null artworkUrlTemplate");
                    }
                    throw new NullPointerException("Null description");
                }
                throw new NullPointerException("Null title");
            }
            throw new NullPointerException("Null queryUrn");
        }
        throw new NullPointerException("Null urn");
    }

    public C4928GKa<String> a() {
        return this.e;
    }

    public C4928GKa<String> b() {
        return this.d;
    }

    public C4928GKa<Date> d() {
        return this.g;
    }

    public C4928GKa<C3508cda> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3520k)) {
            return false;
        }
        C3520k kVar = (C3520k) obj;
        if (!this.a.equals(kVar.i()) || !this.b.equals(kVar.e()) || !this.c.equals(kVar.f()) || !this.d.equals(kVar.b()) || !this.e.equals(kVar.a()) || !this.f.equals(kVar.h()) || !this.g.equals(kVar.d()) || !this.h.equals(kVar.g())) {
            z = false;
        }
        return z;
    }

    public C4928GKa<String> f() {
        return this.c;
    }

    public C4928GKa<String> g() {
        return this.h;
    }

    public List<C3509cea> h() {
        return this.f;
    }

    public int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public C3508cda i() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SystemPlaylist{urn=");
        sb.append(this.a);
        sb.append(", queryUrn=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", artworkUrlTemplate=");
        sb.append(this.e);
        sb.append(", tracks=");
        sb.append(this.f);
        sb.append(", lastUpdated=");
        sb.append(this.g);
        sb.append(", trackingFeatureName=");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }
}
