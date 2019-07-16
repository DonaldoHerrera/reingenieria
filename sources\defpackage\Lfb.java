package defpackage;

import java.util.Map;

/* renamed from: Lfb reason: default package */
/* compiled from: specialBuiltinMembers.kt */
final class Lfb extends C7540vYa implements _Xa<C4935Gcb, Boolean> {
    final /* synthetic */ C7684xdb a;

    Lfb(C7684xdb xdb) {
        this.a = xdb;
        super(1);
    }

    public final boolean a(C4935Gcb gcb) {
        C7471uYa.b(gcb, "it");
        Map a2 = Mfb.c;
        String a3 = Hkb.a((C4904Fcb) this.a);
        if (a2 != null) {
            return a2.containsKey(a3);
        }
        throw new OVa("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a((C4935Gcb) obj));
    }
}
