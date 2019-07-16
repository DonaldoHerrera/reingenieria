package defpackage;

import java.lang.reflect.Method;

@EVa(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever;", "", "()V", "cache", "Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "notOnJava9", "buildCache", "continuation", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "getModuleName", "", "Cache", "kotlin-stdlib"}, mv = {1, 1, 15})
/* renamed from: rXa reason: default package and case insensitive filesystem */
/* compiled from: DebugMetadata.kt */
final class C7263rXa {
    private static final a a = new a(null, null, null);
    public static a b;
    public static final C7263rXa c = new C7263rXa();

    /* renamed from: rXa$a */
    /* compiled from: DebugMetadata.kt */
    private static final class a {
        public final Method a;
        public final Method b;
        public final Method c;

        public a(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }
    }

    private C7263rXa() {
    }

    private final a b(C6783kXa kxa) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), kxa.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), kxa.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            b = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = a;
            b = aVar2;
            return aVar2;
        }
    }

    public final String a(C6783kXa kxa) {
        C7471uYa.b(kxa, "continuation");
        a aVar = b;
        if (aVar == null) {
            aVar = b(kxa);
        }
        if (aVar == a) {
            return null;
        }
        Method method = aVar.a;
        if (method != null) {
            Object invoke = method.invoke(kxa.getClass(), new Object[0]);
            if (invoke != null) {
                Method method2 = aVar.b;
                if (method2 != null) {
                    Object invoke2 = method2.invoke(invoke, new Object[0]);
                    if (invoke2 != null) {
                        Method method3 = aVar.c;
                        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                        if (!(invoke3 instanceof String)) {
                            invoke3 = null;
                        }
                        return (String) invoke3;
                    }
                }
            }
        }
        return null;
    }
}
