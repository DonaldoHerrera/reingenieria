package com.soundcloud.android.foundation.playqueue;

import com.google.common.base.Predicate;

/* renamed from: com.soundcloud.android.foundation.playqueue.b reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C3715b implements Predicate {
    private final /* synthetic */ q a;

    public /* synthetic */ C3715b(q qVar) {
        this.a = qVar;
    }

    public final boolean apply(Object obj) {
        return ((q) obj).equals(this.a);
    }
}
