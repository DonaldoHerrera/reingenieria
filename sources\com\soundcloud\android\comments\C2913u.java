package com.soundcloud.android.comments;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.soundcloud.android.comments.C2921y.a;

/* renamed from: com.soundcloud.android.comments.u reason: case insensitive filesystem */
/* compiled from: CommentRenderer.kt */
final class C2913u implements OnLongClickListener {
    final /* synthetic */ a a;
    final /* synthetic */ r b;
    final /* synthetic */ View c;
    final /* synthetic */ int d;

    C2913u(a aVar, r rVar, View view, int i) {
        this.a = aVar;
        this.b = rVar;
        this.c = view;
        this.d = i;
    }

    public final boolean onLongClick(View view) {
        this.b.a().a(this.a.b());
        return true;
    }
}
