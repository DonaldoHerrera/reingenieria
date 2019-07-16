package com.soundcloud.android.upsell;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.upsell.l.c;
import com.soundcloud.android.upsell.m.a;

/* compiled from: UpsellItemRenderer.kt */
final class o implements OnClickListener {
    final /* synthetic */ m a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;

    o(m mVar, int i, Object obj) {
        this.a = mVar;
        this.b = i;
        this.c = obj;
    }

    public final void onClick(View view) {
        a a2 = this.a.a;
        if (a2 != null) {
            a2.a(this.b, this.c);
        }
        this.a.a().a(new c(this.b));
    }
}
