package defpackage;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: m_a reason: default package and case insensitive filesystem */
/* compiled from: KCallableImpl.kt */
public abstract class C6922m_a<R> implements C7403tZa<R> {
    private final a<List<Annotation>> a;
    private final a<ArrayList<CZa>> b;
    private final a<C5120Mab> c;
    private final a<List<C5210Pab>> d;

    public C6922m_a() {
        a<List<Annotation>> b2 = C5300Sab.b(new C6310d_a(this));
        C7471uYa.a((Object) b2, "ReflectProperties.lazySo…or.computeAnnotations() }");
        this.a = b2;
        a<ArrayList<CZa>> b3 = C5300Sab.b(new C6650i_a(this));
        C7471uYa.a((Object) b3, "ReflectProperties.lazySo…ze()\n        result\n    }");
        this.b = b3;
        a<C5120Mab> b4 = C5300Sab.b(new C6786k_a(this));
        C7471uYa.a((Object) b4, "ReflectProperties.lazySo…eturnType\n        }\n    }");
        this.c = b4;
        a<List<C5210Pab>> b5 = C5300Sab.b(new C6854l_a(this));
        C7471uYa.a((Object) b5, "ReflectProperties.lazySo…KTypeParameterImpl)\n    }");
        this.d = b5;
    }

    private final R b(Map<CZa, ? extends Object> map) {
        Object obj;
        List<CZa> parameters = getParameters();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) parameters, 10));
        for (CZa cZa : parameters) {
            if (map.containsKey(cZa)) {
                obj = map.get(cZa);
                if (obj == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Annotation argument value cannot be null (");
                    sb.append(cZa);
                    sb.append(')');
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (cZa.h()) {
                obj = null;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("No argument provided for a required parameter: ");
                sb2.append(cZa);
                throw new IllegalArgumentException(sb2.toString());
            }
            arrayList.add(obj);
        }
        C6992nbb h = h();
        if (h != null) {
            try {
                Object[] array = arrayList.toArray(new Object[0]);
                if (array != null) {
                    return h.a(array);
                }
                throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
            } catch (IllegalAccessException e) {
                throw new LZa(e);
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("This callable does not support a default call: ");
            sb3.append(i());
            throw new C5240Qab(sb3.toString());
        }
    }

    /* access modifiers changed from: private */
    public final Type l() {
        C4935Gcb i = i();
        if (!(i instanceof C5582adb)) {
            i = null;
        }
        C5582adb adb = (C5582adb) i;
        if (adb == null || !adb.s()) {
            return null;
        }
        Object i2 = C7676xWa.i(f().b());
        if (!(i2 instanceof ParameterizedType)) {
            i2 = null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) i2;
        if (!C7471uYa.a(parameterizedType != null ? parameterizedType.getRawType() : null, (Object) C5575aXa.class)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C7471uYa.a((Object) actualTypeArguments, "continuationType.actualTypeArguments");
        Object i3 = C6578hWa.i(actualTypeArguments);
        if (!(i3 instanceof WildcardType)) {
            i3 = null;
        }
        WildcardType wildcardType = (WildcardType) i3;
        if (wildcardType == null) {
            return null;
        }
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (lowerBounds != null) {
            return (Type) C6578hWa.e((T[]) lowerBounds);
        }
        return null;
    }

    public abstract C6992nbb<?> f();

    public abstract N_a g();

    public List<Annotation> getAnnotations() {
        Object a2 = this.a.a();
        C7471uYa.a(a2, "_annotations()");
        return (List) a2;
    }

    public List<CZa> getParameters() {
        Object a2 = this.b.a();
        C7471uYa.a(a2, "_parameters()");
        return (List) a2;
    }

    public abstract C6992nbb<?> h();

    public abstract C4935Gcb i();

    /* access modifiers changed from: protected */
    public final boolean j() {
        return C7471uYa.a((Object) getName(), (Object) "<init>") && g().a().isAnnotation();
    }

    public abstract boolean k();

    public HZa a() {
        Object a2 = this.c.a();
        C7471uYa.a(a2, "_returnType()");
        return (HZa) a2;
    }

    public R a(Object... objArr) {
        C7471uYa.b(objArr, "args");
        try {
            return f().a(objArr);
        } catch (IllegalAccessException e) {
            throw new LZa(e);
        }
    }

    public R a(Map<CZa, ? extends Object> map) {
        C7471uYa.b(map, "args");
        return j() ? b(map) : a(map, null);
    }

    public final R a(Map<CZa, ? extends Object> map, C5575aXa<?> axa) {
        C7471uYa.b(map, "args");
        List<CZa> parameters = getParameters();
        ArrayList arrayList = new ArrayList(parameters.size());
        ArrayList arrayList2 = new ArrayList(1);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        for (CZa cZa : parameters) {
            if (i != 0 && i % 32 == 0) {
                arrayList2.add(Integer.valueOf(i2));
                i2 = 0;
            }
            if (map.containsKey(cZa)) {
                arrayList.add(map.get(cZa));
            } else if (cZa.h()) {
                arrayList.add(a(UZa.a(cZa.getType())));
                i2 = (1 << (i % 32)) | i2;
                z = true;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("No argument provided for a required parameter: ");
                sb.append(cZa);
                throw new IllegalArgumentException(sb.toString());
            }
            if (cZa.g() == a.VALUE) {
                i++;
            }
        }
        if (axa != null) {
            arrayList.add(axa);
        }
        String str = "null cannot be cast to non-null type kotlin.Array<T>";
        if (!z) {
            Object[] array = arrayList.toArray(new Object[0]);
            if (array != null) {
                return a(Arrays.copyOf(array, array.length));
            }
            throw new OVa(str);
        }
        arrayList2.add(Integer.valueOf(i2));
        C6992nbb h = h();
        if (h != null) {
            arrayList.addAll(arrayList2);
            arrayList.add(null);
            try {
                Object[] array2 = arrayList.toArray(new Object[0]);
                if (array2 != null) {
                    return h.a(array2);
                }
                throw new OVa(str);
            } catch (IllegalAccessException e) {
                throw new LZa(e);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("This callable does not support a default call: ");
            sb2.append(i());
            throw new C5240Qab(sb2.toString());
        }
    }

    private final Object a(Type type) {
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (C7471uYa.a((Object) type, (Object) Boolean.TYPE)) {
            return Boolean.valueOf(false);
        }
        if (C7471uYa.a((Object) type, (Object) Character.TYPE)) {
            return Character.valueOf((char) 0);
        }
        if (C7471uYa.a((Object) type, (Object) Byte.TYPE)) {
            return Byte.valueOf((byte) 0);
        }
        if (C7471uYa.a((Object) type, (Object) Short.TYPE)) {
            return Short.valueOf((short) 0);
        }
        if (C7471uYa.a((Object) type, (Object) Integer.TYPE)) {
            return Integer.valueOf(0);
        }
        if (C7471uYa.a((Object) type, (Object) Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (C7471uYa.a((Object) type, (Object) Long.TYPE)) {
            return Long.valueOf(0);
        }
        if (C7471uYa.a((Object) type, (Object) Double.TYPE)) {
            return Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
        if (C7471uYa.a((Object) type, (Object) Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown primitive: ");
        sb.append(type);
        throw new UnsupportedOperationException(sb.toString());
    }
}
