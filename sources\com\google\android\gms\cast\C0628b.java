package com.google.android.gms.cast;

import com.google.android.gms.internal.cast.X;
import java.util.Collection;

/* renamed from: com.google.android.gms.cast.b reason: case insensitive filesystem */
public final class C0628b {
    public static String a(String str) throws IllegalArgumentException {
        if (str != null) {
            return a("com.google.android.gms.cast.CATEGORY_CAST", str, null, false, true);
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }

    public static String a(String str, Collection<String> collection) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        } else if (collection != null) {
            return a("com.google.android.gms.cast.CATEGORY_CAST", str, collection, false, true);
        } else {
            throw new IllegalArgumentException("namespaces cannot be null");
        }
    }

    private static String a(String str, String str2, Collection<String> collection, boolean z, boolean z2) throws IllegalArgumentException {
        StringBuilder sb = new StringBuilder(str);
        String str3 = "/";
        if (str2 != null) {
            String upperCase = str2.toUpperCase();
            if (!upperCase.matches("[A-F0-9]+")) {
                String str4 = "Invalid application ID: ";
                String valueOf = String.valueOf(str2);
                throw new IllegalArgumentException(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
            }
            sb.append(str3);
            sb.append(upperCase);
        }
        if (collection != null) {
            if (!collection.isEmpty()) {
                if (str2 == null) {
                    sb.append(str3);
                }
                sb.append(str3);
                boolean z3 = true;
                for (String str5 : collection) {
                    X.a(str5);
                    if (z3) {
                        z3 = false;
                    } else {
                        sb.append(",");
                    }
                    sb.append(X.c(str5));
                }
            } else {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
        }
        if (str2 == null && collection == null) {
            sb.append(str3);
        }
        if (collection == null) {
            sb.append(str3);
        }
        sb.append(str3);
        sb.append(str3);
        sb.append("ALLOW_IPV6");
        return sb.toString();
    }
}
