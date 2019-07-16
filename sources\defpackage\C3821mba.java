package defpackage;

import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;

@EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0014\u0015\u0016B\u0005¢\u0006\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H&J%\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0007H&J\b\u0010\u0011\u001a\u00020\u0012H&J\u0006\u0010\u0013\u001a\u00020\u0007¨\u0006\u0017"}, d2 = {"Lcom/soundcloud/android/features/Feature;", "T", "", "()V", "default", "()Ljava/lang/Object;", "description", "", "extract", "firebaseRemoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "localConfigOverride", "Landroid/content/SharedPreferences;", "deviceHelper", "Lcom/soundcloud/android/utils/DeviceHelper;", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;Landroid/content/SharedPreferences;Lcom/soundcloud/android/utils/DeviceHelper;)Ljava/lang/Object;", "key", "remoteConfigurable", "", "remoteKey", "FlagFeature", "KillSwitch", "VariantFeature", "features-base_release"}, mv = {1, 1, 15})
/* renamed from: mba reason: default package and case insensitive filesystem */
/* compiled from: Feature.kt */
public abstract class C3821mba<T> {

    /* renamed from: mba$a */
    /* compiled from: Feature.kt */
    public static abstract class a extends C3821mba<Boolean> {
        public Boolean a(FirebaseRemoteConfig firebaseRemoteConfig, SharedPreferences sharedPreferences, C6699jHa jha) {
            C7471uYa.b(firebaseRemoteConfig, "firebaseRemoteConfig");
            C7471uYa.b(sharedPreferences, "localConfigOverride");
            C7471uYa.b(jha, "deviceHelper");
            return Boolean.valueOf(sharedPreferences.getBoolean(c(), a(firebaseRemoteConfig, jha.b())));
        }

        private final boolean a(FirebaseRemoteConfig firebaseRemoteConfig, int i) {
            if (!d()) {
                return ((Boolean) a()).booleanValue();
            }
            long j = firebaseRemoteConfig.getLong(e());
            if (j > 0) {
                return ((long) i) >= j;
            }
            return firebaseRemoteConfig.getBoolean(e());
        }
    }

    /* renamed from: mba$b */
    /* compiled from: Feature.kt */
    public static abstract class b extends a {
    }

    /* renamed from: mba$c */
    /* compiled from: Feature.kt */
    public static abstract class c<T extends Enum<T>> extends C3821mba<T> {
        private final boolean b(String str) {
            return f().contains(str);
        }

        public abstract T a(String str);

        public abstract List<String> f();

        public T a(FirebaseRemoteConfig firebaseRemoteConfig, SharedPreferences sharedPreferences, C6699jHa jha) {
            C7471uYa.b(firebaseRemoteConfig, "firebaseRemoteConfig");
            C7471uYa.b(sharedPreferences, "localConfigOverride");
            C7471uYa.b(jha, "deviceHelper");
            String string = sharedPreferences.getString(c(), "");
            C7471uYa.a((Object) string, "it");
            if (b(string)) {
                return a(string);
            }
            String a = a(firebaseRemoteConfig);
            String str = null;
            if (a != null && b(a)) {
                str = a;
            }
            if (str != null) {
                return a(str);
            }
            return a(((Enum) a()).name());
        }

        private final String a(FirebaseRemoteConfig firebaseRemoteConfig) {
            if (d()) {
                return firebaseRemoteConfig.getString(e());
            }
            return null;
        }
    }

    public abstract T a();

    public abstract T a(FirebaseRemoteConfig firebaseRemoteConfig, SharedPreferences sharedPreferences, C6699jHa jha);

    public abstract String b();

    public abstract String c();

    public abstract boolean d();

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append("android_");
        sb.append(c());
        return sb.toString();
    }
}
