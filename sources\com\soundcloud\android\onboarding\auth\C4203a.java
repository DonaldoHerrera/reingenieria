package com.soundcloud.android.onboarding.auth;

import android.accounts.Account;
import com.google.common.base.Function;

/* renamed from: com.soundcloud.android.onboarding.auth.a reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C4203a implements Function {
    public static final /* synthetic */ C4203a a = new C4203a();

    private /* synthetic */ C4203a() {
    }

    public final Object apply(Object obj) {
        return ((Account) obj).name;
    }
}
