package com.google.android.gms.internal.clearcut;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.clearcut.ya reason: case insensitive filesystem */
final class C0808ya extends C0802wa {
    private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C0808ya() {
        super();
    }

    private static <E> List<E> b(Object obj, long j) {
        return (List) Ab.f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    public final void a(Object obj, long j) {
        Object obj2;
        List list = (List) Ab.f(obj, j);
        if (list instanceof C0799va) {
            obj2 = ((C0799va) list).V();
        } else if (!c.isAssignableFrom(list.getClass())) {
            obj2 = Collections.unmodifiableList(list);
        } else {
            return;
        }
        Ab.a(obj, j, obj2);
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final <E> void a(Object obj, Object obj2, long j) {
        ? r2;
        List b = b(obj2, j);
        int size = b.size();
        List b2 = b(obj, j);
        if (b2.isEmpty()) {
            Object uaVar = b2 instanceof C0799va ? new C0796ua(size) : new ArrayList(size);
            Ab.a(obj, j, uaVar);
            b2 = uaVar;
        } else {
            if (c.isAssignableFrom(b2.getClass())) {
                ArrayList arrayList = new ArrayList(b2.size() + size);
                arrayList.addAll(b2);
                r2 = arrayList;
            } else if (b2 instanceof C0806xb) {
                C0796ua uaVar2 = new C0796ua(b2.size() + size);
                uaVar2.addAll((C0806xb) b2);
                r2 = uaVar2;
            }
            Ab.a(obj, j, (Object) r2);
            b2 = r2;
        }
        int size2 = b2.size();
        int size3 = b.size();
        if (size2 > 0 && size3 > 0) {
            b2.addAll(b);
        }
        if (size2 > 0) {
            b = b2;
        }
        Ab.a(obj, j, b);
    }
}
