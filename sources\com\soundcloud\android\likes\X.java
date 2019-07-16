package com.soundcloud.android.likes;

import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.tracks.C6192pa;

/* compiled from: TrackLikesTrackUniflowItemRenderer.kt */
public final class X extends C5541_ta<V> {
    /* access modifiers changed from: private */
    public final C2332VH<Integer> a;
    private final C6192pa b;

    public X(C6192pa paVar) {
        C7471uYa.b(paVar, "trackItemRenderer");
        this.b = paVar;
        C2332VH<Integer> s = C2332VH.s();
        C7471uYa.a((Object) s, "PublishRelay.create<Int>()");
        this.a = s;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        return this.b.b(viewGroup);
    }

    public void a(int i, View view, V v, C5378VEa<V> vEa) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(v, "item");
        C7471uYa.b(vEa, "viewHolder");
        view.setOnClickListener(new W(this, vEa));
        C6192pa.a(this.b, v.b(), view, (I) null, 4, (Object) null);
    }

    public final APa<Integer> a() {
        APa<Integer> h = this.a.h();
        C7471uYa.a((Object) h, "trackClick.hide()");
        return h;
    }
}
