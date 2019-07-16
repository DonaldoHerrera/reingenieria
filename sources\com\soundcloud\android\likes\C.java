package com.soundcloud.android.likes;

import com.soundcloud.android.collections.data.C2862s;
import com.soundcloud.android.tracks.Ca;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TrackLikeOperations.kt */
final class C<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C4001z a;

    C(C4001z zVar) {
        this.a = zVar;
    }

    /* renamed from: a */
    public final IPa<List<C3987k>> apply(List<C2862s> list) {
        C7471uYa.b(list, "source");
        Ca b = this.a.d;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (C2862s a2 : list) {
            arrayList.add(a2.a());
        }
        IPa b2 = b.a((List<C3508cda>) arrayList, true).b(LWa.a());
        C7471uYa.a((Object) b2, "trackRepo.liveFromUrns(s…, true).first(emptyMap())");
        return C5263RHa.a(list, b2, B.a);
    }
}
