package com.soundcloud.android.activities;

import com.soundcloud.android.sync.na;
import com.soundcloud.android.sync.oa.a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: ActivitiesSyncProvider */
public class y extends a {
    private final a b;

    public y(a aVar) {
        super(na.ACTIVITIES);
        this.b = aVar;
    }

    public Callable<Boolean> a(String str, boolean z) {
        return this.b.a(str);
    }

    public boolean b() {
        return false;
    }

    public long c() {
        return TimeUnit.MINUTES.toMillis(10);
    }

    public boolean d() {
        return false;
    }
}
