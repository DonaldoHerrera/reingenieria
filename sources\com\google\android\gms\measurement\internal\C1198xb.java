package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.Ib;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.xb reason: case insensitive filesystem */
public final class C1198xb {
    final Mb a;

    C1198xb(Mb mb) {
        this.a = mb;
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            this.a.e().y().a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.a.d().i();
        if (!a()) {
            this.a.e().y().a("Install Referrer Reporter is not available");
            return;
        }
        this.a.e().y().a("Install Referrer Reporter is initializing");
        Ab ab = new Ab(this, str);
        this.a.d().i();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        String str2 = "com.android.vending";
        intent.setComponent(new ComponentName(str2, "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.a.getContext().getPackageManager();
        if (packageManager == null) {
            this.a.e().v().a("Failed to obtain Package Manager to verify binding conditions");
            return;
        }
        List queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.a.e().y().a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
        if (serviceInfo != null) {
            String str3 = serviceInfo.packageName;
            if (resolveInfo.serviceInfo.name == null || !str2.equals(str3) || !a()) {
                this.a.e().y().a("Play Store missing or incompatible. Version 8.3.73 or later required");
            } else {
                try {
                    this.a.e().y().a("Install Referrer Service is", ConnectionTracker.getInstance().bindService(this.a.getContext(), new Intent(intent), ab, 1) ? "available" : "not available");
                } catch (Exception e) {
                    this.a.e().s().a("Exception occurred while binding to Install Referrer Service", e.getMessage());
                }
            }
        }
    }

    @VisibleForTesting
    private final boolean a() {
        boolean z = false;
        try {
            PackageManagerWrapper packageManager = Wrappers.packageManager(this.a.getContext());
            if (packageManager == null) {
                this.a.e().y().a("Failed to retrieve Package Manager to check Play Store compatibility");
                return false;
            }
            if (packageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            this.a.e().y().a("Failed to retrieve Play Store version", e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    @VisibleForTesting
    public final Bundle a(String str, Ib ib) {
        this.a.d().i();
        if (ib == null) {
            this.a.e().v().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle i = ib.i(bundle);
            if (i != null) {
                return i;
            }
            this.a.e().s().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.a.e().s().a("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }
}
