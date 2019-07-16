package com.soundcloud.android.collection.playhistory;

import com.soundcloud.android.sync.na;
import com.soundcloud.android.sync.oa.a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PlayHistorySyncProvider */
public class xa extends a {
    private final C7054oVa<za> b;
    private final va c;

    protected xa(C7054oVa<za> ova, va vaVar) {
        super(na.PLAY_HISTORY);
        this.b = ova;
        this.c = vaVar;
    }

    public Callable<Boolean> a(String str, boolean z) {
        return (Callable) this.b.get();
    }

    public boolean b() {
        return this.c.b();
    }

    public long c() {
        return TimeUnit.MINUTES.toMillis(30);
    }

    public boolean d() {
        return false;
    }
}
