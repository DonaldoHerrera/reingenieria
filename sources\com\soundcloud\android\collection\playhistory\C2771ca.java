package com.soundcloud.android.collection.playhistory;

import java.util.List;

/* renamed from: com.soundcloud.android.collection.playhistory.ca reason: case insensitive filesystem */
/* compiled from: PlayHistoryOperations.kt */
final class C2771ca<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ Z a;

    C2771ca(Z z) {
        this.a = z;
    }

    /* renamed from: a */
    public final IPa<List<C3508cda>> apply(List<C3508cda> list) {
        C7471uYa.b(list, "it");
        return this.a.g.a(list, a.LOCAL_ONLY).g().e(new C2769ba(this));
    }
}
