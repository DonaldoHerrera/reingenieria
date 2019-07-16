package defpackage;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* renamed from: ll reason: default package and case insensitive filesystem */
/* compiled from: OrigamiValueConverter */
public class C1484ll {
    public static double a(double d) {
        return d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : 25.0d + ((d - 8.0d) * 3.0d);
    }

    public static double b(double d) {
        return d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : 8.0d + ((d - 25.0d) / 3.0d);
    }

    public static double c(double d) {
        return d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : 30.0d + ((d - 194.0d) / 3.62d);
    }

    public static double d(double d) {
        return d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : 194.0d + ((d - 30.0d) * 3.62d);
    }
}
