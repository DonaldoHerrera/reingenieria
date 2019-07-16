package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@EVa(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002 !B?\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0002\u0010\u000eJ\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0016¢\u0006\u0002\u0010\u001fR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0006X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "jClass", "Ljava/lang/Class;", "parameterNames", "", "", "callMode", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "origin", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "methods", "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/util/List;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;Ljava/util/List;)V", "defaultValues", "", "erasedParameterTypes", "member", "getMember", "()Ljava/lang/Void;", "parameterTypes", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "CallMode", "Origin", "kotlin-reflect-api"}, mv = {1, 1, 15})
/* renamed from: fbb reason: default package and case insensitive filesystem */
/* compiled from: AnnotationConstructorCaller.kt */
public final class C6448fbb implements C6992nbb {
    private final List<Type> a;
    private final List<Class<?>> b;
    private final List<Object> c;
    private final Class<?> d;
    private final List<String> e;
    private final a f;
    private final List<Method> g;

    /* renamed from: fbb$a */
    /* compiled from: AnnotationConstructorCaller.kt */
    public enum a {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    /* renamed from: fbb$b */
    /* compiled from: AnnotationConstructorCaller.kt */
    public enum b {
        JAVA,
        KOTLIN
    }

    public C6448fbb(Class<?> cls, List<String> list, a aVar, b bVar, List<Method> list2) {
        C7471uYa.b(cls, "jClass");
        C7471uYa.b(list, "parameterNames");
        C7471uYa.b(aVar, "callMode");
        C7471uYa.b(bVar, "origin");
        C7471uYa.b(list2, "methods");
        this.d = cls;
        this.e = list;
        this.f = aVar;
        this.g = list2;
        List<Method> list3 = this.g;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list3, 10));
        for (Method genericReturnType : list3) {
            arrayList.add(genericReturnType.getGenericReturnType());
        }
        this.a = arrayList;
        List<Method> list4 = this.g;
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) list4, 10));
        for (Method returnType : list4) {
            Class returnType2 = returnType.getReturnType();
            C7471uYa.a((Object) returnType2, "it");
            Class f2 = Rvb.f(returnType2);
            if (f2 != null) {
                returnType2 = f2;
            }
            arrayList2.add(returnType2);
        }
        this.b = arrayList2;
        List<Method> list5 = this.g;
        ArrayList arrayList3 = new ArrayList(C6986nWa.a((Iterable<? extends T>) list5, 10));
        for (Method defaultValue : list5) {
            arrayList3.add(defaultValue.getDefaultValue());
        }
        this.c = arrayList3;
        if (this.f == a.POSITIONAL_CALL && bVar == b.JAVA && (!C7676xWa.c((Iterable) this.e, (Object) "value").isEmpty())) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    public Type a() {
        return this.d;
    }

    public void b(Object[] objArr) {
        C7471uYa.b(objArr, "args");
        defpackage.C6992nbb.a.a(this, objArr);
    }

    public Void getMember() {
        return null;
    }

    public Object a(Object[] objArr) {
        Object obj;
        C7471uYa.b(objArr, "args");
        b(objArr);
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Object obj2 = objArr[i];
            int i3 = i2 + 1;
            if (obj2 == null && this.f == a.CALL_BY_NAME) {
                obj = this.c.get(i2);
            } else {
                obj = C6856lbb.b(obj2, (Class) this.b.get(i2));
            }
            if (obj != null) {
                arrayList.add(obj);
                i++;
                i2 = i3;
            } else {
                C6856lbb.a(i2, (String) this.e.get(i2), (Class) this.b.get(i2));
                throw null;
            }
        }
        return C6856lbb.a(this.d, LWa.a((Iterable<? extends HVa<? extends K, ? extends V>>) C7676xWa.e((Iterable) this.e, (Iterable) arrayList)), this.g);
    }

    public List<Type> b() {
        return this.a;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r8v0, types: [java.util.List, java.util.List<java.lang.String>, java.lang.Iterable] */
    public /* synthetic */ C6448fbb(Class cls, List<String> list, a aVar, b bVar, List list2, int i, C7264rYa rya) {
        if ((i & 16) != 0) {
            list2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
            for (String declaredMethod : list) {
                list2.add(cls.getDeclaredMethod(declaredMethod, new Class[0]));
            }
        }
        this(cls, list, aVar, bVar, list2);
    }
}
