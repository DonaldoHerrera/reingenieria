package com.soundcloud.android.ui.visualplayer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.ui.visualplayer.c.a;
import com.soundcloud.android.ui.visualplayer.e.l;

/* compiled from: AdViewHolderFactory.kt */
public final class b implements C6289dFa<a> {
    public C5378VEa<a> a(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.ad_page, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…t.ad_page, parent, false)");
        return new a(inflate);
    }
}
