package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: vt reason: default package and case insensitive filesystem */
public abstract class C1795vt {
    private static WeakHashMap<Class<?>, Field> a = new WeakHashMap<>();
    private static final Lock b = new ReentrantLock();

    private final Bt p() throws IOException {
        Bt f = f();
        if (f == null) {
            f = e();
        }
        if (f != null) {
            return f;
        }
        throw new IllegalArgumentException("no JSON input found");
    }

    private final Bt q() throws IOException {
        Bt p = p();
        int i = C1885yt.a[p.ordinal()];
        boolean z = true;
        if (i == 1) {
            Bt e = e();
            if (!(e == Bt.FIELD_NAME || e == Bt.END_OBJECT)) {
                z = false;
            }
            if (z) {
                return e;
            }
            throw new IllegalArgumentException(String.valueOf(e));
        } else if (i != 2) {
            return p;
        } else {
            return e();
        }
    }

    public final <T> T a(Class<T> cls, C1585ot otVar) throws IOException {
        try {
            return a(cls, false, null);
        } finally {
            a();
        }
    }

    public abstract void a() throws IOException;

    public abstract int b() throws IOException;

    public abstract String c() throws IOException;

    public abstract C1646qt d();

    public abstract Bt e() throws IOException;

    public abstract Bt f();

    public abstract String g() throws IOException;

    public abstract C1795vt h() throws IOException;

    public abstract byte i() throws IOException;

    public abstract short j() throws IOException;

    public abstract float k() throws IOException;

    public abstract long l() throws IOException;

    public abstract double m() throws IOException;

    public abstract BigInteger n() throws IOException;

    public abstract BigDecimal o() throws IOException;

    public final String a(Set<String> set) throws IOException {
        Bt q = q();
        while (q == Bt.FIELD_NAME) {
            String c = c();
            e();
            if (set.contains(c)) {
                return c;
            }
            h();
            q = e();
        }
        return null;
    }

    public final Object a(Type type, boolean z, C1585ot otVar) throws IOException {
        try {
            if (!Void.class.equals(type)) {
                p();
            }
            return a(null, type, new ArrayList(), null, null, true);
        } finally {
            if (z) {
                a();
            }
        }
    }

    private final void a(Field field, Map<String, Object> map, Type type, ArrayList<Type> arrayList, C1585ot otVar) throws IOException {
        Bt q = q();
        while (q == Bt.FIELD_NAME) {
            String c = c();
            e();
            if (otVar == null) {
                map.put(c, a(field, type, arrayList, map, otVar, true));
                q = e();
            } else {
                throw new NoSuchMethodError();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x01cd A[Catch:{ IllegalArgumentException -> 0x045a }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01d7 A[Catch:{ IllegalArgumentException -> 0x045a }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01ff A[Catch:{ IllegalArgumentException -> 0x045a }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0252 A[Catch:{ IllegalArgumentException -> 0x045a }] */
    private final Object a(Field field, Type type, ArrayList<Type> arrayList, Object obj, C1585ot otVar, boolean z) throws IOException {
        Object obj2;
        Mt mt;
        Type type2;
        boolean z2;
        boolean z3;
        Field field2 = field;
        ArrayList<Type> arrayList2 = arrayList;
        Type a2 = Ot.a((List<Type>) arrayList2, type);
        Type type3 = null;
        Class cls = a2 instanceof Class ? (Class) a2 : null;
        if (a2 instanceof ParameterizedType) {
            cls = C1431ju.a((ParameterizedType) a2);
        }
        if (cls == Void.class) {
            h();
            return null;
        }
        Bt f = f();
        try {
            boolean z4 = false;
            boolean z5 = true;
            switch (C1885yt.a[f().ordinal()]) {
                case 1:
                case 4:
                case 5:
                    String str = "expected object or map type but got %s";
                    Object[] objArr = {a2};
                    if (!C1431ju.a(a2)) {
                        Field a3 = z ? a(cls) : null;
                        if (cls != null) {
                            if (otVar != null) {
                                throw new NoSuchMethodError();
                            }
                        }
                        boolean z6 = cls != null && C1431ju.a(cls, Map.class);
                        if (a3 != null) {
                            obj2 = new C1675rt();
                        } else {
                            if (!z6) {
                                if (cls != null) {
                                    obj2 = C1431ju.a(cls);
                                }
                            }
                            obj2 = Ot.b(cls);
                        }
                        Object obj3 = obj2;
                        int size = arrayList.size();
                        if (a2 != null) {
                            arrayList2.add(a2);
                        }
                        if (z6 && !Tt.class.isAssignableFrom(cls)) {
                            Type d = Map.class.isAssignableFrom(cls) ? C1431ju.d(a2) : null;
                            if (d != null) {
                                a(field, (Map) obj3, d, arrayList, otVar);
                                return obj3;
                            }
                        }
                        if (obj3 instanceof C1675rt) {
                            ((C1675rt) obj3).a(d());
                        }
                        Bt q = q();
                        Class cls2 = obj3.getClass();
                        Mt a4 = Mt.a(cls2);
                        boolean isAssignableFrom = Tt.class.isAssignableFrom(cls2);
                        if (isAssignableFrom || !Map.class.isAssignableFrom(cls2)) {
                            while (q == Bt.FIELD_NAME) {
                                String c = c();
                                e();
                                if (otVar == null) {
                                    Ut a5 = a4.a(c);
                                    if (a5 != null) {
                                        if (a5.e()) {
                                            if (!a5.c()) {
                                                throw new IllegalArgumentException("final array/object fields are not supported");
                                            }
                                        }
                                        Field d2 = a5.d();
                                        int size2 = arrayList.size();
                                        arrayList2.add(d2.getGenericType());
                                        Ut ut = a5;
                                        int i = size2;
                                        mt = a4;
                                        Object a6 = a(d2, a5.a(), arrayList, obj3, otVar, true);
                                        arrayList2.remove(i);
                                        ut.a(obj3, a6);
                                    } else {
                                        mt = a4;
                                        if (isAssignableFrom) {
                                            ((Tt) obj3).a(c, a(null, null, arrayList, obj3, otVar, true));
                                        } else if (otVar == null) {
                                            h();
                                        } else {
                                            throw new NoSuchMethodError();
                                        }
                                    }
                                    q = e();
                                    a4 = mt;
                                } else {
                                    throw new NoSuchMethodError();
                                }
                            }
                        } else {
                            a(null, (Map) obj3, C1431ju.d(cls2), arrayList, otVar);
                        }
                        if (a2 != null) {
                            arrayList2.remove(size);
                        }
                        if (a3 == null) {
                            return obj3;
                        }
                        Object obj4 = ((C1675rt) obj3).get(a3.getName());
                        String str2 = "No value specified for @JsonPolymorphicTypeMap field";
                        if (obj4 != null) {
                            String obj5 = obj4.toString();
                            a[] zzbn = ((C1855xt) a3.getAnnotation(C1855xt.class)).zzbn();
                            int length = zzbn.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    a aVar = zzbn[i2];
                                    if (aVar.zzbo().equals(obj5)) {
                                        type2 = aVar.zzbp();
                                    } else {
                                        i2++;
                                    }
                                } else {
                                    type2 = null;
                                }
                            }
                            if (type2 == null) {
                                z5 = false;
                            }
                            String str3 = "No TypeDef annotation found with key: ";
                            String valueOf = String.valueOf(obj5);
                            String concat = valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3);
                            if (z5) {
                                C1646qt d3 = d();
                                C1795vt a7 = d3.a(d3.a(obj3));
                                a7.p();
                                return a7.a(field, type2, arrayList, null, null, false);
                            }
                            throw new IllegalArgumentException(String.valueOf(concat));
                        }
                        throw new IllegalArgumentException(str2);
                    }
                    throw new IllegalArgumentException(Uu.a(str, objArr));
                case 2:
                case 3:
                    boolean a8 = C1431ju.a(a2);
                    if (a2 != null && !a8) {
                        if (cls == null || !C1431ju.a(cls, Collection.class)) {
                            z2 = false;
                            String str4 = "expected collection or array type but got %s";
                            Object[] objArr2 = {a2};
                            if (!z2) {
                                if (otVar != null) {
                                    if (field2 != null) {
                                        throw new NoSuchMethodError();
                                    }
                                }
                                Collection b2 = Ot.b(a2);
                                if (a8) {
                                    type3 = C1431ju.b(a2);
                                } else if (cls != null && Iterable.class.isAssignableFrom(cls)) {
                                    type3 = C1431ju.c(a2);
                                }
                                Type a9 = Ot.a((List<Type>) arrayList2, type3);
                                Bt q2 = q();
                                while (q2 != Bt.END_ARRAY) {
                                    b2.add(a(field, a9, arrayList, b2, otVar, true));
                                    q2 = e();
                                }
                                return a8 ? C1431ju.a(b2, C1431ju.a((List<Type>) arrayList2, a9)) : b2;
                            }
                            throw new IllegalArgumentException(Uu.a(str4, objArr2));
                        }
                    }
                    z2 = true;
                    String str42 = "expected collection or array type but got %s";
                    Object[] objArr22 = {a2};
                    if (!z2) {
                    }
                    break;
                case 6:
                case 7:
                    if (!(a2 == null || cls == Boolean.TYPE)) {
                        if (cls == null || !cls.isAssignableFrom(Boolean.class)) {
                            z3 = false;
                            String str5 = "expected type Boolean or boolean but got %s";
                            Object[] objArr3 = {a2};
                            if (!z3) {
                                return f == Bt.VALUE_TRUE ? Boolean.TRUE : Boolean.FALSE;
                            }
                            throw new IllegalArgumentException(Uu.a(str5, objArr3));
                        }
                    }
                    z3 = true;
                    String str52 = "expected type Boolean or boolean but got %s";
                    Object[] objArr32 = {a2};
                    if (!z3) {
                    }
                    break;
                case 8:
                case 9:
                    if (field2 == null || field2.getAnnotation(C1915zt.class) == null) {
                        z4 = true;
                    }
                    String str6 = "number type formatted as a JSON number cannot use @JsonString annotation";
                    if (z4) {
                        if (cls != null) {
                            if (!cls.isAssignableFrom(BigDecimal.class)) {
                                if (cls == BigInteger.class) {
                                    return n();
                                }
                                if (cls != Double.class) {
                                    if (cls != Double.TYPE) {
                                        if (cls != Long.class) {
                                            if (cls != Long.TYPE) {
                                                if (cls != Float.class) {
                                                    if (cls != Float.TYPE) {
                                                        if (cls != Integer.class) {
                                                            if (cls != Integer.TYPE) {
                                                                if (cls != Short.class) {
                                                                    if (cls != Short.TYPE) {
                                                                        if (cls != Byte.class) {
                                                                            if (cls != Byte.TYPE) {
                                                                                String valueOf2 = String.valueOf(a2);
                                                                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 30);
                                                                                sb.append("expected numeric type but got ");
                                                                                sb.append(valueOf2);
                                                                                throw new IllegalArgumentException(sb.toString());
                                                                            }
                                                                        }
                                                                        return Byte.valueOf(i());
                                                                    }
                                                                }
                                                                return Short.valueOf(j());
                                                            }
                                                        }
                                                        return Integer.valueOf(b());
                                                    }
                                                }
                                                return Float.valueOf(k());
                                            }
                                        }
                                        return Long.valueOf(l());
                                    }
                                }
                                return Double.valueOf(m());
                            }
                        }
                        return o();
                    }
                    throw new IllegalArgumentException(str6);
                case 10:
                    String lowerCase = c().trim().toLowerCase(Locale.US);
                    if (!(cls == Float.TYPE || cls == Float.class || cls == Double.TYPE || cls == Double.class) || (!lowerCase.equals("nan") && !lowerCase.equals("infinity") && !lowerCase.equals("-infinity"))) {
                        if (cls == null || !Number.class.isAssignableFrom(cls) || !(field2 == null || field2.getAnnotation(C1915zt.class) == null)) {
                            z4 = true;
                        }
                        String str7 = "number field formatted as a JSON string must use the @JsonString annotation";
                        if (!z4) {
                            throw new IllegalArgumentException(str7);
                        }
                    }
                    return Ot.a(a2, c());
                case 11:
                    if (cls == null || !cls.isPrimitive()) {
                        z4 = true;
                    }
                    String str8 = "primitive number field but found a JSON null";
                    if (z4) {
                        if (!(cls == null || (cls.getModifiers() & 1536) == 0)) {
                            if (C1431ju.a(cls, Collection.class)) {
                                return Ot.a(Ot.b(a2).getClass());
                            }
                            if (C1431ju.a(cls, Map.class)) {
                                return Ot.a(Ot.b(cls).getClass());
                            }
                        }
                        return Ot.a(C1431ju.a((List<Type>) arrayList2, a2));
                    }
                    throw new IllegalArgumentException(str8);
                default:
                    String valueOf3 = String.valueOf(f);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 27);
                    sb2.append("unexpected JSON node type: ");
                    sb2.append(valueOf3);
                    throw new IllegalArgumentException(sb2.toString());
            }
        } catch (IllegalArgumentException e) {
            StringBuilder sb3 = new StringBuilder();
            String g = g();
            if (g != null) {
                sb3.append("key ");
                sb3.append(g);
            }
            if (field2 != null) {
                if (g != null) {
                    sb3.append(", ");
                }
                sb3.append("field ");
                sb3.append(field2);
            }
            throw new IllegalArgumentException(sb3.toString(), e);
        }
    }

    private static Field a(Class<?> cls) {
        Field field = null;
        if (cls == null) {
            return null;
        }
        b.lock();
        try {
            if (a.containsKey(cls)) {
                return (Field) a.get(cls);
            }
            for (Ut d : Mt.a(cls).c()) {
                Field d2 = d.d();
                C1855xt xtVar = (C1855xt) d2.getAnnotation(C1855xt.class);
                if (xtVar != null) {
                    String str = "Class contains more than one field with @JsonPolymorphicTypeMap annotation: %s";
                    Object[] objArr = {cls};
                    if (field == null) {
                        String str2 = "Field which has the @JsonPolymorphicTypeMap, %s, is not a supported type: %s";
                        Object[] objArr2 = {cls, d2.getType()};
                        if (Ot.a((Type) d2.getType())) {
                            a[] zzbn = xtVar.zzbn();
                            HashSet hashSet = new HashSet();
                            String str3 = "@JsonPolymorphicTypeMap must have at least one @TypeDef";
                            if (zzbn.length > 0) {
                                int length = zzbn.length;
                                int i = 0;
                                while (i < length) {
                                    a aVar = zzbn[i];
                                    String str4 = "Class contains two @TypeDef annotations with identical key: %s";
                                    Object[] objArr3 = {aVar.zzbo()};
                                    if (hashSet.add(aVar.zzbo())) {
                                        i++;
                                    } else {
                                        throw new IllegalArgumentException(Uu.a(str4, objArr3));
                                    }
                                }
                                field = d2;
                            } else {
                                throw new IllegalArgumentException(str3);
                            }
                        } else {
                            throw new IllegalArgumentException(Uu.a(str2, objArr2));
                        }
                    } else {
                        throw new IllegalArgumentException(Uu.a(str, objArr));
                    }
                }
            }
            a.put(cls, field);
            b.unlock();
            return field;
        } finally {
            b.unlock();
        }
    }
}
