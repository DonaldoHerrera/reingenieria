package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: iza reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideRecommendedTracksSyncPrefsFactory */
public final class C6686iza implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public static SharedPreferences a(Context context) {
        SharedPreferences D = C7853zya.D(context);
        C5023JMa.a(D, "Cannot return null from a non-@Nullable @Provides method");
        return D;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
