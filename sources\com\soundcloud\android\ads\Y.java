package com.soundcloud.android.ads;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.foundation.ads.aa;

/* compiled from: lambda */
public final /* synthetic */ class Y implements OnClickListener {
    private final /* synthetic */ a a;
    private final /* synthetic */ aa b;

    public /* synthetic */ Y(a aVar, aa aaVar) {
        this.a = aVar;
        this.b = aaVar;
    }

    public final void onClick(View view) {
        this.a.a(this.b, view);
    }
}
