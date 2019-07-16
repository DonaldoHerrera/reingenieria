package com.soundcloud.android.sync;

import com.soundcloud.android.offline.Cd;
import java.util.Map;

/* renamed from: com.soundcloud.android.sync.x reason: case insensitive filesystem */
/* compiled from: OneShotJobsRegistry.kt */
public final class C6140x implements C2305TR {
    private final Map<C2286SR, C2472bS<? extends C2453aS>> a;

    public C6140x(C2472bS<C3117lU> bSVar, C2472bS<Cd> bSVar2) {
        C7471uYa.b(bSVar, "oneShotConfigurationSyncJobProvider");
        C7471uYa.b(bSVar2, "offlineContentRetryJobProvider");
        this.a = LWa.b((HVa<? extends K, ? extends V>[]) new HVa[]{NVa.a(C2286SR.CONFIGURATION_SYNC, bSVar), NVa.a(C2286SR.RETRY_OFFLINE_SYNC, bSVar2)});
    }

    public Map<C2286SR, C2472bS<? extends C2453aS>> a() {
        return this.a;
    }
}
