package com.soundcloud.android.foundation.ads;

import com.soundcloud.android.foundation.ads.C3676c.a;
import com.soundcloud.android.foundation.ads.X.b;
import java.util.List;

/* renamed from: com.soundcloud.android.foundation.ads.z reason: case insensitive filesystem */
/* compiled from: AutoValue_SponsoredSessionAd */
final class C3698z extends X {
    private final C3508cda d;
    private final a e;
    private final int f;
    private final List<String> g;
    private final b h;
    private final aa i;

    C3698z(C3508cda cda, a aVar, int i2, List<String> list, b bVar, aa aaVar) {
        if (cda != null) {
            this.d = cda;
            if (aVar != null) {
                this.e = aVar;
                this.f = i2;
                if (list != null) {
                    this.g = list;
                    if (bVar != null) {
                        this.h = bVar;
                        if (aaVar != null) {
                            this.i = aaVar;
                            return;
                        }
                        throw new NullPointerException("Null video");
                    }
                    throw new NullPointerException("Null optInCard");
                }
                throw new NullPointerException("Null rewardUrls");
            }
            throw new NullPointerException("Null getMonetizationType");
        }
        throw new NullPointerException("Null getAdUrn");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x = (X) obj;
        if (!this.d.equals(x.f()) || !this.e.equals(x.k()) || this.f != x.m() || !this.g.equals(x.o()) || !this.h.equals(x.n()) || !this.i.equals(x.p())) {
            z = false;
        }
        return z;
    }

    public C3508cda f() {
        return this.d;
    }

    public int hashCode() {
        return ((((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public a k() {
        return this.e;
    }

    public int m() {
        return this.f;
    }

    public b n() {
        return this.h;
    }

    public List<String> o() {
        return this.g;
    }

    public aa p() {
        return this.i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SponsoredSessionAd{getAdUrn=");
        sb.append(this.d);
        sb.append(", getMonetizationType=");
        sb.append(this.e);
        sb.append(", adFreeLength=");
        sb.append(this.f);
        sb.append(", rewardUrls=");
        sb.append(this.g);
        sb.append(", optInCard=");
        sb.append(this.h);
        sb.append(", video=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }
}
