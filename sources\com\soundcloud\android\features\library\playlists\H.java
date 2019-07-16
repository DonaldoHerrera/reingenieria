package com.soundcloud.android.features.library.playlists;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.features.library.playlists.G.a;

/* compiled from: PlaylistHeaderRenderer.kt */
final class H implements OnClickListener {
    final /* synthetic */ G a;

    H(G g) {
        this.a = g;
    }

    public final void onClick(View view) {
        a a2 = this.a.a();
        if (a2 != null) {
            C7471uYa.a((Object) view, "it");
            a2.a(view);
        }
    }
}
