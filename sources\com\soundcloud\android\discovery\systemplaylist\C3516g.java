package com.soundcloud.android.discovery.systemplaylist;

import java.util.Date;

/* renamed from: com.soundcloud.android.discovery.systemplaylist.g reason: case insensitive filesystem */
/* compiled from: AutoValue_ApiSystemPlaylist */
final class C3516g extends C3515f {
    private final C3508cda a;
    private final C4928GKa<Integer> b;
    private final C4928GKa<Date> c;
    private final C4928GKa<String> d;
    private final C4928GKa<String> e;
    private final C4928GKa<String> f;
    private final C4928GKa<String> g;
    private final Pca<Yda> h;

    C3516g(C3508cda cda, C4928GKa<Integer> gKa, C4928GKa<Date> gKa2, C4928GKa<String> gKa3, C4928GKa<String> gKa4, C4928GKa<String> gKa5, C4928GKa<String> gKa6, Pca<Yda> pca) {
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
                                if (gKa6 != null) {
                                    this.g = gKa6;
                                    if (pca != null) {
                                        this.h = pca;
                                        return;
                                    }
                                    throw new NullPointerException("Null tracks");
                                }
                                throw new NullPointerException("Null trackingFeatureName");
                            }
                            throw new NullPointerException("Null artworkUrlTemplate");
                        }
                        throw new NullPointerException("Null description");
                    }
                    throw new NullPointerException("Null title");
                }
                throw new NullPointerException("Null lastUpdated");
            }
            throw new NullPointerException("Null trackCount");
        }
        throw new NullPointerException("Null urn");
    }

    public C4928GKa<String> a() {
        return this.f;
    }

    public C4928GKa<String> b() {
        return this.e;
    }

    public C4928GKa<Date> c() {
        return this.c;
    }

    public C4928GKa<String> d() {
        return this.d;
    }

    public C4928GKa<Integer> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3515f)) {
            return false;
        }
        C3515f fVar = (C3515f) obj;
        if (!this.a.equals(fVar.h()) || !this.b.equals(fVar.e()) || !this.c.equals(fVar.c()) || !this.d.equals(fVar.d()) || !this.e.equals(fVar.b()) || !this.f.equals(fVar.a()) || !this.g.equals(fVar.f()) || !this.h.equals(fVar.g())) {
            z = false;
        }
        return z;
    }

    public C4928GKa<String> f() {
        return this.g;
    }

    public Pca<Yda> g() {
        return this.h;
    }

    public C3508cda h() {
        return this.a;
    }

    public int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiSystemPlaylist{urn=");
        sb.append(this.a);
        sb.append(", trackCount=");
        sb.append(this.b);
        sb.append(", lastUpdated=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", artworkUrlTemplate=");
        sb.append(this.f);
        sb.append(", trackingFeatureName=");
        sb.append(this.g);
        sb.append(", tracks=");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }
}
