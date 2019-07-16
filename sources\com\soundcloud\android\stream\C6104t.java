package com.soundcloud.android.stream;

/* renamed from: com.soundcloud.android.stream.t reason: case insensitive filesystem */
/* compiled from: RemoveStalePromotedItemsCommand */
class C6104t extends a {
    final /* synthetic */ C6106u b;

    C6104t(C6106u uVar) {
        this.b = uVar;
    }

    public void b(C5500ZKa zKa) {
        String str = "created_at";
        C7113pLa b2 = C6907mLa.a().b(str, (Object) Long.valueOf(this.b.c.a() - C6106u.b));
        String str2 = "_id";
        this.b.d = zKa.a(C6975nLa.a(_ea.PromotedTracks.name()).a(str2).a(b2)).b(C4991ILa.a(Long.class));
        if (!this.b.d.isEmpty()) {
            for (Long l : this.b.d) {
                a(zKa.a((C5116MLa) _ea.SoundStream, C6907mLa.a().d("promoted_id", (Object) l)));
                a(zKa.a((C5116MLa) _ea.PromotedTracks, C6907mLa.a().d(str2, (Object) l)));
            }
        }
    }
}
