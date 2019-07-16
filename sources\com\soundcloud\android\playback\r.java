package com.soundcloud.android.playback;

import com.google.common.base.Predicate;
import com.soundcloud.android.playback.ke.b;

/* compiled from: lambda */
public final /* synthetic */ class r implements Predicate {
    private final /* synthetic */ b a;

    public /* synthetic */ r(b bVar) {
        this.a = bVar;
    }

    public final boolean apply(Object obj) {
        return ke.a(this.a, (me) obj);
    }
}
