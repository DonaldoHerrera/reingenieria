package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.net.Uri;

/* renamed from: com.google.android.gms.internal.measurement.sa reason: case insensitive filesystem */
public final class C1035sa {
    private static volatile Ea<Boolean> a = Ea.c();
    private static final Object b = new Object();

    private static boolean a(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                return true;
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean a(Context context, Uri uri) {
        boolean z;
        String authority = uri.getAuthority();
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            throw new IllegalArgumentException(sb.toString());
        } else if (a.b()) {
            return ((Boolean) a.a()).booleanValue();
        } else {
            synchronized (b) {
                if (a.b()) {
                    boolean booleanValue = ((Boolean) a.a()).booleanValue();
                    return booleanValue;
                }
                boolean z2 = false;
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0);
                    if (resolveContentProvider == null || !"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        z = false;
                        if (z && a(context)) {
                            z2 = true;
                        }
                        a = Ea.a(Boolean.valueOf(z2));
                        return ((Boolean) a.a()).booleanValue();
                    }
                }
                z = true;
                z2 = true;
                a = Ea.a(Boolean.valueOf(z2));
                return ((Boolean) a.a()).booleanValue();
            }
        }
    }
}
