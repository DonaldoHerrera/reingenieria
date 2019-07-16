package defpackage;

import java.util.List;

/* renamed from: mZ reason: default package and case insensitive filesystem */
/* compiled from: $AutoValue_PrestitialAdImpressionEvent */
abstract class C3819mZ extends Paa {
    private final String b;
    private final long c;
    private final C3508cda d;
    private final String e;
    private final List<String> f;
    private final String g;

    C3819mZ(String str, long j, C3508cda cda, String str2, List<String> list, String str3) {
        if (str != null) {
            this.b = str;
            this.c = j;
            if (cda != null) {
                this.d = cda;
                if (str2 != null) {
                    this.e = str2;
                    if (list != null) {
                        this.f = list;
                        if (str3 != null) {
                            this.g = str3;
                            return;
                        }
                        throw new NullPointerException("Null monetizationType");
                    }
                    throw new NullPointerException("Null impressionUrls");
                }
                throw new NullPointerException("Null impressionName");
            }
            throw new NullPointerException("Null urn");
        }
        throw new NullPointerException("Null id");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Paa)) {
            return false;
        }
        Paa paa = (Paa) obj;
        if (!this.b.equals(paa.f()) || this.c != paa.g() || !this.d.equals(paa.k()) || !this.e.equals(paa.h()) || !this.f.equals(paa.i()) || !this.g.equals(paa.j())) {
            z = false;
        }
        return z;
    }

    @C3783hda
    public String f() {
        return this.b;
    }

    @C3783hda
    public long g() {
        return this.c;
    }

    public String h() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        long j = this.c;
        return ((((((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public List<String> i() {
        return this.f;
    }

    public String j() {
        return this.g;
    }

    public C3508cda k() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrestitialAdImpressionEvent{id=");
        sb.append(this.b);
        sb.append(", timestamp=");
        sb.append(this.c);
        sb.append(", urn=");
        sb.append(this.d);
        sb.append(", impressionName=");
        sb.append(this.e);
        sb.append(", impressionUrls=");
        sb.append(this.f);
        sb.append(", monetizationType=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
