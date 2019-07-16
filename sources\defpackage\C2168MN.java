package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: MN reason: default package and case insensitive filesystem */
/* compiled from: FirebaseAnalyticsWrapper.kt */
public class C2168MN {
    private final FirebaseAnalytics a;

    public C2168MN(FirebaseAnalytics firebaseAnalytics) {
        C7471uYa.b(firebaseAnalytics, "firebaseAnalytics");
        this.a = firebaseAnalytics;
    }

    public FirebaseAnalytics a() {
        return this.a;
    }

    public void a(String str, Bundle bundle) {
        C7471uYa.b(str, "name");
        a().a(str, bundle);
    }

    public void a(Activity activity, String str, String str2) {
        C7471uYa.b(activity, "activity");
        C7471uYa.b(str, "screenName");
        a().setCurrentScreen(activity, str, str2);
    }

    public void a(String str, String str2) {
        C7471uYa.b(str, "property");
        C7471uYa.b(str2, "value");
        a().a(str, str2);
    }
}
