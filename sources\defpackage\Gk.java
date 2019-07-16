package defpackage;

import android.util.Log;

/* renamed from: Gk reason: default package */
/* compiled from: UnityReflection */
public class Gk {
    private static final String a = "Gk";
    private static Class<?> b;

    public static void a(String str, String str2, String str3) {
        try {
            if (b == null) {
                b = Class.forName("com.unity3d.player.UnityPlayer");
            }
            b.getMethod("UnitySendMessage", new Class[]{String.class, String.class, String.class}).invoke(b, new Object[]{str, str2, str3});
        } catch (Exception e) {
            Log.e(a, "Failed to send message to Unity", e);
        }
    }

    public static void a() {
        a("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    public static void a(String str) {
        a("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }
}
