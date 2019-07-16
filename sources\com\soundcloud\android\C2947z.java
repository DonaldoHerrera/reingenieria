package com.soundcloud.android;

/* renamed from: com.soundcloud.android.z reason: case insensitive filesystem */
/* compiled from: ApplicationModule_ProvideDateProviderFactory */
public final class C2947z implements C4961HMa<C5694cGa> {
    private static final C2947z a = new C2947z();

    public static C2947z a() {
        return a;
    }

    public static C5694cGa b() {
        C5694cGa b = C2933l.b();
        C5023JMa.a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public C5694cGa get() {
        return b();
    }
}
