package defpackage;

import android.content.ContentValues;
import java.util.List;

/* renamed from: MR reason: default package and case insensitive filesystem */
/* compiled from: RepostStorage */
class C2172MR {
    private final C5500ZKa a;
    private final C4898FLa b;
    private final C5694cGa c;
    private final C5545_xa<C3508cda> d = new C2077HR(this);

    C2172MR(C5500ZKa zKa, C4898FLa fLa, C5694cGa cga) {
        this.a = zKa;
        this.b = fLa;
        this.c = cga;
    }

    /* access modifiers changed from: 0000 */
    public IPa<List<C3508cda>> b() {
        return this.b.a((C6975nLa) C6975nLa.a(d.c).a(d.e, d.f).a(d.d, (Object) "repost")).h(new C2452aR(this)).g();
    }

    /* access modifiers changed from: 0000 */
    public C1255eT<C3508cda, Integer> c() {
        return new C2153LR(this, this.a);
    }

    public /* synthetic */ List a(C5631bLa bla) throws Exception {
        return bla.b(this.d);
    }

    /* access modifiers changed from: 0000 */
    public C1255eT<C3508cda, Integer> a() {
        return new C2115JR(this, this.a);
    }

    /* access modifiers changed from: private */
    public C5266RKa a(C5500ZKa zKa, C3508cda cda, int i) {
        return zKa.a((C5116MLa) e.c, C5296SKa.b().a(e.F, i).a(), C6907mLa.a().a(e.d, (Object) Long.valueOf(cda.c())).a(e.e, (Object) Integer.valueOf(b(cda))));
    }

    private int b(C3508cda cda) {
        return cda.x() ^ true ? 1 : 0;
    }

    /* access modifiers changed from: private */
    public ContentValues a(C3508cda cda) {
        C5296SKa a2 = C5296SKa.a(4);
        a2.a(d.d, "repost");
        a2.a(d.e, cda.x() ^ true ? 1 : 0);
        a2.a(d.f, cda.c());
        a2.a(d.g, this.c.b().getTime());
        return a2.a();
    }

    /* access modifiers changed from: private */
    public int a(C5500ZKa zKa, C3508cda cda, boolean z) {
        String str = "_type";
        int intValue = ((Integer) zKa.a((C6975nLa) ((C6975nLa) C6975nLa.a(_ea.SoundView.name()).a(k.B).d("_id", (Object) Long.valueOf(cda.c()))).d(str, (Object) Integer.valueOf(b(cda)))).a(Integer.class)).intValue();
        return z ? intValue + 1 : intValue - 1;
    }
}
