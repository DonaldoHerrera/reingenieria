package defpackage;

import com.soundcloud.android.foundation.playqueue.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: cca reason: default package and case insensitive filesystem */
/* compiled from: PlayQueueCleanupHelper.kt */
public final class C3507cca extends Xda {
    private final String a = "PlayQueue";
    private final C3846pca b;

    public C3507cca(C3846pca pca) {
        C7471uYa.b(pca, "playQueueStorage");
        this.b = pca;
    }

    private final List<C3508cda> d() {
        Object b2 = this.b.d().b();
        C7471uYa.a(b2, "playQueueStorage.loadPla…ueueItems().blockingGet()");
        Iterable<t> iterable = (Iterable) b2;
        ArrayList arrayList = new ArrayList();
        for (t tVar : iterable) {
            C7471uYa.a((Object) tVar, "it");
            C7331sWa.a((Collection) arrayList, (Iterable) C6918mWa.b((Object[]) new C3508cda[]{tVar.n(), tVar.c(), tVar.o(), tVar.q()}));
        }
        return arrayList;
    }

    public Set<C3508cda> a() {
        List d = d();
        ArrayList arrayList = new ArrayList();
        for (Object next : d) {
            C3508cda cda = (C3508cda) next;
            C7471uYa.a((Object) cda, "it");
            if (cda.J()) {
                arrayList.add(next);
            }
        }
        return C7676xWa.t(arrayList);
    }

    public Set<C3508cda> b() {
        List d = d();
        ArrayList arrayList = new ArrayList();
        for (Object next : d) {
            C3508cda cda = (C3508cda) next;
            C7471uYa.a((Object) cda, "it");
            if (cda.u()) {
                arrayList.add(next);
            }
        }
        return C7676xWa.t(arrayList);
    }

    public Set<C3508cda> c() {
        List d = d();
        ArrayList arrayList = new ArrayList();
        for (Object next : d) {
            C3508cda cda = (C3508cda) next;
            C7471uYa.a((Object) cda, "it");
            if (cda.x()) {
                arrayList.add(next);
            }
        }
        return C7676xWa.t(arrayList);
    }

    public String getKey() {
        return this.a;
    }
}
