package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: Rvb reason: default package */
/* compiled from: reflectClassUtil.kt */
public final class Rvb {
    private static final List<C7472uZa<? extends Object>> a = C6918mWa.b((Object[]) new C7472uZa[]{HYa.a(Boolean.TYPE), HYa.a(Byte.TYPE), HYa.a(Character.TYPE), HYa.a(Double.TYPE), HYa.a(Float.TYPE), HYa.a(Integer.TYPE), HYa.a(Long.TYPE), HYa.a(Short.TYPE)});
    private static final Map<Class<? extends Object>, Class<? extends Object>> b;
    private static final Map<Class<? extends Object>, Class<? extends Object>> c;
    private static final Map<Class<? extends C7537vVa<?>>, Integer> d;

    /* JADX INFO: used method not loaded: mWa.b(java.lang.Object[]):null, types can be incorrect */
    static {
        int i = 0;
        List<C7472uZa<? extends Object>> list = a;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (C7472uZa uza : list) {
            arrayList.add(NVa.a(MXa.b(uza), MXa.c(uza)));
        }
        b = LWa.a((Iterable<? extends HVa<? extends K, ? extends V>>) arrayList);
        List<C7472uZa<? extends Object>> list2 = a;
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) list2, 10));
        for (C7472uZa uza2 : list2) {
            arrayList2.add(NVa.a(MXa.c(uza2), MXa.b(uza2)));
        }
        c = LWa.a((Iterable<? extends HVa<? extends K, ? extends V>>) arrayList2);
        List b2 = C6918mWa.b((Object[]) new Class[]{PXa.class, _Xa.class, C6308dYa.class, C6376eYa.class, C6444fYa.class, C6512gYa.class, C6580hYa.class, C6648iYa.class, C6716jYa.class, C6784kYa.class, QXa.class, RXa.class, SXa.class, TXa.class, UXa.class, VXa.class, WXa.class, XXa.class, YXa.class, ZXa.class, C5576aYa.class, C5644bYa.class, C5712cYa.class});
        ArrayList arrayList3 = new ArrayList(C6986nWa.a((Iterable) b2, 10));
        for (Object next : b2) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList3.add(NVa.a((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                C6782kWa.c();
                throw null;
            }
        }
        d = LWa.a((Iterable<? extends HVa<? extends K, ? extends V>>) arrayList3);
    }

    public static final Class<?> a(Class<?> cls) {
        C7471uYa.b(cls, "$this$createArrayType");
        return Array.newInstance(cls, 0).getClass();
    }

    public static final C7280rnb b(Class<?> cls) {
        C7471uYa.b(cls, "$this$classId");
        if (cls.isPrimitive()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't compute ClassId for primitive type: ");
            sb.append(cls);
            throw new IllegalArgumentException(sb.toString());
        } else if (!cls.isArray()) {
            if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                String simpleName = cls.getSimpleName();
                C7471uYa.a((Object) simpleName, "simpleName");
                if (!(simpleName.length() == 0)) {
                    Class declaringClass = cls.getDeclaringClass();
                    if (declaringClass != null) {
                        C7280rnb b2 = b(declaringClass);
                        if (b2 != null) {
                            C7280rnb a2 = b2.a(C7694xnb.b(cls.getSimpleName()));
                            if (a2 != null) {
                                return a2;
                            }
                        }
                    }
                    C7280rnb a3 = C7280rnb.a(new C7349snb(cls.getName()));
                    C7471uYa.a((Object) a3, "ClassId.topLevel(FqName(name))");
                    return a3;
                }
            }
            C7349snb snb = new C7349snb(cls.getName());
            return new C7280rnb(snb.c(), C7349snb.c(snb.e()), true);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't compute ClassId for array type: ");
            sb2.append(cls);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static final String c(Class<?> cls) {
        C7471uYa.b(cls, "$this$desc");
        if (C7471uYa.a((Object) cls, (Object) Void.TYPE)) {
            return "V";
        }
        String name = a(cls).getName();
        C7471uYa.a((Object) name, "createArrayType().name");
        if (name != null) {
            String substring = name.substring(1);
            C7471uYa.a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return Cxb.a(substring, '.', '/', false, 4, (Object) null);
        }
        throw new OVa("null cannot be cast to non-null type java.lang.String");
    }

    public static final Class<?> d(Class<?> cls) {
        C7471uYa.b(cls, "$this$primitiveByWrapper");
        return (Class) b.get(cls);
    }

    public static final ClassLoader e(Class<?> cls) {
        C7471uYa.b(cls, "$this$safeClassLoader");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        C7471uYa.a((Object) systemClassLoader, "ClassLoader.getSystemClassLoader()");
        return systemClassLoader;
    }

    public static final Class<?> f(Class<?> cls) {
        C7471uYa.b(cls, "$this$wrapperByPrimitive");
        return (Class) c.get(cls);
    }

    public static final boolean g(Class<?> cls) {
        C7471uYa.b(cls, "$this$isEnumClassOrSpecializedEnumEntryClass");
        return Enum.class.isAssignableFrom(cls);
    }

    public static final List<Type> a(Type type) {
        C7471uYa.b(type, "$this$parameterizedTypeArguments");
        if (!(type instanceof ParameterizedType)) {
            return C6918mWa.a();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return Ywb.g(Ywb.c(Twb.a(type, (_Xa<? super T, ? extends T>) Pvb.a), (_Xa<? super T, ? extends Iwb<? extends R>>) Qvb.a));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C7471uYa.a((Object) actualTypeArguments, "actualTypeArguments");
        return C6578hWa.j(actualTypeArguments);
    }
}
