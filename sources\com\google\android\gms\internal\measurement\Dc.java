package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

final class Dc<E> extends Sa<E> {
    private static final Dc<Object> b;
    private final List<E> c;

    static {
        Dc<Object> dc = new Dc<>(new ArrayList(0));
        b = dc;
        dc.J();
    }

    private Dc(List<E> list) {
        this.c = list;
    }

    public static <E> Dc<E> d() {
        return b;
    }

    public final void add(int i, E e) {
        c();
        this.c.add(i, e);
        this.modCount++;
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

    public final /* synthetic */ Ob d(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.c);
            return new Dc(arrayList);
        }
        throw new IllegalArgumentException();
    }
}
