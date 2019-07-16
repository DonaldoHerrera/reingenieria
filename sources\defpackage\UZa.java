package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: UZa reason: default package */
/* compiled from: ReflectJvmMapping.kt */
public final class UZa {
    public static final Field a(DZa<?> dZa) {
        C7471uYa.b(dZa, "$this$javaField");
        C7612wab c = C6312dbb.c(dZa);
        if (c != null) {
            return c.n();
        }
        return null;
    }

    public static final Method b(DZa<?> dZa) {
        C7471uYa.b(dZa, "$this$javaGetter");
        return b((C7679xZa<?>) dZa.b());
    }

    public static final Method a(C7748yZa<?> yza) {
        C7471uYa.b(yza, "$this$javaSetter");
        return b((C7679xZa<?>) yza.c());
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
    public static final Method b(C7679xZa<?> xza) {
        Member member;
        C7471uYa.b(xza, "$this$javaMethod");
        C6922m_a a = C6312dbb.a((Object) xza);
        if (a != null) {
            C6992nbb f = a.f();
            if (f != null) {
                member = f.getMember();
                if (!(member instanceof Method)) {
                    member = null;
                }
                return (Method) member;
            }
        }
        member = null;
        if (!(member instanceof Method)) {
        }
        return (Method) member;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
    public static final <T> Constructor<T> a(C7679xZa<? extends T> xza) {
        Member member;
        C7471uYa.b(xza, "$this$javaConstructor");
        C6922m_a a = C6312dbb.a((Object) xza);
        if (a != null) {
            C6992nbb f = a.f();
            if (f != null) {
                member = f.getMember();
                if (!(member instanceof Constructor)) {
                    member = null;
                }
                return (Constructor) member;
            }
        }
        member = null;
        if (!(member instanceof Constructor)) {
        }
        return (Constructor) member;
    }

    public static final Type a(HZa hZa) {
        C7471uYa.b(hZa, "$this$javaType");
        return ((C5120Mab) hZa).a();
    }

    public static final DZa<?> a(Field field) {
        C7471uYa.b(field, "$this$kotlinProperty");
        Object obj = null;
        if (field.isSynthetic()) {
            return null;
        }
        C7610wZa a = a((Member) field);
        if (a != null) {
            Collection j = a.j();
            ArrayList arrayList = new ArrayList();
            for (Object next : j) {
                if (next instanceof DZa) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                if (C7471uYa.a((Object) a((DZa) next2), (Object) field)) {
                    obj = next2;
                    break;
                }
            }
            return (DZa) obj;
        }
        Class declaringClass = field.getDeclaringClass();
        C7471uYa.a((Object) declaringClass, "declaringClass");
        Iterator it2 = NZa.e(MXa.a(declaringClass)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next3 = it2.next();
            if (C7471uYa.a((Object) a((DZa<?>) (FZa) next3), (Object) field)) {
                obj = next3;
                break;
            }
        }
        return (DZa) obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    private static final C7610wZa a(Member member) {
        Enum enumR;
        a aVar = C7751ybb.a;
        Class declaringClass = member.getDeclaringClass();
        String str = "declaringClass";
        C7471uYa.a((Object) declaringClass, str);
        C7751ybb a = aVar.a(declaringClass);
        if (a != null) {
            Rkb a2 = a.a();
            if (a2 != null) {
                enumR = a2.c();
                if (enumR != null) {
                    int i = TZa.a[enumR.ordinal()];
                    if (i == 1 || i == 2 || i == 3) {
                        Class declaringClass2 = member.getDeclaringClass();
                        C7471uYa.a((Object) declaringClass2, str);
                        return new C6583hab(declaringClass2, null, 2, null);
                    }
                }
                return null;
            }
        }
        enumR = null;
        if (enumR != null) {
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c5 A[EDGE_INSN: B:59:0x00c5->B:42:0x00c5 ?: BREAK  , SYNTHETIC] */
    public static final C7679xZa<?> a(Method method) {
        Object obj;
        boolean z;
        C7471uYa.b(method, "$this$kotlinFunction");
        Object obj2 = null;
        if (method.isSynthetic()) {
            return null;
        }
        String str = "declaringClass";
        if (Modifier.isStatic(method.getModifiers())) {
            C7610wZa a = a((Member) method);
            if (a != null) {
                Collection j = a.j();
                ArrayList arrayList = new ArrayList();
                for (Object next : j) {
                    if (next instanceof C7679xZa) {
                        arrayList.add(next);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next2 = it.next();
                    if (C7471uYa.a((Object) b((C7679xZa) next2), (Object) method)) {
                        obj2 = next2;
                        break;
                    }
                }
                return (C7679xZa) obj2;
            }
            Class declaringClass = method.getDeclaringClass();
            C7471uYa.a((Object) declaringClass, str);
            C7472uZa a2 = NZa.a(MXa.a(declaringClass));
            if (a2 != null) {
                Iterator it2 = NZa.d(a2).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    Method b = b((C7679xZa) obj);
                    if (b != null && C7471uYa.a((Object) b.getName(), (Object) method.getName())) {
                        Class[] parameterTypes = b.getParameterTypes();
                        if (parameterTypes != null) {
                            Class[] parameterTypes2 = method.getParameterTypes();
                            C7471uYa.a((Object) parameterTypes2, "this.parameterTypes");
                            if (Arrays.equals(parameterTypes, parameterTypes2) && C7471uYa.a((Object) b.getReturnType(), (Object) method.getReturnType())) {
                                z = true;
                                continue;
                                if (z) {
                                    break;
                                }
                            }
                        } else {
                            C7471uYa.a();
                            throw null;
                        }
                    }
                    z = false;
                    continue;
                    if (z) {
                    }
                }
                C7679xZa<?> xza = (C7679xZa) obj;
                if (xza != null) {
                    return xza;
                }
            }
        }
        Class declaringClass2 = method.getDeclaringClass();
        C7471uYa.a((Object) declaringClass2, str);
        Iterator it3 = NZa.d(MXa.a(declaringClass2)).iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next3 = it3.next();
            if (C7471uYa.a((Object) b((C7679xZa) next3), (Object) method)) {
                obj2 = next3;
                break;
            }
        }
        return (C7679xZa) obj2;
    }

    public static final <T> C7679xZa<T> a(Constructor<T> constructor) {
        Object obj;
        C7471uYa.b(constructor, "$this$kotlinFunction");
        Class declaringClass = constructor.getDeclaringClass();
        C7471uYa.a((Object) declaringClass, "declaringClass");
        Iterator it = MXa.a(declaringClass).i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C7471uYa.a((Object) a((C7679xZa) obj), (Object) constructor)) {
                break;
            }
        }
        return (C7679xZa) obj;
    }
}
