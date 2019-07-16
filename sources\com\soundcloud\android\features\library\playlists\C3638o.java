package com.soundcloud.android.features.library.playlists;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.features.library.playlists.q.a;

/* renamed from: com.soundcloud.android.features.library.playlists.o reason: case insensitive filesystem */
/* compiled from: PlaylistCollectionItemRenderer.kt */
final class C3638o implements OnClickListener {
    final /* synthetic */ C3863rda a;
    final /* synthetic */ a b;

    C3638o(C3863rda rda, a aVar) {
        this.a = rda;
        this.b = aVar;
    }

    public final void onClick(View view) {
        this.b.g.a.accept(this.a.a());
    }
}
