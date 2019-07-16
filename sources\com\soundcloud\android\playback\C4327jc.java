package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.o;
import java.util.List;

/* renamed from: com.soundcloud.android.playback.jc reason: case insensitive filesystem */
/* compiled from: PlaybackMediaProvider.kt */
final class C4327jc<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C4302ec a;
    final /* synthetic */ PlaySessionSource b;
    final /* synthetic */ int c;
    final /* synthetic */ C3880tea d;

    C4327jc(C4302ec ecVar, PlaySessionSource playSessionSource, int i, C3880tea tea) {
        this.a = ecVar;
        this.b = playSessionSource;
        this.c = i;
        this.d = tea;
    }

    /* renamed from: a */
    public final IPa<o> apply(List<C3508cda> list) {
        C7471uYa.b(list, "it");
        C4336lb a2 = this.a.e;
        IPa a3 = IPa.a(list);
        C7471uYa.a((Object) a3, "Single.just(it)");
        PlaySessionSource playSessionSource = this.b;
        C7471uYa.a((Object) playSessionSource, "playSessionSource");
        return a2.a(a3, playSessionSource, this.c, this.d.b());
    }
}
