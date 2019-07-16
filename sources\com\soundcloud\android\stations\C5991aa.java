package com.soundcloud.android.stations;

import java.util.List;

/* renamed from: com.soundcloud.android.stations.aa reason: case insensitive filesystem */
/* compiled from: DefaultStationsRepository.kt */
final class C5991aa<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ T a;
    final /* synthetic */ List b;

    C5991aa(T t, List list) {
        this.a = t;
        this.b = list;
    }

    /* renamed from: a */
    public final IPa<List<Rda>> apply(List<Rda> list) {
        C7471uYa.b(list, "it");
        return this.a.a(this.b, list);
    }
}
