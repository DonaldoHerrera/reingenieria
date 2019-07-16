package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: NZa reason: default package */
/* compiled from: KClasses.kt */
public final class NZa {
    public static final C7472uZa<?> a(C7472uZa<?> uza) {
        Object obj;
        C7471uYa.b(uza, "$this$companionObject");
        Iterator it = uza.k().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C7472uZa uza2 = (C7472uZa) obj;
            if (uza2 != null) {
                if (((I_a) uza2).b().K()) {
                    break;
                }
            } else {
                throw new OVa("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            }
        }
        return (C7472uZa) obj;
    }

    public static final Collection<C7679xZa<?>> b(C7472uZa<?> uza) {
        C7471uYa.b(uza, "$this$declaredFunctions");
        Collection f = ((a) ((I_a) uza).f().a()).f();
        ArrayList arrayList = new ArrayList();
        for (Object next : f) {
            if (next instanceof C7679xZa) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final <T> Collection<FZa<T, ?>> c(C7472uZa<T> uza) {
        C7471uYa.b(uza, "$this$declaredMemberProperties");
        Collection g = ((a) ((I_a) uza).f().a()).g();
        ArrayList arrayList = new ArrayList();
        for (Object next : g) {
            C6922m_a m_a = (C6922m_a) next;
            if (b(m_a) && (m_a instanceof FZa)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final Collection<C7679xZa<?>> d(C7472uZa<?> uza) {
        C7471uYa.b(uza, "$this$functions");
        Collection j = uza.j();
        ArrayList arrayList = new ArrayList();
        for (Object next : j) {
            if (next instanceof C7679xZa) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final <T> Collection<FZa<T, ?>> e(C7472uZa<T> uza) {
        C7471uYa.b(uza, "$this$memberProperties");
        Collection c = ((a) ((I_a) uza).f().a()).c();
        ArrayList arrayList = new ArrayList();
        for (Object next : c) {
            C6922m_a m_a = (C6922m_a) next;
            if (b(m_a) && (m_a instanceof FZa)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final <T> C7679xZa<T> f(C7472uZa<T> uza) {
        Object obj;
        C7471uYa.b(uza, "$this$primaryConstructor");
        Iterator it = ((I_a) uza).i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C7679xZa xza = (C7679xZa) obj;
            if (xza != null) {
                C5582adb i = ((W_a) xza).i();
                if (i != null) {
                    if (((C5242Qcb) i).S()) {
                        break;
                    }
                } else {
                    throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
                }
            } else {
                throw new OVa("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
            }
        }
        return (C7679xZa) obj;
    }

    private static final boolean b(C6922m_a<?> m_a) {
        return !a(m_a);
    }

    private static final boolean a(C6922m_a<?> m_a) {
        return m_a.i().l() != null;
    }
}
