package com.soundcloud.android.ui.visualplayer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.ui.visualplayer.c.C0175c;
import com.soundcloud.android.ui.visualplayer.e.l;

/* compiled from: TrackViewHolderFactory.kt */
public final class g implements C6289dFa<C0175c> {
    public C5378VEa<C0175c> a(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.track_page, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…rack_page, parent, false)");
        return new f(inflate);
    }
}
