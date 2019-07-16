package com.soundcloud.android.payments;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.fragment.app.C0361c;

/* compiled from: ConversionView.kt */
final class L implements OnClickListener {
    final /* synthetic */ H a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;

    L(H h, String str, String str2, String str3) {
        this.a = h;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final void onClick(View view) {
        C5232QGa.a((C0361c) G.a(this.b, this.c, this.d), H.a(this.a), "restrictions_dialog");
    }
}
