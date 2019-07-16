package com.soundcloud.android.profile;

import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.events.v;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.tracks.C6192pa;

/* compiled from: UserTracksItemRenderer.kt */
public final class ee extends C5541_ta<be> {
    private final C6781kVa<ce> a;
    private final C6192pa b;

    public ee(C6192pa paVar) {
        C7471uYa.b(paVar, "trackItemRenderer");
        this.b = paVar;
        C6781kVa<ce> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create<UserTracksItemClickParams>()");
        this.a = s;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        return this.b.b(viewGroup);
    }

    public final C6781kVa<ce> a() {
        return this.a;
    }

    public void a(int i, View view, be beVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(beVar, "item");
        a(beVar, view, i);
    }

    public final void a(be beVar, View view, int i) {
        C7471uYa.b(beVar, "profileTrackItem");
        C7471uYa.b(view, "itemView");
        C6185ma c = beVar.c();
        this.b.a(c, view, (I) null, (v) null, C5512Zta.a.b());
        if (c.K()) {
            view.setOnClickListener(null);
        } else {
            view.setOnClickListener(new de(this, beVar));
        }
    }
}
