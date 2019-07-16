package com.soundcloud.android.likes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.o;
import com.soundcloud.android.offlinestate.OfflineStateButton;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;

/* compiled from: TrackLikesHeaderRenderer.kt */
public final class P extends C5541_ta<S> {
    private final C6781kVa<RVa> a;
    /* access modifiers changed from: private */
    public final C6781kVa<RVa> b;
    /* access modifiers changed from: private */
    public final C6781kVa<RVa> c;
    /* access modifiers changed from: private */
    public final C6781kVa<Boolean> d;

    public P() {
        C6781kVa<RVa> s = C6781kVa.s();
        String str = "PublishSubject.create<Unit>()";
        C7471uYa.a((Object) s, str);
        this.a = s;
        C6781kVa<RVa> s2 = C6781kVa.s();
        C7471uYa.a((Object) s2, str);
        this.b = s2;
        C6781kVa<RVa> s3 = C6781kVa.s();
        C7471uYa.a((Object) s3, str);
        this.c = s3;
        C6781kVa<Boolean> s4 = C6781kVa.s();
        C7471uYa.a((Object) s4, "PublishSubject.create<Boolean>()");
        this.d = s4;
    }

    public final APa<RVa> d() {
        return this.a;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        return LayoutInflater.from(viewGroup.getContext()).inflate(l.track_likes_header, viewGroup, false);
    }

    public final APa<RVa> c() {
        return this.c;
    }

    public void a(int i, View view, S s) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(s, "item");
        view.setVisibility(s.e() ? 0 : 8);
        if (s.e()) {
            b(view, s);
        }
    }

    public final APa<RVa> b() {
        return this.b;
    }

    private final void b(View view, S s) {
        CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.header_text);
        C7471uYa.a((Object) customFontTextView, "headerView.header_text");
        int i = 0;
        customFontTextView.setText(view.getResources().getQuantityString(o.number_of_liked_tracks_you_liked, s.c(), new Object[]{Integer.valueOf(s.c())}));
        ImageButton imageButton = (ImageButton) view.findViewById(i.shuffle_btn);
        imageButton.setOnClickListener(new O(this, s));
        if (!s.h()) {
            i = 8;
        }
        imageButton.setVisibility(i);
        imageButton.setEnabled(s.h());
        a(s, view);
    }

    public final APa<Boolean> a() {
        return this.d;
    }

    private final void a(S s, View view) {
        ((OfflineStateButton) view.findViewById(i.offline_state_button)).setOnClickListener(null);
        OfflineStateButton offlineStateButton = (OfflineStateButton) view.findViewById(i.offline_state_button);
        C7471uYa.a((Object) offlineStateButton, "view.offline_state_button");
        offlineStateButton.setVisibility(8);
        if (s.j()) {
            a(view, s);
        } else if (s.i()) {
            a(view);
        } else {
            ((OfflineStateButton) view.findViewById(i.offline_state_button)).setState(C3823mda.NOT_OFFLINE);
        }
    }

    private final void a(View view, S s) {
        OfflineStateButton offlineStateButton = (OfflineStateButton) view.findViewById(i.offline_state_button);
        offlineStateButton.setVisibility(0);
        offlineStateButton.setOnClickListener(new M(this, s));
        offlineStateButton.setState(s.d());
        if (s.g()) {
            offlineStateButton.b();
        } else if (s.f()) {
            offlineStateButton.a();
        }
    }

    private final void a(View view) {
        OfflineStateButton offlineStateButton = (OfflineStateButton) view.findViewById(i.offline_state_button);
        C7471uYa.a((Object) offlineStateButton, "view.offline_state_button");
        offlineStateButton.setVisibility(0);
        ((OfflineStateButton) view.findViewById(i.offline_state_button)).setOnClickListener(new N(this));
        this.a.a(RVa.a);
    }
}
