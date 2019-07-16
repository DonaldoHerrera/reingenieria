package com.google.android.gms.internal.clearcut;

import java.util.ArrayList;
import java.util.List;

final class Ya<E> extends C0792t<E> {
    private static final Ya<Object> b;
    private final List<E> c;

    static {
        Ya<Object> ya = new Ya<>();
        b = ya;
        ya.zzv();
    }

    Ya() {
        this(new ArrayList(10));
    }

    private Ya(List<E> list) {
        this.c = list;
    }

    public static <E> Ya<E> d() {
        return b;
    }

    public final /* synthetic */ C0770la a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.c);
            return new Ya(arrayList);
        }
        throw new IllegalArgumentException();
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
}
