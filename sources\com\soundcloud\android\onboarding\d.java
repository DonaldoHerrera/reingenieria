package com.soundcloud.android.onboarding;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: lambda */
public final /* synthetic */ class d implements OnClickListener {
    private final /* synthetic */ OnboardActivity a;

    public /* synthetic */ d(OnboardActivity onboardActivity) {
        this.a = onboardActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(dialogInterface, i);
    }
}
