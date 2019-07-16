package com.soundcloud.android.stations;

import java.util.List;

/* compiled from: DefaultStationsRepository.kt */
final class V<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ T a;
    final /* synthetic */ C3508cda b;
    final /* synthetic */ int c;

    V(T t, C3508cda cda, int i) {
        this.a = t;
        this.b = cda;
        this.c = i;
    }

    /* renamed from: a */
    public final IPa<List<Tda>> apply(Sda sda) {
        C7471uYa.b(sda, "it");
        return this.a.c.a(this.b, this.c);
    }
}
