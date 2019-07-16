package com.soundcloud.android.features.library.downloads;

import com.soundcloud.android.collections.data.C2852h;
import com.soundcloud.android.collections.data.C2862s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.soundcloud.android.features.library.downloads.h reason: case insensitive filesystem */
/* compiled from: DownloadsDataSource.kt */
final class C3574h<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ C3575i a;
    final /* synthetic */ List b;

    C3574h(C3575i iVar, List list) {
        this.a = iVar;
        this.b = list;
    }

    /* renamed from: a */
    public final APa<List<s>> apply(HVa<? extends List<C2862s>, ? extends List<C2862s>> hVa) {
        C7471uYa.b(hVa, "<name for destructuring parameter 0>");
        List list = (List) hVa.a();
        List list2 = (List) hVa.b();
        C5604aua b2 = this.a.a.d;
        List list3 = this.b;
        C7471uYa.a((Object) list3, "playlistPosts");
        List c = C7676xWa.c((Collection) list3, (Iterable) list2);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : c) {
            if (hashSet.add(((C2852h) next).a())) {
                arrayList.add(next);
            }
        }
        return a.a(b2, C7676xWa.a((Iterable) C7676xWa.c((Collection) list, (Iterable) arrayList), (Comparator) new C3571e()), C3573g.a, null, C3572f.a, true, 4, null);
    }
}
