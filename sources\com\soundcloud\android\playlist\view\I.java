package com.soundcloud.android.playlist.view;

import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.utilities.android.h;
import com.soundcloud.android.view.LoadingTracksLayout;
import java.util.Arrays;

/* compiled from: PlaylistDetailsEmptyItemRenderer.kt */
public final class I extends C5541_ta<c> {
    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        return h.a(viewGroup, l.playlist_details_emptyview);
    }

    public void a(int i, View view, c cVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(cVar, "item");
        View findViewById = view.findViewById(i.loading);
        View findViewById2 = view.findViewById(i.server_error);
        View findViewById3 = view.findViewById(i.connection_error);
        View findViewById4 = view.findViewById(i.no_tracks);
        C4891FEa e = cVar.e();
        int i2 = 0;
        if (e instanceof c) {
            C6768kIa.a((Iterable<View>) Arrays.asList(new View[]{findViewById, findViewById2, findViewById3}));
            C6768kIa.b((Iterable<View>) RWa.a(findViewById4));
            View findViewById5 = view.findViewById(i.empty_playlist_owner_message);
            C7471uYa.a((Object) findViewById5, "itemView.findViewById<Vi…y_playlist_owner_message)");
            if (!cVar.f()) {
                i2 = 8;
            }
            findViewById5.setVisibility(i2);
        } else if (e instanceof d) {
            C6768kIa.a((Iterable<View>) Arrays.asList(new View[]{findViewById2, findViewById3, findViewById4}));
            C6768kIa.b((Iterable<View>) RWa.a(findViewById));
            ((LoadingTracksLayout) view.findViewById(i.loading)).a();
        } else if (e instanceof b) {
            Object a = ((b) e).a();
            if (a == null) {
                throw new IllegalArgumentException("Required value was null.");
            } else if (!(a instanceof C6973nJa)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Input ");
                sb.append(a);
                sb.append(" not of type ");
                sb.append(C6973nJa.class.getSimpleName());
                throw new IllegalArgumentException(sb.toString());
            } else if (C6972nIa.f(((C6973nJa) a).b())) {
                C6768kIa.a((Iterable<View>) Arrays.asList(new View[]{findViewById, findViewById2, findViewById4}));
                C6768kIa.b((Iterable<View>) RWa.a(findViewById3));
            } else {
                C6768kIa.a((Iterable<View>) Arrays.asList(new View[]{findViewById, findViewById3, findViewById4}));
                C6768kIa.b((Iterable<View>) RWa.a(findViewById2));
            }
        }
    }
}
