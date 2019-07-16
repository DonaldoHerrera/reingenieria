package defpackage;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: lL reason: default package and case insensitive filesystem */
/* compiled from: AnalyticsModule_ProvideFirebaseAnalyticsFactory */
public final class C3109lL implements C4961HMa<FirebaseAnalytics> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C7319sKa> b;

    public C3109lL(C7054oVa<Context> ova, C7054oVa<C7319sKa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C3109lL a(C7054oVa<Context> ova, C7054oVa<C7319sKa> ova2) {
        return new C3109lL(ova, ova2);
    }

    public static FirebaseAnalytics a(Context context, C7319sKa ska) {
        FirebaseAnalytics a2 = C2995fL.a(context, ska);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public FirebaseAnalytics get() {
        return a((Context) this.a.get(), (C7319sKa) this.b.get());
    }
}
