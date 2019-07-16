package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: cza reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvidePlaySessionStateFactory */
public final class C6278cza implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C6278cza(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C6278cza a(C7054oVa<Context> ova) {
        return new C6278cza(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences y = C7853zya.y(context);
        C5023JMa.a(y, "Cannot return null from a non-@Nullable @Provides method");
        return y;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
