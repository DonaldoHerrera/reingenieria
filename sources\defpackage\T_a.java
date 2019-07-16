package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/* renamed from: T_a reason: default package */
/* compiled from: KFunctionImpl.kt */
final class T_a extends C7540vYa implements PXa<C6992nbb<? extends Member>> {
    final /* synthetic */ W_a a;

    T_a(W_a w_a) {
        this.a = w_a;
        super(0);
    }

    public final C6992nbb<Member> d() {
        Object obj;
        C6992nbb nbb;
        C5578a_a a2 = C5504Zab.b.a(this.a.i());
        if (a2 instanceof d) {
            if (this.a.j()) {
                Class a3 = this.a.g().a();
                List<CZa> parameters = this.a.getParameters();
                ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) parameters, 10));
                for (CZa name : parameters) {
                    String name2 = name.getName();
                    if (name2 != null) {
                        arrayList.add(name2);
                    } else {
                        C7471uYa.a();
                        throw null;
                    }
                }
                C6448fbb fbb = new C6448fbb(a3, arrayList, a.POSITIONAL_CALL, b.KOTLIN, null, 16, null);
                return fbb;
            }
            obj = this.a.g().a(((d) a2).b());
        } else if (a2 instanceof e) {
            e eVar = (e) a2;
            obj = this.a.g().b(eVar.c(), eVar.b());
        } else if (a2 instanceof c) {
            obj = ((c) a2).b();
        } else if (a2 instanceof b) {
            obj = ((b) a2).b();
        } else if (a2 instanceof a) {
            List<Method> b = ((a) a2).b();
            Class a4 = this.a.g().a();
            ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) b, 10));
            for (Method method : b) {
                C7471uYa.a((Object) method, "it");
                arrayList2.add(method.getName());
            }
            C6448fbb fbb2 = new C6448fbb(a4, arrayList2, a.POSITIONAL_CALL, b.JAVA, b);
            return fbb2;
        } else {
            throw new FVa();
        }
        if (obj instanceof Constructor) {
            W_a w_a = this.a;
            nbb = w_a.a((Constructor) obj, w_a.i());
        } else if (obj instanceof Method) {
            Method method2 = (Method) obj;
            if (!Modifier.isStatic(method2.getModifiers())) {
                nbb = this.a.a(method2);
            } else if (this.a.i().getAnnotations().a(C6312dbb.a()) != null) {
                nbb = this.a.b(method2);
            } else {
                nbb = this.a.c(method2);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not compute caller for function: ");
            sb.append(this.a.i());
            sb.append(" (member = ");
            sb.append(obj);
            sb.append(')');
            throw new C5240Qab(sb.toString());
        }
        return C7268rbb.a(nbb, this.a.i(), false, 2, null);
    }
}
