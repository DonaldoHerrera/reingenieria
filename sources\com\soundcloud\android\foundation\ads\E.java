package com.soundcloud.android.foundation.ads;

import com.soundcloud.android.foundation.ads.C3676c.a;
import java.util.List;

/* compiled from: AutoValue_VisualPrestitialAd */
final class E extends ea {
    private final String g;
    private final C3508cda h;
    private final a i;
    private final List<Y> j;
    private final List<Y> k;
    private final String l;

    E(String str, C3508cda cda, a aVar, List<Y> list, List<Y> list2, String str2) {
        if (str != null) {
            this.g = str;
            if (cda != null) {
                this.h = cda;
                if (aVar != null) {
                    this.i = aVar;
                    if (list != null) {
                        this.j = list;
                        if (list2 != null) {
                            this.k = list2;
                            if (str2 != null) {
                                this.l = str2;
                                return;
                            }
                            throw new NullPointerException("Null imageUrl");
                        }
                        throw new NullPointerException("Null clickUrls");
                    }
                    throw new NullPointerException("Null impressionUrls");
                }
                throw new NullPointerException("Null monetizationType");
            }
            throw new NullPointerException("Null adUrn");
        }
        throw new NullPointerException("Null clickthroughUrl");
    }

    public String c() {
        return this.g;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ea)) {
            return false;
        }
        ea eaVar = (ea) obj;
        if (!this.g.equals(eaVar.c()) || !this.h.equals(eaVar.f()) || !this.i.equals(eaVar.k()) || !this.j.equals(eaVar.n()) || !this.k.equals(eaVar.m()) || !this.l.equals(eaVar.v())) {
            z = false;
        }
        return z;
    }

    public C3508cda f() {
        return this.h;
    }

    public int hashCode() {
        return ((((((((((this.g.hashCode() ^ 1000003) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    public a k() {
        return this.i;
    }

    public List<Y> m() {
        return this.k;
    }

    public List<Y> n() {
        return this.j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VisualPrestitialAd{clickthroughUrl=");
        sb.append(this.g);
        sb.append(", adUrn=");
        sb.append(this.h);
        sb.append(", monetizationType=");
        sb.append(this.i);
        sb.append(", impressionUrls=");
        sb.append(this.j);
        sb.append(", clickUrls=");
        sb.append(this.k);
        sb.append(", imageUrl=");
        sb.append(this.l);
        sb.append("}");
        return sb.toString();
    }

    public String v() {
        return this.l;
    }
}
