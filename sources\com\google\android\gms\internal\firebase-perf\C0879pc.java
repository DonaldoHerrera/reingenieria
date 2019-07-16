package com.google.android.gms.internal.firebase-perf;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-perf.pc reason: case insensitive filesystem */
final class C0879pc<E> extends Na<E> {
    private static final C0879pc<Object> b;
    private final List<E> c;

    static {
        C0879pc<Object> pcVar = new C0879pc<>(new ArrayList(0));
        b = pcVar;
        pcVar.M();
    }

    private C0879pc(List<E> list) {
        this.c = list;
    }

    public static <E> C0879pc<E> d() {
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

    public final /* synthetic */ Ab i(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.c);
            return new C0879pc(arrayList);
        }
        throw new IllegalArgumentException();
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
