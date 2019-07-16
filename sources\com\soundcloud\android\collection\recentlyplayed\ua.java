package com.soundcloud.android.collection.recentlyplayed;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.image.N;
import com.soundcloud.android.image.StyledImageView;
import com.soundcloud.android.image.W;
import com.soundcloud.android.view.OverflowAnchorImageButton;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;

/* compiled from: RecentlyPlayedProfileRenderer.kt */
public final class ua extends C5541_ta<C2804ca> {
    private final C6781kVa<C3508cda> a;
    private final boolean b;
    private final N c;
    /* access modifiers changed from: private */
    public final F d;
    /* access modifiers changed from: private */
    public final C5231QFa e;

    public ua(boolean z, N n, F f, C5231QFa qFa) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(f, "screenProvider");
        C7471uYa.b(qFa, "userMenuPresenter");
        this.b = z;
        this.c = n;
        this.d = f;
        this.e = qFa;
        C6781kVa<C3508cda> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create<Urn>()");
        this.a = s;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.b ? l.collection_recently_played_profile_item_fixed_width : l.collection_recently_played_profile_item_variable_width, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…te(layout, parent, false)");
        return inflate;
    }

    public final C6781kVa<C3508cda> a() {
        return this.a;
    }

    public void a(int i, View view, C2804ca caVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(caVar, "item");
        CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.title);
        C7471uYa.a((Object) customFontTextView, "title");
        customFontTextView.setText(caVar.getTitle());
        ((StyledImageView) view.findViewById(i.artwork)).a(caVar.b(), C4928GKa.c(W.CIRCULAR), C4928GKa.c(caVar.a()), this.c);
        ImageView imageView = (ImageView) view.findViewById(i.pro_badge);
        C7471uYa.a((Object) imageView, "pro_badge");
        imageView.setVisibility(caVar.k() ? 0 : 8);
        view.setOnClickListener(new sa(this, caVar, i));
        OverflowAnchorImageButton overflowAnchorImageButton = (OverflowAnchorImageButton) view.findViewById(i.overflow_button);
        C7471uYa.a((Object) overflowAnchorImageButton, "overflow_button");
        a(overflowAnchorImageButton, caVar, i);
    }

    private final void a(OverflowAnchorImageButton overflowAnchorImageButton, C2804ca caVar, int i) {
        overflowAnchorImageButton.setOnClickListener(new ta(this, overflowAnchorImageButton, caVar, i));
        C5173OHa.a(overflowAnchorImageButton, g.collection_recently_played_item_overflow_menu_padding);
        C6428fIa.a((ImageView) overflowAnchorImageButton, g.collection_recently_played_item_overflow_menu_touch_expansion);
    }

    /* access modifiers changed from: private */
    public final void a(C2804ca caVar) {
        this.a.a(caVar.a());
    }
}
