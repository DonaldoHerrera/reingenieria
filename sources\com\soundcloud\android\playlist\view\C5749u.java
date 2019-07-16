package com.soundcloud.android.playlist.view;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

/* renamed from: com.soundcloud.android.playlist.view.u reason: case insensitive filesystem */
/* compiled from: PlaylistDetailFragment.kt */
final class C5749u implements OnClickListener {
    final /* synthetic */ PlaylistDetailFragment a;
    final /* synthetic */ List b;

    C5749u(PlaylistDetailFragment playlistDetailFragment, List list) {
        this.a = playlistDetailFragment;
        this.b = list;
    }

    public final void onClick(View view) {
        this.a.x.a(this.b);
    }
}
