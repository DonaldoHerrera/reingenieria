package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: nWa reason: default package and case insensitive filesystem */
/* compiled from: Iterables.kt */
class C6986nWa extends C6918mWa {
    public static final <T> Integer a(Iterable<? extends T> iterable) {
        C7471uYa.b(iterable, "$this$collectionSizeOrNull");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    private static final <T> boolean b(Collection<? extends T> collection) {
        return collection.size() > 2 && (collection instanceof ArrayList);
    }

    public static <T> int a(Iterable<? extends T> iterable, int i) {
        C7471uYa.b(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static <T> List<T> b(Iterable<? extends Iterable<? extends T>> iterable) {
        C7471uYa.b(iterable, "$this$flatten");
        ArrayList arrayList = new ArrayList();
        for (Iterable a : iterable) {
            C7331sWa.a((Collection<? super T>) arrayList, a);
        }
        return arrayList;
    }

    public static final <T> Collection<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C7471uYa.b(iterable, "$this$convertToSetForSetOperationWith");
        C7471uYa.b(iterable2, "source");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return C7676xWa.p(iterable);
        }
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).size() < 2) {
            return (Collection) iterable;
        }
        Collection collection = (Collection) iterable;
        return b(collection) ? C7676xWa.p(iterable) : collection;
    }
}
