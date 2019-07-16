package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;

/* compiled from: UserDetailsPresenter.kt */
public final class Gb extends C5797ib {
    private final C3508cda b;
    private final SearchQuerySourceInfo c;
    private final Long d;
    private final Long e;

    public Gb(C3508cda cda, SearchQuerySourceInfo searchQuerySourceInfo, Long l, Long l2) {
        C7471uYa.b(cda, "userUrn");
        super(null);
        this.b = cda;
        this.c = searchQuerySourceInfo;
        this.d = l;
        this.e = l2;
    }

    public final Long a() {
        return this.d;
    }

    public final Long b() {
        return this.e;
    }

    public final SearchQuerySourceInfo c() {
        return this.c;
    }

    public final C3508cda d() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.e, (java.lang.Object) r3.e) != false) goto L_0x0033;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Gb) {
                Gb gb = (Gb) obj;
                if (C7471uYa.a((Object) this.b, (Object) gb.b)) {
                    if (C7471uYa.a((Object) this.c, (Object) gb.c)) {
                        if (C7471uYa.a((Object) this.d, (Object) gb.d)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3508cda cda = this.b;
        int i = 0;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        SearchQuerySourceInfo searchQuerySourceInfo = this.c;
        int hashCode2 = (hashCode + (searchQuerySourceInfo != null ? searchQuerySourceInfo.hashCode() : 0)) * 31;
        Long l = this.d;
        int hashCode3 = (hashCode2 + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.e;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserFollowsItem(userUrn=");
        sb.append(this.b);
        sb.append(", searchQuerySourceInfo=");
        sb.append(this.c);
        sb.append(", followersCount=");
        sb.append(this.d);
        sb.append(", followingCount=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ Gb(C3508cda cda, SearchQuerySourceInfo searchQuerySourceInfo, Long l, Long l2, int i, C7264rYa rya) {
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            l2 = null;
        }
        this(cda, searchQuerySourceInfo, l, l2);
    }
}
