package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;

/* renamed from: Fk reason: default package */
/* compiled from: SensitiveUserDataUtils */
public class Fk {
    public static boolean a(View view) {
        if (!(view instanceof TextView)) {
            return false;
        }
        TextView textView = (TextView) view;
        if (c(textView) || a(textView) || d(textView) || f(textView) || e(textView) || b(textView)) {
            return true;
        }
        return false;
    }

    private static boolean b(TextView textView) {
        if (textView.getInputType() == 32) {
            return true;
        }
        String g = Hk.g(textView);
        if (g == null || g.length() == 0) {
            return false;
        }
        return Patterns.EMAIL_ADDRESS.matcher(g).matches();
    }

    private static boolean c(TextView textView) {
        if (textView.getInputType() == 128) {
            return true;
        }
        return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
    }

    private static boolean d(TextView textView) {
        return textView.getInputType() == 96;
    }

    private static boolean e(TextView textView) {
        return textView.getInputType() == 3;
    }

    private static boolean f(TextView textView) {
        return textView.getInputType() == 112;
    }

    private static boolean a(TextView textView) {
        String replaceAll = Hk.g(textView).replaceAll("\\s", "");
        int length = replaceAll.length();
        boolean z = false;
        if (length >= 12 && length <= 19) {
            int i = 0;
            boolean z2 = false;
            for (int i2 = length - 1; i2 >= 0; i2--) {
                char charAt = replaceAll.charAt(i2);
                if (charAt < '0' || charAt > '9') {
                    return false;
                }
                int i3 = charAt - '0';
                if (z2) {
                    i3 *= 2;
                    if (i3 > 9) {
                        i3 = (i3 % 10) + 1;
                    }
                }
                i += i3;
                z2 = !z2;
            }
            if (i % 10 == 0) {
                z = true;
            }
        }
        return z;
    }
}
