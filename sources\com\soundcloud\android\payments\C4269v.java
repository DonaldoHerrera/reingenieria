package com.soundcloud.android.payments;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.soundcloud.android.payments.v reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C4269v implements OnClickListener {
    private final /* synthetic */ C4259pa a;
    private final /* synthetic */ WebProduct b;

    public /* synthetic */ C4269v(C4259pa paVar, WebProduct webProduct) {
        this.a = paVar;
        this.b = webProduct;
    }

    public final void onClick(View view) {
        this.a.b(this.b, view);
    }
}
