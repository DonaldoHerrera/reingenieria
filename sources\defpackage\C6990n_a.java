package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: n_a reason: default package and case insensitive filesystem */
/* compiled from: kClassCache.kt */
public final class C6990n_a {
    private static Kvb<String, Object> a;

    static {
        Kvb<String, Object> a2 = Kvb.a();
        C7471uYa.a((Object) a2, "HashPMap.empty<String, Any>()");
        a = a2;
    }

    public static final <T> I_a<T> a(Class<T> cls) {
        C7471uYa.b(cls, "jClass");
        String name = cls.getName();
        Object a2 = a.a((Object) name);
        Class cls2 = null;
        if (a2 instanceof WeakReference) {
            I_a<T> i_a = (I_a) ((WeakReference) a2).get();
            if (i_a != null) {
                cls2 = i_a.a();
            }
            if (C7471uYa.a((Object) cls2, (Object) cls)) {
                return i_a;
            }
        } else if (a2 != null) {
            for (WeakReference weakReference : (WeakReference[]) a2) {
                I_a<T> i_a2 = (I_a) weakReference.get();
                if (C7471uYa.a(i_a2 != null ? i_a2.a() : null, (Object) cls)) {
                    return i_a2;
                }
            }
            int length = ((Object[]) a2).length;
            WeakReference[] weakReferenceArr = new WeakReference[(length + 1)];
            System.arraycopy(a2, 0, weakReferenceArr, 0, length);
            I_a<T> i_a3 = new I_a<>(cls);
            weakReferenceArr[length] = new WeakReference(i_a3);
            Kvb<String, Object> a3 = a.a(name, weakReferenceArr);
            C7471uYa.a((Object) a3, "K_CLASS_CACHE.plus(name, newArray)");
            a = a3;
            return i_a3;
        }
        I_a<T> i_a4 = new I_a<>(cls);
        Kvb<String, Object> a4 = a.a(name, new WeakReference(i_a4));
        C7471uYa.a((Object) a4, "K_CLASS_CACHE.plus(name, WeakReference(newKClass))");
        a = a4;
        return i_a4;
    }
}
