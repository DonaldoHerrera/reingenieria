package defpackage;

import android.os.Build;
import android.os.Build.VERSION;
import org.json.JSONObject;

/* renamed from: fH reason: default package and case insensitive filesystem */
public final class C2991fH {
    public static String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append("; ");
        sb.append(Build.MODEL);
        return sb.toString();
    }

    public static String b() {
        return Integer.toString(VERSION.SDK_INT);
    }

    public static String c() {
        return "Android";
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        C3010gH.a(jSONObject, "deviceType", a());
        C3010gH.a(jSONObject, "osVersion", b());
        C3010gH.a(jSONObject, "os", c());
        return jSONObject;
    }
}
