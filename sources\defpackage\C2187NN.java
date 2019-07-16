package defpackage;

import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: NN reason: default package and case insensitive filesystem */
/* compiled from: FirebaseAnalyticsWrapper_Factory */
public final class C2187NN implements C4961HMa<C2168MN> {
    private final C7054oVa<FirebaseAnalytics> a;

    public C2187NN(C7054oVa<FirebaseAnalytics> ova) {
        this.a = ova;
    }

    public static C2187NN a(C7054oVa<FirebaseAnalytics> ova) {
        return new C2187NN(ova);
    }

    public C2168MN get() {
        return new C2168MN((FirebaseAnalytics) this.a.get());
    }
}
