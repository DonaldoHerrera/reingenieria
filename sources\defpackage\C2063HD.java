package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: HD reason: default package and case insensitive filesystem */
/* compiled from: Lists */
public final class C2063HD {

    /* renamed from: HD$a */
    /* compiled from: Lists */
    private static class a<T> extends AbstractList<List<T>> {
        final List<T> a;
        final int b;

        a(List<T> list, int i) {
            this.a = list;
            this.b = i;
        }

        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        public int size() {
            return C3045iE.a(this.a.size(), this.b, RoundingMode.CEILING);
        }

        public List<T> get(int i) {
            Preconditions.checkElementIndex(i, size());
            int i2 = this.b;
            int i3 = i * i2;
            return this.a.subList(i3, Math.min(i2 + i3, this.a.size()));
        }
    }

    /* renamed from: HD$b */
    /* compiled from: Lists */
    private static class b<T> extends a<T> implements RandomAccess {
        b(List<T> list, int i) {
            super(list, i);
        }
    }

    /* renamed from: HD$c */
    /* compiled from: Lists */
    private static class c<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        final List<F> a;
        final Function<? super F, ? extends T> b;

        c(List<F> list, Function<? super F, ? extends T> function) {
            Preconditions.checkNotNull(list);
            this.a = list;
            Preconditions.checkNotNull(function);
            this.b = function;
        }

        public void clear() {
            this.a.clear();
        }

        public T get(int i) {
            return this.b.apply(this.a.get(i));
        }

        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        public Iterator<T> iterator() {
            return listIterator();
        }

        public ListIterator<T> listIterator(int i) {
            return new C2082ID(this, this.a.listIterator(i));
        }

        public T remove(int i) {
            return this.b.apply(this.a.remove(i));
        }

        public int size() {
            return this.a.size();
        }
    }

    /* renamed from: HD$d */
    /* compiled from: Lists */
    private static class d<F, T> extends AbstractSequentialList<T> implements Serializable {
        final List<F> a;
        final Function<? super F, ? extends T> b;

        d(List<F> list, Function<? super F, ? extends T> function) {
            Preconditions.checkNotNull(list);
            this.a = list;
            Preconditions.checkNotNull(function);
            this.b = function;
        }

        public void clear() {
            this.a.clear();
        }

        public ListIterator<T> listIterator(int i) {
            return new C2101JD(this, this.a.listIterator(i));
        }

        public int size() {
            return this.a.size();
        }
    }

    public static <E> ArrayList<E> a() {
        return new ArrayList<>();
    }

    static int b(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return d(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (Objects.equal(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    static int c(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (Objects.equal(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int d(List<?> list, Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < size) {
                if (obj.equals(list.get(i))) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    private static int e(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
        } else {
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                if (obj.equals(list.get(size2))) {
                    return size2;
                }
            }
        }
        return -1;
    }

    @SafeVarargs
    public static <E> ArrayList<E> a(E... eArr) {
        Preconditions.checkNotNull(eArr);
        ArrayList<E> arrayList = new ArrayList<>(a(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static <E> ArrayList<E> a(Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>(C3063jD.a(iterable));
        }
        return a(iterable.iterator());
    }

    public static <E> ArrayList<E> a(Iterator<? extends E> it) {
        ArrayList<E> a2 = a();
        C2023FD.a((Collection<T>) a2, it);
        return a2;
    }

    static int a(int i) {
        C3044iD.a(i, "arraySize");
        return C3083kE.a(((long) i) + 5 + ((long) (i / 10)));
    }

    public static <F, T> List<T> a(List<F> list, Function<? super F, ? extends T> function) {
        return list instanceof RandomAccess ? new c(list, function) : new d(list, function);
    }

    public static <T> List<List<T>> a(List<T> list, int i) {
        Preconditions.checkNotNull(list);
        Preconditions.checkArgument(i > 0);
        return list instanceof RandomAccess ? new b(list, i) : new a(list, i);
    }

    static boolean a(List<?> list, Object obj) {
        Preconditions.checkNotNull(list);
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return C2023FD.a(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!Objects.equal(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
