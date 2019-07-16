package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;

@EVa(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "()V", "asString", "", "FakeJavaAnnotationConstructor", "JavaConstructor", "JavaMethod", "KotlinConstructor", "KotlinFunction", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "kotlin-reflect-api"}, mv = {1, 1, 15})
/* renamed from: a_a reason: default package and case insensitive filesystem */
/* compiled from: RuntimeTypeMapper.kt */
public abstract class C5578a_a {

    /* renamed from: a_a$a */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class a extends C5578a_a {
        private final List<Method> a;
        private final Class<?> b;

        public a(Class<?> cls) {
            C7471uYa.b(cls, "jClass");
            super(null);
            this.b = cls;
            Method[] declaredMethods = this.b.getDeclaredMethods();
            C7471uYa.a((Object) declaredMethods, "jClass.declaredMethods");
            this.a = C6578hWa.c((T[]) declaredMethods, (Comparator<? super T>) new ZZa<Object>());
        }

        public String a() {
            return C7676xWa.a(this.a, "", "<init>(", ")V", 0, null, _Za.a, 24, null);
        }

        public final List<Method> b() {
            return this.a;
        }
    }

    /* renamed from: a_a$b */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class b extends C5578a_a {
        private final Constructor<?> a;

        public b(Constructor<?> constructor) {
            C7471uYa.b(constructor, "constructor");
            super(null);
            this.a = constructor;
        }

        public String a() {
            Class[] parameterTypes = this.a.getParameterTypes();
            C7471uYa.a((Object) parameterTypes, "constructor.parameterTypes");
            return C6578hWa.a(parameterTypes, "", "<init>(", ")V", 0, null, C5646b_a.a, 24, null);
        }

        public final Constructor<?> b() {
            return this.a;
        }
    }

    /* renamed from: a_a$c */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class c extends C5578a_a {
        private final Method a;

        public c(Method method) {
            C7471uYa.b(method, "method");
            super(null);
            this.a = method;
        }

        public String a() {
            return C5580abb.b(this.a);
        }

        public final Method b() {
            return this.a;
        }
    }

    /* renamed from: a_a$d */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class d extends C5578a_a {
        private final String a = this.b.a();
        private final defpackage.C6664inb.b b;

        public d(defpackage.C6664inb.b bVar) {
            C7471uYa.b(bVar, "signature");
            super(null);
            this.b = bVar;
        }

        public String a() {
            return this.a;
        }

        public final String b() {
            return this.b.b();
        }
    }

    /* renamed from: a_a$e */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class e extends C5578a_a {
        private final String a = this.b.a();
        private final defpackage.C6664inb.b b;

        public e(defpackage.C6664inb.b bVar) {
            C7471uYa.b(bVar, "signature");
            super(null);
            this.b = bVar;
        }

        public String a() {
            return this.a;
        }

        public final String b() {
            return this.b.b();
        }

        public final String c() {
            return this.b.c();
        }
    }

    private C5578a_a() {
    }

    public abstract String a();

    public /* synthetic */ C5578a_a(C7264rYa rya) {
        this();
    }
}
