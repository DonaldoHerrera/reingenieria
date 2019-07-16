package com.soundcloud.android.sync;

import android.app.Application;

/* compiled from: SyncModule_ProvideBackgroundJobManagerFactory */
public final class aa implements C4961HMa<C2248QR> {
    private final C7054oVa<Application> a;
    private final C7054oVa<oa> b;
    private final C7054oVa<C6140x> c;

    public aa(C7054oVa<Application> ova, C7054oVa<oa> ova2, C7054oVa<C6140x> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static aa a(C7054oVa<Application> ova, C7054oVa<oa> ova2, C7054oVa<C6140x> ova3) {
        return new aa(ova, ova2, ova3);
    }

    public static C2248QR a(Application application, oa oaVar, C6140x xVar) {
        C2248QR a2 = Y.a(application, oaVar, xVar);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C2248QR get() {
        return a((Application) this.a.get(), (oa) this.b.get(), (C6140x) this.c.get());
    }
}
