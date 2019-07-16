package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import java.io.File;

/* renamed from: Rg reason: default package */
/* compiled from: Answers */
public class Rg extends C5531_Ma<Boolean> {
    boolean g = false;
    C1873yh h;

    public static Rg L() {
        return (Rg) C5328TMa.a(Rg.class);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    public boolean K() {
        long lastModified;
        try {
            Context e = e();
            PackageManager packageManager = e.getPackageManager();
            String packageName = e.getPackageName();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            String num = Integer.toString(packageInfo.versionCode);
            String str = packageInfo.versionName == null ? "0.0" : packageInfo.versionName;
            if (VERSION.SDK_INT >= 9) {
                lastModified = packageInfo.firstInstallTime;
            } else {
                lastModified = new File(packageManager.getApplicationInfo(packageName, 0).sourceDir).lastModified();
            }
            this.h = C1873yh.a(this, e, u(), num, str, lastModified);
            this.h.c();
            this.g = new C4900FNa().e(e);
            return true;
        } catch (Exception e2) {
            C5328TMa.e().e("Answers", "Error retrieving app properties", e2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public String M() {
        return C7391tNa.b(e(), "com.crashlytics.ApiEndpoint");
    }

    public void a(C1387ih ihVar) {
        if (ihVar == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.g) {
            a("logCustom");
        } else {
            C1873yh yhVar = this.h;
            if (yhVar != null) {
                yhVar.a(ihVar);
            }
        }
    }

    public String v() {
        return "com.crashlytics.sdk.android:answers";
    }

    public String x() {
        return "1.4.7.32";
    }

    /* access modifiers changed from: protected */
    public Boolean d() {
        String str = "Answers";
        boolean a = C7598wNa.a(e()).a();
        Boolean valueOf = Boolean.valueOf(false);
        if (!a) {
            C5328TMa.e().d("Fabric", "Analytics collection disabled, because data collection is disabled by Firebase.");
            this.h.b();
            return valueOf;
        }
        try {
            C6503gPa a2 = C6299dPa.b().a();
            if (a2 == null) {
                C5328TMa.e().e(str, "Failed to retrieve settings");
                return valueOf;
            } else if (a2.d.d) {
                C5328TMa.e().d(str, "Analytics collection enabled");
                this.h.a(a2.e, M());
                return Boolean.valueOf(true);
            } else {
                C5328TMa.e().d(str, "Analytics collection disabled");
                this.h.b();
                return valueOf;
            }
        } catch (Exception e) {
            C5328TMa.e().e(str, "Error dealing with settings", e);
            return valueOf;
        }
    }

    public void a(b bVar) {
        C1873yh yhVar = this.h;
        if (yhVar != null) {
            yhVar.a(bVar.b());
        }
    }

    public void a(a aVar) {
        C1873yh yhVar = this.h;
        if (yhVar != null) {
            yhVar.a(aVar.b(), aVar.a());
        }
    }

    private void a(String str) {
        C5701cNa e = C5328TMa.e();
        StringBuilder sb = new StringBuilder();
        sb.append("Method ");
        sb.append(str);
        sb.append(" is not supported when using Crashlytics through Firebase.");
        e.w("Answers", sb.toString());
    }
}
