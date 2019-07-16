package com.soundcloud.android.payments;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.fragment.app.C0361c;

/* compiled from: ConversionView.kt */
final class M implements OnClickListener {
    final /* synthetic */ H a;
    final /* synthetic */ int b;

    M(H h, int i) {
        this.a = h;
        this.b = i;
    }

    public final void onClick(View view) {
        C5232QGa.a((C0361c) this.a.b(this.b), H.a(this.a), "restrictions_dialog");
    }
}
