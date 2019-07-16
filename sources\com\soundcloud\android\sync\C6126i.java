package com.soundcloud.android.sync;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.soundcloud.android.sync.i reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C6126i implements ThreadFactory {
    public static final /* synthetic */ C6126i a = new C6126i();

    private /* synthetic */ C6126i() {
    }

    public final Thread newThread(Runnable runnable) {
        return ja.a(runnable);
    }
}
