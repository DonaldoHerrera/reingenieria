package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.o;
import java.util.List;

/* renamed from: com.soundcloud.android.playback.jb reason: case insensitive filesystem */
/* compiled from: PlayQueueFactory.kt */
final class C4326jb<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C4336lb a;
    final /* synthetic */ PlaySessionSource b;

    C4326jb(C4336lb lbVar, PlaySessionSource playSessionSource) {
        this.a = lbVar;
        this.b = playSessionSource;
    }

    /* renamed from: a */
    public final IPa<o> apply(List<C3508cda> list) {
        C7471uYa.b(list, "it");
        return this.a.b.a(list).e(new C4321ib(this, list));
    }
}
