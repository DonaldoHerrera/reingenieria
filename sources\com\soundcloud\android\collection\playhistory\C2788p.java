package com.soundcloud.android.collection.playhistory;

import com.google.common.base.Function;
import java.io.IOException;
import java.util.List;

/* renamed from: com.soundcloud.android.collection.playhistory.p reason: case insensitive filesystem */
/* compiled from: FetchPlayHistoryCommand */
class C2788p {
    private static final Function<? super C3298uP, ua> a = new C2786n();
    private final dfa b;

    public C2788p(dfa dfa) {
        this.b = dfa;
    }

    private Pca<C3298uP> b() throws IOException, ifa, Lea {
        return (Pca) this.b.a(hfa.b(C2226PO.PLAY_HISTORY.a()).c().b(), (C4990IKa<ResourceType>) new C2787o<ResourceType>(this));
    }

    public List<ua> a() throws ifa, IOException, Lea {
        return C2063HD.a(b().f(), a);
    }
}
