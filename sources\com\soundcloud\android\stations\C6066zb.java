package com.soundcloud.android.stations;

import android.content.Context;

/* renamed from: com.soundcloud.android.stations.zb reason: case insensitive filesystem */
/* compiled from: StationMenuPresenter_Factory */
public final class C6066zb implements C4961HMa<C6063yb> {
    private final C7054oVa<Context> a;
    private final C7054oVa<Bb> b;
    private final C7054oVa<ic> c;

    public static C6063yb a(Context context, Object obj, ic icVar) {
        return new C6063yb(context, (Bb) obj, icVar);
    }

    public C6063yb get() {
        return new C6063yb((Context) this.a.get(), (Bb) this.b.get(), (ic) this.c.get());
    }
}
