package defpackage;

import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: Phb reason: default package */
/* compiled from: LazyJavaPackageFragment.kt */
final class Phb extends C7540vYa implements PXa<HashMap<C7355sqb, C7355sqb>> {
    final /* synthetic */ Rhb a;

    Phb(Rhb rhb) {
        this.a = rhb;
        super(0);
    }

    public final HashMap<C7355sqb, C7355sqb> d() {
        HashMap<C7355sqb, C7355sqb> hashMap = new HashMap<>();
        for (Entry entry : this.a.ta().entrySet()) {
            String str = (String) entry.getKey();
            Dkb dkb = (Dkb) entry.getValue();
            C7355sqb a2 = C7355sqb.a(str);
            C7471uYa.a((Object) a2, "JvmClassName.byInternalName(partInternalName)");
            Rkb a3 = dkb.a();
            int i = Nhb.a[a3.c().ordinal()];
            if (i == 1) {
                String e = a3.e();
                if (e != null) {
                    C7355sqb a4 = C7355sqb.a(e);
                    C7471uYa.a((Object) a4, "JvmClassName.byInternalN…: continue@kotlinClasses)");
                    hashMap.put(a2, a4);
                }
            } else if (i == 2) {
                hashMap.put(a2, a2);
            }
        }
        return hashMap;
    }
}
