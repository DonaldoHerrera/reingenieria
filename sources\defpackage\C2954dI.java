package defpackage;

import java.util.regex.Pattern;

/* renamed from: dI reason: default package and case insensitive filesystem */
public final class C2954dI {
    private static String a = "^[a-zA-Z0-9-_]{8,10}$";

    public static boolean a(String str) {
        return str != null && !str.isEmpty() && Pattern.compile(a).matcher(str).matches();
    }
}
