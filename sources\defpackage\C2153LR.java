package defpackage;

/* renamed from: LR reason: default package and case insensitive filesystem */
/* compiled from: RepostStorage */
class C2153LR extends C1595pT<C3508cda, C6499gLa, Integer> {
    /* access modifiers changed from: private */
    public int b;
    final /* synthetic */ C2172MR c;

    C2153LR(C2172MR mr, C5500ZKa zKa) {
        this.c = mr;
        super(zKa);
    }

    public C6499gLa a(C5500ZKa zKa, C3508cda cda) {
        this.b = this.c.a(zKa, cda, false);
        return zKa.a((a) new C2134KR(this, cda, C6907mLa.a().a(d.f, (Object) Long.valueOf(cda.c())).a(d.e, (Object) Integer.valueOf(cda.x() ^ true ? 1 : 0)).a(d.d, (Object) "repost")));
    }

    /* access modifiers changed from: protected */
    public Integer a(C6499gLa gla) {
        return Integer.valueOf(this.b);
    }
}
