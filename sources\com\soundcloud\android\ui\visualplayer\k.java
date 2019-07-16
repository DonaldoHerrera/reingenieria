package com.soundcloud.android.ui.visualplayer;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: VisualPlayerFragment.kt */
final class k extends C7540vYa implements PXa<LinearLayoutManager> {
    final /* synthetic */ VisualPlayerFragment a;

    k(VisualPlayerFragment visualPlayerFragment) {
        this.a = visualPlayerFragment;
        super(0);
    }

    public final LinearLayoutManager d() {
        return new LinearLayoutManager(this.a.getContext(), 0, false);
    }
}
