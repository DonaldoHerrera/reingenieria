package com.soundcloud.android.search;

/* compiled from: SearchUserItem.kt */
public final class Ma implements Wca {
    private final C4954HFa a;
    private final C4928GKa<C3508cda> b;
    private final C3508cda c;
    private final C4928GKa<String> d;
    private final Na e;
    private final Sa f;

    public Ma(C4954HFa hFa, C4928GKa<C3508cda> gKa, C3508cda cda, C4928GKa<String> gKa2, Na na, Sa sa) {
        C7471uYa.b(hFa, "userItem");
        C7471uYa.b(gKa, "queryUrn");
        C7471uYa.b(cda, "urn");
        C7471uYa.b(gKa2, "imageUrlTemplate");
        this.a = hFa;
        this.b = gKa;
        this.c = cda;
        this.d = gKa2;
        this.e = na;
        this.f = sa;
    }

    public C3508cda a() {
        return this.c;
    }

    public C4928GKa<String> b() {
        return this.d;
    }

    public final Na c() {
        return this.e;
    }

    public final Sa d() {
        return this.f;
    }

    public final C4954HFa e() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.f, (java.lang.Object) r3.f) != false) goto L_0x004f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Ma) {
                Ma ma = (Ma) obj;
                if (C7471uYa.a((Object) this.a, (Object) ma.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) ma.b)) {
                        if (C7471uYa.a((Object) a(), (Object) ma.a())) {
                            if (C7471uYa.a((Object) b(), (Object) ma.b())) {
                                if (C7471uYa.a((Object) this.e, (Object) ma.e)) {
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

    public int hashCode() {
        C4954HFa hFa = this.a;
        int i = 0;
        int hashCode = (hFa != null ? hFa.hashCode() : 0) * 31;
        C4928GKa<C3508cda> gKa = this.b;
        int hashCode2 = (hashCode + (gKa != null ? gKa.hashCode() : 0)) * 31;
        C3508cda a2 = a();
        int hashCode3 = (hashCode2 + (a2 != null ? a2.hashCode() : 0)) * 31;
        C4928GKa b2 = b();
        int hashCode4 = (hashCode3 + (b2 != null ? b2.hashCode() : 0)) * 31;
        Na na = this.e;
        int hashCode5 = (hashCode4 + (na != null ? na.hashCode() : 0)) * 31;
        Sa sa = this.f;
        if (sa != null) {
            i = sa.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SearchUserItem(userItem=");
        sb.append(this.a);
        sb.append(", queryUrn=");
        sb.append(this.b);
        sb.append(", urn=");
        sb.append(a());
        sb.append(", imageUrlTemplate=");
        sb.append(b());
        sb.append(", clickItemClickParams=");
        sb.append(this.e);
        sb.append(", toggleFollowParams=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ Ma(C4954HFa hFa, C4928GKa gKa, C3508cda cda, C4928GKa gKa2, Na na, Sa sa, int i, C7264rYa rya) {
        if ((i & 4) != 0) {
            cda = hFa.a();
        }
        C3508cda cda2 = cda;
        if ((i & 8) != 0) {
            gKa2 = hFa.b();
        }
        this(hFa, gKa, cda2, gKa2, (i & 16) != 0 ? null : na, (i & 32) != 0 ? null : sa);
    }
}
