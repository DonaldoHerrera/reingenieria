package com.google.android.gms.internal.clearcut;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.ua reason: case insensitive filesystem */
public final class C0796ua extends C0792t<String> implements C0799va, RandomAccess {
    private static final C0796ua b;
    private static final C0799va c = b;
    private final List<Object> d;

    static {
        C0796ua uaVar = new C0796ua();
        b = uaVar;
        uaVar.zzv();
    }

    public C0796ua() {
        this(10);
    }

    public C0796ua(int i) {
        this(new ArrayList<>(i));
    }

    private C0796ua(ArrayList<Object> arrayList) {
        this.d = arrayList;
    }

    private static String a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof A ? ((A) obj).h() : C0761ia.c((byte[]) obj);
    }

    public final List<?> T() {
        return Collections.unmodifiableList(this.d);
    }

    public final C0799va V() {
        return zzu() ? new C0806xb(this) : this;
    }

    public final /* synthetic */ C0770la a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.d);
            return new C0796ua(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        c();
        this.d.add(i, str);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        c();
        if (collection instanceof C0799va) {
            collection = ((C0799va) collection).T();
        }
        boolean addAll = this.d.addAll(i, collection);
        this.modCount++;
        return addAll;
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
        if (obj instanceof A) {
            A a = (A) obj;
            String h = a.h();
            if (a.f()) {
                this.d.set(i, h);
            }
            return h;
        }
        byte[] bArr = (byte[]) obj;
        String c2 = C0761ia.c(bArr);
        if (C0761ia.b(bArr)) {
            this.d.set(i, c2);
        }
        return c2;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final Object j(int i) {
        return this.d.get(i);
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        Object remove = this.d.remove(i);
        this.modCount++;
        return a(remove);
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

    public final /* bridge */ /* synthetic */ boolean zzu() {
        return super.zzu();
    }
}
