package defpackage;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.soundcloud.flippernative.BuildConfig;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: Ot reason: default package */
public final class Ot {
    private static final Boolean a = new Boolean(true);
    private static final String b = new String();
    private static final Character c = new Character(0);
    private static final Byte d = new Byte(0);
    private static final Short e = new Short(0);
    private static final Integer f = new Integer(0);
    private static final Float g = new Float(0.0f);
    private static final Long h = new Long(0);
    private static final Double i = new Double(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    private static final BigInteger j;
    private static final BigDecimal k;
    private static final Rt l = new Rt(0);
    private static final ConcurrentHashMap<Class<?>, Object> m;

    static {
        String str = BuildConfig.VERSION_NAME;
        j = new BigInteger(str);
        k = new BigDecimal(str);
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = new ConcurrentHashMap<>();
        m = concurrentHashMap;
        concurrentHashMap.put(Boolean.class, a);
        m.put(String.class, b);
        m.put(Character.class, c);
        m.put(Byte.class, d);
        m.put(Short.class, e);
        m.put(Integer.class, f);
        m.put(Float.class, g);
        m.put(Long.class, h);
        m.put(Double.class, i);
        m.put(BigInteger.class, j);
        m.put(BigDecimal.class, k);
        m.put(Rt.class, l);
    }

    public static <T> T a(Class<?> cls) {
        T t = m.get(cls);
        if (t == null) {
            synchronized (m) {
                t = m.get(cls);
                if (t == null) {
                    int i2 = 0;
                    if (cls.isArray()) {
                        Class<?> cls2 = cls;
                        do {
                            cls2 = cls2.getComponentType();
                            i2++;
                        } while (cls2.isArray());
                        t = Array.newInstance(cls2, new int[i2]);
                    } else if (cls.isEnum()) {
                        Ut a2 = Mt.a(cls).a((String) null);
                        String str = "enum missing constant with @NullValue annotation: %s";
                        Object[] objArr = {cls};
                        if (a2 != null) {
                            t = a2.f();
                        } else {
                            throw new NullPointerException(Uu.a(str, objArr));
                        }
                    } else {
                        t = C1431ju.a(cls);
                    }
                    m.put(cls, t);
                }
            }
        }
        return t;
    }

    public static boolean b(Object obj) {
        return obj != null && obj == m.get(obj.getClass());
    }

    public static Map<String, Object> c(Object obj) {
        if (obj == null || b(obj)) {
            return Collections.emptyMap();
        }
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return new Nt(obj, false);
    }

    public static boolean d(Object obj) {
        return obj == null || a((Type) obj.getClass());
    }

    public static Collection<Object> b(Type type) {
        if (type instanceof WildcardType) {
            type = C1431ju.a((WildcardType) type);
        }
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
        }
        Class cls = type instanceof Class ? (Class) type : null;
        if (type == null || (type instanceof GenericArrayType) || (cls != null && (cls.isArray() || cls.isAssignableFrom(ArrayList.class)))) {
            return new ArrayList();
        }
        if (cls == null) {
            String valueOf = String.valueOf(type);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("unable to create new instance of type: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        } else if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        } else {
            if (cls.isAssignableFrom(TreeSet.class)) {
                return new TreeSet();
            }
            return (Collection) C1431ju.a(cls);
        }
    }

    public static <T> T a(T t) {
        T t2;
        if (t == null || a((Type) t.getClass())) {
            return t;
        }
        if (t instanceof Tt) {
            return (Tt) ((Tt) t).clone();
        }
        Class cls = t.getClass();
        if (cls.isArray()) {
            t2 = Array.newInstance(cls.getComponentType(), Array.getLength(t));
        } else if (t instanceof Gt) {
            t2 = (Gt) ((Gt) t).clone();
        } else {
            if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
                Object[] array = ((List) t).toArray();
                a((Object) array, (Object) array);
                return Arrays.asList(array);
            }
            t2 = C1431ju.a(cls);
        }
        a((Object) t, (Object) t2);
        return t2;
    }

    public static Map<String, Object> b(Class<?> cls) {
        if (cls == null || cls.isAssignableFrom(Gt.class)) {
            return new Gt();
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new TreeMap();
        }
        return (Map) C1431ju.a(cls);
    }

    public static void a(Object obj, Object obj2) {
        Class cls = obj.getClass();
        boolean z = true;
        int i2 = 0;
        if (!(cls == obj2.getClass())) {
            throw new IllegalArgumentException();
        } else if (cls.isArray()) {
            if (Array.getLength(obj) != Array.getLength(obj2)) {
                z = false;
            }
            if (z) {
                for (Object a2 : C1431ju.a(obj)) {
                    int i3 = i2 + 1;
                    Array.set(obj2, i2, a((T) a2));
                    i2 = i3;
                }
                return;
            }
            throw new IllegalArgumentException();
        } else if (Collection.class.isAssignableFrom(cls)) {
            Collection<Object> collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            for (Object a3 : collection) {
                collection2.add(a((T) a3));
            }
        } else {
            boolean isAssignableFrom = Tt.class.isAssignableFrom(cls);
            if (isAssignableFrom || !Map.class.isAssignableFrom(cls)) {
                Mt a4 = isAssignableFrom ? ((Tt) obj).b : Mt.a(cls);
                for (String a5 : a4.f) {
                    Ut a6 = a4.a(a5);
                    if (!a6.e() && (!isAssignableFrom || !a6.c())) {
                        Object a7 = a6.a(obj);
                        if (a7 != null) {
                            a6.a(obj2, a((T) a7));
                        }
                    }
                }
            } else if (Gt.class.isAssignableFrom(cls)) {
                Gt gt = (Gt) obj2;
                Gt gt2 = (Gt) obj;
                int size = gt2.size();
                while (i2 < size) {
                    gt.a(i2, a((T) gt2.c(i2)));
                    i2++;
                }
            } else {
                Map map = (Map) obj2;
                for (Entry entry : ((Map) obj).entrySet()) {
                    map.put((String) entry.getKey(), a((T) entry.getValue()));
                }
            }
        }
    }

    public static boolean a(Type type) {
        if (type instanceof WildcardType) {
            type = C1431ju.a((WildcardType) type);
        }
        if (!(type instanceof Class)) {
            return false;
        }
        Class<Boolean> cls = (Class) type;
        if (cls.isPrimitive() || cls == Character.class || cls == String.class || cls == Integer.class || cls == Long.class || cls == Short.class || cls == Byte.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == Rt.class || cls == Boolean.class) {
            return true;
        }
        return false;
    }

    public static Object a(Type type, String str) {
        Class cls = type instanceof Class ? (Class) type : null;
        if (type == null || cls != null) {
            if (cls == Void.class) {
                return null;
            }
            if (str == null || cls == null || cls.isAssignableFrom(String.class)) {
                return str;
            }
            if (cls == Character.class || cls == Character.TYPE) {
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                String valueOf = String.valueOf(cls);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                sb.append("expected type Character/char but got ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } else if (cls == Boolean.class || cls == Boolean.TYPE) {
                return Boolean.valueOf(str);
            } else {
                if (cls == Byte.class || cls == Byte.TYPE) {
                    return Byte.valueOf(str);
                }
                if (cls == Short.class || cls == Short.TYPE) {
                    return Short.valueOf(str);
                }
                if (cls == Integer.class || cls == Integer.TYPE) {
                    return Integer.valueOf(str);
                }
                if (cls == Long.class || cls == Long.TYPE) {
                    return Long.valueOf(str);
                }
                if (cls == Float.class || cls == Float.TYPE) {
                    return Float.valueOf(str);
                }
                if (cls == Double.class || cls == Double.TYPE) {
                    return Double.valueOf(str);
                }
                if (cls == Rt.class) {
                    return Rt.a(str);
                }
                if (cls == BigInteger.class) {
                    return new BigInteger(str);
                }
                if (cls == BigDecimal.class) {
                    return new BigDecimal(str);
                }
                if (cls.isEnum()) {
                    if (Mt.a(cls).f.contains(str)) {
                        return Mt.a(cls).a(str).f();
                    }
                    throw new IllegalArgumentException(String.format("given enum name %s not part of enumeration", new Object[]{str}));
                }
            }
        }
        String valueOf2 = String.valueOf(type);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 35);
        sb2.append("expected primitive class, but got: ");
        sb2.append(valueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static Type a(List<Type> list, Type type) {
        if (type instanceof WildcardType) {
            type = C1431ju.a((WildcardType) type);
        }
        while (type instanceof TypeVariable) {
            Type a2 = C1431ju.a(list, (TypeVariable) type);
            if (a2 != null) {
                type = a2;
            }
            if (type instanceof TypeVariable) {
                type = ((TypeVariable) type).getBounds()[0];
            }
        }
        return type;
    }
}
