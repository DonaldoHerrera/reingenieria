package com.soundcloud.android.offline;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.soundcloud.android.properties.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.soundcloud.android.offline.uc reason: case insensitive filesystem */
/* compiled from: LoadOfflineContentUpdatesCommand */
class C4175uc extends C1255eT<C4157rc, Id> {
    private final De a;

    public C4175uc(De de) {
        this.a = de;
    }

    private static <T> Collection<T> b(Collection<T> collection, Collection<T>... collectionArr) {
        ArrayList arrayList = new ArrayList(collection);
        for (Collection<T> removeAll : collectionArr) {
            arrayList.removeAll(removeAll);
        }
        return arrayList;
    }

    private List<C3508cda> d() {
        return (List) this.a.e().b();
    }

    private List<C3508cda> e() {
        return (List) this.a.c().b();
    }

    private List<C3508cda> f() {
        return (List) this.a.b().b();
    }

    private List<C3508cda> g() {
        return (List) this.a.g().b();
    }

    private static <T> Collection<T> a(Collection<T> collection, Collection<T>... collectionArr) {
        ArrayList arrayList = new ArrayList(collection);
        for (Collection<T> addAll : collectionArr) {
            arrayList.addAll(addAll);
        }
        return arrayList;
    }

    static /* synthetic */ boolean b(C4146pc pcVar) {
        return !pcVar.k() || pcVar.j();
    }

    public Id a(C4157rc rcVar) {
        Collection<C4146pc> collection = rcVar.c;
        ArrayList a2 = C2063HD.a((Iterable<? extends E>) C3063jD.a(collection, (Predicate<? super E>) B.a));
        List e = e();
        List f = f();
        List d = d();
        List g = g();
        Collection a3 = a((Collection<C4146pc>) a2);
        Collection a4 = a(a3, (Collection<C3508cda>) d);
        Collection a5 = a(a3, e, f, a4);
        Collection a6 = a(C3063jD.a(collection, (Predicate<? super E>) C.a));
        Collection a7 = a((Collection<C4146pc>) a2, f, a4);
        HashSet hashSet = new HashSet(C3063jD.a((Collection) this.a.f().b(), (Predicate<? super E>) new D<Object>(a4)));
        List a8 = a(collection, f, (Collection<C3508cda>) g, (Collection<C3508cda>) e);
        if (j.g()) {
            b a9 = SDb.a("ScDownloads");
            StringBuilder sb = new StringBuilder();
            sb.append("Calculated offline updates: [request count = ");
            sb.append(rcVar.c.size());
            sb.append("], [unavailableTracks = ");
            sb.append(a6.size());
            sb.append("], [tracksToDownload = ");
            sb.append(a7.size());
            sb.append("], [newTracksToDownload = ");
            sb.append(a5.size());
            sb.append("], [tracksToRestore = ");
            sb.append(a4.size());
            sb.append("], [tracksToMarkForDeletion = ");
            sb.append(a8.size());
            sb.append("], [tracksToDelete = ");
            sb.append(hashSet.size());
            sb.append("]");
            a9.a(sb.toString(), new Object[0]);
        }
        return Id.a().e(C2063HD.a((Iterable<? extends E>) a6)).b(C2063HD.a((Iterable<? extends E>) a7)).a((List<C3508cda>) C2063HD.a((Iterable<? extends E>) a5)).d(C2063HD.a((Iterable<? extends E>) a4)).c(a8).a((Set<C3508cda>) hashSet).a(rcVar).a();
    }

    static /* synthetic */ boolean a(C4146pc pcVar) {
        return pcVar.k() && !pcVar.j();
    }

    static /* synthetic */ boolean a(Collection collection, C3508cda cda) {
        return !collection.contains(cda);
    }

    private List<C3508cda> a(Collection<C4146pc> collection, List<C3508cda> list, Collection<C3508cda> collection2, Collection<C3508cda> collection3) {
        return C2063HD.a((Iterable<? extends E>) b(a((Collection<T>) list, (Collection<T>[]) new Collection[]{collection3, collection2}), a(collection)));
    }

    private Collection<C3508cda> a(Collection<C4146pc> collection) {
        return C3063jD.a(collection, (Function<? super F, T>) Ya.a);
    }

    private Collection<C3508cda> a(Collection<C3508cda> collection, Collection<C3508cda> collection2) {
        collection2.getClass();
        return C3063jD.a(collection, (Predicate<? super E>) new C4109jb<Object>(collection2));
    }

    private Collection<C3508cda> a(Collection<C3508cda> collection, List<C3508cda> list, List<C3508cda> list2, Collection<C3508cda> collection2) {
        return C3063jD.a(collection, (Predicate<? super E>) new E<Object>(list, list2, collection2));
    }

    static /* synthetic */ boolean a(List list, List list2, Collection collection, C3508cda cda) {
        return !list.contains(cda) && !list2.contains(cda) && !collection.contains(cda);
    }

    private Collection<C4146pc> a(Collection<C4146pc> collection, List<C3508cda> list, Collection<C3508cda> collection2) {
        return C3063jD.a(collection, (Predicate<? super E>) new F<Object>(list, collection2));
    }

    static /* synthetic */ boolean a(List list, Collection collection, C4146pc pcVar) {
        return !list.contains(pcVar.a()) && !collection.contains(pcVar.a());
    }
}
