package com.soundcloud.android.stream;

import java.util.List;

/* compiled from: StreamItem.kt */
public final class ub {
    private final tb a;
    private final List<C6109va> b;

    public ub(tb tbVar, List<? extends C6109va> list) {
        C7471uYa.b(tbVar, "clickedItem");
        C7471uYa.b(list, "allItems");
        this.a = tbVar;
        this.b = list;
    }

    public final int a() {
        return this.b.indexOf(this.a);
    }

    public final List<C6109va> b() {
        return this.b;
    }

    public final tb c() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ub) {
                ub ubVar = (ub) obj;
                if (C7471uYa.a((Object) this.a, (Object) ubVar.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        tb tbVar = this.a;
        int i = 0;
        int hashCode = (tbVar != null ? tbVar.hashCode() : 0) * 31;
        List<C6109va> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackStreamItemClickParams(clickedItem=");
        sb.append(this.a);
        sb.append(", allItems=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
