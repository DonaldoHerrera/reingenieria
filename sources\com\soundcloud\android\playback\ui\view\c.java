package com.soundcloud.android.playback.ui.view;

import android.view.ViewGroup;

/* compiled from: VisualPlayerCommentsPresenter.kt */
public class c {
    private final i a;
    private final C5039Jwa b;

    public c(i iVar, C5039Jwa jwa) {
        C7471uYa.b(iVar, "commentRenderer");
        C7471uYa.b(jwa, "playerSettings");
        this.a = iVar;
        this.b = jwa;
    }

    public n a(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "playerCommentHolder");
        return new n(this.a, viewGroup, this.b);
    }
}
