package com.soundcloud.android.offline;

import java.util.Set;

/* compiled from: OfflineAuditor.kt */
public class Ec {
    private final Vb a;
    private final C3469VY b;

    public Ec(Vb vb, C3469VY vy) {
        C7471uYa.b(vb, "downloadOperations");
        C7471uYa.b(vy, "errorReporter");
        this.a = vb;
        this.b = vy;
    }

    public void a() {
        Set set = (Set) this.a.e().b();
        C7471uYa.a((Object) set, "removed");
        if (!set.isEmpty()) {
            a.a(this.b, new Nd(set), null, 2, null);
        }
    }
}
