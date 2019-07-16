package defpackage;

import java.util.Map.Entry;

/* renamed from: Mw reason: default package and case insensitive filesystem */
final class C0233Mw<K> implements Entry<K, Object> {
    private Entry<K, C0229Lw> a;

    private C0233Mw(Entry<K, C0229Lw> entry) {
        this.a = entry;
    }

    public final K getKey() {
        return this.a.getKey();
    }

    public final Object getValue() {
        if (((C0229Lw) this.a.getValue()) == null) {
            return null;
        }
        C0229Lw.a();
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C1403ix) {
            return ((C0229Lw) this.a.getValue()).a((C1403ix) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
