package com.soundcloud.android.playlist.view;

import android.content.Context;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.v;

/* renamed from: com.soundcloud.android.playlist.view.k reason: case insensitive filesystem */
/* compiled from: OtherPlaylistsByUserAdapter */
public class C5740k extends C5407WEa<C3863rda> implements a {
    private final F g;
    private final C3700b h;
    private final C4655rja i;

    C5740k(C5294SIa sIa, F f, C3700b bVar, C4655rja rja) {
        super((C6289dFa<T>) sIa);
        this.i = rja;
        sIa.a((a) this);
        this.g = f;
        this.h = bVar;
    }

    /* access modifiers changed from: 0000 */
    public void a(d dVar) {
        f();
        a((Iterable<? extends T>) dVar.f());
        e();
    }

    public int f(int i2) {
        return 0;
    }

    public void a(Context context, C3863rda rda, int i2) {
        C3508cda a = rda.a();
        Yca b = this.g.b();
        C3710l a2 = a(new v("more_playlists_by_user", i2), b);
        K d = K.d(a, a2);
        this.h.a((J) K.c(a, a2));
        this.i.a(C4621nja.a(a, b, C4928GKa.a(), C4928GKa.a(), C4928GKa.c(d)));
    }

    private C3710l a(v vVar, Yca yca) {
        return C3710l.a(new I(yca.a(), true), yca.a(), vVar, C3508cda.a);
    }
}
