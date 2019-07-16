package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;
import com.google.android.gms.measurement.internal.C1155oc;
import com.google.android.gms.measurement.internal.Rc;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class b {
    private static final Set<String> a = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));
    private static final List<String> b = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd", "app_open"});
    private static final List<String> c = Arrays.asList(new String[]{"auto", "app", "am"});
    private static final List<String> d = Arrays.asList(new String[]{"_r", "_dbg"});
    private static final List<String> e = Arrays.asList((String[]) ArrayUtils.concat(C1155oc.a, C1155oc.b));
    private static final List<String> f = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    public static boolean a(String str) {
        return !c.contains(str);
    }

    public static ConditionalUserProperty b(a aVar) {
        ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
        conditionalUserProperty.mOrigin = aVar.a;
        conditionalUserProperty.mActive = aVar.n;
        conditionalUserProperty.mCreationTimestamp = aVar.m;
        conditionalUserProperty.mExpiredEventName = aVar.k;
        Bundle bundle = aVar.l;
        if (bundle != null) {
            conditionalUserProperty.mExpiredEventParams = new Bundle(bundle);
        }
        conditionalUserProperty.mName = aVar.b;
        conditionalUserProperty.mTimedOutEventName = aVar.f;
        Bundle bundle2 = aVar.g;
        if (bundle2 != null) {
            conditionalUserProperty.mTimedOutEventParams = new Bundle(bundle2);
        }
        conditionalUserProperty.mTimeToLive = aVar.j;
        conditionalUserProperty.mTriggeredEventName = aVar.h;
        Bundle bundle3 = aVar.i;
        if (bundle3 != null) {
            conditionalUserProperty.mTriggeredEventParams = new Bundle(bundle3);
        }
        conditionalUserProperty.mTriggeredTimestamp = aVar.o;
        conditionalUserProperty.mTriggerEventName = aVar.d;
        conditionalUserProperty.mTriggerTimeout = aVar.e;
        Object obj = aVar.c;
        if (obj != null) {
            conditionalUserProperty.mValue = Rc.a(obj);
        }
        return conditionalUserProperty;
    }

    public static boolean a(String str, Bundle bundle) {
        if (b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            for (String containsKey : d) {
                if (bundle.containsKey(containsKey)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean a(String str, String str2) {
        String str3 = "fcm";
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(str3) || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals(str3) || str.equals("fiam");
        }
        if (e.contains(str2)) {
            return false;
        }
        for (String matches : f) {
            if (str2.matches(matches)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(a aVar) {
        if (aVar == null) {
            return false;
        }
        String str = aVar.a;
        if (str == null || str.isEmpty()) {
            return false;
        }
        Object obj = aVar.c;
        if ((obj != null && Rc.a(obj) == null) || !a(str) || !a(str, aVar.b)) {
            return false;
        }
        String str2 = aVar.k;
        if (str2 != null && (!a(str2, aVar.l) || !a(str, aVar.k, aVar.l))) {
            return false;
        }
        String str3 = aVar.h;
        if (str3 != null && (!a(str3, aVar.i) || !a(str, aVar.h, aVar.i))) {
            return false;
        }
        String str4 = aVar.f;
        if (str4 == null || (a(str4, aVar.g) && a(str, aVar.f, aVar.g))) {
            return true;
        }
        return false;
    }

    public static boolean a(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!a(str) || bundle == null) {
            return false;
        }
        for (String containsKey : d) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c2 = 2;
                }
            } else if (str.equals("fdl")) {
                c2 = 1;
            }
        } else if (str.equals("fcm")) {
            c2 = 0;
        }
        String str3 = "_cis";
        if (c2 == 0) {
            bundle.putString(str3, "fcm_integration");
            return true;
        } else if (c2 == 1) {
            bundle.putString(str3, "fdl_integration");
            return true;
        } else if (c2 != 2) {
            return false;
        } else {
            bundle.putString(str3, "fiam_integration");
            return true;
        }
    }

    public static a a(ConditionalUserProperty conditionalUserProperty) {
        a aVar = new a();
        aVar.a = conditionalUserProperty.mOrigin;
        aVar.n = conditionalUserProperty.mActive;
        aVar.m = conditionalUserProperty.mCreationTimestamp;
        aVar.k = conditionalUserProperty.mExpiredEventName;
        Bundle bundle = conditionalUserProperty.mExpiredEventParams;
        if (bundle != null) {
            aVar.l = new Bundle(bundle);
        }
        aVar.b = conditionalUserProperty.mName;
        aVar.f = conditionalUserProperty.mTimedOutEventName;
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            aVar.g = new Bundle(bundle2);
        }
        aVar.j = conditionalUserProperty.mTimeToLive;
        aVar.h = conditionalUserProperty.mTriggeredEventName;
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            aVar.i = new Bundle(bundle3);
        }
        aVar.o = conditionalUserProperty.mTriggeredTimestamp;
        aVar.d = conditionalUserProperty.mTriggerEventName;
        aVar.e = conditionalUserProperty.mTriggerTimeout;
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            aVar.c = Rc.a(obj);
        }
        return aVar;
    }
}
