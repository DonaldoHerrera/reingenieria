package com.soundcloud.android.collection.recentlyplayed;

import com.soundcloud.android.sync.na;
import com.soundcloud.android.sync.oa.a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: RecentlyPlayedSyncProvider */
public class Ia extends a {
    private final C7054oVa<Ka> b;
    private final Ga c;

    protected Ia(C7054oVa<Ka> ova, Ga ga) {
        super(na.RECENTLY_PLAYED);
        this.b = ova;
        this.c = ga;
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
