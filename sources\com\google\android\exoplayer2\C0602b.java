package com.google.android.exoplayer2;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.exoplayer2.b reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C0602b implements Runnable {
    private final /* synthetic */ CopyOnWriteArrayList a;
    private final /* synthetic */ b b;

    public /* synthetic */ C0602b(CopyOnWriteArrayList copyOnWriteArrayList, b bVar) {
        this.a = copyOnWriteArrayList;
        this.b = bVar;
    }

    public final void run() {
        C0625w.c(this.a, this.b);
    }
}
