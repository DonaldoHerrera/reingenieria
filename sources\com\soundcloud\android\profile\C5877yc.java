package com.soundcloud.android.profile;

/* renamed from: com.soundcloud.android.profile.yc reason: case insensitive filesystem */
/* compiled from: UserPlayableItem.kt */
public final class C5877yc implements C5818mc {
    private final C3508cda a;
    private final C3863rda b;
    private final C5882zc c;
    private final C3508cda d;

    public C5877yc(C3863rda rda, C5882zc zcVar, C3508cda cda) {
        C7471uYa.b(rda, "playlistsItem");
        C7471uYa.b(zcVar, "clickParams");
        this.b = rda;
        this.c = zcVar;
        this.d = cda;
        C3508cda a2 = this.b.a();
        C7471uYa.a((Object) a2, "playlistsItem.urn");
        this.a = a2;
    }

    public C3508cda a() {
        return this.a;
    }

    public final C5882zc b() {
        return this.c;
    }

    public final C3863rda c() {
        return this.b;
    }

    public final C3508cda d() {
        return this.d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.d, (java.lang.Object) r3.d) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5877yc) {
                C5877yc ycVar = (C5877yc) obj;
                if (C7471uYa.a((Object) this.b, (Object) ycVar.b)) {
                    if (C7471uYa.a((Object) this.c, (Object) ycVar.c)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3863rda rda = this.b;
        int i = 0;
        int hashCode = (rda != null ? rda.hashCode() : 0) * 31;
        C5882zc zcVar = this.c;
        int hashCode2 = (hashCode + (zcVar != null ? zcVar.hashCode() : 0)) * 31;
        C3508cda cda = this.d;
        if (cda != null) {
            i = cda.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserPlaylistsItem(playlistsItem=");
        sb.append(this.b);
        sb.append(", clickParams=");
        sb.append(this.c);
        sb.append(", queryUrn=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
