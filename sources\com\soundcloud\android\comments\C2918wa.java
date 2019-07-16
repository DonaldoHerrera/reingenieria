package com.soundcloud.android.comments;

/* renamed from: com.soundcloud.android.comments.wa reason: case insensitive filesystem */
/* compiled from: CommentsPresenter.kt */
final class C2918wa<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ Z a;
    final /* synthetic */ long b;
    final /* synthetic */ C3508cda c;
    final /* synthetic */ String d;

    C2918wa(Z z, long j, C3508cda cda, String str) {
        this.a = z;
        this.b = j;
        this.c = cda;
        this.d = str;
    }

    /* renamed from: a */
    public final APa<d<C6973nJa, C>> apply(Db db) {
        C7471uYa.b(db, "response");
        C c2 = new C(db.a(), this.b, db.c().b(), this.c, db.c().g(), db.c().w(), this.d);
        IPa b2 = db.b();
        return APa.c(new b(c2, b2 != null ? new C2916va(b2, this) : null));
    }
}
