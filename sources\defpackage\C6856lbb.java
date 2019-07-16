package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: lbb reason: default package and case insensitive filesystem */
/* compiled from: AnnotationConstructorCaller.kt */
public final class C6856lbb {
    static final /* synthetic */ DZa[] a;

    static {
        String str = "kotlin-reflect-api";
        a = new DZa[]{HYa.a((BYa) new CYa(HYa.a(C6856lbb.class, str), "hashCode", "<v#0>")), HYa.a((BYa) new CYa(HYa.a(C6856lbb.class, str), "toString", "<v#1>"))};
    }

    public static final /* synthetic */ Void a(int i, String str, Class cls) {
        b(i, str, cls);
        throw null;
    }

    /* access modifiers changed from: private */
    public static final Object b(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof C7472uZa) {
            obj = MXa.a((C7472uZa) obj);
        } else if (obj instanceof Object[]) {
            Object obj2 = (Object[]) obj;
            if (obj2 instanceof Class[]) {
                return null;
            }
            if (!(obj2 instanceof C7472uZa[])) {
                obj = obj2;
            } else if (obj != null) {
                C7472uZa[] uzaArr = (C7472uZa[]) obj;
                ArrayList arrayList = new ArrayList(uzaArr.length);
                for (C7472uZa a2 : uzaArr) {
                    arrayList.add(MXa.a(a2));
                }
                obj = arrayList.toArray(new Class[0]);
                if (obj == null) {
                    throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new OVa("null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
            }
        }
        if (!cls.isInstance(obj)) {
            obj = null;
        }
        return obj;
    }

    public static /* synthetic */ Object a(Class cls, Map map, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            Set<String> keySet = map.keySet();
            List arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) keySet, 10));
            for (String declaredMethod : keySet) {
                arrayList.add(cls.getDeclaredMethod(declaredMethod, new Class[0]));
            }
            list = arrayList;
        }
        return a(cls, map, list);
    }

    public static final <T> T a(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        C7471uYa.b(cls, "annotationClass");
        C7471uYa.b(map, "values");
        C7471uYa.b(list, "methods");
        C6516gbb gbb = new C6516gbb(cls, list, map);
        C7744yVa a2 = BVa.a(new C6584hbb(map));
        DZa dZa = a[0];
        C7744yVa a3 = BVa.a(new C6788kbb(cls, map));
        DZa dZa2 = a[1];
        ClassLoader classLoader = cls.getClassLoader();
        Class[] clsArr = {cls};
        C6652ibb ibb = new C6652ibb(cls, a3, dZa2, a2, dZa, gbb, map);
        T newProxyInstance = Proxy.newProxyInstance(classLoader, clsArr, ibb);
        if (newProxyInstance != null) {
            return newProxyInstance;
        }
        throw new OVa("null cannot be cast to non-null type T");
    }

    private static final Void b(int i, String str, Class<?> cls) {
        C7472uZa uza;
        String str2;
        if (C7471uYa.a((Object) cls, (Object) Class.class)) {
            uza = HYa.a(C7472uZa.class);
        } else if (!cls.isArray() || !C7471uYa.a((Object) cls.getComponentType(), (Object) Class.class)) {
            uza = MXa.a(cls);
        } else {
            uza = HYa.a(C7472uZa[].class);
        }
        if (C7471uYa.a((Object) uza.l(), (Object) HYa.a(Object[].class).l())) {
            StringBuilder sb = new StringBuilder();
            sb.append(uza.l());
            sb.append('<');
            Class componentType = MXa.a(uza).getComponentType();
            C7471uYa.a((Object) componentType, "kotlinClass.java.componentType");
            sb.append(MXa.a(componentType).l());
            sb.append('>');
            str2 = sb.toString();
        } else {
            str2 = uza.l();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Argument #");
        sb2.append(i);
        sb2.append(' ');
        sb2.append(str);
        sb2.append(" is not of the required type ");
        sb2.append(str2);
        throw new IllegalArgumentException(sb2.toString());
    }
}
