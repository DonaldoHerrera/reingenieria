package defpackage;

import java.util.Date;

/* renamed from: ZX reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_DbModel_SystemPlaylist */
final class C3480ZX extends g {
    private final C3508cda c;
    private final C3508cda d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final Date i;

    C3480ZX(C3508cda cda, C3508cda cda2, String str, String str2, String str3, String str4, Date date) {
        if (cda != null) {
            this.c = cda;
            this.d = cda2;
            this.e = str;
            this.f = str2;
            this.g = str3;
            this.h = str4;
            this.i = date;
            return;
        }
        throw new NullPointerException("Null urn");
    }

    public Date a() {
        return this.i;
    }

    public String b() {
        return this.g;
    }

    public C3508cda c() {
        return this.c;
    }

    public C3508cda d() {
        return this.d;
    }

    public String description() {
        return this.f;
    }

    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.c.equals(gVar.c())) {
            C3508cda cda = this.d;
            if (cda != null ? cda.equals(gVar.d()) : gVar.d() == null) {
                String str = this.e;
                if (str != null ? str.equals(gVar.e()) : gVar.e() == null) {
                    String str2 = this.f;
                    if (str2 != null ? str2.equals(gVar.description()) : gVar.description() == null) {
                        String str3 = this.g;
                        if (str3 != null ? str3.equals(gVar.b()) : gVar.b() == null) {
                            String str4 = this.h;
                            if (str4 != null ? str4.equals(gVar.f()) : gVar.f() == null) {
                                Date date = this.i;
                                if (date != null) {
                                }
                            }
                        }
                    }
                }
            }
        }
        z = false;
        return z;
    }

    public String f() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = (this.c.hashCode() ^ 1000003) * 1000003;
        C3508cda cda = this.d;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (cda == null ? 0 : cda.hashCode())) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.g;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.h;
        int hashCode6 = (hashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        Date date = this.i;
        if (date != null) {
            i2 = date.hashCode();
        }
        return hashCode6 ^ i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SystemPlaylist{urn=");
        sb.append(this.c);
        sb.append(", query_urn=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", artwork_url_template=");
        sb.append(this.g);
        sb.append(", tracking_feature_name=");
        sb.append(this.h);
        sb.append(", last_updated=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }
}
