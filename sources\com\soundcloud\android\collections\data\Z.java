package com.soundcloud.android.collections.data;

import java.util.ArrayList;
import java.util.List;

/* compiled from: RoomLikesReadStorage.kt */
final class Z<T, R> implements C7118pQa<T, R> {
    public static final Z a = new Z();

    Z() {
    }

    /* renamed from: a */
    public final List<C3508cda> apply(List<I> list) {
        C7471uYa.b(list, "likeEntities");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (I e : list) {
            arrayList.add(e.e());
        }
        return arrayList;
    }
}
