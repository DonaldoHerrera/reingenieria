package com.soundcloud.android.playback;

import com.soundcloud.android.discovery.systemplaylist.C3520k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.soundcloud.android.playback.mc reason: case insensitive filesystem */
/* compiled from: PlaybackMediaProvider.kt */
final class C4342mc<T, R> implements C7118pQa<T, R> {
    public static final C4342mc a = new C4342mc();

    C4342mc() {
    }

    /* renamed from: a */
    public final List<C3508cda> apply(C3520k kVar) {
        C7471uYa.b(kVar, "playlist");
        List<C3509cea> h = kVar.h();
        C7471uYa.a((Object) h, "playlist.tracks()");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) h, 10));
        for (C3509cea y : h) {
            arrayList.add(y.y());
        }
        return arrayList;
    }
}
