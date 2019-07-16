package defpackage;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: Tv reason: default package and case insensitive filesystem */
abstract class C0260Tv<E> extends AbstractList<E> implements C0213Hw<E> {
    private boolean a = true;

    C0260Tv() {
    }

    public boolean N() {
        return this.a;
    }

    public final void O() {
        this.a = false;
    }

    public boolean add(E e) {
        c();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        c();
        return super.addAll(collection);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        c();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean remove(Object obj) {
        c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        c();
        return super.retainAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        c();
        return super.addAll(i, collection);
    }
}
