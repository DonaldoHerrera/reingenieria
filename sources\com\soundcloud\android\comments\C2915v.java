package com.soundcloud.android.comments;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.soundcloud.android.comments.C2872ab.i;

/* renamed from: com.soundcloud.android.comments.v reason: case insensitive filesystem */
/* compiled from: CommentRenderer.kt */
final class C2915v implements Runnable {
    final /* synthetic */ View a;

    C2915v(View view) {
        this.a = view;
    }

    public final void run() {
        this.a.getHitRect(new Rect());
        Rect rect = new Rect();
        this.a.findViewById(i.comment_and_commenter_text).getHitRect(rect);
        rect.right = this.a.getRight();
        View view = this.a;
        view.setTouchDelegate(new TouchDelegate(rect, view.findViewById(i.comment_and_commenter_text)));
    }
}
