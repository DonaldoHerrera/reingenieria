package com.soundcloud.android.collection.recentlyplayed;

import com.google.common.base.Function;
import com.soundcloud.android.collection.playhistory.ua;
import java.io.IOException;
import java.util.List;

/* renamed from: com.soundcloud.android.collection.recentlyplayed.h reason: case insensitive filesystem */
/* compiled from: FetchRecentlyPlayedCommand */
class C2813h {
    private static final Function<? super C3398zP, ua> a = C2799a.a;
    private final dfa b;

    public C2813h(dfa dfa) {
        this.b = dfa;
    }

    private Pca<C3398zP> b() throws IOException, ifa, Lea {
        return (Pca) this.b.a(hfa.b(C2226PO.RECENTLY_PLAYED.a()).c().b(), (C4990IKa<ResourceType>) new C2811g<ResourceType>(this));
    }

    public List<ua> a() throws ifa, IOException, Lea {
        return C2063HD.a(b().f(), a);
    }
}
