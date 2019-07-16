package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: Exb reason: default package */
/* compiled from: Strings.kt */
final class Exb extends C7540vYa implements C6308dYa<CharSequence, Integer, HVa<? extends Integer, ? extends Integer>> {
    final /* synthetic */ List a;
    final /* synthetic */ boolean b;

    Exb(List list, boolean z) {
        this.a = list;
        this.b = z;
        super(2);
    }

    public final HVa<Integer, Integer> a(CharSequence charSequence, int i) {
        C7471uYa.b(charSequence, "$receiver");
        HVa a2 = Hxb.b(charSequence, (Collection<String>) this.a, i, this.b, false);
        if (a2 != null) {
            return NVa.a(a2.c(), Integer.valueOf(((String) a2.d()).length()));
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((CharSequence) obj, ((Number) obj2).intValue());
    }
}
