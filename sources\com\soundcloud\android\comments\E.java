package com.soundcloud.android.comments;

import android.content.Context;
import com.soundcloud.android.view.SmoothScrollLinearLayoutManager;

/* compiled from: CommentsFragment.kt */
final class E extends C7540vYa implements PXa<SmoothScrollLinearLayoutManager> {
    final /* synthetic */ CommentsFragment a;

    E(CommentsFragment commentsFragment) {
        this.a = commentsFragment;
        super(0);
    }

    public final SmoothScrollLinearLayoutManager d() {
        Context context = this.a.getContext();
        if (context != null) {
            return new SmoothScrollLinearLayoutManager(context, 1, true, 1);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
