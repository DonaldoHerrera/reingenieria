package defpackage;

/* renamed from: Dxb reason: default package */
/* compiled from: Strings.kt */
final class Dxb extends C7540vYa implements C6308dYa<CharSequence, Integer, HVa<? extends Integer, ? extends Integer>> {
    final /* synthetic */ char[] a;
    final /* synthetic */ boolean b;

    Dxb(char[] cArr, boolean z) {
        this.a = cArr;
        this.b = z;
        super(2);
    }

    public final HVa<Integer, Integer> a(CharSequence charSequence, int i) {
        C7471uYa.b(charSequence, "$receiver");
        int a2 = Hxb.a(charSequence, this.a, i, this.b);
        if (a2 < 0) {
            return null;
        }
        return NVa.a(Integer.valueOf(a2), Integer.valueOf(1));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((CharSequence) obj, ((Number) obj2).intValue());
    }
}
