package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: bD reason: default package and case insensitive filesystem */
/* compiled from: AbstractMapBasedMultimap */
class C2457bD implements Iterator<K> {
    Entry<K, Collection<V>> a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ b c;

    C2457bD(b bVar, Iterator it) {
        this.c = bVar;
        this.b = it;
    }

    public boolean hasNext() {
        return this.b.hasNext();
    }

    public K next() {
        this.a = (Entry) this.b.next();
        return this.a.getKey();
    }

    public void remove() {
        C3044iD.a(this.a != null);
        Collection collection = (Collection) this.a.getValue();
        this.b.remove();
        C2438aD aDVar = C2438aD.this;
        aDVar.d = aDVar.d - collection.size();
        collection.clear();
        this.a = null;
    }
}
