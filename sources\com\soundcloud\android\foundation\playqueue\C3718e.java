package com.soundcloud.android.foundation.playqueue;

import com.google.common.base.Predicate;

/* renamed from: com.soundcloud.android.foundation.playqueue.e reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C3718e implements Predicate {
    private final /* synthetic */ C3508cda a;

    public /* synthetic */ C3718e(C3508cda cda) {
        this.a = cda;
    }

    public final boolean apply(Object obj) {
        return ((q) obj).c().equals(this.a);
    }
}
