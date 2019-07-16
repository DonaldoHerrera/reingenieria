package com.soundcloud.android.collection.playhistory;

import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.playqueue.m;
import com.soundcloud.android.tracks.C6192pa;

/* compiled from: PlayHistoryTrackRenderer.kt */
public final class Ca extends C5541_ta<U> {
    private final C2332VH<C3508cda> a;
    private final C6192pa b;
    private final F c;

    public Ca(C6192pa paVar, F f) {
        C7471uYa.b(paVar, "renderer");
        C7471uYa.b(f, "screenProvider");
        this.b = paVar;
        this.c = f;
        C2332VH<C3508cda> s = C2332VH.s();
        C7471uYa.a((Object) s, "PublishRelay.create<Urn>()");
        this.a = s;
    }

    private final C4928GKa<I> b() {
        I i = r0;
        I i2 = new I(this.c.a(), true, null, null, null, null, null, null, null, null, null, 0, null, 8188, null);
        String a2 = m.HISTORY.a();
        C7471uYa.a((Object) a2, "DiscoverySource.HISTORY.value()");
        I i3 = i;
        i3.a(a2, "");
        C4928GKa<I> c2 = C4928GKa.c(i3);
        C7471uYa.a((Object) c2, "Optional.of(info)");
        return c2;
    }

    public final C2332VH<C3508cda> a() {
        return this.a;
    }

    public void a(int i, View view, U u) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(u, "item");
        view.setOnClickListener(new Ba(this, u));
        this.b.a(u.b(), view, (I) b().d());
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        return this.b.b(viewGroup);
    }
}
