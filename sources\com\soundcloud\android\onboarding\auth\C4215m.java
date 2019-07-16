package com.soundcloud.android.onboarding.auth;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.soundcloud.android.onboarding.auth.m reason: case insensitive filesystem */
/* compiled from: AcceptTermsFragment.kt */
final class C4215m implements OnClickListener {
    final /* synthetic */ C4210h a;

    C4215m(C4210h hVar) {
        this.a = hVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.Rb().p();
        dialogInterface.cancel();
    }
}
