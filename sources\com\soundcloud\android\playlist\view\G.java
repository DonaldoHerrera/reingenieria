package com.soundcloud.android.playlist.view;

import com.soundcloud.android.playlist.view.C.a;

/* compiled from: PlaylistDetailsAdapter.kt */
public final class G {
    private final I a;
    private final aa b;
    private final ca c;
    private final C5753y d;

    public G(I i, aa aaVar, ca caVar, C5753y yVar) {
        C7471uYa.b(i, "emptyItemRenderer");
        C7471uYa.b(aaVar, "playlistDetailTrackViewRenderer");
        C7471uYa.b(caVar, "upsellItemRenderer");
        C7471uYa.b(yVar, "recommendationsItemRenderer");
        this.a = i;
        this.b = aaVar;
        this.c = caVar;
        this.d = yVar;
    }

    public final C a(a aVar, P p) {
        C7471uYa.b(aVar, "playlistDetailView");
        C7471uYa.b(p, "playlistDetailsHeaderRenderer");
        C c2 = new C(aVar, p, this.a, this.b, this.c, this.d);
        return c2;
    }
}
