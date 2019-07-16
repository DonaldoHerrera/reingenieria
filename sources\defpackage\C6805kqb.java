package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: kqb reason: default package and case insensitive filesystem */
/* compiled from: DescriptorUtils.kt */
final class C6805kqb<N> implements b<N> {
    public static final C6805kqb a = new C6805kqb();

    C6805kqb() {
    }

    public final List<C5061Kdb> a(C5061Kdb kdb) {
        C7471uYa.a((Object) kdb, "current");
        Collection<C5061Kdb> j = kdb.j();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) j, 10));
        for (C5061Kdb original : j) {
            arrayList.add(original.getOriginal());
        }
        return arrayList;
    }
}
