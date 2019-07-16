package defpackage;

import java.nio.charset.Charset;

/* renamed from: exb reason: default package and case insensitive filesystem */
/* compiled from: Charsets.kt */
public final class C6411exb {
    public static final Charset a;
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static final Charset e;
    public static final Charset f;
    public static final C6411exb g = new C6411exb();

    static {
        Charset forName = Charset.forName("UTF-8");
        C7471uYa.a((Object) forName, "Charset.forName(\"UTF-8\")");
        a = forName;
        Charset forName2 = Charset.forName("UTF-16");
        C7471uYa.a((Object) forName2, "Charset.forName(\"UTF-16\")");
        b = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        C7471uYa.a((Object) forName3, "Charset.forName(\"UTF-16BE\")");
        c = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        C7471uYa.a((Object) forName4, "Charset.forName(\"UTF-16LE\")");
        d = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        C7471uYa.a((Object) forName5, "Charset.forName(\"US-ASCII\")");
        e = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        C7471uYa.a((Object) forName6, "Charset.forName(\"ISO-8859-1\")");
        f = forName6;
    }

    private C6411exb() {
    }
}
