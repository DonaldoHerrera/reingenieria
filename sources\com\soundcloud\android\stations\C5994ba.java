package com.soundcloud.android.stations;

import java.util.List;

/* renamed from: com.soundcloud.android.stations.ba reason: case insensitive filesystem */
/* compiled from: DefaultStationsRepository.kt */
final class C5994ba<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ T a;
    final /* synthetic */ int b;

    C5994ba(T t, int i) {
        this.a = t;
        this.b = i;
    }

    /* renamed from: a */
    public final IPa<List<Sda>> apply(Boolean bool) {
        C7471uYa.b(bool, "it");
        return this.a.c(this.b);
    }
}
