package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;

/* renamed from: Gh reason: default package */
/* compiled from: AppData */
class Gh {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    Gh(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public static Gh a(Context context, C4931GNa gNa, String str, String str2) throws NameNotFoundException {
        String packageName = context.getPackageName();
        String f2 = gNa.f();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        Gh gh = new Gh(str, str2, f2, packageName, num, str3);
        return gh;
    }
}
