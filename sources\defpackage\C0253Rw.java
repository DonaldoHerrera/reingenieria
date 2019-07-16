package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: Rw reason: default package and case insensitive filesystem */
public final class C0253Rw extends C0260Tv<String> implements C0249Qw, RandomAccess {
    private static final C0253Rw b;
    private static final C0249Qw c = b;
    private final List<Object> d;

    static {
        C0253Rw rw = new C0253Rw();
        b = rw;
        rw.O();
    }

    public C0253Rw() {
        this(10);
    }

    public final /* bridge */ /* synthetic */ boolean N() {
        return super.N();
    }

    public final void a(C0289Zv zv) {
        c();
        this.d.add(zv);
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

    public final C0249Qw b() {
        return N() ? new Tx(this) : this;
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
        if (obj instanceof C0289Zv) {
            C0289Zv zv = (C0289Zv) obj;
            String a = zv.a(C0209Gw.a);
            if (zv.f()) {
                this.d.set(i, a);
            }
            return a;
        }
        byte[] bArr = (byte[]) obj;
        String c2 = C0209Gw.c(bArr);
        if (C0209Gw.b(bArr)) {
            this.d.set(i, c2);
        }
        return c2;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
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

    public C0253Rw(int i) {
        this(new ArrayList<>(i));
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        c();
        if (collection instanceof C0249Qw) {
            collection = ((C0249Qw) collection).a();
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

    private C0253Rw(ArrayList<Object> arrayList) {
        this.d = arrayList;
    }

    public final /* synthetic */ C0213Hw b(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.d);
            return new C0253Rw(arrayList);
        }
        throw new IllegalArgumentException();
    }

    private static String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C0289Zv) {
            return ((C0289Zv) obj).a(C0209Gw.a);
        }
        return C0209Gw.c((byte[]) obj);
    }

    public final List<?> a() {
        return Collections.unmodifiableList(this.d);
    }
}
