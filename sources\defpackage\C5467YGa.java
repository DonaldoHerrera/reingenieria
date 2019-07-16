package defpackage;

import android.os.Build;
import android.os.Build.VERSION;

/* renamed from: YGa reason: default package and case insensitive filesystem */
/* compiled from: BuildHelper */
public class C5467YGa {
    public String a() {
        return VERSION.RELEASE;
    }

    public int b() {
        return VERSION.SDK_INT;
    }

    public String c() {
        return Build.MANUFACTURER;
    }

    public String d() {
        return Build.MODEL;
    }
}
