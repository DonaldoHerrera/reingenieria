package com.soundcloud.android.collection.recentlyplayed;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.soundcloud.android.collection.Ja;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.image.N;
import com.soundcloud.android.image.StyledImageView;
import com.soundcloud.android.image.W;
import com.soundcloud.android.view.OverflowAnchorImageButton;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;

/* renamed from: com.soundcloud.android.collection.recentlyplayed.fa reason: case insensitive filesystem */
/* compiled from: RecentlyPlayedPlaylistRenderer.kt */
public final class C2810fa extends C5541_ta<C2804ca> {
    private final C6781kVa<C3508cda> a;
    private final boolean b;
    private final N c;
    /* access modifiers changed from: private */
    public final C7287rra d;
    private final Ja e;

    public C2810fa(boolean z, N n, C7287rra rra, Ja ja) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(rra, "playlistItemMenuPresenter");
        C7471uYa.b(ja, "playlistItemIndicatorsView");
        this.b = z;
        this.c = n;
        this.d = rra;
        this.e = ja;
        C6781kVa<C3508cda> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create<Urn>()");
        this.a = s;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.b ? l.collection_recently_played_playlist_item_fixed_width : l.collection_recently_played_playlist_item_variable_width, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…te(layout, parent, false)");
        return inflate;
    }

    public final C6781kVa<C3508cda> a() {
        return this.a;
    }

    public void a(int i, View view, C2804ca caVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(caVar, "item");
        ((RelativeLayout) view.findViewById(i.carousel_playlist_item)).setOnClickListener(new C2806da(this, caVar, view));
        ((StyledImageView) view.findViewById(i.artwork)).a(caVar.b(), C4928GKa.c(W.SQUARE), C4928GKa.c(caVar.a()), this.c);
        CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.title);
        C7471uYa.a((Object) customFontTextView, "this.title");
        customFontTextView.setText(caVar.getTitle());
        ((CustomFontTextView) view.findViewById(i.secondary_text)).setText(caVar.l() ? p.collections_recently_played_album : p.collections_recently_played_playlist);
        OverflowAnchorImageButton overflowAnchorImageButton = (OverflowAnchorImageButton) view.findViewById(i.overflow_button);
        C7471uYa.a((Object) overflowAnchorImageButton, "overflow_button");
        a(overflowAnchorImageButton, caVar);
        this.e.a(view, caVar.n(), caVar.m(), caVar.h());
    }

    private final void a(OverflowAnchorImageButton overflowAnchorImageButton, C2804ca caVar) {
        overflowAnchorImageButton.setOnClickListener(new C2808ea(this, overflowAnchorImageButton, caVar));
        C5173OHa.a(overflowAnchorImageButton, g.collection_recently_played_item_overflow_menu_padding);
        C6428fIa.a((ImageView) overflowAnchorImageButton, g.collection_recently_played_item_overflow_menu_touch_expansion);
    }

    /* access modifiers changed from: private */
    public final void a(C2804ca caVar) {
        this.a.a(caVar.a());
    }
}
