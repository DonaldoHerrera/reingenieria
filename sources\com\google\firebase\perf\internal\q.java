package com.google.firebase.perf.internal;

import com.google.android.gms.internal.firebase-perf.C0907x;
import java.util.Locale;
import java.util.Map.Entry;

public abstract class q {
    public static String a(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", new Object[]{Integer.valueOf(100)});
        } else if (!str.startsWith("_")) {
            return null;
        } else {
            for (C0907x xVar : C0907x.values()) {
                if (xVar.toString().equals(str)) {
                    return null;
                }
            }
            return "Metric name must not start with '_'";
        }
    }

    public abstract boolean a();

    public static String a(Entry<String, String> entry) {
        String str = (String) entry.getKey();
        String str2 = (String) entry.getValue();
        if (str == null) {
            return "Attribute key must not be null";
        }
        if (str2 == null) {
            return "Attribute value must not be null";
        }
        if (str.length() > 40) {
            return String.format(Locale.US, "Attribute key length must not exceed %d characters", new Object[]{Integer.valueOf(40)});
        } else if (str2.length() > 100) {
            return String.format(Locale.US, "Attribute value length must not exceed %d characters", new Object[]{Integer.valueOf(100)});
        } else if (!str.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
            return "Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_";
        } else {
            return null;
        }
    }
}
