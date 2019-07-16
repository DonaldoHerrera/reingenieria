package com.soundcloud.android.profile;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.soundcloud.android.profile.va reason: case insensitive filesystem */
/* compiled from: ProfileHeaderPresenter.kt */
final class C5860va implements OnClickListener {
    final /* synthetic */ C3508cda a;
    final /* synthetic */ C5850ta b;

    C5860va(C3508cda cda, C5850ta taVar) {
        this.a = cda;
        this.b = taVar;
    }

    public final void onClick(View view) {
        this.b.k();
        this.b.o.a(this.a);
    }
}
