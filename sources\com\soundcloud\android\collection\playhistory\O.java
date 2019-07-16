package com.soundcloud.android.collection.playhistory;

import android.content.res.Resources;
import com.soundcloud.android.collection.Ma;
import com.soundcloud.android.ia.o;
import com.soundcloud.android.ia.p;

/* compiled from: PlayHistoryHeaderRenderer.kt */
public final class O extends Ma<Q, T> {
    private final Resources d;

    public O(Resources resources, a aVar) {
        C7471uYa.b(resources, "resources");
        C7471uYa.b(aVar, "popupMenuFactory");
        super(aVar);
        this.d = resources;
    }

    public String a(T t) {
        C7471uYa.b(t, "item");
        String quantityString = this.d.getQuantityString(o.number_of_sounds, t.b(), new Object[]{Integer.valueOf(t.b())});
        C7471uYa.a((Object) quantityString, "resources.getQuantityStr…ckCount, item.trackCount)");
        return quantityString;
    }

    public String a() {
        String string = this.d.getString(p.collections_play_history_clear_action);
        C7471uYa.a((Object) string, "resources.getString(R.st…lay_history_clear_action)");
        return string;
    }
}
