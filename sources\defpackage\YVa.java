package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

@EVa(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\b\b'\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004\u001c\u001d\u001e\u001fB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0016\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006H¦\u0002¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0002J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006 "}, d2 = {"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "()V", "size", "", "getSize", "()I", "equals", "", "other", "", "get", "index", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "element", "(Ljava/lang/Object;)I", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "Companion", "IteratorImpl", "ListIteratorImpl", "SubList", "kotlin-stdlib"}, mv = {1, 1, 15})
/* renamed from: YVa reason: default package */
/* compiled from: AbstractList.kt */
public abstract class YVa<E> extends VVa<E> implements List<E>, MYa {
    public static final a a = new a(null);

    /* renamed from: YVa$a */
    /* compiled from: AbstractList.kt */
    public static final class a {
        private a() {
        }

        public final void a(int i, int i2) {
            if (i < 0 || i >= i2) {
                StringBuilder sb = new StringBuilder();
                sb.append("index: ");
                sb.append(i);
                sb.append(", size: ");
                sb.append(i2);
                throw new IndexOutOfBoundsException(sb.toString());
            }
        }

        public final void b(int i, int i2) {
            if (i < 0 || i > i2) {
                StringBuilder sb = new StringBuilder();
                sb.append("index: ");
                sb.append(i);
                sb.append(", size: ");
                sb.append(i2);
                throw new IndexOutOfBoundsException(sb.toString());
            }
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        public final void a(int i, int i2, int i3) {
            String str = "fromIndex: ";
            if (i < 0 || i2 > i3) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(i);
                sb.append(", toIndex: ");
                sb.append(i2);
                sb.append(", size: ");
                sb.append(i3);
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i > i2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(i);
                sb2.append(" > toIndex: ");
                sb2.append(i2);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        public final int a(Collection<?> collection) {
            C7471uYa.b(collection, "c");
            int i = 1;
            for (Object next : collection) {
                i = (i * 31) + (next != null ? next.hashCode() : 0);
            }
            return i;
        }

        public final boolean a(Collection<?> collection, Collection<?> collection2) {
            C7471uYa.b(collection, "c");
            C7471uYa.b(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            for (Object a : collection) {
                if (!C7471uYa.a(a, it.next())) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: YVa$b */
    /* compiled from: AbstractList.kt */
    private class b implements Iterator<E>, MYa {
        private int a;

        public b() {
        }

        /* access modifiers changed from: protected */
        public final int a() {
            return this.a;
        }

        public boolean hasNext() {
            return this.a < YVa.this.size();
        }

        public E next() {
            if (hasNext()) {
                YVa yVa = YVa.this;
                int i = this.a;
                this.a = i + 1;
                return yVa.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* access modifiers changed from: protected */
        public final void a(int i) {
            this.a = i;
        }
    }

    /* renamed from: YVa$c */
    /* compiled from: AbstractList.kt */
    private class c extends b implements ListIterator<E>, MYa {
        public c(int i) {
            super();
            YVa.a.b(i, YVa.this.size());
            a(i);
        }

        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return a() > 0;
        }

        public int nextIndex() {
            return a();
        }

        public E previous() {
            if (hasPrevious()) {
                YVa yVa = YVa.this;
                a(a() - 1);
                return yVa.get(a());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return a() - 1;
        }

        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: YVa$d */
    /* compiled from: AbstractList.kt */
    private static final class d<E> extends YVa<E> implements RandomAccess {
        private int b;
        private final YVa<E> c;
        private final int d;

        public d(YVa<? extends E> yVa, int i, int i2) {
            C7471uYa.b(yVa, "list");
            this.c = yVa;
            this.d = i;
            YVa.a.a(this.d, i2, this.c.size());
            this.b = i2 - this.d;
        }

        public int f() {
            return this.b;
        }

        public E get(int i) {
            YVa.a.a(i, this.b);
            return this.c.get(this.d + i);
        }
    }

    protected YVa() {
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return a.a((Collection<?>) this, (Collection) obj);
    }

    public abstract E get(int i);

    public int hashCode() {
        return a.a(this);
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (Object a2 : this) {
            if (C7471uYa.a(a2, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C7471uYa.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new c(0);
    }

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return new d(this, i, i2);
    }

    public ListIterator<E> listIterator(int i) {
        return new c(i);
    }
}
