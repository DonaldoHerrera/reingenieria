package com.soundcloud.android.stream;

/* compiled from: StreamDataSource.kt */
final class T extends C7540vYa implements C6376eYa<C3863rda, C3919yda, Integer, C6102s> {
    final /* synthetic */ Z a;

    T(Z z) {
        this.a = z;
        super(3);
    }

    public /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return a((C3863rda) obj, (C3919yda) obj2, ((Number) obj3).intValue());
    }

    public final C6102s a(C3863rda rda, C3919yda yda, int i) {
        C7471uYa.b(rda, "playlistItem");
        C7471uYa.b(yda, "entity");
        C6102s sVar = new C6102s(yda.a, this.a.a(rda, yda), yda.d(), yda.c, yda.d, i);
        return sVar;
    }
}
