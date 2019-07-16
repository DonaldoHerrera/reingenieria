package defpackage;

/* renamed from: fKa reason: default package and case insensitive filesystem */
/* compiled from: WaveformOperations.kt */
final class C6430fKa<T, R> implements C7118pQa<T, C7669xPa<? extends R>> {
    final /* synthetic */ C5630bKa a;
    final /* synthetic */ String b;

    C6430fKa(C5630bKa bka, String str) {
        this.a = bka;
        this.b = str;
    }

    /* renamed from: a */
    public final C7531vPa<C5325TJa> apply(C5325TJa tJa) {
        C7471uYa.b(tJa, "it");
        C5630bKa bka = this.a;
        String str = this.b;
        if (str == null) {
            str = "null";
        }
        return bka.a(tJa, "remove", str);
    }
}
