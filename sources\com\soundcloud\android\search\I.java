package com.soundcloud.android.search;

import java.util.Collection;
import java.util.List;

/* compiled from: SearchResultPage.kt */
public final class I {
    private final List<C3508cda> a;
    private final Oca b;
    private final C3508cda c;
    private final int d;
    private final La e;
    private final String f;

    public I(List<C3508cda> list, Oca oca, C3508cda cda, int i, La la, String str) {
        C7471uYa.b(list, "items");
        C7471uYa.b(cda, "queryUrn");
        C7471uYa.b(la, "searchType");
        C7471uYa.b(str, "queryString");
        this.a = list;
        this.b = oca;
        this.c = cda;
        this.d = i;
        this.e = la;
        this.f = str;
    }

    public final List<C3508cda> a() {
        return this.a;
    }

    public final Oca b() {
        return this.b;
    }

    public final String c() {
        return this.f;
    }

    public final C3508cda d() {
        return this.c;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof I) {
                I i = (I) obj;
                if (C7471uYa.a((Object) this.a, (Object) i.a) && C7471uYa.a((Object) this.b, (Object) i.b) && C7471uYa.a((Object) this.c, (Object) i.c)) {
                    if (!(this.d == i.d) || !C7471uYa.a((Object) this.e, (Object) i.e) || !C7471uYa.a((Object) this.f, (Object) i.f)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final La f() {
        return this.e;
    }

    public int hashCode() {
        List<C3508cda> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Oca oca = this.b;
        int hashCode2 = (hashCode + (oca != null ? oca.hashCode() : 0)) * 31;
        C3508cda cda = this.c;
        int hashCode3 = (((hashCode2 + (cda != null ? cda.hashCode() : 0)) * 31) + this.d) * 31;
        La la = this.e;
        int hashCode4 = (hashCode3 + (la != null ? la.hashCode() : 0)) * 31;
        String str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SearchResultPage(items=");
        sb.append(this.a);
        sb.append(", nextHref=");
        sb.append(this.b);
        sb.append(", queryUrn=");
        sb.append(this.c);
        sb.append(", resultsCount=");
        sb.append(this.d);
        sb.append(", searchType=");
        sb.append(this.e);
        sb.append(", queryString=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public final I a(I i) {
        C7471uYa.b(i, "nextPage");
        I i2 = new I(C7676xWa.c((Collection) this.a, (Iterable) i.a), i.b, this.c, this.d, this.e, this.f);
        return i2;
    }
}
