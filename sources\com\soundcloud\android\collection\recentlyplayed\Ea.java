package com.soundcloud.android.collection.recentlyplayed;

import com.soundcloud.android.collection.playhistory.ua;
import com.soundcloud.android.collection.recentlyplayed.G.b;
import java.util.List;

/* compiled from: RecentlyPlayedStorage.kt */
final class Ea extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ Ga a;
    final /* synthetic */ List b;

    Ea(Ga ga, List list) {
        this.a = ga;
        this.b = list;
        super(0);
    }

    public final void d() {
        b bVar = new b(this.a.b.a());
        for (ua uaVar : this.b) {
            C3508cda b2 = uaVar.b();
            C7471uYa.a((Object) b2, "record.contextUrn()");
            bVar.a(b2.c(), (long) uaVar.c(), uaVar.h());
            this.a.b.c("RecentlyPlayed", (Yd) bVar);
        }
    }
}
