package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.o;
import java.util.concurrent.Callable;

/* renamed from: com.soundcloud.android.playback.ba reason: case insensitive filesystem */
/* compiled from: DefaultPlaySessionController.kt */
final class C4285ba<V> implements Callable<T> {
    final /* synthetic */ o a;
    final /* synthetic */ int b;
    final /* synthetic */ C3508cda c;
    final /* synthetic */ PlaySessionSource d;

    C4285ba(o oVar, int i, C3508cda cda, PlaySessionSource playSessionSource) {
        this.a = oVar;
        this.b = i;
        this.c = cda;
        this.d = playSessionSource;
    }

    public final int call() {
        return Cc.a(this.a, this.b, this.c, this.d, null, 16, null);
    }
}
