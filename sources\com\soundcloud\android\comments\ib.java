package com.soundcloud.android.comments;

/* compiled from: TrackCommentOperations.kt */
final class ib<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ gb a;
    final /* synthetic */ C3508cda b;
    final /* synthetic */ String c;

    ib(gb gbVar, C3508cda cda, String str) {
        this.a = gbVar;
        this.b = cda;
        this.c = str;
    }

    /* renamed from: a */
    public final IPa<Db> apply(C3509cea cea) {
        C7471uYa.b(cea, "track");
        if (cea.b()) {
            gb gbVar = this.a;
            String str = "secret_token";
            hfa b2 = hfa.b(C2226PO.THREADED_TRACK_COMMENTS.a(this.b)).a(str, C4928GKa.b(this.c)).c().b();
            C7471uYa.a((Object) b2, "ApiRequest.get(ApiEndpoi…                 .build()");
            return gbVar.a(cea, b2);
        }
        Db db = new Db(cea, null, null, 6, null);
        IPa<Db> a2 = IPa.a(db);
        C7471uYa.a((Object) a2, "Single.just(TrackCommentsResponse(track))");
        return a2;
    }
}
