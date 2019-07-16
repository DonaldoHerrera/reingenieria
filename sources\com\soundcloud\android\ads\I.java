package com.soundcloud.android.ads;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.ads.Zc.a;
import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.X;

/* compiled from: lambda */
public final /* synthetic */ class I implements OnClickListener {
    private final /* synthetic */ a a;
    private final /* synthetic */ X b;
    private final /* synthetic */ a c;

    public /* synthetic */ I(a aVar, X x, a aVar2) {
        this.a = aVar;
        this.b = x;
        this.c = aVar2;
    }

    public final void onClick(View view) {
        this.a.a(view.getContext(), (C3676c) this.b, C4928GKa.c(this.c));
    }
}
