package com.soundcloud.android.collection.recentlyplayed;

import com.google.common.base.Function;
import com.soundcloud.android.collection.playhistory.ua;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.soundcloud.android.collection.recentlyplayed.j reason: case insensitive filesystem */
/* compiled from: PushRecentlyPlayedCommand */
public class C2817j extends C1255eT<ua, List<ua>> {
    private static final Function<ua, C3398zP> a = C2801b.a;
    private final Ga b;
    private final dfa c;

    public C2817j(Ga ga, dfa dfa) {
        this.b = ga;
        this.c = dfa;
    }

    private void b(List<ua> list) {
        if (this.c.a(hfa.c(C2226PO.RECENTLY_PLAYED.a()).a((Object) a(list)).c().b()).g()) {
            this.b.b(list);
        }
    }

    public List<ua> a(ua uaVar) {
        List<ua> d = this.b.d();
        if (!d.isEmpty()) {
            b(d);
        }
        return d;
    }

    private Pca<C3398zP> a(List<ua> list) {
        return new Pca<>(new ArrayList(C3063jD.a((Collection<F>) list, a)));
    }
}
