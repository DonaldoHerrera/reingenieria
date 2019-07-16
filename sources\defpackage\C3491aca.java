package defpackage;

/* renamed from: aca reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_DbModel_PlayQueue */
final class C3491aca extends a {
    private final Long b;
    private final Long c;
    private final Long d;
    private final Long e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final Boolean n;

    C3491aca(Long l2, Long l3, Long l4, Long l5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool) {
        this.b = l2;
        this.c = l3;
        this.d = l4;
        this.e = l5;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = str8;
        this.n = bool;
    }

    public Long a() {
        return this.b;
    }

    public String b() {
        return this.m;
    }

    public String c() {
        return this.k;
    }

    public String d() {
        return this.j;
    }

    public String e() {
        return this.i;
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
        Long l2 = this.b;
        if (l2 != null ? l2.equals(aVar.a()) : aVar.a() == null) {
            Long l3 = this.c;
            if (l3 != null ? l3.equals(aVar.m()) : aVar.m() == null) {
                Long l4 = this.d;
                if (l4 != null ? l4.equals(aVar.f()) : aVar.f() == null) {
                    Long l5 = this.e;
                    if (l5 != null ? l5.equals(aVar.i()) : aVar.i() == null) {
                        String str = this.f;
                        if (str != null ? str.equals(aVar.j()) : aVar.j() == null) {
                            String str2 = this.g;
                            if (str2 != null ? str2.equals(aVar.l()) : aVar.l() == null) {
                                String str3 = this.h;
                                if (str3 != null ? str3.equals(aVar.k()) : aVar.k() == null) {
                                    String str4 = this.i;
                                    if (str4 != null ? str4.equals(aVar.e()) : aVar.e() == null) {
                                        String str5 = this.j;
                                        if (str5 != null ? str5.equals(aVar.d()) : aVar.d() == null) {
                                            String str6 = this.k;
                                            if (str6 != null ? str6.equals(aVar.c()) : aVar.c() == null) {
                                                String str7 = this.l;
                                                if (str7 != null ? str7.equals(aVar.h()) : aVar.h() == null) {
                                                    String str8 = this.m;
                                                    if (str8 != null ? str8.equals(aVar.b()) : aVar.b() == null) {
                                                        Boolean bool = this.n;
                                                        if (bool != null) {
                                                        }
                                                    }
                                                }
                                            }
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

    public Long f() {
        return this.d;
    }

    public Boolean g() {
        return this.n;
    }

    public String h() {
        return this.l;
    }

    public int hashCode() {
        Long l2 = this.b;
        int i2 = 0;
        int hashCode = ((l2 == null ? 0 : l2.hashCode()) ^ 1000003) * 1000003;
        Long l3 = this.c;
        int hashCode2 = (hashCode ^ (l3 == null ? 0 : l3.hashCode())) * 1000003;
        Long l4 = this.d;
        int hashCode3 = (hashCode2 ^ (l4 == null ? 0 : l4.hashCode())) * 1000003;
        Long l5 = this.e;
        int hashCode4 = (hashCode3 ^ (l5 == null ? 0 : l5.hashCode())) * 1000003;
        String str = this.f;
        int hashCode5 = (hashCode4 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int hashCode6 = (hashCode5 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int hashCode7 = (hashCode6 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.i;
        int hashCode8 = (hashCode7 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.j;
        int hashCode9 = (hashCode8 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.k;
        int hashCode10 = (hashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.l;
        int hashCode11 = (hashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.m;
        int hashCode12 = (hashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        Boolean bool = this.n;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode12 ^ i2;
    }

    public Long i() {
        return this.e;
    }

    public String j() {
        return this.f;
    }

    public String k() {
        return this.h;
    }

    public String l() {
        return this.g;
    }

    public Long m() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayQueue{_id=");
        sb.append(this.b);
        sb.append(", entity_id=");
        sb.append(this.c);
        sb.append(", entity_type=");
        sb.append(this.d);
        sb.append(", reposter_id=");
        sb.append(this.e);
        sb.append(", related_entity=");
        sb.append(this.f);
        sb.append(", source=");
        sb.append(this.g);
        sb.append(", source_version=");
        sb.append(this.h);
        sb.append(", source_urn=");
        sb.append(this.i);
        sb.append(", query_urn=");
        sb.append(this.j);
        sb.append(", context_type=");
        sb.append(this.k);
        sb.append(", context_urn=");
        sb.append(this.l);
        sb.append(", context_query=");
        sb.append(this.m);
        sb.append(", played=");
        sb.append(this.n);
        sb.append("}");
        return sb.toString();
    }
}
