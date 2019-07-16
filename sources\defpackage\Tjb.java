package defpackage;

/* renamed from: Tjb reason: default package */
/* compiled from: signatureEnhancement.kt */
final class Tjb extends C7540vYa implements _Xa<Integer, C6592hjb> {
    final /* synthetic */ C6457fkb a;
    final /* synthetic */ _Xa b;

    Tjb(C6457fkb fkb, _Xa _xa) {
        this.a = fkb;
        this.b = _xa;
        super(1);
    }

    public final C6592hjb a(int i) {
        C6592hjb hjb = (C6592hjb) this.a.a().get(Integer.valueOf(i));
        return hjb != null ? hjb : (C6592hjb) this.b.invoke(Integer.valueOf(i));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).intValue());
    }
}
