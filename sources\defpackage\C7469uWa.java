package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: uWa reason: default package and case insensitive filesystem */
/* compiled from: _CollectionsJvm.kt */
class C7469uWa extends C7400tWa {
    public static <R> List<R> a(Iterable<?> iterable, Class<R> cls) {
        C7471uYa.b(iterable, "$this$filterIsInstance");
        C7471uYa.b(cls, "klass");
        ArrayList arrayList = new ArrayList();
        a(iterable, arrayList, cls);
        return arrayList;
    }

    public static final <T> void e(List<T> list) {
        C7471uYa.b(list, "$this$reverse");
        Collections.reverse(list);
    }

    public static final <C extends Collection<? super R>, R> C a(Iterable<?> iterable, C c, Class<R> cls) {
        C7471uYa.b(iterable, "$this$filterIsInstanceTo");
        C7471uYa.b(c, "destination");
        C7471uYa.b(cls, "klass");
        for (Object next : iterable) {
            if (cls.isInstance(next)) {
                c.add(next);
            }
        }
        return c;
    }
}
