package com.soundcloud.android.likes;

import com.soundcloud.android.collections.data.C2862s;
import java.util.List;

/* compiled from: TrackLikeOperations.kt */
final class G<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ Integer a;

    G(Integer num) {
        this.a = num;
    }

    /* renamed from: a */
    public final T apply(List<C2862s> list) {
        C7471uYa.b(list, "it");
        Integer num = this.a;
        C7471uYa.a((Object) num, "newCount");
        return new T(list, num.intValue());
    }
}
