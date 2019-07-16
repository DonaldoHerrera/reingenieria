package com.soundcloud.android.onboarding;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: lambda */
public final /* synthetic */ class c implements OnClickListener {
    private final /* synthetic */ OnboardActivity a;

    public /* synthetic */ c(OnboardActivity onboardActivity) {
        this.a = onboardActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.c(dialogInterface, i);
    }
}
