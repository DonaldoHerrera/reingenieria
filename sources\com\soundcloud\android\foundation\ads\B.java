package com.soundcloud.android.foundation.ads;

import com.soundcloud.android.foundation.ads.X.b;
import java.util.List;

/* compiled from: AutoValue_SponsoredSessionAd_OptInCard */
final class B extends b {
    private final C3508cda a;
    private final String b;
    private final String c;
    private final List<Y> d;
    private final List<Y> e;

    B(C3508cda cda, String str, String str2, List<Y> list, List<Y> list2) {
        if (cda != null) {
            this.a = cda;
            if (str != null) {
                this.b = str;
                if (str2 != null) {
                    this.c = str2;
                    if (list != null) {
                        this.d = list;
                        if (list2 != null) {
                            this.e = list2;
                            return;
                        }
                        throw new NullPointerException("Null trackingClickUrls");
                    }
                    throw new NullPointerException("Null trackingImpressionUrls");
                }
                throw new NullPointerException("Null clickthroughUrl");
            }
            throw new NullPointerException("Null imageUrl");
        }
        throw new NullPointerException("Null adUrn");
    }

    public String c() {
        return this.c;
    }

    public C3508cda e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.a.equals(bVar.e()) || !this.b.equals(bVar.f()) || !this.c.equals(bVar.c()) || !this.d.equals(bVar.h()) || !this.e.equals(bVar.g())) {
            z = false;
        }
        return z;
    }

    public String f() {
        return this.b;
    }

    public List<Y> g() {
        return this.e;
    }

    public List<Y> h() {
        return this.d;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OptInCard{adUrn=");
        sb.append(this.a);
        sb.append(", imageUrl=");
        sb.append(this.b);
        sb.append(", clickthroughUrl=");
        sb.append(this.c);
        sb.append(", trackingImpressionUrls=");
        sb.append(this.d);
        sb.append(", trackingClickUrls=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
