package com.soundcloud.android.features.library.likes.search;

import com.soundcloud.android.likes.V;
import com.soundcloud.android.tracks.C6185ma;

/* compiled from: TrackLikesSearchItem.kt */
public final class x {
    private final C6185ma a = this.c.b();
    private final String b;
    private final V c;

    public x(String str, V v) {
        C7471uYa.b(str, "query");
        C7471uYa.b(v, "searchItem");
        this.b = str;
        this.c = v;
    }

    public final String a() {
        return this.b;
    }

    public final V b() {
        return this.c;
    }

    public final C6185ma c() {
        return this.a;
    }

    public final int d() {
        return this.c.a().ordinal();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x) {
                x xVar = (x) obj;
                if (C7471uYa.a((Object) this.b, (Object) xVar.b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        V v = this.c;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackLikesSearchItem(query=");
        sb.append(this.b);
        sb.append(", searchItem=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    public final boolean a(x xVar) {
        C7471uYa.b(xVar, "second");
        return this.c.a(xVar.c);
    }
}
