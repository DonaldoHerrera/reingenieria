package com.soundcloud.android.collection.playhistory;

import com.google.common.base.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PushPlayHistoryCommand */
public class Fa extends C1255eT<ua, List<ua>> {
    private static final Function<ua, C3298uP> a = C2778g.a;
    private final va b;
    private final dfa c;

    Fa(va vaVar, dfa dfa) {
        this.b = vaVar;
        this.c = dfa;
    }

    private void b(List<ua> list) {
        if (this.c.a(hfa.c(C2226PO.PLAY_HISTORY.a()).a((Object) a(list)).c().b()).g()) {
            this.b.a(list);
        }
    }

    public List<ua> a(ua uaVar) {
        List<ua> f = this.b.f();
        if (!f.isEmpty()) {
            b(f);
        }
        return f;
    }

    private Pca<C3298uP> a(List<ua> list) {
        return new Pca<>(new ArrayList(C3063jD.a((Collection<F>) list, a)));
    }
}
