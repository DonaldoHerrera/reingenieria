package com.soundcloud.android.offline;

import java.util.Collection;
import java.util.List;

/* compiled from: DownloadOperations.kt */
final class Yb<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ Vb a;

    Yb(Vb vb) {
        this.a = vb;
    }

    /* renamed from: a */
    public final IPa<List<C3508cda>> apply(List<C3508cda> list) {
        C7471uYa.b(list, "expected");
        return this.a.a((Collection<C3508cda>) list).e(new Xb(list));
    }
}
