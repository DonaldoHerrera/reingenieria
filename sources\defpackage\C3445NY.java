package defpackage;

import com.soundcloud.android.image.W;

/* renamed from: NY reason: default package and case insensitive filesystem */
/* compiled from: SelectionItemViewModel.kt */
public final class C3445NY {
    private final C3508cda a;
    private final C3508cda b;
    private final String c;
    private final W d;
    private final Integer e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final C3442MY j;

    public C3445NY(C3508cda cda, C3508cda cda2, String str, W w, Integer num, String str2, String str3, String str4, String str5, C3442MY my) {
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
        this.j = my;
    }

    public final W a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.f;
    }

    public final C3442MY e() {
        return this.j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.j, (java.lang.Object) r3.j) != false) goto L_0x006f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3445NY) {
                C3445NY ny = (C3445NY) obj;
                if (C7471uYa.a((Object) this.a, (Object) ny.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) ny.b)) {
                        if (C7471uYa.a((Object) this.c, (Object) ny.c)) {
                            if (C7471uYa.a((Object) this.d, (Object) ny.d)) {
                                if (C7471uYa.a((Object) this.e, (Object) ny.e)) {
                                    if (C7471uYa.a((Object) this.f, (Object) ny.f)) {
                                        if (C7471uYa.a((Object) this.g, (Object) ny.g)) {
                                            if (C7471uYa.a((Object) this.h, (Object) ny.h)) {
                                                if (C7471uYa.a((Object) this.i, (Object) ny.i)) {
                                                }
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

    public final C3508cda f() {
        return this.a;
    }

    public final String g() {
        return this.i;
    }

    public final String h() {
        String str = this.h;
        return str != null ? str : this.i;
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
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        C3442MY my = this.j;
        if (my != null) {
            i2 = my.hashCode();
        }
        return hashCode9 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SelectionItemViewModel(urn=");
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
        sb.append(", trackingInfo=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }

    public C3445NY(C3418EY ey, C3442MY my) {
        C7471uYa.b(ey, "selectionItem");
        this(ey.h(), ey.e(), ey.c(), ey.b(), ey.d(), ey.g(), ey.f(), ey.a(), ey.i(), my);
    }
}
