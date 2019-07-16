package defpackage;

/* renamed from: eEa reason: default package and case insensitive filesystem */
/* compiled from: AsyncLoader.kt */
final class C6356eEa extends C7540vYa implements _Xa<d<? extends ErrorType, ? extends PageData>, RVa> {
    final /* synthetic */ C6424fEa a;
    final /* synthetic */ BPa b;

    C6356eEa(C6424fEa fea, BPa bPa) {
        this.a = fea;
        this.b = bPa;
        super(1);
    }

    public final void a(d<? extends ErrorType, ? extends PageData> dVar) {
        if (dVar instanceof b) {
            C6713jVa e = this.a.a.a.c;
            f fVar = new f(this.a.a.a, false, null, 2, null);
            e.a(fVar);
            b a2 = this.a.a.a.a((b) dVar);
            this.a.a.a.b(a2);
            this.b.a(this.a.b.e(a2).h(new C6288dEa(this)));
        } else if (dVar instanceof a) {
            this.a.a.a.c.a(new f(false, ((a) dVar).a()));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((d) obj);
        return RVa.a;
    }
}
