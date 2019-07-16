package defpackage;

import android.content.res.Resources;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: WFa reason: default package and case insensitive filesystem */
/* compiled from: CondensedNumberFormatter */
public final class C5408WFa {
    private final DecimalFormat a;
    private final DecimalFormat b;
    private final DecimalFormat c;
    private final String[] d;

    C5408WFa(Locale locale, Resources resources) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);
        this.c = a("#,###", decimalFormatSymbols);
        this.a = a("##.#", decimalFormatSymbols);
        this.b = a("#.##", decimalFormatSymbols);
        this.d = resources.getStringArray(c.ak_number_suffixes);
    }

    public static C5408WFa a(Locale locale, Resources resources) {
        return new C5408WFa(locale, resources);
    }

    private boolean b(long j) {
        return ((double) j) >= 10000.0d;
    }

    private DecimalFormat a(String str, DecimalFormatSymbols decimalFormatSymbols) {
        DecimalFormat decimalFormat = new DecimalFormat(str, decimalFormatSymbols);
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        return decimalFormat;
    }

    public String a(long j) {
        if (!b(j)) {
            return this.c.format(j);
        }
        return a((double) j, 0);
    }

    private String a(double d2, int i) {
        if (d2 < 1000.0d) {
            return a(d2, this.d[i]);
        }
        return a(d2 / 1000.0d, i + 1);
    }

    private String a(double d2, String str) {
        if (d2 >= 100.0d) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.c.format(d2));
            sb.append(str);
            return sb.toString();
        } else if (d2 >= 10.0d) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.a.format(d2));
            sb2.append(str);
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.b.format(d2));
            sb3.append(str);
            return sb3.toString();
        }
    }
}
