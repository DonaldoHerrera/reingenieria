package defpackage;

import java.util.List;

/* renamed from: sZ reason: default package and case insensitive filesystem */
/* compiled from: $AutoValue_SponsoredSessionStartEvent */
abstract class C3867sZ extends Taa {
    private final String a;
    private final long b;
    private final C3508cda c;
    private final String d;
    private final Yca e;
    private final String f;
    private final List<String> g;

    C3867sZ(String str, long j, C3508cda cda, String str2, Yca yca, String str3, List<String> list) {
        if (str != null) {
            this.a = str;
            this.b = j;
            if (cda != null) {
                this.c = cda;
                if (str2 != null) {
                    this.d = str2;
                    if (yca != null) {
                        this.e = yca;
                        if (str3 != null) {
                            this.f = str3;
                            if (list != null) {
                                this.g = list;
                                return;
                            }
                            throw new NullPointerException("Null trackingUrls");
                        }
                        throw new NullPointerException("Null monetizationType");
                    }
                    throw new NullPointerException("Null page");
                }
                throw new NullPointerException("Null clickTarget");
            }
            throw new NullPointerException("Null adUrn");
        }
        throw new NullPointerException("Null id");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Taa)) {
            return false;
        }
        Taa taa = (Taa) obj;
        if (!this.a.equals(taa.f()) || this.b != taa.g() || !this.c.equals(taa.h()) || !this.d.equals(taa.i()) || !this.e.equals(taa.k()) || !this.f.equals(taa.j()) || !this.g.equals(taa.l())) {
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

    public C3508cda h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((((((((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public String i() {
        return this.d;
    }

    public String j() {
        return this.f;
    }

    public Yca k() {
        return this.e;
    }

    public List<String> l() {
        return this.g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SponsoredSessionStartEvent{id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", adUrn=");
        sb.append(this.c);
        sb.append(", clickTarget=");
        sb.append(this.d);
        sb.append(", page=");
        sb.append(this.e);
        sb.append(", monetizationType=");
        sb.append(this.f);
        sb.append(", trackingUrls=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
