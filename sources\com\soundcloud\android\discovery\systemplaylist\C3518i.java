package com.soundcloud.android.discovery.systemplaylist;

import java.util.Date;
import java.util.List;

/* renamed from: com.soundcloud.android.discovery.systemplaylist.i reason: case insensitive filesystem */
/* compiled from: AutoValue_SystemPlaylistEntity */
final class C3518i extends C3524o {
    private final C3508cda a;
    private final C4928GKa<C3508cda> b;
    private final C4928GKa<String> c;
    private final C4928GKa<String> d;
    private final C4928GKa<String> e;
    private final C4928GKa<String> f;
    private final List<C3508cda> g;
    private final C4928GKa<Date> h;

    C3518i(C3508cda cda, C4928GKa<C3508cda> gKa, C4928GKa<String> gKa2, C4928GKa<String> gKa3, C4928GKa<String> gKa4, C4928GKa<String> gKa5, List<C3508cda> list, C4928GKa<Date> gKa6) {
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
                            if (gKa5 != null) {
                                this.f = gKa5;
                                if (list != null) {
                                    this.g = list;
                                    if (gKa6 != null) {
                                        this.h = gKa6;
                                        return;
                                    }
                                    throw new NullPointerException("Null lastUpdated");
                                }
                                throw new NullPointerException("Null trackUrns");
                            }
                            throw new NullPointerException("Null trackingFeatureName");
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

    public C4928GKa<Date> c() {
        return this.h;
    }

    public C4928GKa<C3508cda> d() {
        return this.b;
    }

    public C4928GKa<String> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3524o)) {
            return false;
        }
        C3524o oVar = (C3524o) obj;
        if (!this.a.equals(oVar.h()) || !this.b.equals(oVar.d()) || !this.c.equals(oVar.e()) || !this.d.equals(oVar.b()) || !this.e.equals(oVar.a()) || !this.f.equals(oVar.g()) || !this.g.equals(oVar.f()) || !this.h.equals(oVar.c())) {
            z = false;
        }
        return z;
    }

    public List<C3508cda> f() {
        return this.g;
    }

    public C4928GKa<String> g() {
        return this.f;
    }

    public C3508cda h() {
        return this.a;
    }

    public int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SystemPlaylistEntity{urn=");
        sb.append(this.a);
        sb.append(", queryUrn=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", artworkUrlTemplate=");
        sb.append(this.e);
        sb.append(", trackingFeatureName=");
        sb.append(this.f);
        sb.append(", trackUrns=");
        sb.append(this.g);
        sb.append(", lastUpdated=");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }
}
