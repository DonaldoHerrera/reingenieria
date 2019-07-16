package com.soundcloud.android.ads;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.foundation.ads.aa;

/* compiled from: lambda */
public final /* synthetic */ class V implements OnClickListener {
    private final /* synthetic */ a a;
    private final /* synthetic */ aa b;
    private final /* synthetic */ a c;

    public /* synthetic */ V(a aVar, aa aaVar, a aVar2) {
        this.a = aVar;
        this.b = aaVar;
        this.c = aVar2;
    }

    public final void onClick(View view) {
        this.a.a(this.b, this.c, view);
    }
}
