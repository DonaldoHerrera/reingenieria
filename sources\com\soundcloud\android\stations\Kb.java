package com.soundcloud.android.stations;

import com.soundcloud.android.image.N;
import com.soundcloud.android.tracks.C6188na;

/* compiled from: StationTrackRenderer_Factory */
public final class Kb implements C4961HMa<Jb> {
    private final C7054oVa<N> a;
    private final C7054oVa<C6188na> b;
    private final C7054oVa<C4655rja> c;

    public static Jb a(N n, C6188na naVar, C4655rja rja) {
        return new Jb(n, naVar, rja);
    }

    public Jb get() {
        return new Jb((N) this.a.get(), (C6188na) this.b.get(), (C4655rja) this.c.get());
    }
}
