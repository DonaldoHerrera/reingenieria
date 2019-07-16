package com.soundcloud.android.profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.profile.P.f;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;

/* compiled from: ViewAllRenderer.kt */
public final class pe extends C5541_ta<f> {
    private final C6781kVa<C4621nja> a;

    public pe() {
        C6781kVa<C4621nja> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create()");
        this.a = s;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.sounds_view_all, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…_view_all, parent, false)");
        return inflate;
    }

    public final C6781kVa<C4621nja> a() {
        return this.a;
    }

    public void a(int i, View view, f fVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(fVar, "item");
        ((CustomFontTextView) view.findViewById(i.sounds_view_all_text)).setText(a(fVar));
        view.setOnClickListener(new oe(this, fVar));
    }

    private final int a(f fVar) {
        switch (fVar.a()) {
            case 1:
                return p.user_profile_sounds_view_all_tracks;
            case 2:
                return p.user_profile_sounds_view_all_albums;
            case 3:
                return p.user_profile_sounds_view_all_playlists;
            case 4:
                return p.user_profile_sounds_view_all_reposts;
            case 5:
                return p.user_profile_sounds_view_all_likes;
            case 6:
                return p.user_profile_sounds_view_all_top_tracks;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected item type ");
                sb.append(fVar.a());
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
