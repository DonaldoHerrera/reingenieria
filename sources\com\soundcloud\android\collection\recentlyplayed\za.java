package com.soundcloud.android.collection.recentlyplayed;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.image.N;
import com.soundcloud.android.image.StyledImageView;
import com.soundcloud.android.image.W;
import com.soundcloud.android.stations.C6063yb;
import com.soundcloud.android.view.OverflowAnchorImageButton;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;

/* compiled from: RecentlyPlayedStationRenderer.kt */
public final class za extends C5541_ta<C2804ca> {
    private final C6781kVa<C3508cda> a;
    private final boolean b;
    private final N c;
    /* access modifiers changed from: private */
    public final C6063yb d;

    public za(boolean z, N n, C6063yb ybVar) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(ybVar, "stationMenuPresenter");
        this.b = z;
        this.c = n;
        this.d = ybVar;
        C6781kVa<C3508cda> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create<Urn>()");
        this.a = s;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.b ? l.collection_recently_played_station_item_fixed_width : l.collection_recently_played_station_item_variable_width, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…te(layout, parent, false)");
        return inflate;
    }

    /* access modifiers changed from: private */
    public final void b(C2804ca caVar) {
        this.a.a(caVar.a());
    }

    public final C6781kVa<C3508cda> a() {
        return this.a;
    }

    public void a(int i, View view, C2804ca caVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(caVar, "item");
        ((StyledImageView) view.findViewById(i.artwork)).a(caVar.b(), C4928GKa.c(W.STATION), caVar.a(), this.c);
        CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.title);
        C7471uYa.a((Object) customFontTextView, "title");
        customFontTextView.setText(caVar.getTitle());
        ((CustomFontTextView) view.findViewById(i.secondary_text)).setText(a(caVar));
        view.setOnClickListener(new xa(this, caVar));
        OverflowAnchorImageButton overflowAnchorImageButton = (OverflowAnchorImageButton) view.findViewById(i.overflow_button);
        C7471uYa.a((Object) overflowAnchorImageButton, "overflow_button");
        a(overflowAnchorImageButton, caVar);
    }

    private final void a(OverflowAnchorImageButton overflowAnchorImageButton, C2804ca caVar) {
        overflowAnchorImageButton.setOnClickListener(new ya(this, overflowAnchorImageButton, caVar));
        C5173OHa.a(overflowAnchorImageButton, g.collection_recently_played_item_overflow_menu_padding);
        C6428fIa.a((ImageView) overflowAnchorImageButton, g.collection_recently_played_item_overflow_menu_touch_expansion);
    }

    private final int a(C2804ca caVar) {
        C3508cda a2 = caVar.a();
        if (a2.f()) {
            return p.collections_recently_played_artist_station;
        }
        if (a2.y()) {
            return p.collections_recently_played_track_station;
        }
        return p.collections_recently_played_other_station;
    }
}
