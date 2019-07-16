package defpackage;

import java.util.Collection;
import java.util.Set;

/* renamed from: iib reason: default package and case insensitive filesystem */
/* compiled from: LazyJavaStaticClassScope.kt */
public final class C6659iib extends a<C5029Jcb, RVa> {
    final /* synthetic */ C5029Jcb a;
    final /* synthetic */ Set b;
    final /* synthetic */ _Xa c;

    C6659iib(C5029Jcb jcb, Set set, _Xa _xa) {
        this.a = jcb;
        this.b = set;
        this.c = _xa;
    }

    public void a() {
    }

    /* renamed from: a */
    public boolean b(C5029Jcb jcb) {
        C7471uYa.b(jcb, "current");
        if (jcb == this.a) {
            return true;
        }
        Eqb L = jcb.L();
        C7471uYa.a((Object) L, "current.staticScope");
        if (!(L instanceof C6795kib)) {
            return true;
        }
        this.b.addAll((Collection) this.c.invoke(L));
        return false;
    }
}
