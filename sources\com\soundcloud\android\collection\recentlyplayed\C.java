package com.soundcloud.android.collection.recentlyplayed;

import android.content.res.Resources;
import com.soundcloud.android.collection.Ma;
import com.soundcloud.android.ia.o;
import com.soundcloud.android.ia.p;

/* compiled from: RecentlyPlayedHeaderRenderer.kt */
public final class C extends Ma<E, B> {
    private final Resources d;

    public C(Resources resources, a aVar) {
        C7471uYa.b(resources, "resources");
        C7471uYa.b(aVar, "popupMenuFactory");
        super(aVar);
        this.d = resources;
    }

    public String a(B b) {
        C7471uYa.b(b, "header");
        String quantityString = this.d.getQuantityString(o.collections_recently_played_header_items, b.g(), new Object[]{Integer.valueOf(b.g())});
        C7471uYa.a((Object) quantityString, "resources.getQuantityStr…unt, header.contextCount)");
        return quantityString;
    }

    public String a() {
        String string = this.d.getString(p.collections_recently_played_clear_action);
        C7471uYa.a((Object) string, "resources.getString(coll…ntly_played_clear_action)");
        return string;
    }
}
