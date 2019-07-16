package com.soundcloud.android.features.library.playlists;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: PlaylistOptionsPresenter.kt */
final class L implements OnClickListener {
    public static final L a = new L();

    L() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
