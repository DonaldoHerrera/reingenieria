package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: MMa reason: default package and case insensitive filesystem */
/* compiled from: SetFactory */
public final class C5117MMa<T> implements C4961HMa<Set<T>> {
    private static final C4961HMa<Set<Object>> a = C4992IMa.a(Collections.emptySet());
    private final List<C7054oVa<T>> b;
    private final List<C7054oVa<Collection<T>>> c;

    /* renamed from: MMa$a */
    /* compiled from: SetFactory */
    public static final class a<T> {
        private final List<C7054oVa<T>> a;
        private final List<C7054oVa<Collection<T>>> b;

        public a<T> a(C7054oVa<? extends T> ova) {
            this.a.add(ova);
            return this;
        }

        private a(int i, int i2) {
            this.a = C4868EMa.c(i);
            this.b = C4868EMa.c(i2);
        }

        public C5117MMa<T> a() {
            return new C5117MMa<>(this.a, this.b);
        }
    }

    public static <T> a<T> a(int i, int i2) {
        return new a<>(i, i2);
    }

    private C5117MMa(List<C7054oVa<T>> list, List<C7054oVa<Collection<T>>> list2) {
        this.b = list;
        this.c = list2;
    }

    public Set<T> get() {
        int size = this.b.size();
        ArrayList arrayList = new ArrayList(this.c.size());
        int size2 = this.c.size();
        int i = size;
        for (int i2 = 0; i2 < size2; i2++) {
            Collection collection = (Collection) ((C7054oVa) this.c.get(i2)).get();
            i += collection.size();
            arrayList.add(collection);
        }
        HashSet a2 = C4868EMa.a(i);
        int size3 = this.b.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object obj = ((C7054oVa) this.b.get(i3)).get();
            C5023JMa.a(obj);
            a2.add(obj);
        }
        int size4 = arrayList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            for (Object next : (Collection) arrayList.get(i4)) {
                C5023JMa.a(next);
                a2.add(next);
            }
        }
        return Collections.unmodifiableSet(a2);
    }
}
