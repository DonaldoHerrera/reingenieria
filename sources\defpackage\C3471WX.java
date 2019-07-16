package defpackage;

/* renamed from: WX reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_DbModel_PromotedTrackCard */
final class C3471WX extends d {
    private final long d;
    private final long e;
    private final C3508cda f;
    private final C3508cda g;
    private final C3508cda h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;

    C3471WX(long j2, long j3, C3508cda cda, C3508cda cda2, C3508cda cda3, String str, String str2, String str3, String str4, String str5, String str6) {
        this.d = j2;
        this.e = j3;
        if (cda != null) {
            this.f = cda;
            this.g = cda2;
            if (cda3 != null) {
                this.h = cda3;
                if (str != null) {
                    this.i = str;
                    if (str2 != null) {
                        this.j = str2;
                        if (str3 != null) {
                            this.k = str3;
                            if (str4 != null) {
                                this.l = str4;
                                if (str5 != null) {
                                    this.m = str5;
                                    if (str6 != null) {
                                        this.n = str6;
                                        return;
                                    }
                                    throw new NullPointerException("Null monetization_type");
                                }
                                throw new NullPointerException("Null tracking_track_impression_urls");
                            }
                            throw new NullPointerException("Null tracking_track_played_urls");
                        }
                        throw new NullPointerException("Null tracking_promoter_clicked_urls");
                    }
                    throw new NullPointerException("Null tracking_profile_clicked_urls");
                }
                throw new NullPointerException("Null tracking_track_clicked_urls");
            }
            throw new NullPointerException("Null urn");
        }
        throw new NullPointerException("Null track_urn");
    }

    public long a() {
        return this.d;
    }

    public C3508cda b() {
        return this.f;
    }

    public C3508cda c() {
        return this.h;
    }

    public long d() {
        return this.e;
    }

    public String e() {
        return this.j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        if (r7.n.equals(r8.g()) != false) goto L_0x0096;
     */
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.d == dVar.a() && this.e == dVar.d() && this.f.equals(dVar.b())) {
            C3508cda cda = this.g;
            if (cda != null ? cda.equals(dVar.j()) : dVar.j() == null) {
                if (this.h.equals(dVar.c())) {
                    if (this.i.equals(dVar.h())) {
                        if (this.j.equals(dVar.e())) {
                            if (this.k.equals(dVar.f())) {
                                if (this.l.equals(dVar.k())) {
                                    if (this.m.equals(dVar.i())) {
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
        return this.k;
    }

    public String g() {
        return this.n;
    }

    public String h() {
        return this.i;
    }

    public int hashCode() {
        long j2 = this.d;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        long j3 = this.e;
        int hashCode = (((i2 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f.hashCode()) * 1000003;
        C3508cda cda = this.g;
        return this.n.hashCode() ^ ((((((((((((((hashCode ^ (cda == null ? 0 : cda.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003);
    }

    public String i() {
        return this.m;
    }

    public C3508cda j() {
        return this.g;
    }

    public String k() {
        return this.l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PromotedTrackCard{_id=");
        sb.append(this.d);
        sb.append(", created_at=");
        sb.append(this.e);
        sb.append(", track_urn=");
        sb.append(this.f);
        sb.append(", promoter_urn=");
        sb.append(this.g);
        sb.append(", urn=");
        sb.append(this.h);
        sb.append(", tracking_track_clicked_urls=");
        sb.append(this.i);
        sb.append(", tracking_profile_clicked_urls=");
        sb.append(this.j);
        sb.append(", tracking_promoter_clicked_urls=");
        sb.append(this.k);
        sb.append(", tracking_track_played_urls=");
        sb.append(this.l);
        sb.append(", tracking_track_impression_urls=");
        sb.append(this.m);
        sb.append(", monetization_type=");
        sb.append(this.n);
        sb.append("}");
        return sb.toString();
    }
}
