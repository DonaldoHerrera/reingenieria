package defpackage;

/* renamed from: Cvb reason: default package */
/* compiled from: numbers.kt */
public final class Cvb {
    public static final Bvb a(String str) {
        C7471uYa.b(str, "value");
        String str2 = "(this as java.lang.String).substring(startIndex)";
        if (Cxb.b(str, "0x", false, 2, null) || Cxb.b(str, "0X", false, 2, null)) {
            String substring = str.substring(2);
            C7471uYa.a((Object) substring, str2);
            return new Bvb(substring, 16);
        } else if (!Cxb.b(str, "0b", false, 2, null) && !Cxb.b(str, "0B", false, 2, null)) {
            return new Bvb(str, 10);
        } else {
            String substring2 = str.substring(2);
            C7471uYa.a((Object) substring2, str2);
            return new Bvb(substring2, 2);
        }
    }
}
