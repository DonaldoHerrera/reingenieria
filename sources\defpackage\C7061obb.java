package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

@EVa(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u001e*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\b\u001b\u001c\u001d\u001e\u001f !\"B3\b\u0002\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0004R\u0017\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u0001\u0007#$%&'()¨\u0006*"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "member", "returnType", "Ljava/lang/reflect/Type;", "instanceClass", "Ljava/lang/Class;", "valueParameterTypes", "", "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "getInstanceClass", "()Ljava/lang/Class;", "getMember", "()Ljava/lang/reflect/Member;", "Ljava/lang/reflect/Member;", "parameterTypes", "", "getParameterTypes", "()Ljava/util/List;", "getReturnType", "()Ljava/lang/reflect/Type;", "checkObjectInstance", "", "obj", "", "AccessorForHiddenBoundConstructor", "AccessorForHiddenConstructor", "BoundConstructor", "Companion", "Constructor", "FieldGetter", "FieldSetter", "Method", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "kotlin-reflect-api"}, mv = {1, 1, 15})
/* renamed from: obb reason: default package and case insensitive filesystem */
/* compiled from: CallerImpl.kt */
public abstract class C7061obb<M extends Member> implements C6992nbb<M> {
    public static final d a = new d(null);
    private final List<Type> b;
    private final M c;
    private final Type d;
    private final Class<?> e;

    /* renamed from: obb$a */
    /* compiled from: CallerImpl.kt */
    public static final class a extends C7061obb<Constructor<?>> implements C6924mbb {
        private final Object f;

        public a(Constructor<?> constructor, Object obj) {
            Object obj2;
            C7471uYa.b(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            C7471uYa.a((Object) declaringClass, "constructor.declaringClass");
            d dVar = C7061obb.a;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            C7471uYa.a((Object) genericParameterTypes, "constructor.genericParameterTypes");
            if (genericParameterTypes.length <= 2) {
                obj2 = new Type[0];
            } else {
                obj2 = C6374eWa.a(genericParameterTypes, 1, genericParameterTypes.length - 1);
                if (obj2 == null) {
                    throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            super(constructor, declaringClass, null, (Type[]) obj2, null);
            this.f = obj;
        }

        public Object a(Object[] objArr) {
            C7471uYa.b(objArr, "args");
            b(objArr);
            Constructor constructor = (Constructor) getMember();
            JYa jYa = new JYa(3);
            jYa.a(this.f);
            jYa.b(objArr);
            jYa.a((Object) null);
            return constructor.newInstance(jYa.a(new Object[jYa.a()]));
        }
    }

    /* renamed from: obb$b */
    /* compiled from: CallerImpl.kt */
    public static final class b extends C7061obb<Constructor<?>> {
        public b(Constructor<?> constructor) {
            Object obj;
            C7471uYa.b(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            C7471uYa.a((Object) declaringClass, "constructor.declaringClass");
            d dVar = C7061obb.a;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            C7471uYa.a((Object) genericParameterTypes, "constructor.genericParameterTypes");
            if (genericParameterTypes.length <= 1) {
                obj = new Type[0];
            } else {
                obj = C6374eWa.a(genericParameterTypes, 0, genericParameterTypes.length - 1);
                if (obj == null) {
                    throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            super(constructor, declaringClass, null, (Type[]) obj, null);
        }

        public Object a(Object[] objArr) {
            C7471uYa.b(objArr, "args");
            b(objArr);
            Constructor constructor = (Constructor) getMember();
            JYa jYa = new JYa(2);
            jYa.b(objArr);
            jYa.a((Object) null);
            return constructor.newInstance(jYa.a(new Object[jYa.a()]));
        }
    }

    /* renamed from: obb$c */
    /* compiled from: CallerImpl.kt */
    public static final class c extends C7061obb<Constructor<?>> implements C6924mbb {
        private final Object f;

        public c(Constructor<?> constructor, Object obj) {
            C7471uYa.b(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            C7471uYa.a((Object) declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            C7471uYa.a((Object) genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, null, genericParameterTypes, null);
            this.f = obj;
        }

        public Object a(Object[] objArr) {
            C7471uYa.b(objArr, "args");
            b(objArr);
            Constructor constructor = (Constructor) getMember();
            JYa jYa = new JYa(2);
            jYa.a(this.f);
            jYa.b(objArr);
            return constructor.newInstance(jYa.a(new Object[jYa.a()]));
        }
    }

    /* renamed from: obb$d */
    /* compiled from: CallerImpl.kt */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: obb$e */
    /* compiled from: CallerImpl.kt */
    public static final class e extends C7061obb<Constructor<?>> {
        public e(Constructor<?> constructor) {
            C7471uYa.b(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            C7471uYa.a((Object) declaringClass, "constructor.declaringClass");
            Class declaringClass2 = constructor.getDeclaringClass();
            C7471uYa.a((Object) declaringClass2, "klass");
            Class declaringClass3 = declaringClass2.getDeclaringClass();
            Class cls = (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            C7471uYa.a((Object) genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, cls, genericParameterTypes, null);
        }

        public Object a(Object[] objArr) {
            C7471uYa.b(objArr, "args");
            b(objArr);
            return ((Constructor) getMember()).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    @EVa(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000b\u0001\u0005\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "field", "requiresInstance", "", "(Ljava/lang/reflect/Field;Z)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "BoundInstance", "BoundJvmStaticInObject", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "kotlin-reflect-api"}, mv = {1, 1, 15})
    /* renamed from: obb$f */
    /* compiled from: CallerImpl.kt */
    public static abstract class f extends C7061obb<Field> {

        /* renamed from: obb$f$a */
        /* compiled from: CallerImpl.kt */
        public static final class a extends f implements C6924mbb {
            private final Object f;

            public a(Field field, Object obj) {
                C7471uYa.b(field, "field");
                super(field, false, null);
                this.f = obj;
            }

            public Object a(Object[] objArr) {
                C7471uYa.b(objArr, "args");
                b(objArr);
                return ((Field) getMember()).get(this.f);
            }
        }

        /* renamed from: obb$f$b */
        /* compiled from: CallerImpl.kt */
        public static final class b extends f implements C6924mbb {
            public b(Field field) {
                C7471uYa.b(field, "field");
                super(field, false, null);
            }
        }

        /* renamed from: obb$f$c */
        /* compiled from: CallerImpl.kt */
        public static final class c extends f {
            public c(Field field) {
                C7471uYa.b(field, "field");
                super(field, true, null);
            }
        }

        /* renamed from: obb$f$d */
        /* compiled from: CallerImpl.kt */
        public static final class d extends f {
            public d(Field field) {
                C7471uYa.b(field, "field");
                super(field, true, null);
            }

            public void b(Object[] objArr) {
                C7471uYa.b(objArr, "args");
                C7061obb.super.b(objArr);
                a(C6578hWa.f(objArr));
            }
        }

        /* renamed from: obb$f$e */
        /* compiled from: CallerImpl.kt */
        public static final class e extends f {
            public e(Field field) {
                C7471uYa.b(field, "field");
                super(field, false, null);
            }
        }

        public /* synthetic */ f(Field field, boolean z, C7264rYa rya) {
            this(field, z);
        }

        public Object a(Object[] objArr) {
            C7471uYa.b(objArr, "args");
            b(objArr);
            return ((Field) getMember()).get(c() != null ? C6578hWa.e((T[]) objArr) : null);
        }

        private f(Field field, boolean z) {
            Type genericType = field.getGenericType();
            C7471uYa.a((Object) genericType, "field.genericType");
            super(field, genericType, z ? field.getDeclaringClass() : null, new Type[0], null);
        }
    }

    @EVa(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0010\u0011\u0012\u0013\u0014B\u001f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0001\u0005\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "field", "notNull", "", "requiresInstance", "(Ljava/lang/reflect/Field;ZZ)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "checkArguments", "", "([Ljava/lang/Object;)V", "BoundInstance", "BoundJvmStaticInObject", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "kotlin-reflect-api"}, mv = {1, 1, 15})
    /* renamed from: obb$g */
    /* compiled from: CallerImpl.kt */
    public static abstract class g extends C7061obb<Field> {
        private final boolean f;

        /* renamed from: obb$g$a */
        /* compiled from: CallerImpl.kt */
        public static final class a extends g implements C6924mbb {
            private final Object g;

            public a(Field field, boolean z, Object obj) {
                C7471uYa.b(field, "field");
                super(field, z, false, null);
                this.g = obj;
            }

            public Object a(Object[] objArr) {
                C7471uYa.b(objArr, "args");
                b(objArr);
                ((Field) getMember()).set(this.g, C6578hWa.e((T[]) objArr));
                return RVa.a;
            }
        }

        /* renamed from: obb$g$b */
        /* compiled from: CallerImpl.kt */
        public static final class b extends g implements C6924mbb {
            public b(Field field, boolean z) {
                C7471uYa.b(field, "field");
                super(field, z, false, null);
            }

            public Object a(Object[] objArr) {
                C7471uYa.b(objArr, "args");
                b(objArr);
                ((Field) getMember()).set(null, C6578hWa.h(objArr));
                return RVa.a;
            }
        }

        /* renamed from: obb$g$c */
        /* compiled from: CallerImpl.kt */
        public static final class c extends g {
            public c(Field field, boolean z) {
                C7471uYa.b(field, "field");
                super(field, z, true, null);
            }
        }

        /* renamed from: obb$g$d */
        /* compiled from: CallerImpl.kt */
        public static final class d extends g {
            public d(Field field, boolean z) {
                C7471uYa.b(field, "field");
                super(field, z, true, null);
            }

            public void b(Object[] objArr) {
                C7471uYa.b(objArr, "args");
                super.b(objArr);
                a(C6578hWa.f(objArr));
            }
        }

        /* renamed from: obb$g$e */
        /* compiled from: CallerImpl.kt */
        public static final class e extends g {
            public e(Field field, boolean z) {
                C7471uYa.b(field, "field");
                super(field, z, false, null);
            }
        }

        public /* synthetic */ g(Field field, boolean z, boolean z2, C7264rYa rya) {
            this(field, z, z2);
        }

        public Object a(Object[] objArr) {
            C7471uYa.b(objArr, "args");
            b(objArr);
            ((Field) getMember()).set(c() != null ? C6578hWa.e((T[]) objArr) : null, C6578hWa.h(objArr));
            return RVa.a;
        }

        public void b(Object[] objArr) {
            C7471uYa.b(objArr, "args");
            C7061obb.super.b(objArr);
            if (this.f && C6578hWa.h(objArr) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        private g(Field field, boolean z, boolean z2) {
            Class cls = Void.TYPE;
            C7471uYa.a((Object) cls, "Void.TYPE");
            Class declaringClass = z2 ? field.getDeclaringClass() : null;
            Type genericType = field.getGenericType();
            C7471uYa.a((Object) genericType, "field.genericType");
            Type[] typeArr = {genericType};
            super(field, cls, declaringClass, typeArr, null);
            this.f = z;
        }
    }

    @EVa(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0010\u0011\u0012\u0013\u0014\u0015B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ%\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0004¢\u0006\u0002\u0010\u000fR\u000e\u0010\n\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0001\u0006\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Method;", "method", "requiresInstance", "", "parameterTypes", "", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V", "isVoidMethod", "callMethod", "", "instance", "args", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "BoundInstance", "BoundJvmStaticInObject", "BoundStatic", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "kotlin-reflect-api"}, mv = {1, 1, 15})
    /* renamed from: obb$h */
    /* compiled from: CallerImpl.kt */
    public static abstract class h extends C7061obb<Method> {
        private final boolean f;

        /* renamed from: obb$h$a */
        /* compiled from: CallerImpl.kt */
        public static final class a extends h implements C6924mbb {
            private final Object g;

            public a(Method method, Object obj) {
                C7471uYa.b(method, "method");
                super(method, false, null, 4, null);
                this.g = obj;
            }

            public Object a(Object[] objArr) {
                C7471uYa.b(objArr, "args");
                b(objArr);
                return a(this.g, objArr);
            }
        }

        /* renamed from: obb$h$b */
        /* compiled from: CallerImpl.kt */
        public static final class b extends h implements C6924mbb {
            public b(Method method) {
                C7471uYa.b(method, "method");
                super(method, false, null, 4, null);
            }

            public Object a(Object[] objArr) {
                C7471uYa.b(objArr, "args");
                b(objArr);
                return a(null, objArr);
            }
        }

        /* renamed from: obb$h$c */
        /* compiled from: CallerImpl.kt */
        public static final class c extends h implements C6924mbb {
            private final Object g;

            public c(Method method, Object obj) {
                Object obj2;
                C7471uYa.b(method, "method");
                d dVar = C7061obb.a;
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                C7471uYa.a((Object) genericParameterTypes, "method.genericParameterTypes");
                if (genericParameterTypes.length <= 1) {
                    obj2 = new Type[0];
                } else {
                    obj2 = C6374eWa.a(genericParameterTypes, 1, genericParameterTypes.length);
                    if (obj2 == null) {
                        throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                super(method, false, (Type[]) obj2, null);
                this.g = obj;
            }

            public Object a(Object[] objArr) {
                C7471uYa.b(objArr, "args");
                b(objArr);
                JYa jYa = new JYa(2);
                jYa.a(this.g);
                jYa.b(objArr);
                return a(null, jYa.a(new Object[jYa.a()]));
            }
        }

        /* renamed from: obb$h$d */
        /* compiled from: CallerImpl.kt */
        public static final class d extends h {
            public d(Method method) {
                C7471uYa.b(method, "method");
                super(method, false, null, 6, null);
            }

            public Object a(Object[] objArr) {
                Object[] objArr2;
                C7471uYa.b(objArr, "args");
                b(objArr);
                Object obj = objArr[0];
                d dVar = C7061obb.a;
                if (objArr.length <= 1) {
                    objArr2 = new Object[0];
                } else {
                    objArr2 = C6374eWa.a(objArr, 1, objArr.length);
                    if (objArr2 == null) {
                        throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                return a(obj, objArr2);
            }
        }

        /* renamed from: obb$h$e */
        /* compiled from: CallerImpl.kt */
        public static final class e extends h {
            public e(Method method) {
                C7471uYa.b(method, "method");
                super(method, true, null, 4, null);
            }

            public Object a(Object[] objArr) {
                Object[] objArr2;
                C7471uYa.b(objArr, "args");
                b(objArr);
                a(C6578hWa.f(objArr));
                d dVar = C7061obb.a;
                if (objArr.length <= 1) {
                    objArr2 = new Object[0];
                } else {
                    objArr2 = C6374eWa.a(objArr, 1, objArr.length);
                    if (objArr2 == null) {
                        throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                return a(null, objArr2);
            }
        }

        /* renamed from: obb$h$f */
        /* compiled from: CallerImpl.kt */
        public static final class f extends h {
            public f(Method method) {
                C7471uYa.b(method, "method");
                super(method, false, null, 6, null);
            }

            public Object a(Object[] objArr) {
                C7471uYa.b(objArr, "args");
                b(objArr);
                return a(null, objArr);
            }
        }

        public /* synthetic */ h(Method method, boolean z, Type[] typeArr, C7264rYa rya) {
            this(method, z, typeArr);
        }

        /* access modifiers changed from: protected */
        public final Object a(Object obj, Object[] objArr) {
            C7471uYa.b(objArr, "args");
            return this.f ? RVa.a : ((Method) getMember()).invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }

        /* synthetic */ h(Method method, boolean z, Type[] typeArr, int i, C7264rYa rya) {
            if ((i & 2) != 0) {
                z = !Modifier.isStatic(method.getModifiers());
            }
            if ((i & 4) != 0) {
                typeArr = method.getGenericParameterTypes();
                C7471uYa.a((Object) typeArr, "method.genericParameterTypes");
            }
            this(method, z, typeArr);
        }

        private h(Method method, boolean z, Type[] typeArr) {
            Type genericReturnType = method.getGenericReturnType();
            C7471uYa.a((Object) genericReturnType, "method.genericReturnType");
            super(method, genericReturnType, z ? method.getDeclaringClass() : null, typeArr, null);
            this.f = C7471uYa.a((Object) a(), (Object) Void.TYPE);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        if (r1 != null) goto L_0x0030;
     */
    private C7061obb(M m, Type type, Class<?> cls, Type[] typeArr) {
        List<Type> list;
        this.c = m;
        this.d = type;
        this.e = cls;
        Class<?> cls2 = this.e;
        if (cls2 != null) {
            JYa jYa = new JYa(2);
            jYa.a((Object) cls2);
            jYa.b(typeArr);
            list = C6918mWa.b((T[]) (Type[]) jYa.a((Object[]) new Type[jYa.a()]));
        }
        list = C6578hWa.j(typeArr);
        this.b = list;
    }

    public final Type a() {
        return this.d;
    }

    public void b(Object[] objArr) {
        C7471uYa.b(objArr, "args");
        defpackage.C6992nbb.a.a(this, objArr);
    }

    public final Class<?> c() {
        return this.e;
    }

    public final M getMember() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final void a(Object obj) {
        if (obj == null || !this.c.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public List<Type> b() {
        return this.b;
    }

    public /* synthetic */ C7061obb(Member member, Type type, Class cls, Type[] typeArr, C7264rYa rya) {
        this(member, type, cls, typeArr);
    }
}
