package com.soundcloud.android.search;

import com.soundcloud.android.tracks.C6185ma;

/* compiled from: SearchTrackItem.kt */
public final class Da implements Wca {
    private final C6185ma a;
    private final C4928GKa<C3508cda> b;
    private final C3508cda c;
    private final C4928GKa<String> d;
    private final Ea e;

    public Da(C6185ma maVar, C4928GKa<C3508cda> gKa, C3508cda cda, C4928GKa<String> gKa2, Ea ea) {
        C7471uYa.b(maVar, "trackItem");
        C7471uYa.b(gKa, "queryUrn");
        C7471uYa.b(cda, "urn");
        C7471uYa.b(gKa2, "imageUrlTemplate");
        C7471uYa.b(ea, "trackItemClickParams");
        this.a = maVar;
        this.b = gKa;
        this.c = cda;
        this.d = gKa2;
        this.e = ea;
    }

    public C3508cda a() {
        return this.c;
    }

    public C4928GKa<String> b() {
        return this.d;
    }

    public final C4928GKa<C3508cda> c() {
        return this.b;
    }

    public final C6185ma d() {
        return this.a;
    }

    public final Ea e() {
        return this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.e, (java.lang.Object) r3.e) != false) goto L_0x0045;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Da) {
                Da da = (Da) obj;
                if (C7471uYa.a((Object) this.a, (Object) da.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) da.b)) {
                        if (C7471uYa.a((Object) a(), (Object) da.a())) {
                            if (C7471uYa.a((Object) b(), (Object) da.b())) {
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
        C6185ma maVar = this.a;
        int i = 0;
        int hashCode = (maVar != null ? maVar.hashCode() : 0) * 31;
        C4928GKa<C3508cda> gKa = this.b;
        int hashCode2 = (hashCode + (gKa != null ? gKa.hashCode() : 0)) * 31;
        C3508cda a2 = a();
        int hashCode3 = (hashCode2 + (a2 != null ? a2.hashCode() : 0)) * 31;
        C4928GKa b2 = b();
        int hashCode4 = (hashCode3 + (b2 != null ? b2.hashCode() : 0)) * 31;
        Ea ea = this.e;
        if (ea != null) {
            i = ea.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SearchTrackItem(trackItem=");
        sb.append(this.a);
        sb.append(", queryUrn=");
        sb.append(this.b);
        sb.append(", urn=");
        sb.append(a());
        sb.append(", imageUrlTemplate=");
        sb.append(b());
        sb.append(", trackItemClickParams=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ Da(C6185ma maVar, C4928GKa gKa, C3508cda cda, C4928GKa gKa2, Ea ea, int i, C7264rYa rya) {
        if ((i & 4) != 0) {
            cda = maVar.a();
            C7471uYa.a((Object) cda, "trackItem.urn");
        }
        C3508cda cda2 = cda;
        if ((i & 8) != 0) {
            gKa2 = maVar.b();
            C7471uYa.a((Object) gKa2, "trackItem.imageUrlTemplate");
        }
        this(maVar, gKa, cda2, gKa2, ea);
    }
}
