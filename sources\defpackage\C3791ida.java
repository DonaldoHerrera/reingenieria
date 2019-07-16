package defpackage;

import java.util.Date;

/* renamed from: ida reason: default package and case insensitive filesystem */
/* compiled from: Comment.kt */
public final class C3791ida {
    private final C3508cda a;
    private final C3508cda b;
    private final long c;
    private final Date d;
    private final String e;
    private final C3508cda f;
    private final boolean g;

    public C3791ida(C3508cda cda, C3508cda cda2, long j, Date date, String str, C3508cda cda3, boolean z) {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(cda2, "trackUrn");
        C7471uYa.b(date, "createdAt");
        C7471uYa.b(str, "body");
        C7471uYa.b(cda3, "commenter");
        this.a = cda;
        this.b = cda2;
        this.c = j;
        this.d = date;
        this.e = str;
        this.f = cda3;
        this.g = z;
    }

    public static /* synthetic */ C3791ida a(C3791ida ida, C3508cda cda, C3508cda cda2, long j, Date date, String str, C3508cda cda3, boolean z, int i, Object obj) {
        C3791ida ida2 = ida;
        return ida.a((i & 1) != 0 ? ida2.a : cda, (i & 2) != 0 ? ida2.b : cda2, (i & 4) != 0 ? ida2.c : j, (i & 8) != 0 ? ida2.d : date, (i & 16) != 0 ? ida2.e : str, (i & 32) != 0 ? ida2.f : cda3, (i & 64) != 0 ? ida2.g : z);
    }

    public final C3791ida a(C3508cda cda, C3508cda cda2, long j, Date date, String str, C3508cda cda3, boolean z) {
        C3508cda cda4 = cda;
        C7471uYa.b(cda, "urn");
        C3508cda cda5 = cda2;
        C7471uYa.b(cda2, "trackUrn");
        Date date2 = date;
        C7471uYa.b(date, "createdAt");
        String str2 = str;
        C7471uYa.b(str2, "body");
        C3508cda cda6 = cda3;
        C7471uYa.b(cda6, "commenter");
        C3791ida ida = new C3791ida(cda4, cda5, j, date2, str2, cda6, z);
        return ida;
    }

    public final String a() {
        return this.e;
    }

    public final C3508cda b() {
        return this.f;
    }

    public final Date c() {
        return this.d;
    }

    public final long d() {
        return this.c;
    }

    public final C3508cda e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3791ida) {
                C3791ida ida = (C3791ida) obj;
                if (C7471uYa.a((Object) this.a, (Object) ida.a) && C7471uYa.a((Object) this.b, (Object) ida.b)) {
                    if ((this.c == ida.c) && C7471uYa.a((Object) this.d, (Object) ida.d) && C7471uYa.a((Object) this.e, (Object) ida.e) && C7471uYa.a((Object) this.f, (Object) ida.f)) {
                        if (this.g == ida.g) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f() {
        return this.g;
    }

    public int hashCode() {
        C3508cda cda = this.a;
        int i = 0;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        C3508cda cda2 = this.b;
        int hashCode2 = (hashCode + (cda2 != null ? cda2.hashCode() : 0)) * 31;
        long j = this.c;
        int i2 = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        Date date = this.d;
        int hashCode3 = (i2 + (date != null ? date.hashCode() : 0)) * 31;
        String str = this.e;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        C3508cda cda3 = this.f;
        if (cda3 != null) {
            i = cda3.hashCode();
        }
        int i3 = (hashCode4 + i) * 31;
        boolean z = this.g;
        if (z) {
            z = true;
        }
        return i3 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Comment(urn=");
        sb.append(this.a);
        sb.append(", trackUrn=");
        sb.append(this.b);
        sb.append(", trackTime=");
        sb.append(this.c);
        sb.append(", createdAt=");
        sb.append(this.d);
        sb.append(", body=");
        sb.append(this.e);
        sb.append(", commenter=");
        sb.append(this.f);
        sb.append(", isReply=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
