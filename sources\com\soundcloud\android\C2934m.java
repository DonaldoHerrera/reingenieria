package com.soundcloud.android;

import android.accounts.AccountManager;
import android.app.Application;

/* renamed from: com.soundcloud.android.m reason: case insensitive filesystem */
/* compiled from: ApplicationModule_ProvideAccountManagerFactory */
public final class C2934m implements C4961HMa<AccountManager> {
    private final C7054oVa<Application> a;

    public C2934m(C7054oVa<Application> ova) {
        this.a = ova;
    }

    public static C2934m a(C7054oVa<Application> ova) {
        return new C2934m(ova);
    }

    public static AccountManager a(Application application) {
        AccountManager a2 = C2933l.a(application);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public AccountManager get() {
        return a((Application) this.a.get());
    }
}
