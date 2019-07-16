package defpackage;

import com.soundcloud.android.image.W;

/* renamed from: EY reason: default package and case insensitive filesystem */
/* compiled from: SelectionItem.kt */
public final class C3418EY {
    private final C3508cda a;
    private final C3508cda b;
    private final String c;
    private final W d;
    private final Integer e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;

    public C3418EY(C3508cda cda, C3508cda cda2, String str, W w, Integer num, String str2, String str3, String str4, String str5) {
        C7471uYa.b(cda2, "selectionUrn");
        this.a = cda;
        this.b = cda2;
        this.c = str;
        this.d = w;
        this.e = num;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
    }

    public final String a() {
        return this.h;
    }

    public final W b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final Integer d() {
        return this.e;
    }

    public final C3508cda e() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.i, (java.lang.Object) r3.i) != false) goto L_0x0065;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3418EY) {
                C3418EY ey = (C3418EY) obj;
                if (C7471uYa.a((Object) this.a, (Object) ey.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) ey.b)) {
                        if (C7471uYa.a((Object) this.c, (Object) ey.c)) {
                            if (C7471uYa.a((Object) this.d, (Object) ey.d)) {
                                if (C7471uYa.a((Object) this.e, (Object) ey.e)) {
                                    if (C7471uYa.a((Object) this.f, (Object) ey.f)) {
                                        if (C7471uYa.a((Object) this.g, (Object) ey.g)) {
                                            if (C7471uYa.a((Object) this.h, (Object) ey.h)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String f() {
        return this.g;
    }

    public final String g() {
        return this.f;
    }

    public final C3508cda h() {
        return this.a;
    }

    public int hashCode() {
        C3508cda cda = this.a;
        int i2 = 0;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        C3508cda cda2 = this.b;
        int hashCode2 = (hashCode + (cda2 != null ? cda2.hashCode() : 0)) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        W w = this.d;
        int hashCode4 = (hashCode3 + (w != null ? w.hashCode() : 0)) * 31;
        Integer num = this.e;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.g;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.h;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.i;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String i() {
        return this.i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SelectionItem(urn=");
        sb.append(this.a);
        sb.append(", selectionUrn=");
        sb.append(this.b);
        sb.append(", artworkUrlTemplate=");
        sb.append(this.c);
        sb.append(", artworkStyle=");
        sb.append(this.d);
        sb.append(", count=");
        sb.append(this.e);
        sb.append(", shortTitle=");
        sb.append(this.f);
        sb.append(", shortSubtitle=");
        sb.append(this.g);
        sb.append(", appLink=");
        sb.append(this.h);
        sb.append(", webLink=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
