package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: Pw reason: default package and case insensitive filesystem */
final class C0245Pw<K> implements Iterator<Entry<K, Object>> {
    private Iterator<Entry<K, Object>> a;

    public C0245Pw(Iterator<Entry<K, Object>> it) {
        this.a = it;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.a.next();
        return entry.getValue() instanceof C0229Lw ? new C0233Mw(entry) : entry;
    }

    public final void remove() {
        this.a.remove();
    }
}
