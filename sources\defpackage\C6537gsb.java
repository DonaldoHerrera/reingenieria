package defpackage;

/* renamed from: gsb reason: default package and case insensitive filesystem */
/* compiled from: DeserializedClassDescriptor.kt */
final class C6537gsb extends C7540vYa implements _Xa<C7694xnb, Xeb> {
    final /* synthetic */ c a;

    C6537gsb(c cVar) {
        this.a = cVar;
        super(1);
    }

    /* renamed from: a */
    public final Xeb invoke(C7694xnb xnb) {
        C7471uYa.b(xnb, "name");
        C7485ulb ulb = (C7485ulb) this.a.a.get(xnb);
        if (ulb == null) {
            return null;
        }
        Ssb f = C6333dsb.this.a().f();
        c cVar = this.a;
        return Xeb.a(f, C6333dsb.this, xnb, cVar.c, new Xrb(C6333dsb.this.a().f(), new C6469fsb(ulb, this, xnb)), C7822zdb.a);
    }
}
