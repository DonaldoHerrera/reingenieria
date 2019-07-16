package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: Ohb reason: default package */
/* compiled from: LazyJavaPackageFragment.kt */
final class Ohb extends C7540vYa implements PXa<Map<String, ? extends Dkb>> {
    final /* synthetic */ Rhb a;

    Ohb(Rhb rhb) {
        this.a = rhb;
        super(0);
    }

    public final Map<String, Dkb> d() {
        Jkb l = this.a.g.a().l();
        String a2 = this.a.q().a();
        C7471uYa.a((Object) a2, "fqName.asString()");
        List<String> a3 = l.a(a2);
        ArrayList arrayList = new ArrayList();
        for (String str : a3) {
            C7355sqb a4 = C7355sqb.a(str);
            C7471uYa.a((Object) a4, "JvmClassName.byInternalName(partName)");
            C7280rnb a5 = C7280rnb.a(a4.a());
            C7471uYa.a((Object) a5, "ClassId.topLevel(JvmClas…velClassMaybeWithDollars)");
            Dkb a6 = Ckb.a(this.a.g.a().h(), a5);
            HVa a7 = a6 != null ? NVa.a(str, a6) : null;
            if (a7 != null) {
                arrayList.add(a7);
            }
        }
        return LWa.a((Iterable<? extends HVa<? extends K, ? extends V>>) arrayList);
    }
}
