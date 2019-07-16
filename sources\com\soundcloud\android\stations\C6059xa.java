package com.soundcloud.android.stations;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.soundcloud.android.stations.xa reason: case insensitive filesystem */
/* compiled from: LikedStationsPresenter.kt */
final class C6059xa<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C6065za a;

    C6059xa(C6065za zaVar) {
        this.a = zaVar;
    }

    /* renamed from: a */
    public final List<Nb> apply(List<? extends Sda> list) {
        C7471uYa.b(list, "stations");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
        for (Sda sda : list) {
            arrayList.add(new Nb(sda, C7471uYa.a((Object) this.a.f().e(), (Object) sda.a())));
        }
        return arrayList;
    }
}
