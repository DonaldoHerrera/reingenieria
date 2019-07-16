package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

@EVa(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0016\u0017B\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J%\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0004¢\u0006\u0002\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000\u0001\u0002\u0018\u0019¨\u0006\u001a"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Ljava/lang/reflect/Method;", "unboxMethod", "parameterTypes", "", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Method;Ljava/util/List;)V", "member", "getMember", "()Ljava/lang/reflect/Method;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "callMethod", "", "instance", "args", "", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "Bound", "Unbound", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "kotlin-reflect-api"}, mv = {1, 1, 15})
/* renamed from: sbb reason: default package and case insensitive filesystem */
/* compiled from: InternalUnderlyingValOfInlineClass.kt */
public abstract class C7337sbb implements C6992nbb<Method> {
    private final Type a;
    private final Method b;
    private final List<Type> c;

    /* renamed from: sbb$a */
    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    public static final class a extends C7337sbb implements C6924mbb {
        private final Object d;

        public a(Method method, Object obj) {
            C7471uYa.b(method, "unboxMethod");
            super(method, C6918mWa.a(), null);
            this.d = obj;
        }

        public Object a(Object[] objArr) {
            C7471uYa.b(objArr, "args");
            b(objArr);
            return a(this.d, objArr);
        }
    }

    /* renamed from: sbb$b */
    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    public static final class b extends C7337sbb {
        public b(Method method) {
            C7471uYa.b(method, "unboxMethod");
            super(method, C6850lWa.a(method.getDeclaringClass()), null);
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

    private C7337sbb(Method method, List<? extends Type> list) {
        this.b = method;
        this.c = list;
        Class returnType = this.b.getReturnType();
        C7471uYa.a((Object) returnType, "unboxMethod.returnType");
        this.a = returnType;
    }

    public final Type a() {
        return this.a;
    }

    public void b(Object[] objArr) {
        C7471uYa.b(objArr, "args");
        defpackage.C6992nbb.a.a(this, objArr);
    }

    public final Method getMember() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final Object a(Object obj, Object[] objArr) {
        C7471uYa.b(objArr, "args");
        return this.b.invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    public final List<Type> b() {
        return this.c;
    }

    public /* synthetic */ C7337sbb(Method method, List list, C7264rYa rya) {
        this(method, list);
    }
}
