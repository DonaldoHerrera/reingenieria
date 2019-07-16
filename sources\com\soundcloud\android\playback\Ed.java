package com.soundcloud.android.playback;

import com.soundcloud.android.playback.C4527xd.c;
import com.soundcloud.android.playback.Id.b;

/* compiled from: StreamSelector.kt */
final class Ed<T> implements C6776kQa<b> {
    final /* synthetic */ C4527xd a;
    final /* synthetic */ C3509cea b;

    Ed(C4527xd xdVar, C3509cea cea) {
        this.a = xdVar;
        this.b = cea;
    }

    /* renamed from: a */
    public final void accept(b bVar) {
        SDb.a("StreamSelector").a("Did not find payload in repository!", new Object[0]);
        C3469VY a2 = this.a.k;
        StringBuilder sb = new StringBuilder();
        sb.append("Could not find payload track ");
        sb.append(this.b.y());
        a.a(a2, new c(sb.toString()), null, 2, null);
    }
}
