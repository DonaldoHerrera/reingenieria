package defpackage;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* renamed from: JKa reason: default package and case insensitive filesystem */
/* compiled from: Types */
final class C5021JKa {
    static final Type[] a = new Type[0];

    /* renamed from: JKa$a */
    /* compiled from: Types */
    private static final class a implements GenericArrayType, Serializable {
        private final Type a;

        public a(Type type) {
            this.a = C5021JKa.b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C5021JKa.a((Type) this, (Type) (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C5021JKa.d(this.a));
            sb.append("[]");
            return sb.toString();
        }
    }

    /* renamed from: JKa$b */
    /* compiled from: Types */
    private static final class b implements ParameterizedType, Serializable {
        private final Type a;
        private final Type b;
        private final Type[] c;

        public b(Type type, Type type2, Type... typeArr) {
            Type type3;
            int i = 0;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z) {
                    throw new IllegalArgumentException();
                }
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = C5021JKa.b(type);
            }
            this.a = type3;
            this.b = C5021JKa.b(type2);
            this.c = (Type[]) typeArr.clone();
            while (true) {
                Type[] typeArr2 = this.c;
                if (i >= typeArr2.length) {
                    return;
                }
                if (typeArr2[i] != null) {
                    C5021JKa.e(typeArr2[i]);
                    Type[] typeArr3 = this.c;
                    typeArr3[i] = C5021JKa.b(typeArr3[i]);
                    i++;
                } else {
                    throw new NullPointerException();
                }
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C5021JKa.a((Type) this, (Type) (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.c.clone();
        }

        public Type getOwnerType() {
            return this.a;
        }

        public Type getRawType() {
            return this.b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.c) ^ this.b.hashCode()) ^ C5021JKa.b((Object) this.a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.c.length + 1) * 30);
            sb.append(C5021JKa.d(this.b));
            if (this.c.length == 0) {
                return sb.toString();
            }
            sb.append('<');
            sb.append(C5021JKa.d(this.c[0]));
            for (int i = 1; i < this.c.length; i++) {
                sb.append(", ");
                sb.append(C5021JKa.d(this.c[i]));
            }
            sb.append('>');
            return sb.toString();
        }
    }

    /* renamed from: JKa$c */
    /* compiled from: Types */
    private static final class c implements WildcardType, Serializable {
        private final Type a;
        private final Type b;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                if (typeArr2[0] != null) {
                    C5021JKa.e(typeArr2[0]);
                    if (typeArr[0] == Object.class) {
                        this.b = C5021JKa.b(typeArr2[0]);
                        this.a = Object.class;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                throw new NullPointerException();
            } else if (typeArr[0] != null) {
                C5021JKa.e(typeArr[0]);
                this.b = null;
                this.a = C5021JKa.b(typeArr[0]);
            } else {
                throw new NullPointerException();
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C5021JKa.a((Type) this, (Type) (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.b;
            if (type == null) {
                return C5021JKa.a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.a};
        }

        public int hashCode() {
            Type type = this.b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.a.hashCode() + 31);
        }

        public String toString() {
            if (this.b != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("? super ");
                sb.append(C5021JKa.d(this.b));
                return sb.toString();
            } else if (this.a == Object.class) {
                return "?";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("? extends ");
                sb2.append(C5021JKa.d(this.a));
                return sb2.toString();
            }
        }
    }

    private C5021JKa() {
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [JKa$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static Type b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                cls = new a(b((Type) cls.getComponentType()));
            }
            return cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    public static Class<?> c(Type type) {
        String str;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(c(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return c(((WildcardType) type).getUpperBounds()[0]);
            }
            if (type == null) {
                str = "null";
            } else {
                str = type.getClass().getName();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
            sb.append(type);
            sb.append("> is of type ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static String d(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* access modifiers changed from: private */
    public static void e(Type type) {
        if (!(!(type instanceof Class) || !((Class) type).isPrimitive())) {
            throw new IllegalArgumentException();
        }
    }

    static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean a(Type type, Type type2) {
        boolean z = true;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (!a((Object) parameterizedType.getOwnerType(), (Object) parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                z = false;
            }
            return z;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                z = false;
            }
            return z;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                z = false;
            }
            return z;
        }
    }

    /* access modifiers changed from: private */
    public static int b(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    static Type a(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new IllegalArgumentException("Missing type parameter.");
    }
}
