package com.soundcloud.android.profile;

import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.ia.f;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.playback.Db.a;
import com.soundcloud.android.profile.P.e;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.tracks.C6192pa;
import com.soundcloud.android.tracks.Ea;

/* renamed from: com.soundcloud.android.profile.ma reason: case insensitive filesystem */
/* compiled from: ProfileBucketsTrackItemRenderer.kt */
public final class C5816ma extends C5541_ta<e> {
    private final C6781kVa<a> a;
    private final C6192pa b;
    private final Ea.a c;

    public C5816ma(C6192pa paVar, Ea.a aVar) {
        C7471uYa.b(paVar, "trackItemRenderer");
        C7471uYa.b(aVar, "trackItemViewFactory");
        this.b = paVar;
        this.c = aVar;
        C6781kVa<a> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create()");
        this.a = s;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View a2 = this.c.a(viewGroup, l.tracklist_item_with_divider);
        C7471uYa.a((Object) a2, "trackItemViewFactory.cre…cklist_item_with_divider)");
        return a2;
    }

    public final C6781kVa<a> a() {
        return this.a;
    }

    public void a(int i, View view, e eVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(eVar, "item");
        C6185ma e = eVar.e();
        view.setBackgroundColor(view.getResources().getColor(f.white));
        view.setOnClickListener(new C5811la(this, eVar));
        this.b.a(e, view, (I) null, eVar.c(), eVar.b() ? C5512Zta.a.c() : C5512Zta.a.b());
    }
}
