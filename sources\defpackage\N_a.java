package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\b\b \u0018\u0000 =2\u00020\u0001:\u0003=>?B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\f\u001a\u00020\r2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0014\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0013J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011J\u0018\u0010\"\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010#\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u00042\u0006\u0010\u001d\u001a\u00020%H&J\u0012\u0010&\u001a\u0004\u0018\u00010\u00172\u0006\u0010'\u001a\u00020(H&J\"\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0\u00042\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0004J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\u0006\u0010\u001d\u001a\u00020%H&J\u001a\u00100\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t012\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0014\u00102\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J$\u00103\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00104\u001a\u00020(2\u0006\u00105\u001a\u00020(H\u0002J=\u00106\u001a\u0004\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001d\u001a\u00020\u00112\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t082\n\u00109\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0002\u0010:J8\u00106\u001a\u0004\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001d\u001a\u00020\u00112\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t012\n\u00109\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J(\u0010;\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019*\u0006\u0012\u0002\b\u00030\t2\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t01H\u0002J=\u0010<\u001a\u0004\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001d\u001a\u00020\u00112\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t082\n\u00109\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0002\u0010:R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t8TX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006@"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "()V", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "methodOwner", "Ljava/lang/Class;", "getMethodOwner", "()Ljava/lang/Class;", "addParametersAndMasks", "", "result", "", "desc", "", "isConstructor", "", "createProperty", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "findConstructorBySignature", "Ljava/lang/reflect/Constructor;", "findDefaultConstructor", "findDefaultMethod", "Ljava/lang/reflect/Method;", "name", "isMember", "findFunctionDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "signature", "findMethodBySignature", "findPropertyDescriptor", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "index", "", "getMembers", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "belonginess", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "getProperties", "loadParameterTypes", "", "loadReturnType", "parseType", "begin", "end", "lookupMethod", "parameterTypes", "", "returnType", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "tryGetConstructor", "tryGetMethod", "Companion", "Data", "MemberBelonginess", "kotlin-reflect-api"}, mv = {1, 1, 15})
/* renamed from: N_a reason: default package */
/* compiled from: KDeclarationContainerImpl.kt */
public abstract class N_a implements C7057oYa {
    private static final Class<?> a = Class.forName("rYa");
    /* access modifiers changed from: private */
    public static final C7162pxb b = new C7162pxb("<v#(\\d+)>");
    public static final a c = new a(null);

    /* renamed from: N_a$a */
    /* compiled from: KDeclarationContainerImpl.kt */
    public static final class a {
        private a() {
        }

        public final C7162pxb a() {
            return N_a.b;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: N_a$b */
    /* compiled from: KDeclarationContainerImpl.kt */
    public abstract class b {
        static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(b.class), "moduleData", "getModuleData()Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;"))};
        private final defpackage.C5300Sab.a b = C5300Sab.b(new O_a(this));

        public b() {
        }

        public final C4841Dbb a() {
            return (C4841Dbb) this.b.a(this, a[0]);
        }
    }

    /* renamed from: N_a$c */
    /* compiled from: KDeclarationContainerImpl.kt */
    protected enum c {
        DECLARED,
        INHERITED;

        public final boolean a(C4935Gcb gcb) {
            C7471uYa.b(gcb, "member");
            defpackage.C4935Gcb.a g = gcb.g();
            C7471uYa.a((Object) g, "member.kind");
            return g.a() == (this == DECLARED);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d A[LOOP:0: B:6:0x0029->B:21:0x005d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A[SYNTHETIC] */
    private final Method b(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        boolean z;
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            C7471uYa.a((Object) declaredMethod, "result");
            if (C7471uYa.a((Object) declaredMethod.getReturnType(), (Object) cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            C7471uYa.a((Object) declaredMethods, "declaredMethods");
            int length = declaredMethods.length;
            int i = 0;
            while (i < length) {
                Method method = declaredMethods[i];
                C7471uYa.a((Object) method, "method");
                if (C7471uYa.a((Object) method.getName(), (Object) str) && C7471uYa.a((Object) method.getReturnType(), (Object) cls2)) {
                    Class[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes == null) {
                        C7471uYa.a();
                        throw null;
                    } else if (Arrays.equals(parameterTypes, clsArr)) {
                        z = true;
                        if (!z) {
                            return method;
                        }
                        i++;
                    }
                }
                z = false;
                if (!z) {
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final Class<?> d(String str) {
        return a(str, Hxb.a((CharSequence) str, ')', 0, false, 6, (Object) null) + 1, str.length());
    }

    public abstract Collection<C5582adb> a(C7694xnb xnb);

    public abstract C7408tdb a(int i);

    public abstract Collection<C7408tdb> b(C7694xnb xnb);

    public abstract Collection<C5242Qcb> d();

    /* access modifiers changed from: protected */
    public Class<?> e() {
        Class<?> f = Rvb.f(a());
        return f != null ? f : a();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x001e A[SYNTHETIC] */
    public final Collection<C6922m_a<?>> a(Eqb eqb, c cVar) {
        Object obj;
        C7471uYa.b(eqb, "scope");
        C7471uYa.b(cVar, "belonginess");
        S_a s_a = new S_a(this);
        Collection<C5272Rcb> a2 = defpackage.Gqb.a.a(eqb, null, null, 3, null);
        ArrayList arrayList = new ArrayList();
        for (C5272Rcb rcb : a2) {
            if (rcb instanceof C4935Gcb) {
                C4935Gcb gcb = (C4935Gcb) rcb;
                if ((!C7471uYa.a((Object) gcb.d(), (Object) _db.h)) && cVar.a(gcb)) {
                    obj = (C6922m_a) rcb.a(s_a, RVa.a);
                    if (obj == null) {
                        arrayList.add(obj);
                    }
                }
            }
            obj = null;
            if (obj == null) {
            }
        }
        return C7676xWa.q(arrayList);
    }

    public final C7408tdb c(String str, String str2) {
        String str3;
        String str4 = str;
        String str5 = str2;
        C7471uYa.b(str4, "name");
        C7471uYa.b(str5, "signature");
        C6819kxb a2 = b.a(str5);
        boolean z = true;
        if (a2 != null) {
            String str6 = (String) a2.a().a().b().get(1);
            C7408tdb a3 = a(Integer.parseInt(str6));
            if (a3 != null) {
                return a3;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Local property #");
            sb.append(str6);
            sb.append(" not found in ");
            sb.append(a());
            throw new C5240Qab(sb.toString());
        }
        C7694xnb b2 = C7694xnb.b(str);
        String str7 = "Name.identifier(name)";
        C7471uYa.a((Object) b2, str7);
        Collection b3 = b(b2);
        ArrayList arrayList = new ArrayList();
        for (Object next : b3) {
            if (C7471uYa.a((Object) C5504Zab.b.a((C7408tdb) next).a(), (Object) str5)) {
                arrayList.add(next);
            }
        }
        String str8 = ") not resolved in ";
        String str9 = "' (JVM signature: ";
        String str10 = "Property '";
        if (arrayList.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str10);
            sb2.append(str4);
            sb2.append(str9);
            sb2.append(str5);
            sb2.append(str8);
            sb2.append(this);
            throw new C5240Qab(sb2.toString());
        } else if (arrayList.size() == 1) {
            return (C7408tdb) C7676xWa.j((List) arrayList);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next2 : arrayList) {
                C5583aeb d = ((C7408tdb) next2).d();
                Object obj = linkedHashMap.get(d);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(d, obj);
                }
                ((List) obj).add(next2);
            }
            Collection values = KWa.a(linkedHashMap, R_a.a).values();
            C7471uYa.a((Object) values, "properties\n             …                }).values");
            List list = (List) C7676xWa.i((Iterable) values);
            if (list.size() == 1) {
                C7471uYa.a((Object) list, "mostVisibleProperties");
                return (C7408tdb) C7676xWa.f(list);
            }
            C7694xnb b4 = C7694xnb.b(str);
            C7471uYa.a((Object) b4, str7);
            String a4 = C7676xWa.a(b(b4), "\n", null, null, 0, null, Q_a.a, 30, null);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str10);
            sb3.append(str4);
            sb3.append(str9);
            sb3.append(str5);
            sb3.append(str8);
            sb3.append(this);
            sb3.append(':');
            if (a4.length() != 0) {
                z = false;
            }
            if (z) {
                str3 = " no members found";
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(10);
                sb4.append(a4);
                str3 = sb4.toString();
            }
            sb3.append(str3);
            throw new C5240Qab(sb3.toString());
        }
    }

    public final Method b(String str, String str2) {
        C7471uYa.b(str, "name");
        C7471uYa.b(str2, "desc");
        if (C7471uYa.a((Object) str, (Object) "<init>")) {
            return null;
        }
        return a(e(), str, c(str2), d(str2));
    }

    public final Constructor<?> b(String str) {
        C7471uYa.b(str, "desc");
        Class a2 = a();
        ArrayList arrayList = new ArrayList();
        a((List<Class<?>>) arrayList, str, true);
        return a(a2, (List<? extends Class<?>>) arrayList);
    }

    /* access modifiers changed from: private */
    public final C7612wab<?> a(C7408tdb tdb) {
        int i = 0;
        int i2 = tdb.k() != null ? 1 : 0;
        if (tdb.l() != null) {
            i = 1;
        }
        int i3 = i2 + i;
        if (tdb.V()) {
            if (i3 == 0) {
                return new X_a(this, tdb);
            }
            if (i3 == 1) {
                return new Z_a(this, tdb);
            }
            if (i3 == 2) {
                return new C5579aab(this, tdb);
            }
        } else if (i3 == 0) {
            return new C6991nab(this, tdb);
        } else {
            if (i3 == 1) {
                return new C7198qab(this, tdb);
            }
            if (i3 == 2) {
                return new C7405tab(this, tdb);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported property: ");
        sb.append(tdb);
        throw new C5240Qab(sb.toString());
    }

    public final C5582adb a(String str, String str2) {
        Iterable iterable;
        String str3;
        C7471uYa.b(str, "name");
        C7471uYa.b(str2, "signature");
        if (C7471uYa.a((Object) str, (Object) "<init>")) {
            iterable = C7676xWa.q(d());
        } else {
            C7694xnb b2 = C7694xnb.b(str);
            C7471uYa.a((Object) b2, "Name.identifier(name)");
            iterable = a(b2);
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable2) {
            if (C7471uYa.a((Object) C5504Zab.b.a((C5582adb) next).a(), (Object) str2)) {
                arrayList.add(next);
            }
        }
        boolean z = true;
        if (arrayList.size() == 1) {
            return (C5582adb) C7676xWa.j((List) arrayList);
        }
        String a2 = C7676xWa.a(iterable2, "\n", null, null, 0, null, P_a.a, 30, null);
        StringBuilder sb = new StringBuilder();
        sb.append("Function '");
        sb.append(str);
        sb.append("' (JVM signature: ");
        sb.append(str2);
        sb.append(") not resolved in ");
        sb.append(this);
        sb.append(':');
        if (a2.length() != 0) {
            z = false;
        }
        if (z) {
            str3 = " no members found";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(10);
            sb2.append(a2);
            str3 = sb2.toString();
        }
        sb.append(str3);
        throw new C5240Qab(sb.toString());
    }

    private final Method a(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        Class[] interfaces;
        Method b2 = b(cls, str, clsArr, cls2);
        if (b2 != null) {
            return b2;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            Method a2 = a(superclass, str, clsArr, cls2);
            if (a2 != null) {
                return a2;
            }
        }
        for (Class cls3 : cls.getInterfaces()) {
            C7471uYa.a((Object) cls3, "superInterface");
            Method a3 = a(cls3, str, clsArr, cls2);
            if (a3 != null) {
                return a3;
            }
        }
        return null;
    }

    private final List<Class<?>> c(String str) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            int i3 = i2;
            while (str.charAt(i3) == '[') {
                i3++;
            }
            char charAt = str.charAt(i3);
            if (Hxb.a((CharSequence) "VZCBSIFJD", charAt, false, 2, (Object) null)) {
                i = i3 + 1;
            } else if (charAt == 'L') {
                i = Hxb.a((CharSequence) str, ';', i2, false, 4, (Object) null) + 1;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown type prefix in the method signature: ");
                sb.append(str);
                throw new C5240Qab(sb.toString());
            }
            arrayList.add(a(str, i2, i));
            i2 = i;
        }
        return arrayList;
    }

    public final Method a(String str, String str2, boolean z) {
        C7471uYa.b(str, "name");
        C7471uYa.b(str2, "desc");
        if (C7471uYa.a((Object) str, (Object) "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(a());
        }
        a((List<Class<?>>) arrayList, str2, false);
        Class e = e();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("$default");
        return a(e, sb.toString(), (List<? extends Class<?>>) arrayList, d(str2));
    }

    public final Constructor<?> a(String str) {
        C7471uYa.b(str, "desc");
        return a(a(), c(str));
    }

    private final void a(List<Class<?>> list, String str, boolean z) {
        List c2 = c(str);
        list.addAll(c2);
        int size = ((c2.size() + 32) - 1) / 32;
        for (int i = 0; i < size; i++) {
            Class cls = Integer.TYPE;
            C7471uYa.a((Object) cls, "Integer.TYPE");
            list.add(cls);
        }
        Object obj = z ? a : Object.class;
        C7471uYa.a(obj, "if (isConstructor) DEFAU…RKER else Any::class.java");
        list.add(obj);
    }

    private final Class<?> a(String str, int i, int i2) {
        char charAt = str.charAt(i);
        if (charAt == 'F') {
            return Float.TYPE;
        }
        if (charAt == 'L') {
            ClassLoader e = Rvb.e(a());
            int i3 = i + 1;
            int i4 = i2 - 1;
            if (str != null) {
                String substring = str.substring(i3, i4);
                C7471uYa.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Class<?> loadClass = e.loadClass(Cxb.a(substring, '/', '.', false, 4, (Object) null));
                C7471uYa.a((Object) loadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
                return loadClass;
            }
            throw new OVa("null cannot be cast to non-null type java.lang.String");
        } else if (charAt == 'S') {
            return Short.TYPE;
        } else {
            if (charAt == 'V') {
                Class<?> cls = Void.TYPE;
                C7471uYa.a((Object) cls, "Void.TYPE");
                return cls;
            } else if (charAt == 'I') {
                return Integer.TYPE;
            } else {
                if (charAt == 'J') {
                    return Long.TYPE;
                }
                if (charAt == 'Z') {
                    return Boolean.TYPE;
                }
                if (charAt == '[') {
                    return Rvb.a(a(str, i + 1, i2));
                }
                switch (charAt) {
                    case 'B':
                        return Byte.TYPE;
                    case 'C':
                        return Character.TYPE;
                    case 'D':
                        return Double.TYPE;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown type prefix in the method signature: ");
                        sb.append(str);
                        throw new C5240Qab(sb.toString());
                }
            }
        }
    }

    private final Method a(Class<?> cls, String str, List<? extends Class<?>> list, Class<?> cls2) {
        String str2 = "null cannot be cast to non-null type java.util.Collection<T>";
        if (list != null) {
            Object[] array = list.toArray(new Class[0]);
            String str3 = "null cannot be cast to non-null type kotlin.Array<T>";
            if (array != null) {
                Method a2 = a(cls, str, (Class<?>[]) (Class[]) array, cls2);
                if (a2 != null) {
                    return a2;
                }
                if (cls.isInterface()) {
                    Class<Object> cls3 = Object.class;
                    if (list != null) {
                        Object[] array2 = list.toArray(new Class[0]);
                        if (array2 != null) {
                            Method a3 = a(cls3, str, (Class<?>[]) (Class[]) array2, cls2);
                            if (a3 != null) {
                                return a3;
                            }
                        } else {
                            throw new OVa(str3);
                        }
                    } else {
                        throw new OVa(str2);
                    }
                }
                return null;
            }
            throw new OVa(str3);
        }
        throw new OVa(str2);
    }

    private final Constructor<?> a(Class<?> cls, List<? extends Class<?>> list) {
        if (list != null) {
            try {
                Object[] array = list.toArray(new Class[0]);
                if (array != null) {
                    Class[] clsArr = (Class[]) array;
                    return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                }
                throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } else {
            throw new OVa("null cannot be cast to non-null type java.util.Collection<T>");
        }
    }
}
