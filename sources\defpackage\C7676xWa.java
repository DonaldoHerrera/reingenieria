package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: xWa reason: default package and case insensitive filesystem */
/* compiled from: _Collections.kt */
class C7676xWa extends C7469uWa {
    public static <T> boolean a(Iterable<? extends T> iterable, T t) {
        C7471uYa.b(iterable, "$this$contains");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        return b(iterable, t) >= 0;
    }

    public static final <T> int b(Iterable<? extends T> iterable, T t) {
        C7471uYa.b(iterable, "$this$indexOf");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (Object next : iterable) {
            if (i < 0) {
                C6782kWa.c();
                throw null;
            } else if (C7471uYa.a((Object) t, next)) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    public static <T> List<T> c(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        C7471uYa.b(iterable, "$this$drop");
        int i2 = 0;
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested element count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (i == 0) {
            return q(iterable);
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i;
                if (size <= 0) {
                    return C6918mWa.a();
                }
                if (size == 1) {
                    return C6850lWa.a(i(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i < size2) {
                            arrayList.add(((List) iterable).get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (Object next : iterable) {
                int i3 = i2 + 1;
                if (i2 >= i) {
                    arrayList.add(next);
                }
                i2 = i3;
            }
            return C6918mWa.b((List<? extends T>) arrayList);
        }
    }

    public static <T> T d(List<? extends T> list, int i) {
        C7471uYa.b(list, "$this$getOrNull");
        if (i < 0 || i > C6918mWa.a(list)) {
            return null;
        }
        return list.get(i);
    }

    public static <T> List<T> e(List<? extends T> list, int i) {
        C7471uYa.b(list, "$this$takeLast");
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested element count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (i == 0) {
            return C6918mWa.a();
        } else {
            int size = list.size();
            if (i >= size) {
                return q(list);
            }
            if (i == 1) {
                return C6850lWa.a(h(list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(list.get(i2));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
    }

    public static <T> T f(List<? extends T> list) {
        C7471uYa.b(list, "$this$first");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T g(Iterable<? extends T> iterable) {
        C7471uYa.b(iterable, "$this$first");
        if (iterable instanceof List) {
            return f((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T h(Iterable<? extends T> iterable) {
        C7471uYa.b(iterable, "$this$firstOrNull");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static <T> T i(Iterable<? extends T> iterable) {
        C7471uYa.b(iterable, "$this$last");
        if (iterable instanceof List) {
            return h((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T j(Iterable<? extends T> iterable) {
        C7471uYa.b(iterable, "$this$lastOrNull");
        T t = null;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                t = list.get(list.size() - 1);
            }
            return t;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T k(List<? extends T> list) {
        C7471uYa.b(list, "$this$singleOrNull");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T> List<T> l(Iterable<? extends T> iterable) {
        C7471uYa.b(iterable, "$this$reversed");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return q(iterable);
        }
        List<T> r = r(iterable);
        C7469uWa.e(r);
        return r;
    }

    public static <T> T m(Iterable<? extends T> iterable) {
        C7471uYa.b(iterable, "$this$single");
        if (iterable instanceof List) {
            return j((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T n(Iterable<? extends T> iterable) {
        C7471uYa.b(iterable, "$this$singleOrNull");
        T t = null;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                t = list.get(0);
            }
            return t;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static <T extends Comparable<? super T>> List<T> o(Iterable<? extends T> iterable) {
        C7471uYa.b(iterable, "$this$sorted");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return q(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            String str = "null cannot be cast to non-null type kotlin.Array<T>";
            if (array == null) {
                throw new OVa(str);
            } else if (array != null) {
                Comparable[] comparableArr = (Comparable[]) array;
                if (comparableArr != null) {
                    C6374eWa.b(comparableArr);
                    return C6374eWa.a((T[]) comparableArr);
                }
                throw new OVa("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            } else {
                throw new OVa(str);
            }
        } else {
            List<T> r = r(iterable);
            C7262rWa.c(r);
            return r;
        }
    }

    public static <T> HashSet<T> p(Iterable<? extends T> iterable) {
        C7471uYa.b(iterable, "$this$toHashSet");
        HashSet<T> hashSet = new HashSet<>(LWa.a(C6986nWa.a(iterable, 12)));
        b(iterable, (C) hashSet);
        return hashSet;
    }

    public static <T> List<T> q(Iterable<? extends T> iterable) {
        List<T> list;
        C7471uYa.b(iterable, "$this$toList");
        if (!(iterable instanceof Collection)) {
            return C6918mWa.b(r(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            list = C6918mWa.a();
        } else if (size != 1) {
            list = c(collection);
        } else {
            list = C6850lWa.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        return list;
    }

    public static final <T> List<T> r(Iterable<? extends T> iterable) {
        C7471uYa.b(iterable, "$this$toMutableList");
        if (iterable instanceof Collection) {
            return c((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        b(iterable, (C) arrayList);
        return arrayList;
    }

    public static <T> Set<T> s(Iterable<? extends T> iterable) {
        C7471uYa.b(iterable, "$this$toMutableSet");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b(iterable, (C) linkedHashSet);
        return linkedHashSet;
    }

    public static <T> Set<T> t(Iterable<? extends T> iterable) {
        Set<T> set;
        C7471uYa.b(iterable, "$this$toSet");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                set = SWa.a();
            } else if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(LWa.a(collection.size()));
                b(iterable, (C) linkedHashSet);
                set = linkedHashSet;
            } else {
                set = RWa.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            }
            return set;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        b(iterable, (C) linkedHashSet2);
        return SWa.a((Set<? extends T>) linkedHashSet2);
    }

    public static <T> Iterable<CWa<T>> u(Iterable<? extends T> iterable) {
        C7471uYa.b(iterable, "$this$withIndex");
        return new DWa(new C7607wWa(iterable));
    }

    public static <T> List<T> d(Iterable<? extends T> iterable, int i) {
        C7471uYa.b(iterable, "$this$take");
        int i2 = 0;
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested element count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (i == 0) {
            return C6918mWa.a();
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return q(iterable);
                }
                if (i == 1) {
                    return C6850lWa.a(g(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            for (Object next : iterable) {
                int i3 = i2 + 1;
                if (i2 == i) {
                    break;
                }
                arrayList.add(next);
                i2 = i3;
            }
            return C6918mWa.b((List<? extends T>) arrayList);
        }
    }

    public static <T extends Comparable<? super T>> T k(Iterable<? extends T> iterable) {
        C7471uYa.b(iterable, "$this$max");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) < 0) {
                t = t2;
            }
        }
        return t;
    }

    public static final <C extends Collection<? super T>, T> C a(Iterable<? extends T> iterable, C c) {
        C7471uYa.b(iterable, "$this$filterNotNullTo");
        C7471uYa.b(c, "destination");
        for (Object next : iterable) {
            if (next != null) {
                c.add(next);
            }
        }
        return c;
    }

    public static <T> List<T> f(Iterable<? extends T> iterable) {
        C7471uYa.b(iterable, "$this$filterNotNull");
        ArrayList arrayList = new ArrayList();
        a(iterable, (C) arrayList);
        return arrayList;
    }

    public static <T> List<T> a(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        C7471uYa.b(iterable, "$this$sortedWith");
        C7471uYa.b(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return q(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            String str = "null cannot be cast to non-null type kotlin.Array<T>";
            if (array == null) {
                throw new OVa(str);
            } else if (array != null) {
                C6374eWa.a(array, comparator);
                return C6374eWa.a((T[]) array);
            } else {
                throw new OVa(str);
            }
        } else {
            List<T> r = r(iterable);
            C7262rWa.a(r, comparator);
            return r;
        }
    }

    public static int[] b(Collection<Integer> collection) {
        C7471uYa.b(collection, "$this$toIntArray");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Number intValue : collection) {
            int i2 = i + 1;
            iArr[i] = intValue.intValue();
            i = i2;
        }
        return iArr;
    }

    public static <T> T g(List<? extends T> list) {
        C7471uYa.b(list, "$this$firstOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static <T> T h(List<? extends T> list) {
        C7471uYa.b(list, "$this$last");
        if (!list.isEmpty()) {
            return list.get(C6918mWa.a(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T j(List<? extends T> list) {
        C7471uYa.b(list, "$this$single");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    public static final <T, C extends Collection<? super T>> C b(Iterable<? extends T> iterable, C c) {
        C7471uYa.b(iterable, "$this$toCollection");
        C7471uYa.b(c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    public static <T> T i(List<? extends T> list) {
        C7471uYa.b(list, "$this$lastOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static <T> Set<T> b(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C7471uYa.b(iterable, "$this$intersect");
        C7471uYa.b(iterable2, "other");
        Set<T> s = s(iterable);
        C7331sWa.b(s, iterable2);
        return s;
    }

    public static <T> List<T> a(Collection<? extends T> collection, T t) {
        C7471uYa.b(collection, "$this$plus");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static <T, R> List<R> d(Iterable<? extends T> iterable, _Xa<? super T, ? extends R> _xa) {
        C7471uYa.b(iterable, "$this$map");
        C7471uYa.b(_xa, "transform");
        ArrayList arrayList = new ArrayList(C6986nWa.a(iterable, 10));
        for (Object invoke : iterable) {
            arrayList.add(_xa.invoke(invoke));
        }
        return arrayList;
    }

    public static <T> List<T> e(Iterable<? extends T> iterable) {
        C7471uYa.b(iterable, "$this$distinct");
        return q(s(iterable));
    }

    public static <T> boolean b(Iterable<? extends T> iterable, _Xa<? super T, Boolean> _xa) {
        C7471uYa.b(iterable, "$this$all");
        C7471uYa.b(_xa, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object invoke : iterable) {
            if (!((Boolean) _xa.invoke(invoke)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static <T, R> List<HVa<T, R>> e(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        C7471uYa.b(iterable, "$this$zip");
        C7471uYa.b(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C6986nWa.a(iterable, 10), C6986nWa.a(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(NVa.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final <T> List<List<T>> a(Iterable<? extends T> iterable, int i, int i2, boolean z) {
        C7471uYa.b(iterable, "$this$windowed");
        VWa.a(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator a = VWa.a(iterable.iterator(), i, i2, z, false);
            while (a.hasNext()) {
                arrayList.add((List) a.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList(((size + i2) - 1) / i2);
        int i3 = 0;
        while (i3 < size) {
            int b = C7265rZa.b(i, size - i3);
            if (b < i && !z) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(b);
            for (int i4 = 0; i4 < b; i4++) {
                arrayList3.add(list.get(i4 + i3));
            }
            arrayList2.add(arrayList3);
            i3 += i2;
        }
        return arrayList2;
    }

    public static <T> List<List<T>> b(Iterable<? extends T> iterable, int i) {
        C7471uYa.b(iterable, "$this$chunked");
        return a(iterable, i, i, true);
    }

    public static <T> Set<T> d(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C7471uYa.b(iterable, "$this$union");
        C7471uYa.b(iterable2, "other");
        Set<T> s = s(iterable);
        C7331sWa.a((Collection<? super T>) s, iterable2);
        return s;
    }

    public static <T> List<T> d(Iterable<? extends T> iterable, T t) {
        C7471uYa.b(iterable, "$this$plus");
        if (iterable instanceof Collection) {
            return a((Collection) iterable, t);
        }
        ArrayList arrayList = new ArrayList();
        C7331sWa.a((Collection<? super T>) arrayList, iterable);
        arrayList.add(t);
        return arrayList;
    }

    public static <T> List<T> c(List<? extends T> list, int i) {
        C7471uYa.b(list, "$this$dropLast");
        if (i >= 0) {
            return d((Iterable<? extends T>) list, C7265rZa.a(list.size() - i, 0));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Requested element count ");
        sb.append(i);
        sb.append(" is less than zero.");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static <T> List<T> c(Iterable<? extends T> iterable, _Xa<? super T, Boolean> _xa) {
        C7471uYa.b(iterable, "$this$filter");
        C7471uYa.b(_xa, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (((Boolean) _xa.invoke(next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static <T> Iwb<T> d(Iterable<? extends T> iterable) {
        C7471uYa.b(iterable, "$this$asSequence");
        return new C7538vWa(iterable);
    }

    public static <T> List<T> c(Collection<? extends T> collection) {
        C7471uYa.b(collection, "$this$toMutableList");
        return new ArrayList(collection);
    }

    public static <T> List<T> c(Iterable<? extends T> iterable, T t) {
        C7471uYa.b(iterable, "$this$minus");
        ArrayList arrayList = new ArrayList(C6986nWa.a(iterable, 10));
        boolean z = false;
        for (Object next : iterable) {
            boolean z2 = true;
            if (!z && C7471uYa.a(next, (Object) t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ Appendable a(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, _Xa _xa, int i2, Object obj) {
        CharSequence charSequence5 = (i2 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence6 = "";
        CharSequence charSequence7 = (i2 & 4) != 0 ? charSequence6 : charSequence2;
        if ((i2 & 8) == 0) {
            charSequence6 = charSequence3;
        }
        a(iterable, appendable, charSequence5, charSequence7, charSequence6, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : _xa);
        return appendable;
    }

    public static final <T, A extends Appendable> A a(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, _Xa<? super T, ? extends CharSequence> _xa) {
        C7471uYa.b(iterable, "$this$joinTo");
        C7471uYa.b(a, "buffer");
        C7471uYa.b(charSequence, "separator");
        C7471uYa.b(charSequence2, "prefix");
        C7471uYa.b(charSequence3, "postfix");
        C7471uYa.b(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C7852zxb.a(a, next, _xa);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static <T> List<T> c(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C7471uYa.b(iterable, "$this$minus");
        C7471uYa.b(iterable2, "elements");
        Collection a = C6986nWa.a(iterable2, iterable);
        if (a.isEmpty()) {
            return q(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!a.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ String a(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, _Xa _xa, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            _xa = null;
        }
        return a(iterable, charSequence, charSequence6, charSequence5, i3, charSequence7, _xa);
    }

    public static <T> String a(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, _Xa<? super T, ? extends CharSequence> _xa) {
        C7471uYa.b(iterable, "$this$joinToString");
        C7471uYa.b(charSequence, "separator");
        C7471uYa.b(charSequence2, "prefix");
        C7471uYa.b(charSequence3, "postfix");
        C7471uYa.b(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        a(iterable, sb, charSequence, charSequence2, charSequence3, i, charSequence4, _xa);
        String sb2 = sb.toString();
        C7471uYa.a((Object) sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static <T> List<T> c(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        C7471uYa.b(collection, "$this$plus");
        C7471uYa.b(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C7331sWa.a((Collection<? super T>) arrayList2, iterable);
        return arrayList2;
    }
}
