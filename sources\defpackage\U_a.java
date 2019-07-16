package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/* renamed from: U_a reason: default package */
/* compiled from: KFunctionImpl.kt */
final class U_a extends C7540vYa implements PXa<C6992nbb<? extends Member>> {
    final /* synthetic */ W_a a;

    U_a(W_a w_a) {
        this.a = w_a;
        super(0);
    }

    public final C6992nbb<Member> d() {
        Object obj;
        C6992nbb nbb;
        C5578a_a a2 = C5504Zab.b.a(this.a.i());
        C6992nbb<Member> nbb2 = null;
        if (a2 instanceof e) {
            N_a g = this.a.g();
            e eVar = (e) a2;
            String c = eVar.c();
            String b = eVar.b();
            Member member = this.a.f().getMember();
            if (member != null) {
                obj = g.a(c, b, !Modifier.isStatic(member.getModifiers()));
            } else {
                C7471uYa.a();
                throw null;
            }
        } else if (a2 instanceof d) {
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
                C6448fbb fbb = new C6448fbb(a3, arrayList, a.CALL_BY_NAME, b.KOTLIN, null, 16, null);
                return fbb;
            }
            obj = this.a.g().b(((d) a2).b());
        } else if (a2 instanceof a) {
            List<Method> b2 = ((a) a2).b();
            Class a4 = this.a.g().a();
            ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) b2, 10));
            for (Method method : b2) {
                C7471uYa.a((Object) method, "it");
                arrayList2.add(method.getName());
            }
            C6448fbb fbb2 = new C6448fbb(a4, arrayList2, a.CALL_BY_NAME, b.JAVA, b2);
            return fbb2;
        } else {
            obj = null;
        }
        if (obj instanceof Constructor) {
            W_a w_a = this.a;
            nbb = w_a.a((Constructor) obj, w_a.i());
        } else if (obj instanceof Method) {
            if (this.a.i().getAnnotations().a(C6312dbb.a()) != null) {
                C5272Rcb e = this.a.i().e();
                if (e == null) {
                    throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                } else if (!((C5029Jcb) e).K()) {
                    nbb = this.a.b((Method) obj);
                }
            }
            nbb = this.a.c((Method) obj);
        } else {
            nbb = null;
        }
        if (nbb != null) {
            nbb2 = C7268rbb.a(nbb, this.a.i(), true);
        }
        return nbb2;
    }
}
