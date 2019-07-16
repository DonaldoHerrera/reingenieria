package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

/* renamed from: lA reason: default package and case insensitive filesystem */
public final class C1469lA {
    /* access modifiers changed from: private */
    public static final C1893zA a = new C1893zA("AppUpdateService");
    private static final Intent b = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    final C1654rB<C1501mB> c;
    /* access modifiers changed from: private */
    public final String d;
    private final Context e;

    public C1469lA(Context context) {
        this.d = context.getPackageName();
        this.e = context;
        C1654rB rBVar = new C1654rB(context.getApplicationContext(), a, "AppUpdateService", b, C1438kA.a, null);
        this.c = rBVar;
    }

    /* access modifiers changed from: private */
    public static int b(Bundle bundle) {
        return bundle.getInt("error.code", -2);
    }

    /* access modifiers changed from: private */
    public static C1284fA b(Bundle bundle, String str) {
        C1284fA fAVar = new C1284fA(str, bundle.getInt("version.code", -1), bundle.getInt("update.availability"), bundle.getInt("install.status", 0), (PendingIntent) bundle.getParcelable("blocking.intent"), (PendingIntent) bundle.getParcelable("nonblocking.intent"));
        return fAVar;
    }

    /* access modifiers changed from: private */
    public static Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore.version.code", 10601);
        return bundle;
    }

    /* access modifiers changed from: private */
    public final Bundle c(String str) {
        Bundle bundle = new Bundle();
        bundle.putAll(c());
        bundle.putString("package.name", str);
        Integer d2 = d();
        if (d2 != null) {
            bundle.putInt("app.version.code", d2.intValue());
        }
        return bundle;
    }

    private final Integer d() {
        try {
            return Integer.valueOf(this.e.getPackageManager().getPackageInfo(this.e.getPackageName(), 0).versionCode);
        } catch (NameNotFoundException unused) {
            a.d("The current version of the app could not be retrieved", new Object[0]);
            return null;
        }
    }

    public final RB<C1284fA> a(String str) {
        a.a("requestUpdateInfo(%s)", str);
        YB yb = new YB();
        this.c.a((C1684sB) new C1531nA(this, yb, str, yb));
        return yb.a();
    }

    public final RB<Void> b(String str) {
        a.a("completeUpdate(%s)", str);
        YB yb = new YB();
        this.c.a((C1684sB) new C1500mA(this, yb, yb, str));
        return yb.a();
    }
}
