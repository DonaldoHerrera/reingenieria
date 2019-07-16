package com.soundcloud.android.playback.playqueue;

import com.google.common.base.Predicate;
import com.soundcloud.android.foundation.playqueue.q;

/* renamed from: com.soundcloud.android.playback.playqueue.t reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C4396t implements Predicate {
    private final /* synthetic */ q a;

    public /* synthetic */ C4396t(q qVar) {
        this.a = qVar;
    }

    public final boolean apply(Object obj) {
        return Pa.a(this.a, (Va) obj);
    }
}
