package com.soundcloud.android.stations;

import com.soundcloud.android.tracks.C6185ma;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StationsOperations.kt */
final class dc<T, R> implements C7118pQa<T, R> {
    public static final dc a = new dc();

    dc() {
    }

    /* renamed from: a */
    public final List<C6040qb> apply(List<? extends C6185ma> list) {
        C7471uYa.b(list, "tracks");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
        for (C6185ma a2 : list) {
            arrayList.add(C6040qb.a(a2));
        }
        return arrayList;
    }
}
