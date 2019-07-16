package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;

/* renamed from: com.soundcloud.android.profile.mb reason: case insensitive filesystem */
/* compiled from: UserDetailsPresenter.kt */
public final class C5817mb {
    private final C3508cda a;
    private final SearchQuerySourceInfo b;

    public C5817mb(C3508cda cda, SearchQuerySourceInfo searchQuerySourceInfo) {
        C7471uYa.b(cda, "userUrn");
        this.a = cda;
        this.b = searchQuerySourceInfo;
    }

    public final SearchQuerySourceInfo a() {
        return this.b;
    }

    public final C3508cda b() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5817mb) {
                C5817mb mbVar = (C5817mb) obj;
                if (C7471uYa.a((Object) this.a, (Object) mbVar.a)) {
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
        sb.append("UserDetailsParams(userUrn=");
        sb.append(this.a);
        sb.append(", searchQuerySourceInfo=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
