package com.soundcloud.android.activities;

import java.util.Date;

/* compiled from: ActivityItem.kt */
public final class B {
    private final Date a;
    private final G b;
    private final String c;
    private final String d;
    private final C3508cda e;
    private final C3508cda f;
    private final String g;
    private final boolean h;

    public B(Date date, G g2, String str, String str2, C3508cda cda, C3508cda cda2, String str3, boolean z) {
        C7471uYa.b(date, "createdAt");
        C7471uYa.b(g2, "kind");
        C7471uYa.b(str, "userName");
        C7471uYa.b(str2, "playableTitle");
        C7471uYa.b(cda2, "urn");
        this.a = date;
        this.b = g2;
        this.c = str;
        this.d = str2;
        this.e = cda;
        this.f = cda2;
        this.g = str3;
        this.h = z;
    }

    public final C3508cda a() {
        return this.e;
    }

    public final Date b() {
        return this.a;
    }

    public final String c() {
        return this.g;
    }

    public final G d() {
        return this.b;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof B) {
                B b2 = (B) obj;
                if (C7471uYa.a((Object) this.a, (Object) b2.a) && C7471uYa.a((Object) this.b, (Object) b2.b) && C7471uYa.a((Object) this.c, (Object) b2.c) && C7471uYa.a((Object) this.d, (Object) b2.d) && C7471uYa.a((Object) this.e, (Object) b2.e) && C7471uYa.a((Object) this.f, (Object) b2.f) && C7471uYa.a((Object) this.g, (Object) b2.g)) {
                    if (this.h == b2.h) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final C3508cda f() {
        return this.f;
    }

    public final boolean g() {
        return this.h;
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        Date date = this.a;
        int i = 0;
        int hashCode = (date != null ? date.hashCode() : 0) * 31;
        G g2 = this.b;
        int hashCode2 = (hashCode + (g2 != null ? g2.hashCode() : 0)) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        C3508cda cda = this.e;
        int hashCode5 = (hashCode4 + (cda != null ? cda.hashCode() : 0)) * 31;
        C3508cda cda2 = this.f;
        int hashCode6 = (hashCode5 + (cda2 != null ? cda2.hashCode() : 0)) * 31;
        String str3 = this.g;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (hashCode6 + i) * 31;
        boolean z = this.h;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityItem(createdAt=");
        sb.append(this.a);
        sb.append(", kind=");
        sb.append(this.b);
        sb.append(", userName=");
        sb.append(this.c);
        sb.append(", playableTitle=");
        sb.append(this.d);
        sb.append(", commentedTrackUrn=");
        sb.append(this.e);
        sb.append(", urn=");
        sb.append(this.f);
        sb.append(", imageUrlTemplate=");
        sb.append(this.g);
        sb.append(", userIsPro=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
