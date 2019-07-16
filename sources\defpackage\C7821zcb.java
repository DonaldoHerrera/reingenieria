package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: zcb reason: default package and case insensitive filesystem */
/* compiled from: JvmBuiltInsSettings.kt */
final class C7821zcb<N> implements b<N> {
    final /* synthetic */ C7269rcb a;

    C7821zcb(C7269rcb rcb) {
        this.a = rcb;
    }

    public final List<C7757yhb> a(C5029Jcb jcb) {
        C7471uYa.a((Object) jcb, "it");
        Ptb Q = jcb.Q();
        C7471uYa.a((Object) Q, "it.typeConstructor");
        Collection<C7706xtb> b = Q.b();
        C7471uYa.a((Object) b, "it.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        for (C7706xtb za : b) {
            C5122Mcb c = za.za().c();
            C7757yhb yhb = null;
            C5122Mcb original = c != null ? c.getOriginal() : null;
            if (!(original instanceof C5029Jcb)) {
                original = null;
            }
            C5029Jcb jcb2 = (C5029Jcb) original;
            if (jcb2 != null) {
                yhb = this.a.d(jcb2);
            }
            if (yhb != null) {
                arrayList.add(yhb);
            }
        }
        return arrayList;
    }
}
