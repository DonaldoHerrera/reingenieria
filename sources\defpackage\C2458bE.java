package defpackage;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: bE reason: default package and case insensitive filesystem */
/* compiled from: Sets */
public final class C2458bE {

    /* renamed from: bE$a */
    /* compiled from: Sets */
    static abstract class a<E> extends AbstractSet<E> {
        a() {
        }

        public boolean removeAll(Collection<?> collection) {
            return C2458bE.a((Set<?>) this, collection);
        }

        public boolean retainAll(Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            return super.retainAll(collection);
        }
    }

    /* renamed from: bE$b */
    /* compiled from: Sets */
    public static abstract class b<E> extends AbstractSet<E> {
        /* synthetic */ b(C2439aE aEVar) {
            this();
        }

        @CanIgnoreReturnValue
        @Deprecated
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private b() {
        }
    }

    public static <E> HashSet<E> a() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> a(E... eArr) {
        HashSet<E> a2 = a(eArr.length);
        Collections.addAll(a2, eArr);
        return a2;
    }

    public static <E> HashSet<E> a(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new HashSet<>(C3063jD.a(iterable));
        }
        return a(iterable.iterator());
    }

    public static <E> HashSet<E> a(Iterator<? extends E> it) {
        HashSet<E> a2 = a();
        C2023FD.a((Collection<T>) a2, it);
        return a2;
    }

    public static <E> HashSet<E> a(int i) {
        return new HashSet<>(C2196OD.a(i));
    }

    public static <E> b<E> a(Set<? extends E> set, Set<? extends E> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new C2439aE(set, set2);
    }

    static int a(Set<?> set) {
        int i = 0;
        for (Object next : set) {
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    static boolean a(Set<?> set, Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    z = false;
                }
                return z;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean a(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    static boolean a(Set<?> set, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof C2253RD) {
            collection = ((C2253RD) collection).e();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return a(set, collection.iterator());
        }
        return C2023FD.a(set.iterator(), collection);
    }
}
