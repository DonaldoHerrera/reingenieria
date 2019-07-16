package com.soundcloud.android.comments;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.comments.C2890i.b;

/* renamed from: com.soundcloud.android.comments.g reason: case insensitive filesystem */
/* compiled from: CommentActionsSheetFragment.kt */
final class C2886g implements OnClickListener {
    final /* synthetic */ C2876c a;
    final /* synthetic */ C2890i b;

    C2886g(C2876c cVar, C2890i iVar) {
        this.a = cVar;
        this.b = iVar;
    }

    public final void onClick(View view) {
        this.a.dismiss();
        C2876c.a(this.a).a(new C2875bb(this.b.b(), this.b.c() == b.REPORT_AND_DELETE));
    }
}
