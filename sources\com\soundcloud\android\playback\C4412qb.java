package com.soundcloud.android.playback;

import android.view.Surface;
import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.o;
import com.soundcloud.android.foundation.playqueue.q;

/* renamed from: com.soundcloud.android.playback.qb reason: case insensitive filesystem */
/* compiled from: PlaySessionController.kt */
public interface C4412qb {
    IPa<C4536zc> a(o oVar, C3508cda cda, int i, PlaySessionSource playSessionSource, long j);

    void a(long j);

    void a(q qVar);

    void a(String str, Surface surface);

    IPa<C4536zc> b(o oVar, C3508cda cda, int i, PlaySessionSource playSessionSource, long j);

    void b(long j);

    void g();

    boolean h();

    void i();

    boolean isPlaying();

    void j();

    boolean k();

    void l();

    boolean m();

    void pause();

    void play();
}
