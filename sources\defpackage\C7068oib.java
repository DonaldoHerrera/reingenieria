package defpackage;

/* renamed from: oib reason: default package and case insensitive filesystem */
/* compiled from: JavaTypeResolver.kt */
final class C7068oib extends C7540vYa implements _Xa<Zib, Boolean> {
    public static final C7068oib a = new C7068oib();

    C7068oib() {
        super(1);
    }

    public final boolean a(Zib zib) {
        if (!(zib instanceof C5724cjb)) {
            zib = null;
        }
        C5724cjb cjb = (C5724cjb) zib;
        return (cjb == null || cjb.b() == null || cjb.d()) ? false : true;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a((Zib) obj));
    }
}
