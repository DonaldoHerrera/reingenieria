package com.soundcloud.android.collection.recentlyplayed;

import com.soundcloud.android.collection.Ja;
import com.soundcloud.android.image.N;

/* renamed from: com.soundcloud.android.collection.recentlyplayed.ga reason: case insensitive filesystem */
/* compiled from: RecentlyPlayedPlaylistRenderer.kt */
public class C2812ga {
    private final N a;
    private final C7287rra b;
    private final Ja c;

    public C2812ga(N n, C7287rra rra, Ja ja) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(rra, "playlistItemMenuPresenter");
        C7471uYa.b(ja, "playlistItemIndicatorsView");
        this.a = n;
        this.b = rra;
        this.c = ja;
    }

    public C2810fa a(boolean z) {
        return new C2810fa(z, this.a, this.b, this.c);
    }
}
