package defpackage;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* renamed from: SN reason: default package and case insensitive filesystem */
/* compiled from: FirebaseModule_ProvideFirebaseRemoteConfigFactory */
public final class C2282SN implements C4961HMa<FirebaseRemoteConfig> {
    private static final C2282SN a = new C2282SN();

    public static C2282SN a() {
        return a;
    }

    public static FirebaseRemoteConfig b() {
        FirebaseRemoteConfig b = C2244QN.b();
        C5023JMa.a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public FirebaseRemoteConfig get() {
        return b();
    }
}
