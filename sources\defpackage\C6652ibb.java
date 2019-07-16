package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: ibb reason: default package and case insensitive filesystem */
/* compiled from: AnnotationConstructorCaller.kt */
final class C6652ibb implements InvocationHandler {
    final /* synthetic */ Class a;
    final /* synthetic */ C7744yVa b;
    final /* synthetic */ DZa c;
    final /* synthetic */ C7744yVa d;
    final /* synthetic */ DZa e;
    final /* synthetic */ C6516gbb f;
    final /* synthetic */ Map g;

    C6652ibb(Class cls, C7744yVa yva, DZa dZa, C7744yVa yva2, DZa dZa2, C6516gbb gbb, Map map) {
        this.a = cls;
        this.b = yva;
        this.c = dZa;
        this.d = yva2;
        this.e = dZa2;
        this.f = gbb;
        this.g = map;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        C7471uYa.a((Object) method, "method");
        String name = method.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633 && name.equals("annotationType")) {
                        return this.a;
                    }
                } else if (name.equals("hashCode")) {
                    C7744yVa yva = this.d;
                    DZa dZa = this.e;
                    return yva.getValue();
                }
            } else if (name.equals("toString")) {
                C7744yVa yva2 = this.b;
                DZa dZa2 = this.c;
                return yva2.getValue();
            }
        }
        if (C7471uYa.a((Object) name, (Object) "equals") && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(this.f.invoke(C6578hWa.i(objArr)));
        }
        if (this.g.containsKey(name)) {
            return this.g.get(name);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Method is not supported: ");
        sb.append(method);
        sb.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb.append(C6578hWa.j(objArr));
        sb.append(')');
        throw new C5240Qab(sb.toString());
    }
}
