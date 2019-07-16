package defpackage;

import java.util.Date;

/* renamed from: Wza reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_ApiFollowing */
final class C5431Wza extends C5402Vza {
    private final C3508cda b;
    private final C3508cda c;
    private final Date d;

    C5431Wza(C3508cda cda, C3508cda cda2, Date date) {
        if (cda != null) {
            this.b = cda;
            if (cda2 != null) {
                this.c = cda2;
                if (date != null) {
                    this.d = date;
                    return;
                }
                throw new NullPointerException("Null createdAt");
            }
            throw new NullPointerException("Null userUrn");
        }
        throw new NullPointerException("Null targetUrn");
    }

    public Date a() {
        return this.d;
    }

    public C3508cda b() {
        return this.b;
    }

    public C3508cda c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5402Vza)) {
            return false;
        }
        C5402Vza vza = (C5402Vza) obj;
        if (!this.b.equals(vza.b()) || !this.c.equals(vza.c()) || !this.d.equals(vza.a())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiFollowing{targetUrn=");
        sb.append(this.b);
        sb.append(", userUrn=");
        sb.append(this.c);
        sb.append(", createdAt=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
