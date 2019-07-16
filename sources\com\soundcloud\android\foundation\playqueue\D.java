package com.soundcloud.android.foundation.playqueue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: ShuffledPlayQueue */
public abstract class D extends E {

    /* compiled from: ShuffledPlayQueue */
    public static class a<T> implements List<T> {
        private final List<T> a;
        private final List<Integer> b;

        public a(List<T> list, int i, int i2) {
            this(list, a(i, list.size(), i2));
        }

        private static List<Integer> a(int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList.add(i4, Integer.valueOf(i4));
            }
            if (i < i3) {
                Collections.shuffle(arrayList.subList(i, i3));
            }
            return arrayList;
        }

        private int c(int i) {
            if (i > 0) {
                return ((Integer) this.b.get(i - 1)).intValue() + 1;
            }
            return 1;
        }

        private int m(int i) {
            return ((Integer) this.b.get(i)).intValue();
        }

        private void n(int i) {
            Integer num = (Integer) this.b.remove(i);
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                Integer num2 = (Integer) this.b.get(i2);
                if (num2.intValue() >= num.intValue()) {
                    this.b.set(i2, Integer.valueOf(num2.intValue() - 1));
                }
            }
        }

        private void o(int i) {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                int intValue = ((Integer) this.b.get(i2)).intValue();
                if (intValue >= i) {
                    this.b.set(i2, Integer.valueOf(intValue + 1));
                }
            }
        }

        public boolean add(T t) {
            add(size(), t);
            return true;
        }

        public boolean addAll(int i, Collection<? extends T> collection) {
            int i2 = 0;
            for (Object add : collection) {
                add(i + i2, add);
                i2++;
            }
            return true;
        }

        public void clear() {
            this.a.clear();
            this.b.clear();
        }

        public boolean contains(Object obj) {
            return this.a.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return this.a.containsAll(collection);
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!C4804CKa.a(this.a, aVar.a) || !C4804CKa.a(this.b, aVar.b)) {
                z = false;
            }
            return z;
        }

        public T get(int i) {
            return this.a.get(m(i));
        }

        public int hashCode() {
            return C4804CKa.a(this.a, this.b);
        }

        public int indexOf(Object obj) {
            int indexOf = this.a.indexOf(obj);
            for (int i = 0; i < this.b.size(); i++) {
                if (indexOf == ((Integer) this.b.get(i)).intValue()) {
                    return i;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        public Iterator<T> iterator() {
            return new C(this);
        }

        public int lastIndexOf(Object obj) {
            throw new UnsupportedOperationException();
        }

        public ListIterator<T> listIterator() {
            throw new UnsupportedOperationException();
        }

        public boolean remove(Object obj) {
            remove(indexOf(obj));
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            for (Object indexOf : collection) {
                remove(indexOf(indexOf));
            }
            return true;
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public T set(int i, T t) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return this.a.size();
        }

        public List<T> subList(int i, int i2) {
            ArrayList arrayList = new ArrayList(i2 - i);
            while (i < i2) {
                arrayList.add(get(i));
                i++;
            }
            return arrayList;
        }

        public Object[] toArray() {
            Object[] array = this.a.toArray();
            Object[] objArr = new Object[array.length];
            for (int i = 0; i < objArr.length; i++) {
                objArr[i] = array[m(i)];
            }
            return objArr;
        }

        public a(List<T> list, List<Integer> list2) {
            this.a = list;
            this.b = list2;
        }

        public void add(int i, T t) {
            int c = c(i);
            o(c);
            this.b.add(i, Integer.valueOf(c));
            this.a.add(c, t);
        }

        public ListIterator<T> listIterator(int i) {
            throw new UnsupportedOperationException();
        }

        public T remove(int i) {
            int m = m(i);
            n(i);
            return this.a.remove(m);
        }

        public boolean addAll(Collection<? extends T> collection) {
            for (Object add : collection) {
                add(add);
            }
            return true;
        }

        public <T1> T1[] toArray(T1[] t1Arr) {
            throw new UnsupportedOperationException();
        }
    }

    /* synthetic */ D(a aVar, B b) {
        this(aVar);
    }

    public static D a(o oVar, int i, int i2) {
        return new B(new a(oVar.k(), i, i2), oVar);
    }

    public boolean j() {
        return true;
    }

    public abstract o l();

    private D(a<q> aVar) {
        super(aVar);
    }
}
