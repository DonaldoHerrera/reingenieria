package defpackage;

import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: Mb reason: default package and case insensitive filesystem */
/* compiled from: TextUtilsCompat */
public final class C0231Mb {
    private static final Locale a;

    static {
        String str = "";
        a = new Locale(str, str);
    }

    public static int a(Locale locale) {
        if (VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale != null && !locale.equals(a)) {
            String a2 = C0215Ib.a(locale);
            if (a2 == null) {
                return b(locale);
            }
            if (a2.equalsIgnoreCase("Arab") || a2.equalsIgnoreCase("Hebr")) {
                return 1;
            }
        }
        return 0;
    }

    private static int b(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }
}
