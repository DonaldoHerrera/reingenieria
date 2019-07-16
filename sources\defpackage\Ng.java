package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import java.security.MessageDigest;

/* renamed from: Ng reason: default package */
public final class Ng {
    private static final String a = Hg.a(Ng.class);

    public static String a(String str) {
        if (str == null) {
            throw new NullPointerException("Provided String must be non-null.");
        } else if (str.length() != 0) {
            return str;
        } else {
            throw new IllegalArgumentException("Provided String must be non-empty.");
        }
    }

    public static String b(String str) {
        if (str.trim().equals("")) {
            return null;
        }
        return str;
    }

    public static String c(String str) {
        try {
            byte[] digest = MessageDigest.getInstance(Constants.MD5).digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & 255) | Ascii.NUL).substring(1, 3));
            }
            return sb.toString();
        } catch (Exception e) {
            Hg.b(a, "Failed to calculate MD5 hash", e);
            return null;
        }
    }

    public static boolean d(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean e(String str) {
        return str == null || str.length() == 0;
    }

    private static String b(String str, String str2) {
        String str3 = ".";
        if (d(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(str);
        sb2.append(str3);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String a(String[] strArr, String str) {
        if (strArr == null || str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            if (str2 != null) {
                sb.append(str2);
                sb.append(str);
            }
        }
        String sb2 = sb.toString();
        if (sb2.endsWith(str)) {
            sb2 = sb2.substring(0, sb2.length() - str.length());
        }
        return sb2;
    }

    public static int a(String str, String str2) {
        return str.split(str2, -1).length - 1;
    }

    public static String a(Context context, String str, String str2) {
        String str3 = "null";
        if (str == null) {
            str = str3;
        }
        if (str.equals(str3)) {
            return b("37a6259cc0c1dae299a7866489dff0bd", str2);
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.support.stringutils.cachefilesuffix", 0);
        String str4 = "user_id_key";
        String string = sharedPreferences.getString(str4, null);
        String str5 = "user_id_hash_value";
        if (string != null && string.equals(str)) {
            String string2 = sharedPreferences.getString(str5, null);
            if (!e(string2)) {
                return b(string2, str2);
            }
            Hg.a(a, "The saved user id hash was null or empty.");
        }
        String str6 = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Generating MD5 for user id: ");
        sb.append(str);
        sb.append(" apiKey: ");
        sb.append(str2);
        Hg.a(str6, sb.toString());
        String c = c(str);
        if (c == null) {
            c = Integer.toString(str.hashCode());
        }
        Editor edit = sharedPreferences.edit();
        edit.putString(str4, str);
        edit.putString(str5, c);
        edit.apply();
        return b(c, str2);
    }

    public static String a(Context context, String str) {
        return a(context, str, null);
    }
}
