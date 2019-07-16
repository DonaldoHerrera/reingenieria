package defpackage;

/* renamed from: XX reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_DbModel_SelectionItem */
final class C3474XX extends e {
    private final long e;
    private final C3508cda f;
    private final C3508cda g;
    private final String h;
    private final String i;
    private final Long j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;

    C3474XX(long j2, C3508cda cda, C3508cda cda2, String str, String str2, Long l2, String str3, String str4, String str5, String str6) {
        this.e = j2;
        if (cda != null) {
            this.f = cda;
            this.g = cda2;
            this.h = str;
            this.i = str2;
            this.j = l2;
            this.k = str3;
            this.l = str4;
            this.m = str5;
            this.n = str6;
            return;
        }
        throw new NullPointerException("Null selection_urn");
    }

    public long a() {
        return this.e;
    }

    public String b() {
        return this.h;
    }

    public C3508cda c() {
        return this.g;
    }

    public Long count() {
        return this.j;
    }

    public String d() {
        return this.k;
    }

    public String e() {
        return this.l;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.e == eVar.a() && this.f.equals(eVar.g())) {
            C3508cda cda = this.g;
            if (cda != null ? cda.equals(eVar.c()) : eVar.c() == null) {
                String str = this.h;
                if (str != null ? str.equals(eVar.b()) : eVar.b() == null) {
                    String str2 = this.i;
                    if (str2 != null ? str2.equals(eVar.i()) : eVar.i() == null) {
                        Long l2 = this.j;
                        if (l2 != null ? l2.equals(eVar.count()) : eVar.count() == null) {
                            String str3 = this.k;
                            if (str3 != null ? str3.equals(eVar.d()) : eVar.d() == null) {
                                String str4 = this.l;
                                if (str4 != null ? str4.equals(eVar.e()) : eVar.e() == null) {
                                    String str5 = this.m;
                                    if (str5 != null ? str5.equals(eVar.h()) : eVar.h() == null) {
                                        String str6 = this.n;
                                        if (str6 != null) {
                                        }
                                    }
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
        return this.n;
    }

    public C3508cda g() {
        return this.f;
    }

    public String h() {
        return this.m;
    }

    public int hashCode() {
        long j2 = this.e;
        int hashCode = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003;
        C3508cda cda = this.g;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (cda == null ? 0 : cda.hashCode())) * 1000003;
        String str = this.h;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.i;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Long l2 = this.j;
        int hashCode5 = (hashCode4 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        String str3 = this.k;
        int hashCode6 = (hashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.l;
        int hashCode7 = (hashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.m;
        int hashCode8 = (hashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.n;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode8 ^ i2;
    }

    public String i() {
        return this.i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SelectionItem{_id=");
        sb.append(this.e);
        sb.append(", selection_urn=");
        sb.append(this.f);
        sb.append(", urn=");
        sb.append(this.g);
        sb.append(", artwork_url_template=");
        sb.append(this.h);
        sb.append(", artwork_style=");
        sb.append(this.i);
        sb.append(", count=");
        sb.append(this.j);
        sb.append(", short_title=");
        sb.append(this.k);
        sb.append(", short_subtitle=");
        sb.append(this.l);
        sb.append(", web_link=");
        sb.append(this.m);
        sb.append(", app_link=");
        sb.append(this.n);
        sb.append("}");
        return sb.toString();
    }
}
