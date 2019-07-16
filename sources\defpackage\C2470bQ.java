package defpackage;

import java.util.Locale;

/* renamed from: bQ reason: default package and case insensitive filesystem */
/* compiled from: Logging.kt */
public final class C2470bQ {
    public static final b a(String str) {
        C7471uYa.b(str, "buildType");
        Locale locale = Locale.US;
        C7471uYa.a((Object) locale, "Locale.US");
        String lowerCase = str.toLowerCase(locale);
        C7471uYa.a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        switch (lowerCase.hashCode()) {
            case 3020272:
                if (lowerCase.equals("beta")) {
                    return new C2451aQ();
                }
                break;
            case 92909918:
                if (lowerCase.equals("alpha")) {
                    return new C2432_P();
                }
                break;
            case 95458899:
                if (lowerCase.equals("debug")) {
                    return new a();
                }
                break;
            case 1090594823:
                if (lowerCase.equals("release")) {
                    return new C2489cQ();
                }
                break;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown build type when trying to configure logger ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }
}
