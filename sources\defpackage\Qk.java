package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import com.facebook.B;
import com.facebook.internal.ia;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: Qk reason: default package */
/* compiled from: AppEventUtility */
public class Qk {
    public static double a(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([\\,\\.]\\d+)*([\\.\\,]\\d+)?", 8).matcher(str);
            if (!matcher.find()) {
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            return NumberFormat.getNumberInstance(ia.a()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }

    public static void a() {
    }

    public static void b() {
    }

    public static String c() {
        Context e = B.e();
        try {
            return e.getPackageManager().getPackageInfo(e.getPackageName(), 0).versionName;
        } catch (NameNotFoundException unused) {
            return "";
        }
    }

    public static boolean d() {
        String str = "generic";
        if (!Build.FINGERPRINT.startsWith(str) && !Build.FINGERPRINT.startsWith("unknown")) {
            String str2 = "google_sdk";
            if (!Build.MODEL.contains(str2) && !Build.MODEL.contains("Emulator") && !Build.MODEL.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith(str) || !Build.DEVICE.startsWith(str)) && !str2.equals(Build.PRODUCT))) {
                return false;
            }
        }
        return true;
    }

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte valueOf : bArr) {
            stringBuffer.append(String.format("%02x", new Object[]{Byte.valueOf(valueOf)}));
        }
        return stringBuffer.toString();
    }
}
