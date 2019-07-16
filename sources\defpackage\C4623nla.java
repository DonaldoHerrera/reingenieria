package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: nla reason: default package and case insensitive filesystem */
/* compiled from: BillingUtil */
final class C4623nla {
    private C4623nla() {
    }

    public static int a(Bundle bundle) {
        if (bundle == null) {
            return -2;
        }
        return a(bundle.get("RESPONSE_CODE"));
    }

    static String b(String str) {
        return str.replaceAll("\\(.*?\\)", "").trim();
    }

    public static int a(Intent intent) {
        if (intent == null) {
            return -2;
        }
        return a(intent.getExtras().get("RESPONSE_CODE"));
    }

    private static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Long) {
            return ((Long) obj).intValue();
        }
        throw new IllegalArgumentException("Invalid type for Google Play billing RESPONSE_CODE");
    }

    public static void a(String str) {
        SDb.a("PlayBilling").a(str, new Object[0]);
    }

    static void a(String str, int i) {
        String str2 = "PlayBilling";
        if (i == -1) {
            SDb.a(str2).b("%s: RemoteException", str);
        } else if (i == 0) {
            SDb.a(str2).a("%s: OK", str);
        } else if (i != 3) {
            b a = SDb.a(str2);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": Unknown response code of ");
            sb.append(i);
            a.b(sb.toString(), new Object[0]);
        } else {
            SDb.a(str2).b("%s: UNAVAILABLE", str);
        }
    }

    static String a(int i) {
        String str = "/";
        String[] split = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split(str);
        String[] split2 = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split(str);
        if (i <= -1000) {
            int i2 = -1000 - i;
            if (i2 >= 0 && i2 < split2.length) {
                return split2[i2];
            }
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(":Unknown IAB Helper Error");
            return sb.toString();
        } else if (i >= 0 && i < split.length) {
            return split[i];
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            sb2.append(":Unknown");
            return sb2.toString();
        }
    }
}
