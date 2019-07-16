package com.soundcloud.android.stream;

import com.soundcloud.android.tracks.C6185ma;

/* compiled from: StreamDataSource.kt */
final class S extends C7540vYa implements C6376eYa<C6185ma, C3919yda, Integer, tb> {
    final /* synthetic */ Z a;

    S(Z z) {
        this.a = z;
        super(3);
    }

    public /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return a((C6185ma) obj, (C3919yda) obj2, ((Number) obj3).intValue());
    }

    public final tb a(C6185ma maVar, C3919yda yda, int i) {
        C7471uYa.b(maVar, "trackItem");
        C7471uYa.b(yda, "entity");
        tb tbVar = new tb(yda.a, this.a.a(maVar, yda), yda.d(), yda.c, yda.d, i);
        return tbVar;
    }
}
