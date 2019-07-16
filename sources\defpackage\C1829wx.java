package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: wx reason: default package and case insensitive filesystem */
final class C1829wx<E> extends C0260Tv<E> {
    private static final C1829wx<Object> b;
    private final List<E> c;

    static {
        C1829wx<Object> wxVar = new C1829wx<>(new ArrayList(0));
        b = wxVar;
        wxVar.O();
    }

    private C1829wx(List<E> list) {
        this.c = list;
    }

    public static <E> C1829wx<E> d() {
        return b;
    }

    public final void add(int i, E e) {
        c();
        this.c.add(i, e);
        this.modCount++;
    }

    public final /* synthetic */ C0213Hw b(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.c);
            return new C1829wx(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i) {
        return this.c.get(i);
    }

    public final E remove(int i) {
        c();
        E remove = this.c.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        c();
        E e2 = this.c.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.c.size();
    }
}
