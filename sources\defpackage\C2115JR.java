package defpackage;

/* renamed from: JR reason: default package and case insensitive filesystem */
/* compiled from: RepostStorage */
class C2115JR extends C1595pT<C3508cda, C6499gLa, Integer> {
    /* access modifiers changed from: private */
    public int b;
    final /* synthetic */ C2172MR c;

    C2115JR(C2172MR mr, C5500ZKa zKa) {
        this.c = mr;
        super(zKa);
    }

    public C6499gLa a(C5500ZKa zKa, C3508cda cda) {
        this.b = this.c.a(zKa, cda, true);
        return zKa.a((a) new C2096IR(this, cda));
    }

    /* access modifiers changed from: protected */
    public Integer a(C6499gLa gla) {
        return Integer.valueOf(this.b);
    }
}
