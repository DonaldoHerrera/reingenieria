package defpackage;

import java.util.ArrayList;

/* renamed from: acb reason: default package and case insensitive filesystem */
/* compiled from: FunctionClassDescriptor.kt */
final class C5581acb extends C7540vYa implements C6308dYa<C6473fub, String, RVa> {
    final /* synthetic */ C5649bcb a;
    final /* synthetic */ ArrayList b;

    C5581acb(C5649bcb bcb, ArrayList arrayList) {
        this.a = bcb;
        this.b = arrayList;
        super(2);
    }

    public final void a(C6473fub fub, String str) {
        C7471uYa.b(fub, "variance");
        C7471uYa.b(str, "name");
        this.b.add(C7686xfb.a(this.a, C6723jeb.c.a(), false, fub, C7694xnb.b(str), this.b.size()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((C6473fub) obj, (String) obj2);
        return RVa.a;
    }
}
