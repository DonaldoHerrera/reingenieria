package com.soundcloud.android.stations;

import com.soundcloud.android.sync.ia;
import java.util.List;

/* renamed from: com.soundcloud.android.stations.ia reason: case insensitive filesystem */
/* compiled from: DefaultStationsRepository.kt */
final class C6015ia<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ T a;

    C6015ia(T t) {
        this.a = t;
    }

    /* renamed from: a */
    public final IPa<List<Sda>> apply(ia iaVar) {
        C7471uYa.b(iaVar, "it");
        return this.a.c(7);
    }
}
