package com.soundcloud.android.comments;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: CommentsFragment.kt */
final class N implements OnClickListener {
    final /* synthetic */ CommentsFragment a;

    N(CommentsFragment commentsFragment) {
        this.a = commentsFragment;
    }

    public final void onClick(View view) {
        this.a.T().a(this.a.bc());
    }
}
