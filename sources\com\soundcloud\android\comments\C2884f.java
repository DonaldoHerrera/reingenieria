package com.soundcloud.android.comments;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.soundcloud.android.comments.f reason: case insensitive filesystem */
/* compiled from: CommentActionsSheetFragment.kt */
final class C2884f implements OnClickListener {
    final /* synthetic */ C2876c a;
    final /* synthetic */ C2890i b;

    C2884f(C2876c cVar, C2890i iVar) {
        this.a = cVar;
        this.b = iVar;
    }

    public final void onClick(View view) {
        this.a.dismiss();
        C2876c.a(this.a).a(new C2892j(this.b.b(), this.b.f()));
    }
}
