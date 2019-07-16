package defpackage;

import java.util.Date;

/* renamed from: oba reason: default package and case insensitive filesystem */
/* compiled from: Following.kt */
public final class C3837oba implements C4737AFa {
    private final C3508cda a;
    private final long b;
    private final Date c;
    private final Date d;

    public C3837oba(C3508cda cda, long j, Date date, Date date2) {
        C7471uYa.b(cda, "userUrn");
        this.a = cda;
        this.b = j;
        this.c = date;
        this.d = date2;
    }

    public final Date a() {
        return this.c;
    }

    public final Date b() {
        return this.d;
    }

    public final C3508cda c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3837oba) {
                C3837oba oba = (C3837oba) obj;
                if (C7471uYa.a((Object) this.a, (Object) oba.a)) {
                    if (!(this.b == oba.b) || !C7471uYa.a((Object) this.c, (Object) oba.c) || !C7471uYa.a((Object) this.d, (Object) oba.d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3508cda cda = this.a;
        int i = 0;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        long j = this.b;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        Date date = this.c;
        int hashCode2 = (i2 + (date != null ? date.hashCode() : 0)) * 31;
        Date date2 = this.d;
        if (date2 != null) {
            i = date2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Following(userUrn=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", addedAt=");
        sb.append(this.c);
        sb.append(", removedAt=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
