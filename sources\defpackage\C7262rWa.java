package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: rWa reason: default package and case insensitive filesystem */
/* compiled from: MutableCollectionsJVM.kt */
class C7262rWa extends C7193qWa {
    public static <T> void a(List<T> list, Comparator<? super T> comparator) {
        C7471uYa.b(list, "$this$sortWith");
        C7471uYa.b(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static final <T extends Comparable<? super T>> void c(List<T> list) {
        C7471uYa.b(list, "$this$sort");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static <T> List<T> c(Iterable<? extends T> iterable) {
        C7471uYa.b(iterable, "$this$shuffled");
        List<T> r = C7676xWa.r(iterable);
        Collections.shuffle(r);
        return r;
    }
}
