package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: KUa reason: default package */
/* compiled from: VolatileSizeArrayList */
public final class KUa<T> extends AtomicInteger implements List<T>, RandomAccess {
    final ArrayList<T> a = new ArrayList<>();

    public boolean add(T t) {
        boolean add = this.a.add(t);
        lazySet(this.a.size());
        return add;
    }

    public boolean addAll(Collection<? extends T> collection) {
        boolean addAll = this.a.addAll(collection);
        lazySet(this.a.size());
        return addAll;
    }

    public void clear() {
        this.a.clear();
        lazySet(0);
    }

    public boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.a.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (obj instanceof KUa) {
            return this.a.equals(((KUa) obj).a);
        }
        return this.a.equals(obj);
    }

    public T get(int i) {
        return this.a.get(i);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public int indexOf(Object obj) {
        return this.a.indexOf(obj);
    }

    public boolean isEmpty() {
        return get() == 0;
    }

    public Iterator<T> iterator() {
        return this.a.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.a.lastIndexOf(obj);
    }

    public ListIterator<T> listIterator() {
        return this.a.listIterator();
    }

    public boolean remove(Object obj) {
        boolean remove = this.a.remove(obj);
        lazySet(this.a.size());
        return remove;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean removeAll = this.a.removeAll(collection);
        lazySet(this.a.size());
        return removeAll;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean retainAll = this.a.retainAll(collection);
        lazySet(this.a.size());
        return retainAll;
    }

    public T set(int i, T t) {
        return this.a.set(i, t);
    }

    public int size() {
        return get();
    }

    public List<T> subList(int i, int i2) {
        return this.a.subList(i, i2);
    }

    public Object[] toArray() {
        return this.a.toArray();
    }

    public String toString() {
        return this.a.toString();
    }

    public ListIterator<T> listIterator(int i) {
        return this.a.listIterator(i);
    }

    public <E> E[] toArray(E[] eArr) {
        return this.a.toArray(eArr);
    }

    public void add(int i, T t) {
        this.a.add(i, t);
        lazySet(this.a.size());
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        boolean addAll = this.a.addAll(i, collection);
        lazySet(this.a.size());
        return addAll;
    }

    public T remove(int i) {
        T remove = this.a.remove(i);
        lazySet(this.a.size());
        return remove;
    }
}
