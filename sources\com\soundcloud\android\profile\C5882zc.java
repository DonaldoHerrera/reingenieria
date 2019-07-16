package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;

/* renamed from: com.soundcloud.android.profile.zc reason: case insensitive filesystem */
/* compiled from: UserPlayableItem.kt */
public final class C5882zc {
    private final C3508cda a;
    private final SearchQuerySourceInfo b;

    public C5882zc(C3508cda cda, SearchQuerySourceInfo searchQuerySourceInfo) {
        C7471uYa.b(cda, "playlist");
        this.a = cda;
        this.b = searchQuerySourceInfo;
    }

    public final C3508cda a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5882zc) {
                C5882zc zcVar = (C5882zc) obj;
                if (C7471uYa.a((Object) this.a, (Object) zcVar.a)) {
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
        SearchQuerySourceInfo searchQuerySourceInfo = this.b;
        if (searchQuerySourceInfo != null) {
            i = searchQuerySourceInfo.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserPlaylistsItemClickParams(playlist=");
        sb.append(this.a);
        sb.append(", searchQuerySourceInfo=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
