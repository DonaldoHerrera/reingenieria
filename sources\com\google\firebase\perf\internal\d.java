package com.google.firebase.perf.internal;

import android.util.Log;
import com.google.android.gms.internal.firebase-perf.T;

public final class d extends q {
    private final T a;

    d(T t) {
        this.a = t;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c A[RETURN] */
    public final boolean a() {
        boolean z;
        T t = this.a;
        String str = "FirebasePerformance";
        if (t == null) {
            Log.w(str, "ApplicationInfo is null");
        } else if (!t.o()) {
            Log.w(str, "GoogleAppId is null");
        } else if (!this.a.p()) {
            Log.w(str, "AppInstanceId is null");
        } else if (!this.a.s()) {
            Log.w(str, "ApplicationProcessState is null");
        } else {
            if (this.a.q()) {
                if (!this.a.r().o()) {
                    Log.w(str, "AndroidAppInfo.packageName is null");
                } else if (!this.a.r().p()) {
                    Log.w(str, "AndroidAppInfo.sdkVersion is null");
                }
            }
            z = true;
            if (!z) {
                return true;
            }
            Log.w(str, "ApplicationInfo is invalid");
            return false;
        }
        z = false;
        if (!z) {
        }
    }
}
