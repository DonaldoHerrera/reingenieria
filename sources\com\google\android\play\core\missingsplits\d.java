package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.AppTask;
import android.app.ActivityManager.RecentTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

final class d implements a {
    private static final C1893zA a = new C1893zA("MissingSplitsManagerImpl");
    private final Context b;
    private final Runtime c;
    private final c d;
    private final AtomicReference<Boolean> e;

    d(Context context, Runtime runtime, c cVar, AtomicReference<Boolean> atomicReference) {
        this.b = context;
        this.c = runtime;
        this.d = cVar;
        this.e = atomicReference;
    }

    private final boolean a(ComponentName componentName) {
        String className = componentName.getClassName();
        try {
            Class cls = Class.forName(className);
            while (cls != null) {
                if (cls.equals(Activity.class)) {
                    return true;
                }
                Class superclass = cls.getSuperclass();
                cls = superclass != cls ? superclass : null;
            }
            return false;
        } catch (ClassNotFoundException unused) {
            a.c("ClassNotFoundException when scanning class hierarchy of '%s'", className);
            try {
                return this.b.getPackageManager().getActivityInfo(componentName, 0) != null;
            } catch (NameNotFoundException unused2) {
            }
        }
    }

    private final boolean c() {
        try {
            ApplicationInfo applicationInfo = this.b.getPackageManager().getApplicationInfo(this.b.getPackageName(), 128);
            return applicationInfo.metaData != null && Boolean.TRUE.equals(applicationInfo.metaData.get("com.android.vending.splits.required"));
        } catch (NameNotFoundException unused) {
            a.c("App '%s' is not found in the PackageManager", this.b.getPackageName());
            return false;
        }
    }

    private final Set<String> d() {
        if (VERSION.SDK_INT < 21) {
            return Collections.emptySet();
        }
        try {
            PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 0);
            HashSet hashSet = new HashSet();
            if (packageInfo.splitNames != null) {
                Collections.addAll(hashSet, packageInfo.splitNames);
            }
            return hashSet;
        } catch (NameNotFoundException unused) {
            a.c("App '%s' is not found in PackageManager", this.b.getPackageName());
            return Collections.emptySet();
        }
    }

    private final List<AppTask> e() {
        List<AppTask> appTasks = ((ActivityManager) this.b.getSystemService("activity")).getAppTasks();
        return appTasks != null ? appTasks : Collections.emptyList();
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0091 A[SYNTHETIC] */
    public final boolean a() {
        boolean z;
        boolean z2;
        boolean z3;
        if (VERSION.SDK_INT < 21) {
            return false;
        }
        if (b()) {
            Iterator it = e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                AppTask appTask = (AppTask) it.next();
                if (!(appTask.getTaskInfo() == null || appTask.getTaskInfo().baseIntent == null || appTask.getTaskInfo().baseIntent.getComponent() == null)) {
                    if (PlayCoreMissingSplitsActivity.class.getName().equals(appTask.getTaskInfo().baseIntent.getComponent().getClassName())) {
                        z = true;
                        break;
                    }
                }
            }
            if (!z) {
                Iterator it2 = e().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = false;
                        break;
                    }
                    RecentTaskInfo taskInfo = ((AppTask) it2.next()).getTaskInfo();
                    if (taskInfo != null) {
                        Intent intent = taskInfo.baseIntent;
                        if (!(intent == null || intent.getComponent() == null || !a(taskInfo.baseIntent.getComponent()))) {
                            z3 = true;
                            continue;
                            if (z3) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z3 = false;
                    continue;
                    if (z3) {
                    }
                }
                this.d.b();
                for (AppTask finishAndRemoveTask : e()) {
                    finishAndRemoveTask.finishAndRemoveTask();
                }
                if (z2) {
                    this.b.getPackageManager().setComponentEnabledSetting(new ComponentName(this.b, PlayCoreMissingSplitsActivity.class), 1, 1);
                    this.b.startActivity(new Intent(this.b, PlayCoreMissingSplitsActivity.class).addFlags(884998144));
                }
                this.c.exit(0);
            }
            return true;
        }
        if (this.d.a()) {
            this.d.c();
            this.c.exit(0);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    public final boolean b() {
        boolean booleanValue;
        boolean z;
        synchronized (this.e) {
            if (((Boolean) this.e.get()) == null) {
                AtomicReference<Boolean> atomicReference = this.e;
                boolean z2 = false;
                if (VERSION.SDK_INT >= 21 && c()) {
                    Set d2 = d();
                    if (!d2.isEmpty()) {
                        if (d2.size() != 1 || !d2.contains("")) {
                            z = false;
                            if (z) {
                                z2 = true;
                            }
                        }
                    }
                    z = true;
                    if (z) {
                    }
                }
                atomicReference.set(Boolean.valueOf(z2));
            }
            booleanValue = ((Boolean) this.e.get()).booleanValue();
        }
        return booleanValue;
    }
}
