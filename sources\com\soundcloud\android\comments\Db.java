package com.soundcloud.android.comments;

import java.util.List;

/* compiled from: TrackCommentOperations.kt */
public final class Db {
    private final C3509cea a;
    private final List<C3791ida> b;
    private final IPa<Db> c;

    public Db(C3509cea cea, List<C3791ida> list, IPa<Db> iPa) {
        C7471uYa.b(cea, "track");
        C7471uYa.b(list, "comments");
        this.a = cea;
        this.b = list;
        this.c = iPa;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=IPa, code=IPa<com.soundcloud.android.comments.Db>, for r3v0, types: [IPa] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<ida>, for r2v0, types: [java.util.List] */
    public static /* synthetic */ Db a(Db db, C3509cea cea, List<C3791ida> list, IPa<Db> iPa, int i, Object obj) {
        if ((i & 1) != 0) {
            cea = db.a;
        }
        if ((i & 2) != 0) {
            list = db.b;
        }
        if ((i & 4) != 0) {
            iPa = db.c;
        }
        return db.a(cea, list, iPa);
    }

    public final Db a(C3509cea cea, List<C3791ida> list, IPa<Db> iPa) {
        C7471uYa.b(cea, "track");
        C7471uYa.b(list, "comments");
        return new Db(cea, list, iPa);
    }

    public final List<C3791ida> a() {
        return this.b;
    }

    public final IPa<Db> b() {
        return this.c;
    }

    public final C3509cea c() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Db) {
                Db db = (Db) obj;
                if (C7471uYa.a((Object) this.a, (Object) db.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) db.b)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3509cea cea = this.a;
        int i = 0;
        int hashCode = (cea != null ? cea.hashCode() : 0) * 31;
        List<C3791ida> list = this.b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        IPa<Db> iPa = this.c;
        if (iPa != null) {
            i = iPa.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackCommentsResponse(track=");
        sb.append(this.a);
        sb.append(", comments=");
        sb.append(this.b);
        sb.append(", next=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ Db(C3509cea cea, List list, IPa iPa, int i, C7264rYa rya) {
        if ((i & 2) != 0) {
            list = C6918mWa.a();
        }
        if ((i & 4) != 0) {
            iPa = null;
        }
        this(cea, list, iPa);
    }
}
