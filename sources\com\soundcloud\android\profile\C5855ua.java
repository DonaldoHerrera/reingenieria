package com.soundcloud.android.profile;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.soundcloud.android.profile.ua reason: case insensitive filesystem */
/* compiled from: ProfileHeaderPresenter.kt */
final class C5855ua implements OnClickListener {
    final /* synthetic */ C5850ta a;
    final /* synthetic */ C3240rR b;
    final /* synthetic */ C3508cda c;
    final /* synthetic */ C2390YL d;

    C5855ua(C5850ta taVar, C3240rR rRVar, C3508cda cda, C2390YL yl) {
        this.a = taVar;
        this.b = rRVar;
        this.c = cda;
        this.d = yl;
    }

    public final void onClick(View view) {
        this.b.a(this.c, this.a.c().isChecked()).a((C7117pPa) C5606ava.a(this.a.t, (PXa) null, 1, (Object) null));
        this.d.a(this.c, this.a.c().isChecked(), this.a.j());
        this.a.k();
    }
}
