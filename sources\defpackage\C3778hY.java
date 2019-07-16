package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* renamed from: hY reason: default package and case insensitive filesystem */
/* compiled from: DiscoveryCardSyncer */
class C3778hY implements Callable<Boolean> {
    private final dfa a;
    private final C3898wY b;
    private final C3768fea c;
    private final C3800jea d;

    C3778hY(dfa dfa, C3898wY wYVar, C3768fea fea, C3800jea jea) {
        this.a = dfa;
        this.b = wYVar;
        this.c = fea;
        this.d = jea;
    }

    public /* synthetic */ void a(C3441MX mx) {
        a(mx.a().b(), mx.a().d());
    }

    private void a(Yda yda, C3776gea gea) {
        this.c.a(Collections.singleton(yda));
        if (gea != null) {
            this.d.b(Collections.singleton(gea));
        }
    }

    public Boolean call() throws Exception {
        Pca pca = (Pca) this.a.a(hfa.b(C2226PO.DISCOVERY_CARDS.a()).c().b(), (C4990IKa<ResourceType>) new C3770gY<ResourceType>(this));
        this.b.a(pca);
        Iterator it = pca.iterator();
        while (it.hasNext()) {
            ((C3435KX) it.next()).b().a((C7733yKa<? super T>) new C3753eX<Object>(this));
        }
        return Boolean.valueOf(true);
    }
}
