package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: tx reason: default package and case insensitive filesystem */
final class C1739tx {
    private static final C1739tx a = new C1739tx();
    private final Ax b = new C0281Xw();
    private final ConcurrentMap<Class<?>, C1859xx<?>> c = new ConcurrentHashMap();

    private C1739tx() {
    }

    public static C1739tx a() {
        return a;
    }

    public final <T> C1859xx<T> a(Class<T> cls) {
        String str = "messageType";
        C0209Gw.a(cls, str);
        C1859xx<T> xxVar = (C1859xx) this.c.get(cls);
        if (xxVar != null) {
            return xxVar;
        }
        C1859xx<T> a2 = this.b.a(cls);
        C0209Gw.a(cls, str);
        C0209Gw.a(a2, "schema");
        C1859xx xxVar2 = (C1859xx) this.c.putIfAbsent(cls, a2);
        return xxVar2 != null ? xxVar2 : a2;
    }

    public final <T> C1859xx<T> a(T t) {
        return a(t.getClass());
    }
}
