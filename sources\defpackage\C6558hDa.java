package defpackage;

/* renamed from: hDa reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_DbModel_DownloadedMediaStreams */
final class C6558hDa extends a {
    private final C3508cda c;
    private final String d;
    private final String e;
    private final String f;

    C6558hDa(C3508cda cda, String str, String str2, String str3) {
        if (cda != null) {
            this.c = cda;
            if (str != null) {
                this.d = str;
                if (str2 != null) {
                    this.e = str2;
                    if (str3 != null) {
                        this.f = str3;
                        return;
                    }
                    throw new NullPointerException("Null mime_type");
                }
                throw new NullPointerException("Null quality");
            }
            throw new NullPointerException("Null preset");
        }
        throw new NullPointerException("Null urn");
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public C3508cda c() {
        return this.c;
    }

    public String d() {
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
        if (!this.c.equals(aVar.c()) || !this.d.equals(aVar.a()) || !this.e.equals(aVar.b()) || !this.f.equals(aVar.d())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DownloadedMediaStreams{urn=");
        sb.append(this.c);
        sb.append(", preset=");
        sb.append(this.d);
        sb.append(", quality=");
        sb.append(this.e);
        sb.append(", mime_type=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
