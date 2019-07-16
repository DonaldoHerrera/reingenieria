package defpackage;

/* renamed from: kvb reason: default package and case insensitive filesystem */
/* compiled from: capitalizeDecapitalize.kt */
final class C6815kvb extends C7540vYa implements _Xa<Integer, Boolean> {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;

    C6815kvb(String str, boolean z) {
        this.a = str;
        this.b = z;
        super(1);
    }

    public final boolean a(int i) {
        char charAt = this.a.charAt(i);
        if (this.b) {
            return 'A' <= charAt && 'Z' >= charAt;
        }
        return Character.isUpperCase(charAt);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a(((Number) obj).intValue()));
    }
}
