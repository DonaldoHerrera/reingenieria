package com.soundcloud.android.collection.playhistory;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.ia.l;

/* compiled from: PlayHistoryEmptyRenderer.kt */
public final class I extends C5541_ta<S> {
    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.play_history_empty, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…ory_empty, parent, false)");
        return inflate;
    }

    public void a(int i, View view, S s) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(s, "item");
        view.setEnabled(false);
    }
}
