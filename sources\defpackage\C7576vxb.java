package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: vxb reason: default package and case insensitive filesystem */
/* compiled from: Indent.kt */
class C7576vxb {
    public static /* synthetic */ String a(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return a(str, str2);
    }

    public static final String a(String str, String str2) {
        C7471uYa.b(str, "$this$trimMargin");
        C7471uYa.b(str2, "marginPrefix");
        return a(str, "", str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bc, code lost:
        if (r15 != null) goto L_0x00c0;
     */
    public static final String a(String str, String str2, String str3) {
        int i;
        String str4;
        C7471uYa.b(str, "$this$replaceIndentByMargin");
        C7471uYa.b(str2, "newIndent");
        C7471uYa.b(str3, "marginPrefix");
        if (!Cxb.a(str3)) {
            List e = Hxb.e(str);
            int length = str.length() + (str2.length() * e.size());
            _Xa a = a(str2);
            int a2 = C6918mWa.a(e);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object next : e) {
                int i3 = i2 + 1;
                String str5 = null;
                if (i2 >= 0) {
                    String str6 = (String) next;
                    if (!(i2 == 0 || i2 == a2) || !Cxb.a(str6)) {
                        int length2 = str6.length();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length2) {
                                i = -1;
                                break;
                            }
                            if (!C6275cxb.a(str6.charAt(i4))) {
                                i = i4;
                                break;
                            }
                            i4++;
                        }
                        if (i == -1) {
                            str4 = str6;
                        } else {
                            int i5 = i;
                            str4 = str6;
                            if (Cxb.a(str6, str3, i, false, 4, (Object) null)) {
                                int length3 = i5 + str3.length();
                                if (str4 != null) {
                                    str5 = str4.substring(length3);
                                    C7471uYa.a((Object) str5, "(this as java.lang.String).substring(startIndex)");
                                } else {
                                    throw new OVa("null cannot be cast to non-null type java.lang.String");
                                }
                            }
                        }
                        if (str5 != null) {
                            str5 = (String) a.invoke(str5);
                        }
                        str5 = str4;
                    }
                    if (str5 != null) {
                        arrayList.add(str5);
                    }
                    i2 = i3;
                } else {
                    C6782kWa.c();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(length);
            C7676xWa.a(arrayList, sb, "\n", null, null, 0, null, null, 124, null);
            String sb2 = sb.toString();
            C7471uYa.a((Object) sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.");
    }

    private static final _Xa<String, String> a(String str) {
        if (str.length() == 0) {
            return C7438txb.a;
        }
        return new C7507uxb(str);
    }
}
