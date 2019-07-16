package com.soundcloud.android.ads;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.ads.C2617ra.a;
import com.soundcloud.android.foundation.ads.C3676c;

/* renamed from: com.soundcloud.android.ads.ta reason: case insensitive filesystem */
/* compiled from: AdItemRenderer.kt */
final class C2625ta implements OnClickListener {
    final /* synthetic */ C2629ua a;
    final /* synthetic */ C3676c b;

    C2625ta(C2629ua uaVar, C3676c cVar) {
        this.a = uaVar;
        this.b = cVar;
    }

    public final void onClick(View view) {
        this.a.a().a(new a(this.b));
    }
}
