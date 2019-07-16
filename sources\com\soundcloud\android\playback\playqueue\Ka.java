package com.soundcloud.android.playback.playqueue;

import com.google.common.base.Predicate;
import com.soundcloud.android.foundation.playqueue.q;

/* compiled from: PlayQueueOperations.kt */
final class Ka<T> implements Predicate<q> {
    public static final Ka a = new Ka();

    Ka() {
    }

    /* renamed from: a */
    public final boolean apply(q qVar) {
        if (qVar != null) {
            C3508cda c = qVar.c();
            C7471uYa.a((Object) c, "it.urn");
            if (c.x()) {
                return true;
            }
        }
        return false;
    }
}
