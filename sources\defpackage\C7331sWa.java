package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: sWa reason: default package and case insensitive filesystem */
/* compiled from: MutableCollections.kt */
class C7331sWa extends C7262rWa {
    public static <T> boolean a(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C7471uYa.b(collection, "$this$addAll");
        C7471uYa.b(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    public static final <T> boolean b(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C7471uYa.b(collection, "$this$retainAll");
        C7471uYa.b(iterable, "elements");
        return LYa.a((Object) collection).retainAll(C6986nWa.a(iterable, (Iterable<? extends T>) collection));
    }

    public static <T> boolean a(Iterable<? extends T> iterable, _Xa<? super T, Boolean> _xa) {
        C7471uYa.b(iterable, "$this$retainAll");
        C7471uYa.b(_xa, "predicate");
        return a(iterable, _xa, false);
    }

    private static final <T> boolean a(Iterable<? extends T> iterable, _Xa<? super T, Boolean> _xa, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) _xa.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }
}
