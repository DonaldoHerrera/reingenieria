package com.soundcloud.android.search;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: SearchUserItemRenderer.kt */
final class Oa implements OnClickListener {
    final /* synthetic */ Qa a;
    final /* synthetic */ Ma b;

    Oa(Qa qa, Ma ma) {
        this.a = qa;
        this.b = ma;
    }

    public final void onClick(View view) {
        Na c = this.b.c();
        if (c != null) {
            this.a.a().a(c);
        }
    }
}
