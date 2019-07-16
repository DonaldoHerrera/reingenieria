package com.soundcloud.android.payments;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.soundcloud.android.payments.va reason: case insensitive filesystem */
/* compiled from: ProductChoiceScrollView.kt */
final class C4270va implements OnClickListener {
    final /* synthetic */ a a;
    final /* synthetic */ WebProduct b;

    C4270va(a aVar, WebProduct webProduct) {
        this.a = aVar;
        this.b = webProduct;
    }

    public final void onClick(View view) {
        this.a.c(this.b);
    }
}
