package com.soundcloud.android.offline;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* compiled from: OfflineContentCleanupHelper.kt */
public final class Ic extends Xda {
    private final String a = "OfflineContent";
    private final Gd b;

    public Ic(Gd gd) {
        C7471uYa.b(gd, "offlineContentStorage");
        this.b = gd;
    }

    public Set<C3508cda> b() {
        return new HashSet((Collection) this.b.b().b());
    }

    public String getKey() {
        return this.a;
    }
}
