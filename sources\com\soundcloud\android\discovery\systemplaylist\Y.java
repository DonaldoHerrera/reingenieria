package com.soundcloud.android.discovery.systemplaylist;

import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.foundation.events.B;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.tracks.C6192pa;

/* compiled from: SystemPlaylistTrackItemRenderer.kt */
public final class Y extends C5541_ta<V> {
    private final C6781kVa<ea> a;
    private final C6192pa b;

    public Y(C6192pa paVar) {
        C7471uYa.b(paVar, "trackItemRenderer");
        this.b = paVar;
        C6781kVa<ea> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create<TrackClickParams>()");
        this.a = s;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        return this.b.b(viewGroup);
    }

    public final C6781kVa<ea> a() {
        return this.a;
    }

    public void a(int i, View view, V v) {
        View view2 = view;
        V v2 = v;
        C7471uYa.b(view2, "itemView");
        C7471uYa.b(v2, "item");
        W b2 = v.b();
        int i2 = i - 1;
        String a2 = Yca.SYSTEM_PLAYLIST.a();
        C7471uYa.a((Object) a2, "Screen.SYSTEM_PLAYLIST.get()");
        I i3 = r5;
        I i4 = new I(a2, true, null, null, null, null, null, null, null, null, null, 0, null, 8188, null);
        I i5 = i3;
        i5.a(b2.b(), i2);
        String c = b2.c();
        if (c != null) {
            i5.a(c, "");
        }
        C3508cda a3 = b2.a();
        if (a3 != null) {
            i5.a(new B(i2, a3));
        }
        this.b.a(b2.d(), view2, b2.b(), i5);
        view2.setOnClickListener(new X(this, v2));
    }
}
