package defpackage;

import java.util.List;

/* renamed from: YX reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_DbModel_SingleContentSelectionCard */
final class C3477YX extends f {
    private final long c;
    private final C3508cda d;
    private final C3508cda e;
    private final C3508cda f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final List<String> l;

    C3477YX(long j2, C3508cda cda, C3508cda cda2, C3508cda cda3, String str, String str2, String str3, String str4, String str5, List<String> list) {
        this.c = j2;
        if (cda != null) {
            this.d = cda;
            this.e = cda2;
            this.f = cda3;
            this.g = str;
            this.h = str2;
            this.i = str3;
            this.j = str4;
            this.k = str5;
            if (list != null) {
                this.l = list;
                return;
            }
            throw new NullPointerException("Null social_proof_avatar_urls");
        }
        throw new NullPointerException("Null urn");
    }

    public long a() {
        return this.c;
    }

    public List<String> b() {
        return this.l;
    }

    public C3508cda c() {
        return this.d;
    }

    public C3508cda d() {
        return this.e;
    }

    public String description() {
        return this.i;
    }

    public String e() {
        return this.h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00be, code lost:
        if (r7.l.equals(r8.b()) != false) goto L_0x00c2;
     */
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.c == fVar.a() && this.d.equals(fVar.c())) {
            C3508cda cda = this.e;
            if (cda != null ? cda.equals(fVar.d()) : fVar.d() == null) {
                C3508cda cda2 = this.f;
                if (cda2 != null ? cda2.equals(fVar.g()) : fVar.g() == null) {
                    String str = this.g;
                    if (str != null ? str.equals(fVar.h()) : fVar.h() == null) {
                        String str2 = this.h;
                        if (str2 != null ? str2.equals(fVar.e()) : fVar.e() == null) {
                            String str3 = this.i;
                            if (str3 != null ? str3.equals(fVar.description()) : fVar.description() == null) {
                                String str4 = this.j;
                                if (str4 != null ? str4.equals(fVar.f()) : fVar.f() == null) {
                                    String str5 = this.k;
                                    if (str5 != null ? str5.equals(fVar.i()) : fVar.i() == null) {
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
        return this.j;
    }

    public C3508cda g() {
        return this.f;
    }

    public String h() {
        return this.g;
    }

    public int hashCode() {
        long j2 = this.c;
        int hashCode = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003;
        C3508cda cda = this.e;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (cda == null ? 0 : cda.hashCode())) * 1000003;
        C3508cda cda2 = this.f;
        int hashCode3 = (hashCode2 ^ (cda2 == null ? 0 : cda2.hashCode())) * 1000003;
        String str = this.g;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.h;
        int hashCode5 = (hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.i;
        int hashCode6 = (hashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.j;
        int hashCode7 = (hashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.k;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return this.l.hashCode() ^ ((hashCode7 ^ i2) * 1000003);
    }

    public String i() {
        return this.k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SingleContentSelectionCard{_id=");
        sb.append(this.c);
        sb.append(", urn=");
        sb.append(this.d);
        sb.append(", query_urn=");
        sb.append(this.e);
        sb.append(", parent_query_urn=");
        sb.append(this.f);
        sb.append(", style=");
        sb.append(this.g);
        sb.append(", title=");
        sb.append(this.h);
        sb.append(", description=");
        sb.append(this.i);
        sb.append(", tracking_feature_name=");
        sb.append(this.j);
        sb.append(", social_proof=");
        sb.append(this.k);
        sb.append(", social_proof_avatar_urls=");
        sb.append(this.l);
        sb.append("}");
        return sb.toString();
    }
}
