package com.soundcloud.android.comments;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.comments.C2921y.a;

/* renamed from: com.soundcloud.android.comments.s reason: case insensitive filesystem */
/* compiled from: CommentRenderer.kt */
final class C2909s implements OnClickListener {
    final /* synthetic */ a a;
    final /* synthetic */ r b;
    final /* synthetic */ View c;
    final /* synthetic */ int d;

    C2909s(a aVar, r rVar, View view, int i) {
        this.a = aVar;
        this.b = rVar;
        this.c = view;
        this.d = i;
    }

    public final void onClick(View view) {
        this.b.c().a(this.a.c());
    }
}
