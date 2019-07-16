package defpackage;

import java.util.List;

/* renamed from: _ob reason: default package */
/* compiled from: RenderingUtils.kt */
public final class _ob {
    public static final String a(C7694xnb xnb) {
        C7471uYa.b(xnb, "$this$render");
        String str = "asString()";
        if (b(xnb)) {
            StringBuilder sb = new StringBuilder();
            String a = xnb.a();
            C7471uYa.a((Object) a, str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.valueOf('`'));
            sb2.append(a);
            sb.append(sb2.toString());
            sb.append('`');
            return sb.toString();
        }
        String a2 = xnb.a();
        C7471uYa.a((Object) a2, str);
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r5 != false) goto L_0x003c;
     */
    private static final boolean b(C7694xnb xnb) {
        boolean z;
        boolean z2 = false;
        if (xnb.c()) {
            return false;
        }
        String a = xnb.a();
        C7471uYa.a((Object) a, "asString()");
        if (!Vob.a.contains(a)) {
            int i = 0;
            while (true) {
                if (i >= a.length()) {
                    z = false;
                    break;
                }
                char charAt = a.charAt(i);
                if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                    z = true;
                    break;
                }
                i++;
            }
        }
        z2 = true;
        return z2;
    }

    public static final String a(C7487unb unb) {
        C7471uYa.b(unb, "$this$render");
        List e = unb.e();
        C7471uYa.a((Object) e, "pathSegments()");
        return a(e);
    }

    public static final String a(List<C7694xnb> list) {
        C7471uYa.b(list, "pathSegments");
        StringBuilder sb = new StringBuilder();
        for (C7694xnb xnb : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(a(xnb));
        }
        String sb2 = sb.toString();
        C7471uYa.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
