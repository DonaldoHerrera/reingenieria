package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class Zb extends Sa<String> implements Yb, RandomAccess {
    private static final Zb b;
    private static final Yb c = b;
    private final List<Object> d;

    static {
        Zb zb = new Zb();
        b = zb;
        zb.J();
    }

    public Zb() {
        this(10);
    }

    public final /* bridge */ /* synthetic */ boolean K() {
        return super.K();
    }

    public final Yb R() {
        return K() ? new C0930bd(this) : this;
    }

    public final List<?> S() {
        return Collections.unmodifiableList(this.d);
    }

    public final void a(Ya ya) {
        c();
        this.d.add(ya);
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

    public final /* synthetic */ Ob d(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.d);
            return new Zb(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.d.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Ya) {
            Ya ya = (Ya) obj;
            String f = ya.f();
            if (ya.g()) {
                this.d.set(i, f);
            }
            return f;
        }
        byte[] bArr = (byte[]) obj;
        String c2 = Hb.c(bArr);
        if (Hb.b(bArr)) {
            this.d.set(i, c2);
        }
        return c2;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final Object l(int i) {
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

    public Zb(int i) {
        this(new ArrayList<>(i));
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        c();
        if (collection instanceof Yb) {
            collection = ((Yb) collection).S();
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

    private Zb(ArrayList<Object> arrayList) {
        this.d = arrayList;
    }

    private static String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Ya) {
            return ((Ya) obj).f();
        }
        return Hb.c((byte[]) obj);
    }
}
