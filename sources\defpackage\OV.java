package defpackage;

/* renamed from: OV reason: default package */
/* compiled from: RepositoryExtensions.kt */
final class OV<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ MV a;
    final /* synthetic */ C3508cda b;

    OV(MV mv, C3508cda cda) {
        this.a = mv;
        this.b = cda;
    }

    /* renamed from: a */
    public final Pda<T> apply(HVa<Integer, ? extends Pda<T>> hVa) {
        C7471uYa.b(hVa, "<name for destructuring parameter 0>");
        int intValue = ((Number) hVa.a()).intValue();
        Pda<T> pda = (Pda) hVa.b();
        if (intValue != 0) {
            return pda;
        }
        MV mv = this.a;
        if (!(mv instanceof a)) {
            return pda;
        }
        if (pda instanceof b) {
            return a.a.a(((b) pda).a(), ((a) this.a).a());
        }
        if (pda instanceof c) {
            return c.a.a(this.b, ((a) mv).a());
        }
        throw new IllegalStateException("Unexpected response from storage");
    }
}
