package com.soundcloud.android.foundation.playqueue;

/* compiled from: CurrentPlayQueueItemEvent.kt */
public abstract class k {
    private final long a;
    private final q b;
    private final C3508cda c;
    private final int d;

    private k(q qVar, C3508cda cda, int i) {
        this.b = qVar;
        this.c = cda;
        this.d = i;
        this.a = System.currentTimeMillis();
    }

    public C3508cda a() {
        return this.c;
    }

    public q b() {
        return this.b;
    }

    public int c() {
        return this.d;
    }

    public /* synthetic */ k(q qVar, C3508cda cda, int i, C7264rYa rya) {
        this(qVar, cda, i);
    }
}
