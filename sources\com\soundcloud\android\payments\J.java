package com.soundcloud.android.payments;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.payments.H.b;

/* compiled from: ConversionView.kt */
final class J implements OnClickListener {
    final /* synthetic */ b a;

    J(b bVar) {
        this.a = bVar;
    }

    public final void onClick(View view) {
        this.a.onClose();
    }
}
