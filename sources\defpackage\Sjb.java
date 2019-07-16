package defpackage;

/* renamed from: Sjb reason: default package */
/* compiled from: signatureEnhancement.kt */
final class Sjb extends C7540vYa implements _Xa<Integer, C6592hjb> {
    final /* synthetic */ C6592hjb[] a;

    Sjb(C6592hjb[] hjbArr) {
        this.a = hjbArr;
        super(1);
    }

    public final C6592hjb a(int i) {
        C6592hjb[] hjbArr = this.a;
        return (i < 0 || i > C6578hWa.g(hjbArr)) ? C6592hjb.b.a() : hjbArr[i];
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).intValue());
    }
}
