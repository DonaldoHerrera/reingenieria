package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan.Standard;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.Map;

/* renamed from: zp reason: default package and case insensitive filesystem */
/* compiled from: TtmlRenderUtil */
final class C1911zp {
    public static Ap a(Ap ap, String[] strArr, Map<String, Ap> map) {
        if (ap == null && strArr == null) {
            return null;
        }
        int i = 0;
        if (ap == null && strArr.length == 1) {
            return (Ap) map.get(strArr[0]);
        }
        if (ap == null && strArr.length > 1) {
            Ap ap2 = new Ap();
            int length = strArr.length;
            while (i < length) {
                ap2.a((Ap) map.get(strArr[i]));
                i++;
            }
            return ap2;
        } else if (ap == null || strArr == null || strArr.length != 1) {
            if (!(ap == null || strArr == null || strArr.length <= 1)) {
                int length2 = strArr.length;
                while (i < length2) {
                    ap.a((Ap) map.get(strArr[i]));
                    i++;
                }
            }
            return ap;
        } else {
            ap.a((Ap) map.get(strArr[0]));
            return ap;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, Ap ap) {
        if (ap.g() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(ap.g()), i, i2, 33);
        }
        if (ap.k()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (ap.l()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (ap.j()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(ap.b()), i, i2, 33);
        }
        if (ap.i()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(ap.a()), i, i2, 33);
        }
        if (ap.c() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(ap.c()), i, i2, 33);
        }
        if (ap.h() != null) {
            spannableStringBuilder.setSpan(new Standard(ap.h()), i, i2, 33);
        }
        int e = ap.e();
        if (e == 1) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) ap.d(), true), i, i2, 33);
        } else if (e == 2) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(ap.d()), i, i2, 33);
        } else if (e == 3) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(ap.d() / 100.0f), i, i2, 33);
        }
    }

    static void a(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != 10) {
            spannableStringBuilder.append(10);
        }
    }

    static String a(String str) {
        String str2 = "\n";
        String str3 = " ";
        return str.replaceAll("\r\n", str2).replaceAll(" *\n *", str2).replaceAll(str2, str3).replaceAll("[ \t\\x0B\f\r]+", str3);
    }
}
