package com.google.android.play.core.missingsplits;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class c {
    private static final C1893zA a = new C1893zA("MissingSplitsAppComponentsHelper");
    private final Context b;
    private final PackageManager c;

    c(Context context, PackageManager packageManager) {
        this.b = context;
        this.c = packageManager;
    }

    private final void a(List<ComponentInfo> list, int i) {
        for (ComponentInfo componentInfo : list) {
            this.c.setComponentEnabledSetting(new ComponentName(componentInfo.packageName, componentInfo.name), i, 1);
        }
    }

    private final List<ComponentInfo> d() {
        try {
            ArrayList arrayList = new ArrayList();
            PackageInfo packageInfo = this.c.getPackageInfo(this.b.getPackageName(), 526);
            if (packageInfo.providers != null) {
                Collections.addAll(arrayList, packageInfo.providers);
            }
            if (packageInfo.receivers != null) {
                Collections.addAll(arrayList, packageInfo.receivers);
            }
            if (packageInfo.services != null) {
                Collections.addAll(arrayList, packageInfo.services);
            }
            return arrayList;
        } catch (NameNotFoundException e) {
            a.c("Failed to resolve own package", e);
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        for (ComponentInfo componentInfo : d()) {
            if (this.c.getComponentEnabledSetting(new ComponentName(componentInfo.packageName, componentInfo.name)) != 2) {
                a.b("Not all non-activity components are disabled", new Object[0]);
                return false;
            }
        }
        a.b("All non-activity components are disabled", new Object[0]);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        a.a("Disabling all non-activity components", new Object[0]);
        a(d(), 2);
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        a.a("Resetting enabled state of all non-activity components", new Object[0]);
        a(d(), 0);
    }
}
