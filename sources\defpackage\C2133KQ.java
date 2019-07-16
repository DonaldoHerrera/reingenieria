package defpackage;

import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* renamed from: KQ reason: default package and case insensitive filesystem */
/* compiled from: AppFeaturesProvider_Factory */
public final class C2133KQ implements C4961HMa<C2114JQ> {
    private final C7054oVa<FirebaseRemoteConfig> a;
    private final C7054oVa<SharedPreferences> b;
    private final C7054oVa<C6699jHa> c;

    public C2133KQ(C7054oVa<FirebaseRemoteConfig> ova, C7054oVa<SharedPreferences> ova2, C7054oVa<C6699jHa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C2133KQ a(C7054oVa<FirebaseRemoteConfig> ova, C7054oVa<SharedPreferences> ova2, C7054oVa<C6699jHa> ova3) {
        return new C2133KQ(ova, ova2, ova3);
    }

    public C2114JQ get() {
        return new C2114JQ((FirebaseRemoteConfig) this.a.get(), (SharedPreferences) this.b.get(), (C6699jHa) this.c.get());
    }
}
