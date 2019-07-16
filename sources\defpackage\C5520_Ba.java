package defpackage;

import java.util.Date;

/* renamed from: _Ba reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_ApiPost */
final class C5520_Ba extends C5433XBa {
    private final C3508cda a;
    private final Date b;
    private final boolean c;

    C5520_Ba(C3508cda cda, Date date, boolean z) {
        if (cda != null) {
            this.a = cda;
            if (date != null) {
                this.b = date;
                this.c = z;
                return;
            }
            throw new NullPointerException("Null createdAt");
        }
        throw new NullPointerException("Null targetUrn");
    }

    public boolean a() {
        return this.c;
    }

    public Date b() {
        return this.b;
    }

    public C3508cda c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5433XBa)) {
            return false;
        }
        C5433XBa xBa = (C5433XBa) obj;
        if (!this.a.equals(xBa.c()) || !this.b.equals(xBa.b()) || this.c != xBa.a()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiPost{targetUrn=");
        sb.append(this.a);
        sb.append(", createdAt=");
        sb.append(this.b);
        sb.append(", repost=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
