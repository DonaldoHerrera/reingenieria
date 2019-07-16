package com.soundcloud.android.search;

import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.tracks.C6192pa;

/* compiled from: SearchTrackItemRenderer.kt */
public class Ga extends C5541_ta<Da> {
    private final C6781kVa<Ea> a;
    private final C6192pa b;

    public Ga(C6192pa paVar) {
        C7471uYa.b(paVar, "trackItemRenderer");
        this.b = paVar;
        C6781kVa<Ea> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create()");
        this.a = s;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        return this.b.b(viewGroup);
    }

    public C6781kVa<Ea> a() {
        return this.a;
    }

    public void a(int i, View view, Da da) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(da, "item");
        this.b.a(da.d(), view, (C3508cda) da.c().d());
        view.setOnClickListener(new Fa(this, da));
    }
}
