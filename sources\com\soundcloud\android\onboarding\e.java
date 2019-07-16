package com.soundcloud.android.onboarding;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: lambda */
public final /* synthetic */ class e implements OnClickListener {
    private final /* synthetic */ OnboardActivity a;

    public /* synthetic */ e(OnboardActivity onboardActivity) {
        this.a = onboardActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.b(dialogInterface, i);
    }
}
