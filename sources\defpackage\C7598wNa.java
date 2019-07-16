package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

/* renamed from: wNa reason: default package and case insensitive filesystem */
/* compiled from: DataCollectionArbiter */
public class C7598wNa {
    private static C7598wNa a;
    private static Object b = new Object();
    private final SharedPreferences c;
    private volatile boolean d;
    private volatile boolean e;
    private final C4838DNa f;
    private boolean g = false;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    private C7598wNa(Context context) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (context != null) {
            this.c = context.getSharedPreferences("com.google.firebase.crashlytics.prefs", 0);
            this.f = C4869ENa.a(context);
            String str = "firebase_crashlytics_collection_enabled";
            if (this.c.contains(str)) {
                z2 = this.c.getBoolean(str, true);
            } else {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager != null) {
                        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
                        if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str))) {
                            z2 = applicationInfo.metaData.getBoolean(str);
                        }
                    }
                } catch (NameNotFoundException e2) {
                    C5328TMa.e().a("Fabric", "Unable to get PackageManager. Falling through", e2);
                }
                z2 = true;
                z = false;
                this.e = z2;
                this.d = z;
                if (C7391tNa.o(context) != null) {
                    z3 = true;
                }
                this.g = z3;
                return;
            }
            z = true;
            this.e = z2;
            this.d = z;
            if (C7391tNa.o(context) != null) {
            }
            this.g = z3;
            return;
        }
        throw new RuntimeException("null context");
    }

    public static C7598wNa a(Context context) {
        C7598wNa wna;
        synchronized (b) {
            if (a == null) {
                a = new C7598wNa(context);
            }
            wna = a;
        }
        return wna;
    }

    public boolean b() {
        return this.e;
    }

    public boolean a() {
        if (this.g && this.d) {
            return this.e;
        }
        C4838DNa dNa = this.f;
        if (dNa != null) {
            return dNa.a();
        }
        return true;
    }
}
