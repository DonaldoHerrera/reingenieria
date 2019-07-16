package com.soundcloud.android.search;

import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;

/* compiled from: SearchUserItem.kt */
public final class Na {
    private final C3508cda a;
    private final Yca b;
    private final SearchQuerySourceInfo c;
    private final La d;

    public Na(C3508cda cda, Yca yca, SearchQuerySourceInfo searchQuerySourceInfo, La la) {
        C7471uYa.b(cda, "user");
        C7471uYa.b(yca, "screen");
        C7471uYa.b(searchQuerySourceInfo, "searchQuerySourceInfo");
        C7471uYa.b(la, "searchType");
        this.a = cda;
        this.b = yca;
        this.c = searchQuerySourceInfo;
        this.d = la;
    }

    public final SearchQuerySourceInfo a() {
        return this.c;
    }

    public final La b() {
        return this.d;
    }

    public final C3508cda c() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.d, (java.lang.Object) r3.d) != false) goto L_0x0033;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Na) {
                Na na = (Na) obj;
                if (C7471uYa.a((Object) this.a, (Object) na.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) na.b)) {
                        if (C7471uYa.a((Object) this.c, (Object) na.c)) {
                        }
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
        Yca yca = this.b;
        int hashCode2 = (hashCode + (yca != null ? yca.hashCode() : 0)) * 31;
        SearchQuerySourceInfo searchQuerySourceInfo = this.c;
        int hashCode3 = (hashCode2 + (searchQuerySourceInfo != null ? searchQuerySourceInfo.hashCode() : 0)) * 31;
        La la = this.d;
        if (la != null) {
            i = la.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SearchUserItemClickParams(user=");
        sb.append(this.a);
        sb.append(", screen=");
        sb.append(this.b);
        sb.append(", searchQuerySourceInfo=");
        sb.append(this.c);
        sb.append(", searchType=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
