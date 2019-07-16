package com.soundcloud.android.tracks;

import java.util.List;
import java.util.Set;

/* compiled from: FullTrackStorageReader.kt */
public class K implements C4610mga<C3508cda, C3493aea> {
    private final Ya a;

    public K(Ya ya) {
        C7471uYa.b(ya, "trackStorage");
        this.a = ya;
    }

    public APa<List<C3493aea>> a(Set<C3508cda> set) {
        C7471uYa.b(set, "keys");
        if (set.size() == 1) {
            APa<List<C3493aea>> h = this.a.a((C3508cda) C7676xWa.g((Iterable) set)).a((C7256rQa<? super T>) I.a).h(J.a);
            C7471uYa.a((Object) h, "trackStorage\n           ….map { listOf(it.get()) }");
            return h;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Reading ");
        sb.append(set.size());
        sb.append(" FullTracks in batch is not implemented!");
        throw new UnsupportedOperationException(sb.toString());
    }
}
