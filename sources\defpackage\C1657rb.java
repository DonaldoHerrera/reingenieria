package defpackage;

import android.os.Build.VERSION;

/* renamed from: rb reason: default package and case insensitive filesystem */
/* compiled from: BuildCompat */
public class C1657rb {
    public static boolean a() {
        if (VERSION.CODENAME.length() != 1 || VERSION.CODENAME.charAt(0) < 'Q' || VERSION.CODENAME.charAt(0) > 'Z') {
            return false;
        }
        return true;
    }
}
