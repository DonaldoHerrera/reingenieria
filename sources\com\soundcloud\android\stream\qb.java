package com.soundcloud.android.stream;

import com.soundcloud.android.tracks.C6188na;
import com.soundcloud.android.tracks.Va;

/* compiled from: StreamTrackItemRenderer_Factory */
public final class qb implements C4961HMa<pb> {
    private final C7054oVa<C5408WFa> a;
    private final C7054oVa<C6188na> b;
    private final C7054oVa<C5204PIa> c;
    private final C7054oVa<A> d;
    private final C7054oVa<Va> e;

    public static pb a(C5408WFa wFa, C6188na naVar, C5204PIa pIa, Object obj, Va va) {
        pb pbVar = new pb(wFa, naVar, pIa, (A) obj, va);
        return pbVar;
    }

    public pb get() {
        pb pbVar = new pb((C5408WFa) this.a.get(), (C6188na) this.b.get(), (C5204PIa) this.c.get(), (A) this.d.get(), (Va) this.e.get());
        return pbVar;
    }
}
