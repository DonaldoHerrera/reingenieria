package defpackage;

import java.util.List;

/* renamed from: Uda reason: default package */
/* compiled from: StationWithTrackUrns.kt */
public final class Uda {
    private final C3508cda a;
    private final String b;
    private final String c;
    private final String d;
    private final List<C3508cda> e;
    private final String f;
    private final int g;
    private final boolean h;

    public Uda(C3508cda cda, String str, String str2, String str3, List<C3508cda> list, String str4, int i, boolean z) {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(str, C1325gg.TYPE);
        C7471uYa.b(str2, "title");
        C7471uYa.b(list, "trackUrns");
        this.a = cda;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = str4;
        this.g = i;
        this.h = z;
    }

    public static /* synthetic */ Uda a(Uda uda, C3508cda cda, String str, String str2, String str3, List list, String str4, int i, boolean z, int i2, Object obj) {
        Uda uda2 = uda;
        int i3 = i2;
        return uda.a((i3 & 1) != 0 ? uda2.a : cda, (i3 & 2) != 0 ? uda2.b : str, (i3 & 4) != 0 ? uda2.c : str2, (i3 & 8) != 0 ? uda2.d : str3, (i3 & 16) != 0 ? uda2.e : list, (i3 & 32) != 0 ? uda2.f : str4, (i3 & 64) != 0 ? uda2.g : i, (i3 & 128) != 0 ? uda2.h : z);
    }

    public final Uda a(C3508cda cda, String str, String str2, String str3, List<C3508cda> list, String str4, int i, boolean z) {
        C3508cda cda2 = cda;
        C7471uYa.b(cda, "urn");
        String str5 = str;
        C7471uYa.b(str, C1325gg.TYPE);
        String str6 = str2;
        C7471uYa.b(str2, "title");
        List<C3508cda> list2 = list;
        C7471uYa.b(list, "trackUrns");
        Uda uda = new Uda(cda2, str5, str6, str3, list2, str4, i, z);
        return uda;
    }

    public final String a() {
        return this.f;
    }

    public final boolean b() {
        return this.h;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final List<C3508cda> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Uda) {
                Uda uda = (Uda) obj;
                if (C7471uYa.a((Object) this.a, (Object) uda.a) && C7471uYa.a((Object) this.b, (Object) uda.b) && C7471uYa.a((Object) this.c, (Object) uda.c) && C7471uYa.a((Object) this.d, (Object) uda.d) && C7471uYa.a((Object) this.e, (Object) uda.e) && C7471uYa.a((Object) this.f, (Object) uda.f)) {
                    if (this.g == uda.g) {
                        if (this.h == uda.h) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String f() {
        return this.b;
    }

    public final C3508cda g() {
        return this.a;
    }

    public int hashCode() {
        C3508cda cda = this.a;
        int i = 0;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<C3508cda> list = this.e;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        String str4 = this.f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int i2 = (((hashCode5 + i) * 31) + this.g) * 31;
        boolean z = this.h;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StationWithTrackUrns(urn=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", permalink=");
        sb.append(this.d);
        sb.append(", trackUrns=");
        sb.append(this.e);
        sb.append(", imageUrlTemplate=");
        sb.append(this.f);
        sb.append(", lastPlayedTrackPosition=");
        sb.append(this.g);
        sb.append(", liked=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ Uda(C3508cda cda, String str, String str2, String str3, List list, String str4, int i, boolean z, int i2, C7264rYa rya) {
        this(cda, str, str2, str3, (i2 & 16) != 0 ? C6918mWa.a() : list, str4, i, z);
    }
}
