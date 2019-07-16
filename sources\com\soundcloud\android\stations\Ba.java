package com.soundcloud.android.stations;

import com.soundcloud.android.sync.na;
import com.soundcloud.android.sync.oa.a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: LikedStationsSyncProvider */
public class Ba extends a {
    private final C7054oVa<Da> b;
    private final kc c;

    public Ba(C7054oVa<Da> ova, kc kcVar) {
        super(na.LIKED_STATIONS);
        this.b = ova;
        this.c = kcVar;
    }

    public Callable<Boolean> a(String str, boolean z) {
        return (Callable) this.b.get();
    }

    public boolean b() {
        return !this.c.a().isEmpty() || !this.c.b().isEmpty();
    }

    public long c() {
        return TimeUnit.HOURS.toMillis(4);
    }

    public boolean d() {
        return true;
    }
}
