package defpackage;

/* renamed from: zxb reason: default package and case insensitive filesystem */
/* compiled from: StringBuilder.kt */
class C7852zxb extends C7783yxb {
    public static StringBuilder a(StringBuilder sb, String... strArr) {
        C7471uYa.b(sb, "$this$append");
        C7471uYa.b(strArr, "value");
        for (String append : strArr) {
            sb.append(append);
        }
        return sb;
    }

    public static <T> void a(Appendable appendable, T t, _Xa<? super T, ? extends CharSequence> _xa) {
        C7471uYa.b(appendable, "$this$appendElement");
        if (_xa != null) {
            appendable.append((CharSequence) _xa.invoke(t));
            return;
        }
        if (t != null ? t instanceof CharSequence : true) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
