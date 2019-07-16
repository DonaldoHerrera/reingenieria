package defpackage;

import android.content.res.Resources;
import com.soundcloud.android.ia.p;
import java.util.Locale;

/* renamed from: JHa reason: default package and case insensitive filesystem */
/* compiled from: LocaleFormatter */
public class C5018JHa {
    private final Locale a;
    private final Resources b;

    public C5018JHa(Locale locale, Resources resources) {
        this.a = locale;
        this.b = resources;
    }

    public String a() {
        return this.b.getString(p.app_locale);
    }

    public C4928GKa<String> b() {
        if (!this.a.getLanguage().isEmpty() && !this.a.getCountry().isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a.getLanguage());
            sb.append("-");
            sb.append(this.a.getCountry());
            return C4928GKa.c(sb.toString());
        } else if (!this.a.getLanguage().isEmpty()) {
            return C4928GKa.c(this.a.getLanguage());
        } else {
            return C4928GKa.a();
        }
    }
}
