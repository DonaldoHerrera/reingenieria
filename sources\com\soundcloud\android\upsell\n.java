package com.soundcloud.android.upsell;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.upsell.m.a;

/* compiled from: UpsellItemRenderer.kt */
final class n implements OnClickListener {
    final /* synthetic */ m a;
    final /* synthetic */ View b;
    final /* synthetic */ int c;
    final /* synthetic */ Object d;

    n(m mVar, View view, int i, Object obj) {
        this.a = mVar;
        this.b = view;
        this.c = i;
        this.d = obj;
    }

    public final void onClick(View view) {
        a a2 = this.a.a;
        String str = "view.context";
        if (a2 != null) {
            Context context = this.b.getContext();
            C7471uYa.a((Object) context, str);
            a2.a(context, this.c, this.d);
        }
        C6781kVa a3 = this.a.a();
        Context context2 = this.b.getContext();
        C7471uYa.a((Object) context2, str);
        a3.a(new l.a(context2));
    }
}
