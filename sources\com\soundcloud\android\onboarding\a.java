package com.soundcloud.android.onboarding;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

/* compiled from: lambda */
public final /* synthetic */ class a implements OnClickListener {
    private final /* synthetic */ OnboardActivity a;
    private final /* synthetic */ Bundle b;

    public /* synthetic */ a(OnboardActivity onboardActivity, Bundle bundle) {
        this.a = onboardActivity;
        this.b = bundle;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(this.b, dialogInterface, i);
    }
}
