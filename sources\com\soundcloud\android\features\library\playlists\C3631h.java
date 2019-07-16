package com.soundcloud.android.features.library.playlists;

import androidx.recyclerview.widget.GridLayoutManager.b;

/* renamed from: com.soundcloud.android.features.library.playlists.h reason: case insensitive filesystem */
/* compiled from: PlaylistCollectionFragment.kt */
public final class C3631h extends b {
    final /* synthetic */ PlaylistCollectionFragment c;
    final /* synthetic */ int d;

    C3631h(PlaylistCollectionFragment playlistCollectionFragment, int i) {
        this.c = playlistCollectionFragment;
        this.d = i;
    }

    public int b(int i) {
        if (i >= this.c.Xb().b() || !((C3635l) this.c.Xb().g(i)).c()) {
            return this.d;
        }
        return 1;
    }
}
