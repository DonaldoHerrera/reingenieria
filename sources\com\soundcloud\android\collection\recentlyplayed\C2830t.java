package com.soundcloud.android.collection.recentlyplayed;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.ia.l;

/* renamed from: com.soundcloud.android.collection.recentlyplayed.t reason: case insensitive filesystem */
/* compiled from: RecentlyPlayedEmptyRenderer.kt */
public final class C2830t extends C5541_ta<C2829s> {
    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.recently_played_empty, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…yed_empty, parent, false)");
        return inflate;
    }

    public void a(int i, View view, C2829s sVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(sVar, "item");
        view.setEnabled(false);
    }
}
