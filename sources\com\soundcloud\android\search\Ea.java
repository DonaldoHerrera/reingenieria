package com.soundcloud.android.search;

import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import java.util.List;

/* compiled from: SearchTrackItem.kt */
public final class Ea {
    private final C3508cda a;
    private final La b;
    private final List<C3508cda> c;
    private final int d;
    private final SearchQuerySourceInfo e;

    public Ea(C3508cda cda, La la, List<C3508cda> list, int i, SearchQuerySourceInfo searchQuerySourceInfo) {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(la, "searchType");
        C7471uYa.b(list, "list");
        C7471uYa.b(searchQuerySourceInfo, "searchQuerySourceInfo");
        this.a = cda;
        this.b = la;
        this.c = list;
        this.d = i;
        this.e = searchQuerySourceInfo;
    }

    public final List<C3508cda> a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final SearchQuerySourceInfo c() {
        return this.e;
    }

    public final La d() {
        return this.b;
    }

    public final C3508cda e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Ea) {
                Ea ea = (Ea) obj;
                if (C7471uYa.a((Object) this.a, (Object) ea.a) && C7471uYa.a((Object) this.b, (Object) ea.b) && C7471uYa.a((Object) this.c, (Object) ea.c)) {
                    if (!(this.d == ea.d) || !C7471uYa.a((Object) this.e, (Object) ea.e)) {
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
        La la = this.b;
        int hashCode2 = (hashCode + (la != null ? la.hashCode() : 0)) * 31;
        List<C3508cda> list = this.c;
        int hashCode3 = (((hashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.d) * 31;
        SearchQuerySourceInfo searchQuerySourceInfo = this.e;
        if (searchQuerySourceInfo != null) {
            i = searchQuerySourceInfo.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SearchTrackItemClickParams(urn=");
        sb.append(this.a);
        sb.append(", searchType=");
        sb.append(this.b);
        sb.append(", list=");
        sb.append(this.c);
        sb.append(", position=");
        sb.append(this.d);
        sb.append(", searchQuerySourceInfo=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
