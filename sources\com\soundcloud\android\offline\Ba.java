package com.soundcloud.android.offline;

import java.util.concurrent.Callable;

/* compiled from: lambda */
public final /* synthetic */ class Ba implements Callable {
    private final /* synthetic */ Gd a;
    private final /* synthetic */ C3508cda b;

    public /* synthetic */ Ba(Gd gd, C3508cda cda) {
        this.a = gd;
        this.b = cda;
    }

    public final Object call() {
        return this.a.b(this.b);
    }
}
