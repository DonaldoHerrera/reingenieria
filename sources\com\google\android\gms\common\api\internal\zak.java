package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.GoogleApi;
import java.util.Map;
import java.util.Set;

public final class zak {
    private final T<zai<?>, ConnectionResult> zaay = new T<>();
    private final T<zai<?>, String> zadb = new T<>();
    private final Xy<Map<zai<?>, String>> zadc = new Xy<>();
    private int zadd;
    private boolean zade = false;

    public zak(Iterable<? extends GoogleApi<?>> iterable) {
        for (GoogleApi zak : iterable) {
            this.zaay.put(zak.zak(), null);
        }
        this.zadd = this.zaay.keySet().size();
    }

    public final Wy<Map<zai<?>, String>> getTask() {
        return this.zadc.a();
    }

    public final void zaa(zai<?> zai, ConnectionResult connectionResult, String str) {
        this.zaay.put(zai, connectionResult);
        this.zadb.put(zai, str);
        this.zadd--;
        if (!connectionResult.isSuccess()) {
            this.zade = true;
        }
        if (this.zadd == 0) {
            if (this.zade) {
                this.zadc.a((Exception) new AvailabilityException(this.zaay));
                return;
            }
            this.zadc.a(this.zadb);
        }
    }

    public final Set<zai<?>> zap() {
        return this.zaay.keySet();
    }
}
