package defpackage;

import com.soundcloud.android.foundation.ads.C3676c.a;
import java.util.List;

/* renamed from: vZ reason: default package and case insensitive filesystem */
/* compiled from: $AutoValue_VisualAdImpressionEvent */
abstract class C3891vZ extends C3506cba {
    private final String a;
    private final long b;
    private final String c;
    private final String d;
    private final String e;
    private final C4928GKa<C3508cda> f;
    private final C4928GKa<String> g;
    private final List<String> h;
    private final a i;
    private final a j;

    C3891vZ(String str, long j2, String str2, String str3, String str4, C4928GKa<C3508cda> gKa, C4928GKa<String> gKa2, List<String> list, a aVar, a aVar2) {
        if (str != null) {
            this.a = str;
            this.b = j2;
            if (str2 != null) {
                this.c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.e = str4;
                        if (gKa != null) {
                            this.f = gKa;
                            if (gKa2 != null) {
                                this.g = gKa2;
                                if (list != null) {
                                    this.h = list;
                                    if (aVar != null) {
                                        this.i = aVar;
                                        if (aVar2 != null) {
                                            this.j = aVar2;
                                            return;
                                        }
                                        throw new NullPointerException("Null monetizationType");
                                    }
                                    throw new NullPointerException("Null impressionName");
                                }
                                throw new NullPointerException("Null impressionUrls");
                            }
                            throw new NullPointerException("Null adArtworkUrl");
                        }
                        throw new NullPointerException("Null adUrn");
                    }
                    throw new NullPointerException("Null originScreen");
                }
                throw new NullPointerException("Null trackUrn");
            }
            throw new NullPointerException("Null userUrn");
        }
        throw new NullPointerException("Null id");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3506cba)) {
            return false;
        }
        C3506cba cba = (C3506cba) obj;
        if (!this.a.equals(cba.f()) || this.b != cba.g() || !this.c.equals(cba.o()) || !this.d.equals(cba.n()) || !this.e.equals(cba.m()) || !this.f.equals(cba.i()) || !this.g.equals(cba.h()) || !this.h.equals(cba.k()) || !this.i.equals(cba.j()) || !this.j.equals(cba.l())) {
            z = false;
        }
        return z;
    }

    @C3783hda
    public String f() {
        return this.a;
    }

    @C3783hda
    public long g() {
        return this.b;
    }

    public C4928GKa<String> h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j2 = this.b;
        return ((((((((((((((((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
    }

    public C4928GKa<C3508cda> i() {
        return this.f;
    }

    public a j() {
        return this.i;
    }

    public List<String> k() {
        return this.h;
    }

    public a l() {
        return this.j;
    }

    public String m() {
        return this.e;
    }

    public String n() {
        return this.d;
    }

    public String o() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VisualAdImpressionEvent{id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", userUrn=");
        sb.append(this.c);
        sb.append(", trackUrn=");
        sb.append(this.d);
        sb.append(", originScreen=");
        sb.append(this.e);
        sb.append(", adUrn=");
        sb.append(this.f);
        sb.append(", adArtworkUrl=");
        sb.append(this.g);
        sb.append(", impressionUrls=");
        sb.append(this.h);
        sb.append(", impressionName=");
        sb.append(this.i);
        sb.append(", monetizationType=");
        sb.append(this.j);
        sb.append("}");
        return sb.toString();
    }
}
