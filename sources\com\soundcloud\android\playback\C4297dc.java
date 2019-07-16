package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.p;
import java.lang.ref.WeakReference;

/* renamed from: com.soundcloud.android.playback.dc reason: case insensitive filesystem */
/* compiled from: PlaybackMediaProvider.kt */
final class C4297dc<T> implements C6776kQa<p> {
    final /* synthetic */ C4302ec a;

    C4297dc(C4302ec ecVar) {
        this.a = ecVar;
    }

    /* renamed from: a */
    public final void accept(p pVar) {
        WeakReference c = this.a.b;
        if (c != null) {
            C4641pna pna = (C4641pna) c.get();
            if (pna != null) {
                pna.a(this.a.b());
            }
        }
    }
}
