package com.soundcloud.android.ads;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.ads.C2617ra.d;

/* renamed from: com.soundcloud.android.ads.sa reason: case insensitive filesystem */
/* compiled from: AdItemRenderer.kt */
final class C2621sa implements OnClickListener {
    final /* synthetic */ C2629ua a;

    C2621sa(C2629ua uaVar) {
        this.a = uaVar;
    }

    public final void onClick(View view) {
        C6781kVa a2 = this.a.a();
        C7471uYa.a((Object) view, "view");
        Context context = view.getContext();
        C7471uYa.a((Object) context, "view.context");
        a2.a(new d(context));
    }
}
