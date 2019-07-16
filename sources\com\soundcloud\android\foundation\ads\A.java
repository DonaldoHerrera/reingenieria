package com.soundcloud.android.foundation.ads;

import com.soundcloud.android.foundation.ads.X.a;
import com.soundcloud.android.foundation.ads.X.b;
import java.util.List;

/* compiled from: AutoValue_SponsoredSessionAd_ApiModel */
final class A extends a {
    private final C3508cda a;
    private final int b;
    private final List<String> c;
    private final aa.a d;
    private final b e;

    A(C3508cda cda, int i, List<String> list, aa.a aVar, b bVar) {
        if (cda != null) {
            this.a = cda;
            this.b = i;
            if (list != null) {
                this.c = list;
                if (aVar != null) {
                    this.d = aVar;
                    if (bVar != null) {
                        this.e = bVar;
                        return;
                    }
                    throw new NullPointerException("Null optInCard");
                }
                throw new NullPointerException("Null video");
            }
            throw new NullPointerException("Null rewardUrls");
        }
        throw new NullPointerException("Null adUrn");
    }

    public int a() {
        return this.b;
    }

    public C3508cda b() {
        return this.a;
    }

    public b c() {
        return this.e;
    }

    public List<String> d() {
        return this.c;
    }

    public aa.a e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.a.equals(aVar.b()) || this.b != aVar.a() || !this.c.equals(aVar.d()) || !this.d.equals(aVar.e()) || !this.e.equals(aVar.c())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiModel{adUrn=");
        sb.append(this.a);
        sb.append(", adFreeMinutes=");
        sb.append(this.b);
        sb.append(", rewardUrls=");
        sb.append(this.c);
        sb.append(", video=");
        sb.append(this.d);
        sb.append(", optInCard=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
