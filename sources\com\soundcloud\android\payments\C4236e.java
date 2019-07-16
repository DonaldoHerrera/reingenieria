package com.soundcloud.android.payments;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.soundcloud.android.payments.e reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C4236e implements OnClickListener {
    private final /* synthetic */ S a;
    private final /* synthetic */ int b;

    public /* synthetic */ C4236e(S s, int i) {
        this.a = s;
        this.b = i;
    }

    public final void onClick(View view) {
        this.a.a(this.b, view);
    }
}
