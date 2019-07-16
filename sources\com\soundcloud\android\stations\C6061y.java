package com.soundcloud.android.stations;

import java.util.Date;

/* renamed from: com.soundcloud.android.stations.y reason: case insensitive filesystem */
/* compiled from: AutoValue_StationsDbModel_Station */
final class C6061y extends a {
    private final long c;
    private final C3508cda d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final Long i;
    private final Date j;

    C6061y(long j2, C3508cda cda, String str, String str2, String str3, String str4, Long l, Date date) {
        this.c = j2;
        if (cda != null) {
            this.d = cda;
            this.e = str;
            this.f = str2;
            this.g = str3;
            this.h = str4;
            this.i = l;
            this.j = date;
            return;
        }
        throw new NullPointerException("Null urn");
    }

    public long a() {
        return this.c;
    }

    public String b() {
        return this.h;
    }

    public C3508cda c() {
        return this.d;
    }

    public Date d() {
        return this.j;
    }

    public String e() {
        return this.f;
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
        if (this.c == aVar.a() && this.d.equals(aVar.c())) {
            String str = this.e;
            if (str != null ? str.equals(aVar.type()) : aVar.type() == null) {
                String str2 = this.f;
                if (str2 != null ? str2.equals(aVar.e()) : aVar.e() == null) {
                    String str3 = this.g;
                    if (str3 != null ? str3.equals(aVar.f()) : aVar.f() == null) {
                        String str4 = this.h;
                        if (str4 != null ? str4.equals(aVar.b()) : aVar.b() == null) {
                            Long l = this.i;
                            if (l != null ? l.equals(aVar.g()) : aVar.g() == null) {
                                Date date = this.j;
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
        return this.g;
    }

    public Long g() {
        return this.i;
    }

    public int hashCode() {
        long j2 = this.c;
        int hashCode = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003;
        String str = this.e;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.g;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.h;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        Long l = this.i;
        int hashCode6 = (hashCode5 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Date date = this.j;
        if (date != null) {
            i2 = date.hashCode();
        }
        return hashCode6 ^ i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Station{_id=");
        sb.append(this.c);
        sb.append(", urn=");
        sb.append(this.d);
        sb.append(", type=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", permalink=");
        sb.append(this.g);
        sb.append(", artwork_url_template=");
        sb.append(this.h);
        sb.append(", last_played_track_position=");
        sb.append(this.i);
        sb.append(", play_queue_updated_at=");
        sb.append(this.j);
        sb.append("}");
        return sb.toString();
    }

    public String type() {
        return this.e;
    }
}
