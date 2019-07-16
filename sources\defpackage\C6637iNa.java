package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: iNa reason: default package and case insensitive filesystem */
/* compiled from: AbstractSpiCall */
public abstract class C6637iNa {
    private static final Pattern a = Pattern.compile("http(s?)://[^\\/]+", 2);
    private final String b;
    private final C4839DOa c;
    private final C7806zOa d;
    private final String e;
    protected final C5531_Ma f;

    public C6637iNa(C5531_Ma _ma, String str, String str2, C4839DOa dOa, C7806zOa zoa) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        } else if (dOa != null) {
            this.f = _ma;
            this.e = str;
            this.b = a(str2);
            this.c = dOa;
            this.d = zoa;
        } else {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
    }

    /* access modifiers changed from: protected */
    public C4777BOa a() {
        return a(Collections.emptyMap());
    }

    /* access modifiers changed from: protected */
    public String b() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public C4777BOa a(Map<String, String> map) {
        C4777BOa a2 = this.c.a(this.d, b(), map);
        a2.a(false);
        a2.a(10000);
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics Android SDK/");
        sb.append(this.f.x());
        a2.c("User-Agent", sb.toString());
        a2.c("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
        return a2;
    }

    private String a(String str) {
        return !C7391tNa.b(this.e) ? a.matcher(str).replaceFirst(this.e) : str;
    }
}
