package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: Ura reason: default package and case insensitive filesystem */
/* compiled from: Singles.kt */
public final class C5365Ura<T1, T2, R> implements C6504gQa<List<? extends C3863rda>, Set<? extends C3508cda>, R> {
    final /* synthetic */ C4909Fra a;

    public C5365Ura(C4909Fra fra) {
        this.a = fra;
    }

    public final R apply(List<? extends C3863rda> list, Set<? extends C3508cda> set) {
        Set set2 = set;
        List<C3863rda> list2 = list;
        C7471uYa.a((Object) list2, "playlists");
        R arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list2, 10));
        for (C3863rda rda : list2) {
            C3508cda a2 = rda.a();
            String str = "it.urn";
            C7471uYa.a((Object) a2, str);
            String B = rda.B();
            C7471uYa.a((Object) B, "it.title()");
            int L = rda.L();
            boolean m = rda.m();
            C4909Fra fra = this.a;
            C3815lda e = fra.m;
            C3508cda a3 = rda.a();
            C7471uYa.a((Object) a3, str);
            a aVar = new a(a2, B, L, m, fra.a(e, a3), set2.contains(rda.a()), false, 64, null);
            arrayList.add(aVar);
        }
        return arrayList;
    }
}
