package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: ju reason: default package and case insensitive filesystem */
public final class C1431ju {
    private static ParameterizedType a(Type type, Class<?> cls) {
        Class<?> cls2;
        if ((type instanceof Class) || (type instanceof ParameterizedType)) {
            while (type != null && type != Object.class) {
                if (type instanceof Class) {
                    cls2 = (Class) type;
                } else {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    Class<?> a = a(parameterizedType);
                    if (a == cls) {
                        return parameterizedType;
                    }
                    if (cls.isInterface()) {
                        Type[] genericInterfaces = a.getGenericInterfaces();
                        int length = genericInterfaces.length;
                        for (int i = 0; i < length; i++) {
                            Type type2 = genericInterfaces[i];
                            if (cls.isAssignableFrom(type2 instanceof Class ? (Class) type2 : a((ParameterizedType) type2))) {
                                type = type2;
                                break;
                            }
                        }
                    }
                    cls2 = a;
                }
                type = cls2.getGenericSuperclass();
            }
        }
        return null;
    }

    public static Type b(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    public static Type c(Type type) {
        return a(type, Iterable.class, 0);
    }

    public static Type d(Type type) {
        return a(type, Map.class, 1);
    }

    public static boolean a(Class<?> cls, Class<?> cls2) {
        return cls.isAssignableFrom(cls2) || cls2.isAssignableFrom(cls);
    }

    public static <T> T a(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw a((Exception) e, cls);
        } catch (InstantiationException e2) {
            throw a((Exception) e2, cls);
        }
    }

    private static IllegalArgumentException a(Exception exc, Class<?> cls) {
        StringBuilder sb = new StringBuilder("unable to create new instance of class ");
        sb.append(cls.getName());
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (cls.isArray()) {
            arrayList.add("because it is an array");
        } else if (cls.isPrimitive()) {
            arrayList.add("because it is primitive");
        } else if (cls == Void.class) {
            arrayList.add("because it is void");
        } else {
            if (Modifier.isInterface(cls.getModifiers())) {
                arrayList.add("because it is an interface");
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add("because it is abstract");
            }
            if (cls.getEnclosingClass() != null && !Modifier.isStatic(cls.getModifiers())) {
                arrayList.add("because it is not static");
            }
            if (!Modifier.isPublic(cls.getModifiers())) {
                arrayList.add("possibly because it is not public");
            } else {
                try {
                    cls.getConstructor(new Class[0]);
                } catch (NoSuchMethodException unused) {
                    arrayList.add("because it has no accessible default constructor");
                }
            }
        }
        int size = arrayList.size();
        boolean z = false;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            if (z) {
                sb.append(" and");
            } else {
                z = true;
            }
            sb.append(" ");
            sb.append(str);
        }
        return new IllegalArgumentException(sb.toString(), exc);
    }

    public static boolean a(Type type) {
        return (type instanceof GenericArrayType) || ((type instanceof Class) && ((Class) type).isArray());
    }

    public static Class<?> a(ParameterizedType parameterizedType) {
        return (Class) parameterizedType.getRawType();
    }

    public static Type a(WildcardType wildcardType) {
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (lowerBounds.length != 0) {
            return lowerBounds[0];
        }
        return wildcardType.getUpperBounds()[0];
    }

    public static Type a(List<Type> list, TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            Class cls = (Class) genericDeclaration;
            int size = list.size();
            ParameterizedType parameterizedType = null;
            while (parameterizedType == null) {
                size--;
                if (size < 0) {
                    break;
                }
                parameterizedType = a((Type) list.get(size), cls);
            }
            if (parameterizedType != null) {
                TypeVariable[] typeParameters = genericDeclaration.getTypeParameters();
                int i = 0;
                while (i < typeParameters.length && !typeParameters[i].equals(typeVariable)) {
                    i++;
                }
                Type type = parameterizedType.getActualTypeArguments()[i];
                if (type instanceof TypeVariable) {
                    Type a = a(list, (TypeVariable) type);
                    if (a != null) {
                        return a;
                    }
                }
                return type;
            }
        }
        return null;
    }

    public static Class<?> a(List<Type> list, Type type) {
        if (type instanceof TypeVariable) {
            type = a(list, (TypeVariable) type);
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(a(list, b(type)), 0).getClass();
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return a((ParameterizedType) type);
        }
        C1216cu.a(type == null, "wildcard type is not supported: %s", type);
        return Object.class;
    }

    private static Type a(Type type, Class<?> cls, int i) {
        ParameterizedType a = a(type, cls);
        if (a == null) {
            return null;
        }
        Type type2 = a.getActualTypeArguments()[i];
        if (type2 instanceof TypeVariable) {
            Type a2 = a(Arrays.asList(new Type[]{type}), (TypeVariable) type2);
            if (a2 != null) {
                return a2;
            }
        }
        return type2;
    }

    public static <T> Iterable<T> a(Object obj) {
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        Class cls = obj.getClass();
        C1216cu.a(cls.isArray(), "not an array or Iterable: %s", cls);
        if (!cls.getComponentType().isPrimitive()) {
            return Arrays.asList((Object[]) obj);
        }
        return new C1400iu(obj);
    }

    public static Object a(Collection<?> collection, Class<?> cls) {
        if (!cls.isPrimitive()) {
            return collection.toArray((Object[]) Array.newInstance(cls, collection.size()));
        }
        Object newInstance = Array.newInstance(cls, collection.size());
        int i = 0;
        for (Object obj : collection) {
            int i2 = i + 1;
            Array.set(newInstance, i, obj);
            i = i2;
        }
        return newInstance;
    }
}
