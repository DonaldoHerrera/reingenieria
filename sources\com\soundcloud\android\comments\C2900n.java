package com.soundcloud.android.comments;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.soundcloud.android.comments.n reason: case insensitive filesystem */
/* compiled from: CommentInputRenderer.kt */
final class C2900n implements OnClickListener {
    final /* synthetic */ a a;

    C2900n(a aVar) {
        this.a = aVar;
    }

    public final void onClick(View view) {
        this.a.a();
        this.a.c().setEnabled(false);
        this.a.d().a();
        this.a.g.g.a(RVa.a);
    }
}
