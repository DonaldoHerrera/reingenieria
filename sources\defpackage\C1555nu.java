package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* renamed from: nu reason: default package and case insensitive filesystem */
public final class C1555nu {
    private static final C1524mu a = new C1617pu("-_.*", true);
    private static final C1524mu b = new C1617pu("-_.!~*'()@:$&,;=", false);
    private static final C1524mu c = new C1617pu("-_.!~*'()@:$&,;=+/?", false);
    private static final C1524mu d = new C1617pu("-_.!~*'():$&,;=", false);
    private static final C1524mu e = new C1617pu("-_.!~*'()@:$,;/?:", false);

    public static String a(String str) {
        return a.a(str);
    }

    public static String b(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String c(String str) {
        return b.a(str);
    }

    public static String d(String str) {
        return c.a(str);
    }

    public static String e(String str) {
        return d.a(str);
    }

    public static String f(String str) {
        return e.a(str);
    }
}
