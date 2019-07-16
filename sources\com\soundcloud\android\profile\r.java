package com.soundcloud.android.profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.profile.P.c;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;

/* compiled from: HeaderRenderer.kt */
public final class r extends C5541_ta<c> {
    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.profile_user_sounds_header, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…ds_header, parent, false)");
        return inflate;
    }

    public void a(int i, View view, c cVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(cVar, "item");
        ((CustomFontTextView) view.findViewById(i.sounds_header_text)).setText(a(cVar));
    }

    public final int a(c cVar) {
        C7471uYa.b(cVar, "item");
        switch (cVar.a()) {
            case 0:
                return p.user_profile_sounds_header_spotlight;
            case 1:
                return p.user_profile_sounds_header_tracks;
            case 2:
                return p.user_profile_sounds_header_albums;
            case 3:
                return p.user_profile_sounds_header_playlists;
            case 4:
                return p.user_profile_sounds_header_reposts;
            case 5:
                return p.user_profile_sounds_header_likes;
            case 6:
                return p.user_profile_sounds_header_top_tracks;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("No Header text for item type ");
                sb.append(cVar.a());
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
