package com.soundcloud.android.onboarding.auth;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

/* renamed from: com.soundcloud.android.onboarding.auth.l reason: case insensitive filesystem */
/* compiled from: AcceptTermsFragment.kt */
final class C4214l implements OnClickListener {
    final /* synthetic */ C4210h a;
    final /* synthetic */ Bundle b;

    C4214l(C4210h hVar, Bundle bundle) {
        this.a = hVar;
        this.b = bundle;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.Rb().a(pa.a(this.b.getString("BUNDLE_TERMS_SIGNUP_VIA")), this.b.getBundle("BUNDLE_TERMS_SIGNUP_PARAMS"));
    }
}
