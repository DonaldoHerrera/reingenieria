package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* renamed from: com.google.android.gms.internal.measurement.pa reason: case insensitive filesystem */
public final /* synthetic */ class C1018pa {
    public static <V> V a(C1012oa<V> oaVar) {
        long clearCallingIdentity;
        try {
            return oaVar.a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a = oaVar.a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
