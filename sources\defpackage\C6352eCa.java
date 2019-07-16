package defpackage;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/* renamed from: eCa reason: default package and case insensitive filesystem */
/* compiled from: FetchPostsCommand */
class C6352eCa extends C1317gT<C2226PO, NavigableSet<C6760kCa>, C6352eCa> {
    private final dfa b;

    C6352eCa(dfa dfa) {
        this.b = dfa;
    }

    public NavigableSet<C6760kCa> call() throws Exception {
        Pca pca = (Pca) this.b.a(hfa.b(((C2226PO) this.a).a()).c().b(), (C4990IKa<ResourceType>) new C6284dCa<ResourceType>(this));
        TreeSet treeSet = new TreeSet(C6760kCa.a);
        Iterator it = pca.iterator();
        while (it.hasNext()) {
            treeSet.add(((C5462YBa) it.next()).a());
        }
        return treeSet;
    }
}
