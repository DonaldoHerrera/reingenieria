package com.google.android.gms.internal.firebase-perf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class Mb extends Na<String> implements Lb, RandomAccess {
    private static final Mb b;
    private static final Lb c = b;
    private final List<Object> d;

    static {
        Mb mb = new Mb();
        b = mb;
        mb.M();
    }

    public Mb() {
        this(10);
    }

    public final /* bridge */ /* synthetic */ boolean L() {
        return super.L();
    }

    public final Lb U() {
        return L() ? new Pc(this) : this;
    }

    public final List<?> W() {
        return Collections.unmodifiableList(this.d);
    }

    public final void a(Oa oa) {
        c();
        this.d.add(oa);
        this.modCount++;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        c();
        this.d.add(i, str);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        c();
        this.d.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.d.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Oa) {
            Oa oa = (Oa) obj;
            String f = oa.f();
            if (oa.g()) {
                this.d.set(i, f);
            }
            return f;
        }
        byte[] bArr = (byte[]) obj;
        String c2 = C0897ub.c(bArr);
        if (C0897ub.b(bArr)) {
            this.d.set(i, c2);
        }
        return c2;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* synthetic */ Ab i(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.d);
            return new Mb(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final Object j(int i) {
        return this.d.get(i);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        c();
        return a(this.d.set(i, str));
    }

    public final int size() {
        return this.d.size();
    }

    public Mb(int i) {
        this(new ArrayList<>(i));
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        c();
        if (collection instanceof Lb) {
            collection = ((Lb) collection).W();
        }
        boolean addAll = this.d.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        Object remove = this.d.remove(i);
        this.modCount++;
        return a(remove);
    }

    private Mb(ArrayList<Object> arrayList) {
        this.d = arrayList;
    }

    private static String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Oa) {
            return ((Oa) obj).f();
        }
        return C0897ub.c((byte[]) obj);
    }
}
