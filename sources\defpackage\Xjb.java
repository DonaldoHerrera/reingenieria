package defpackage;

import java.util.ArrayList;

/* renamed from: Xjb reason: default package */
/* compiled from: signatureEnhancement.kt */
final class Xjb extends C7540vYa implements C6308dYa<C7706xtb, C6590hhb, RVa> {
    final /* synthetic */ ArrayList a;

    Xjb(ArrayList arrayList) {
        this.a = arrayList;
        super(2);
    }

    public final void a(C7706xtb xtb, C6590hhb hhb) {
        C7471uYa.b(xtb, C1325gg.TYPE);
        C7471uYa.b(hhb, "ownerContext");
        C6590hhb b = Zgb.b(hhb, xtb.getAnnotations());
        ArrayList arrayList = this.a;
        C5654bhb b2 = b.b();
        arrayList.add(new C6321dkb(xtb, b2 != null ? b2.a(a.TYPE_USE) : null));
        for (Stb stb : xtb.ya()) {
            String str = "arg.type";
            if (stb.a()) {
                ArrayList arrayList2 = this.a;
                C7706xtb type = stb.getType();
                C7471uYa.a((Object) type, str);
                arrayList2.add(new C6321dkb(type, null));
            } else {
                C7706xtb type2 = stb.getType();
                C7471uYa.a((Object) type2, str);
                a(type2, b);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((C7706xtb) obj, (C6590hhb) obj2);
        return RVa.a;
    }
}
