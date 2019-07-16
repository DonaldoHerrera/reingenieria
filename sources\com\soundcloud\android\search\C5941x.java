package com.soundcloud.android.search;

import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;

/* renamed from: com.soundcloud.android.search.x reason: case insensitive filesystem */
/* compiled from: SearchPlaylistItem.kt */
public final class C5941x {
    private final C3508cda a;
    private final Yca b;
    private final SearchQuerySourceInfo c;
    private final La d;

    public C5941x(C3508cda cda, Yca yca, SearchQuerySourceInfo searchQuerySourceInfo, La la) {
        C7471uYa.b(cda, "playlist");
        C7471uYa.b(yca, "screen");
        C7471uYa.b(searchQuerySourceInfo, "searchQuerySourceInfo");
        C7471uYa.b(la, "searchType");
        this.a = cda;
        this.b = yca;
        this.c = searchQuerySourceInfo;
        this.d = la;
    }

    public final C3508cda a() {
        return this.a;
    }

    public final SearchQuerySourceInfo b() {
        return this.c;
    }

    public final La c() {
        return this.d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.d, (java.lang.Object) r3.d) != false) goto L_0x0033;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5941x) {
                C5941x xVar = (C5941x) obj;
                if (C7471uYa.a((Object) this.a, (Object) xVar.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) xVar.b)) {
                        if (C7471uYa.a((Object) this.c, (Object) xVar.c)) {
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
        sb.append("SearchPlaylistItemClickParams(playlist=");
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
