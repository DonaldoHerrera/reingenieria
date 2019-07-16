package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: Uaa reason: default package */
/* compiled from: TrackChangedEvent.kt */
public final class Uaa {
    private final Map<C3508cda, C3509cea> a;
    private final Collection<C3509cea> b;

    public Uaa(Collection<C3509cea> collection) {
        C7471uYa.b(collection, "tracks");
        this.b = collection;
        Collection<C3509cea> collection2 = this.b;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) collection2, 10));
        for (C3509cea cea : collection2) {
            arrayList.add(NVa.a(cea.y(), cea));
        }
        this.a = LWa.a((Iterable) arrayList);
    }

    public final Map<C3508cda, C3509cea> a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.b, (java.lang.Object) ((defpackage.Uaa) r2).b) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Uaa) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Collection<C3509cea> collection = this.b;
        if (collection != null) {
            return collection.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackChangedEvent(tracks=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
