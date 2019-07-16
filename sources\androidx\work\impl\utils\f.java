package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.i;

/* compiled from: PackageManagerHelper */
public class f {
    private static final String a = i.a("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z) {
        String str = "enabled";
        String str2 = "disabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            i a2 = i.a();
            String str3 = a;
            String str4 = "%s %s";
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? str : str2;
            a2.a(str3, String.format(str4, objArr), new Throwable[0]);
        } catch (Exception e) {
            i a3 = i.a();
            String str5 = a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str = str2;
            }
            objArr2[1] = str;
            a3.a(str5, String.format("%s could not be %s", objArr2), e);
        }
    }
}
