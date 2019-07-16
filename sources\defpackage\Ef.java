package defpackage;

import java.util.Locale;

/* renamed from: Ef reason: default package */
public enum Ef implements C1294fg<String> {
    GOOGLE_PLAY_STORE,
    KINDLE_STORE;

    public static String c(String str) {
        return str.replace(" ", "_").toUpperCase(Locale.US);
    }

    public String forJsonPut() {
        int i = Df.a[ordinal()];
        if (i == 1) {
            return "Google Play Store";
        }
        if (i != 2) {
            return null;
        }
        return "Kindle Store";
    }
}
