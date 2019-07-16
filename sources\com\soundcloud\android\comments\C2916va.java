package com.soundcloud.android.comments;

/* renamed from: com.soundcloud.android.comments.va reason: case insensitive filesystem */
/* compiled from: CommentsPresenter.kt */
final class C2916va extends C7540vYa implements PXa<APa<d<? extends C6973nJa, ? extends C>>> {
    final /* synthetic */ IPa a;
    final /* synthetic */ C2918wa b;

    C2916va(IPa iPa, C2918wa waVar) {
        this.a = iPa;
        this.b = waVar;
        super(0);
    }

    public final APa<d<C6973nJa, C>> d() {
        Z z = this.b.a;
        APa j = this.a.j();
        C7471uYa.a((Object) j, "it.toObservable()");
        C2918wa waVar = this.b;
        return z.a(j, waVar.b, waVar.c, waVar.d);
    }
}
