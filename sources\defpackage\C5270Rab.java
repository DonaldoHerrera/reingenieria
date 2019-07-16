package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: Rab reason: default package and case insensitive filesystem */
/* compiled from: moduleByClassLoader.kt */
public final class C5270Rab {
    private static final ConcurrentMap<C6380ebb, WeakReference<C4841Dbb>> a = new ConcurrentHashMap();

    public static final C4841Dbb a(Class<?> cls) {
        C7471uYa.b(cls, "$this$getOrCreateModule");
        ClassLoader e = Rvb.e(cls);
        C6380ebb ebb = new C6380ebb(e);
        WeakReference weakReference = (WeakReference) a.get(ebb);
        if (weakReference != null) {
            C4841Dbb dbb = (C4841Dbb) weakReference.get();
            if (dbb != null) {
                C7471uYa.a((Object) dbb, "it");
                return dbb;
            }
            a.remove(ebb, weakReference);
        }
        C4841Dbb a2 = C4841Dbb.a.a(e);
        while (true) {
            try {
                WeakReference weakReference2 = (WeakReference) a.putIfAbsent(ebb, new WeakReference(a2));
                if (weakReference2 != null) {
                    C4841Dbb dbb2 = (C4841Dbb) weakReference2.get();
                    if (dbb2 != null) {
                        return dbb2;
                    }
                    a.remove(ebb, weakReference2);
                } else {
                    ebb.a(null);
                    return a2;
                }
            } finally {
                ebb.a(null);
            }
        }
    }
}
