package com.soundcloud.android.stream;

import java.util.List;

/* compiled from: StreamViewModel.kt */
public final class sb {
    private final List<C6109va> a;
    private final int b;

    public sb() {
        this(null, 0, 3, null);
    }

    public sb(List<? extends C6109va> list, int i) {
        C7471uYa.b(list, "streamItems");
        this.a = list;
        this.b = i;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.soundcloud.android.stream.va>, for r1v0, types: [java.util.List] */
    public static /* synthetic */ sb a(sb sbVar, List<C6109va> list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = sbVar.a;
        }
        if ((i2 & 2) != 0) {
            i = sbVar.b;
        }
        return sbVar.a(list, i);
    }

    public final int a() {
        return this.b;
    }

    public final sb a(List<? extends C6109va> list, int i) {
        C7471uYa.b(list, "streamItems");
        return new sb(list, i);
    }

    public final List<C6109va> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sb) {
                sb sbVar = (sb) obj;
                if (C7471uYa.a((Object) this.a, (Object) sbVar.a)) {
                    if (this.b == sbVar.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<C6109va> list = this.a;
        return ((list != null ? list.hashCode() : 0) * 31) + this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StreamViewModel(streamItems=");
        sb.append(this.a);
        sb.append(", newItemsCount=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ sb(List list, int i, int i2, C7264rYa rya) {
        if ((i2 & 1) != 0) {
            list = C6918mWa.a();
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        this(list, i);
    }
}
