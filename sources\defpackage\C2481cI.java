package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.util.Log;

/* renamed from: cI reason: default package and case insensitive filesystem */
public class C2481cI {
    private static final String a = "cI";

    public static String a(String str, Bundle bundle) {
        try {
            Builder buildUpon = Uri.parse(str).buildUpon();
            if (bundle != null && bundle.keySet().size() > 0) {
                for (String str2 : bundle.keySet()) {
                    String obj = bundle.get(str2).toString();
                    if (obj != null && !obj.isEmpty()) {
                        buildUpon.appendQueryParameter(str2, bundle.get(str2).toString());
                    }
                }
            }
            return buildUpon.build().toString();
        } catch (Exception e) {
            String str3 = a;
            StringBuilder sb = new StringBuilder("Exception when adding parameters to url ");
            sb.append(str);
            sb.append(": ");
            sb.append(e);
            Log.e(str3, sb.toString());
            return "";
        }
    }
}
