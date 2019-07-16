package com.soundcloud.android.tracks;

import java.util.List;
import java.util.Set;

/* compiled from: TrackStorageReader.kt */
public class wb implements C4610mga<C3508cda, C3509cea> {
    private final Ya a;

    public wb(Ya ya) {
        C7471uYa.b(ya, "trackStorage");
        this.a = ya;
    }

    public APa<List<C3509cea>> a(Set<C3508cda> set) {
        C7471uYa.b(set, "keys");
        return this.a.b(C7676xWa.q(set));
    }
}
