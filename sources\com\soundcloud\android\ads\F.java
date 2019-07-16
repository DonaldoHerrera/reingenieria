package com.soundcloud.android.ads;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.ads.Zc.a;
import com.soundcloud.android.foundation.ads.X;

/* compiled from: lambda */
public final /* synthetic */ class F implements OnClickListener {
    private final /* synthetic */ a a;
    private final /* synthetic */ a b;
    private final /* synthetic */ X c;

    public /* synthetic */ F(a aVar, a aVar2, X x) {
        this.a = aVar;
        this.b = aVar2;
        this.c = x;
    }

    public final void onClick(View view) {
        this.a.a(this.b, this.c, view.getContext());
    }
}
