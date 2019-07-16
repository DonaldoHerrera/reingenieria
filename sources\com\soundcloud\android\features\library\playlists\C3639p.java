package com.soundcloud.android.features.library.playlists;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.features.library.playlists.q.a;
import com.soundcloud.android.view.OverflowAnchorImageButton;

/* renamed from: com.soundcloud.android.features.library.playlists.p reason: case insensitive filesystem */
/* compiled from: PlaylistCollectionItemRenderer.kt */
final class C3639p implements OnClickListener {
    final /* synthetic */ a a;
    final /* synthetic */ C3863rda b;
    final /* synthetic */ OverflowAnchorImageButton c;

    C3639p(a aVar, C3863rda rda, OverflowAnchorImageButton overflowAnchorImageButton) {
        this.a = aVar;
        this.b = rda;
        this.c = overflowAnchorImageButton;
    }

    public final void onClick(View view) {
        this.a.g.d.a((View) this.c, this.b);
    }
}
