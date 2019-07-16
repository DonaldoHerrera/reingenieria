package com.soundcloud.android;

import com.facebook.B;

/* compiled from: ApplicationModule_ProvideFacebookSdkFactory */
public final class C implements C4961HMa<B> {
    private static final C a = new C();

    public static B a() {
        B e = C2933l.e();
        C5023JMa.a(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }

    public B get() {
        return a();
    }
}
