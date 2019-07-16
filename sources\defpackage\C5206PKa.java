package defpackage;

import java.math.BigInteger;
import java.util.Locale;

/* renamed from: PKa reason: default package and case insensitive filesystem */
/* compiled from: Strings */
public final class C5206PKa {
    private C5206PKa() {
    }

    public static boolean a(CharSequence charSequence) {
        return c(d(charSequence).trim());
    }

    public static boolean b(CharSequence charSequence) {
        return !a(charSequence);
    }

    public static boolean c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String d(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    public static String a(byte[] bArr) {
        Locale locale = Locale.US;
        StringBuilder sb = new StringBuilder();
        sb.append("%0");
        sb.append(bArr.length << 1);
        sb.append("x");
        return String.format(locale, sb.toString(), new Object[]{new BigInteger(1, bArr)});
    }

    public static C5176OKa a(String str) {
        return new C5176OKa(str);
    }

    public static C5176OKa a(char c) {
        return new C5176OKa(String.valueOf(c));
    }
}
