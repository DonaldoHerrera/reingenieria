package com.soundcloud.android.search;

/* renamed from: com.soundcloud.android.search.w reason: case insensitive filesystem */
/* compiled from: SearchPlaylistItem.kt */
public final class C5940w implements Wca {
    private final C3863rda a;
    private final C4928GKa<C3508cda> b;
    private final C3508cda c;
    private final C4928GKa<String> d;
    private final C5941x e;

    public C5940w(C3863rda rda, C4928GKa<C3508cda> gKa, C3508cda cda, C4928GKa<String> gKa2, C5941x xVar) {
        C7471uYa.b(rda, "playlistItem");
        C7471uYa.b(gKa, "queryUrn");
        C7471uYa.b(cda, "urn");
        C7471uYa.b(gKa2, "imageUrlTemplate");
        this.a = rda;
        this.b = gKa;
        this.c = cda;
        this.d = gKa2;
        this.e = xVar;
    }

    public C3508cda a() {
        return this.c;
    }

    public C4928GKa<String> b() {
        return this.d;
    }

    public final C5941x c() {
        return this.e;
    }

    public final C3863rda d() {
        return this.a;
    }

    public final C4928GKa<C3508cda> e() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.e, (java.lang.Object) r3.e) != false) goto L_0x0045;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5940w) {
                C5940w wVar = (C5940w) obj;
                if (C7471uYa.a((Object) this.a, (Object) wVar.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) wVar.b)) {
                        if (C7471uYa.a((Object) a(), (Object) wVar.a())) {
                            if (C7471uYa.a((Object) b(), (Object) wVar.b())) {
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
        C3863rda rda = this.a;
        int i = 0;
        int hashCode = (rda != null ? rda.hashCode() : 0) * 31;
        C4928GKa<C3508cda> gKa = this.b;
        int hashCode2 = (hashCode + (gKa != null ? gKa.hashCode() : 0)) * 31;
        C3508cda a2 = a();
        int hashCode3 = (hashCode2 + (a2 != null ? a2.hashCode() : 0)) * 31;
        C4928GKa b2 = b();
        int hashCode4 = (hashCode3 + (b2 != null ? b2.hashCode() : 0)) * 31;
        C5941x xVar = this.e;
        if (xVar != null) {
            i = xVar.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SearchPlaylistItem(playlistItem=");
        sb.append(this.a);
        sb.append(", queryUrn=");
        sb.append(this.b);
        sb.append(", urn=");
        sb.append(a());
        sb.append(", imageUrlTemplate=");
        sb.append(b());
        sb.append(", clickItemClickParams=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C5940w(C3863rda rda, C4928GKa gKa, C3508cda cda, C4928GKa gKa2, C5941x xVar, int i, C7264rYa rya) {
        if ((i & 4) != 0) {
            cda = rda.a();
            C7471uYa.a((Object) cda, "playlistItem.urn");
        }
        C3508cda cda2 = cda;
        if ((i & 8) != 0) {
            gKa2 = rda.b();
            C7471uYa.a((Object) gKa2, "playlistItem.imageUrlTemplate");
        }
        C4928GKa gKa3 = gKa2;
        if ((i & 16) != 0) {
            xVar = null;
        }
        this(rda, gKa, cda2, gKa3, xVar);
    }
}
