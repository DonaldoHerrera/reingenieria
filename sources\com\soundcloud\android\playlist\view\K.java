package com.soundcloud.android.playlist.view;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.m;

/* compiled from: PlaylistDetailsHeaderAnimator */
class K extends m {
    final /* synthetic */ M a;

    K(M m) {
        this.a = m;
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
        this.a.a(recyclerView, i2 > 0 ? a.UP : a.DOWN);
    }
}
