package defpackage;

import java.net.Proxy.Type;

/* renamed from: qzb reason: default package and case insensitive filesystem */
/* compiled from: RequestLine */
public final class C7235qzb {
    public static String a(C7647wyb wyb, Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(wyb.e());
        sb.append(' ');
        if (b(wyb, type)) {
            sb.append(wyb.g());
        } else {
            sb.append(a(wyb.g()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    private static boolean b(C7647wyb wyb, Type type) {
        return !wyb.d() && type == Type.HTTP;
    }

    public static String a(C7095oyb oyb) {
        String c = oyb.c();
        String e = oyb.e();
        if (e == null) {
            return c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append('?');
        sb.append(e);
        return sb.toString();
    }
}
