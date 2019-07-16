package defpackage;

/* renamed from: ihb reason: default package and case insensitive filesystem */
/* compiled from: resolvers.kt */
final class C6658ihb extends C7540vYa implements _Xa<_ib, C6863lib> {
    final /* synthetic */ C6726jhb a;

    C6658ihb(C6726jhb jhb) {
        this.a = jhb;
        super(1);
    }

    /* renamed from: a */
    public final C6863lib invoke(_ib _ib) {
        C7471uYa.b(_ib, "typeParameter");
        Integer num = (Integer) this.a.a.get(_ib);
        if (num == null) {
            return null;
        }
        return new C6863lib(Zgb.a(this.a.c, (C6998nhb) this.a), _ib, this.a.e + num.intValue(), this.a.d);
    }
}
