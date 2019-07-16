package com.soundcloud.android.search;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: SearchUserItemRenderer.kt */
final class Pa implements OnClickListener {
    final /* synthetic */ Qa a;
    final /* synthetic */ Ma b;

    Pa(Qa qa, Ma ma) {
        this.a = qa;
        this.b = ma;
    }

    public final void onClick(View view) {
        Sa d = this.b.d();
        if (d != null) {
            this.a.b().a(d);
        }
    }
}
