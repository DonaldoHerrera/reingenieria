package com.soundcloud.android.collection.recentlyplayed;

import com.soundcloud.android.collection.playhistory.ua;
import com.soundcloud.android.collection.recentlyplayed.G.d;
import java.util.List;

/* compiled from: RecentlyPlayedStorage.kt */
final class Ca extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ Ga a;
    final /* synthetic */ List b;

    Ca(Ga ga, List list) {
        this.a = ga;
        this.b = list;
        super(0);
    }

    public final void d() {
        d dVar = new d(this.a.b.a());
        for (ua uaVar : this.b) {
            C3508cda b2 = uaVar.b();
            C7471uYa.a((Object) b2, "record.contextUrn()");
            dVar.a(b2.c(), (long) uaVar.c(), uaVar.h(), Boolean.valueOf(true));
            this.a.b.a("RecentlyPlayed", (Yd) dVar);
        }
    }
}
