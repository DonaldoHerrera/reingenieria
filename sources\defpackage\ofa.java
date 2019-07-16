package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: ofa reason: default package */
/* compiled from: UriUtils */
public class ofa {
    public static C2215PD<String, String> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return C2987fD.f();
        }
        return a(Uri.parse(str));
    }

    public static C2215PD<String, String> a(Uri uri) {
        C2987fD f = C2987fD.f();
        for (String str : uri.getQueryParameterNames()) {
            f.a(str, uri.getQueryParameters(str));
        }
        return f;
    }
}
