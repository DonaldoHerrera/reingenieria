package com.soundcloud.android.foundation.ads;

import com.soundcloud.android.foundation.ads.C3692t.a;

/* renamed from: com.soundcloud.android.foundation.ads.x reason: case insensitive filesystem */
/* compiled from: AutoValue_AppInstallAd_ApiModel */
final class C3696x extends a {
    private final C3508cda a;
    private final int b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final float g;
    private final int h;
    private final C3683j i;

    C3696x(C3508cda cda, int i2, String str, String str2, String str3, String str4, float f2, int i3, C3683j jVar) {
        if (cda != null) {
            this.a = cda;
            this.b = i2;
            if (str != null) {
                this.c = str;
                if (str2 != null) {
                    this.d = str2;
                    if (str3 != null) {
                        this.e = str3;
                        if (str4 != null) {
                            this.f = str4;
                            this.g = f2;
                            this.h = i3;
                            if (jVar != null) {
                                this.i = jVar;
                                return;
                            }
                            throw new NullPointerException("Null adTracking");
                        }
                        throw new NullPointerException("Null imageUrl");
                    }
                    throw new NullPointerException("Null clickThroughUrl");
                }
                throw new NullPointerException("Null ctaButtonText");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null adUrn");
    }

    public C3683j a() {
        return this.i;
    }

    public C3508cda b() {
        return this.a;
    }

    public String c() {
        return this.e;
    }

    public String d() {
        return this.d;
    }

    public int e() {
        return this.b;
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
        if (!this.a.equals(aVar.b()) || this.b != aVar.e() || !this.c.equals(aVar.g()) || !this.d.equals(aVar.d()) || !this.e.equals(aVar.c()) || !this.f.equals(aVar.f()) || Float.floatToIntBits(this.g) != Float.floatToIntBits(aVar.i()) || this.h != aVar.h() || !this.i.equals(aVar.a())) {
            z = false;
        }
        return z;
    }

    public String f() {
        return this.f;
    }

    public String g() {
        return this.c;
    }

    public int h() {
        return this.h;
    }

    public int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ Float.floatToIntBits(this.g)) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode();
    }

    public float i() {
        return this.g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiModel{adUrn=");
        sb.append(this.a);
        sb.append(", expiryInMins=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", ctaButtonText=");
        sb.append(this.d);
        sb.append(", clickThroughUrl=");
        sb.append(this.e);
        sb.append(", imageUrl=");
        sb.append(this.f);
        sb.append(", rating=");
        sb.append(this.g);
        sb.append(", ratersCount=");
        sb.append(this.h);
        sb.append(", adTracking=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }
}
