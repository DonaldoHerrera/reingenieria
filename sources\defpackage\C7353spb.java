package defpackage;

/* renamed from: spb reason: default package and case insensitive filesystem */
/* compiled from: OverridingUtil */
class C7353spb implements _Xa<C4935Gcb, Boolean> {
    final /* synthetic */ C5029Jcb a;

    C7353spb(C5029Jcb jcb) {
        this.a = jcb;
    }

    /* renamed from: a */
    public Boolean invoke(C4935Gcb gcb) {
        return Boolean.valueOf(!_db.a(gcb.d()) && _db.a((C5390Vcb) gcb, (C5272Rcb) this.a));
    }
}
