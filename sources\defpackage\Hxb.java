package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: Hxb reason: default package */
/* compiled from: Strings.kt */
class Hxb extends Cxb {
    public static C6785kZa b(CharSequence charSequence) {
        C7471uYa.b(charSequence, "$this$indices");
        return new C6785kZa(0, charSequence.length() - 1);
    }

    public static int c(CharSequence charSequence) {
        C7471uYa.b(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    public static String d(String str, char c, String str2) {
        C7471uYa.b(str, "$this$substringBeforeLast");
        C7471uYa.b(str2, "missingDelimiterValue");
        int b = b((CharSequence) str, c, 0, false, 6, (Object) null);
        if (b == -1) {
            return str2;
        }
        String substring = str.substring(0, b);
        C7471uYa.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final List<String> e(CharSequence charSequence) {
        C7471uYa.b(charSequence, "$this$lines");
        return Ywb.g(d(charSequence));
    }

    public static final String a(CharSequence charSequence, C6785kZa kza) {
        C7471uYa.b(charSequence, "$this$substring");
        C7471uYa.b(kza, "range");
        return charSequence.subSequence(kza.f().intValue(), kza.g().intValue() + 1).toString();
    }

    public static /* synthetic */ String b(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return c(str, str2, str3);
    }

    public static /* synthetic */ String c(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return c(str, c, str2);
    }

    public static /* synthetic */ String a(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return a(str, c, str2);
    }

    public static String b(String str, String str2, String str3) {
        C7471uYa.b(str, "$this$substringAfter");
        C7471uYa.b(str2, "delimiter");
        C7471uYa.b(str3, "missingDelimiterValue");
        int a = a((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (a == -1) {
            return str3;
        }
        String substring = str.substring(a + str2.length(), str.length());
        C7471uYa.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String c(String str, char c, String str2) {
        C7471uYa.b(str, "$this$substringBefore");
        C7471uYa.b(str2, "missingDelimiterValue");
        int a = a((CharSequence) str, c, 0, false, 6, (Object) null);
        if (a == -1) {
            return str2;
        }
        String substring = str.substring(0, a);
        C7471uYa.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static String d(String str, String str2, String str3) {
        C7471uYa.b(str, "$this$substringBeforeLast");
        C7471uYa.b(str2, "delimiter");
        C7471uYa.b(str3, "missingDelimiterValue");
        int b = b((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (b == -1) {
            return str3;
        }
        String substring = str.substring(0, b);
        C7471uYa.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String a(String str, char c, String str2) {
        C7471uYa.b(str, "$this$substringAfter");
        C7471uYa.b(str2, "missingDelimiterValue");
        int a = a((CharSequence) str, c, 0, false, 6, (Object) null);
        if (a == -1) {
            return str2;
        }
        String substring = str.substring(a + 1, str.length());
        C7471uYa.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String b(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return b(str, c, str2);
    }

    public static final String c(String str, String str2, String str3) {
        C7471uYa.b(str, "$this$substringBefore");
        C7471uYa.b(str2, "delimiter");
        C7471uYa.b(str3, "missingDelimiterValue");
        int a = a((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (a == -1) {
            return str3;
        }
        String substring = str.substring(0, a);
        C7471uYa.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final Iwb<String> d(CharSequence charSequence) {
        C7471uYa.b(charSequence, "$this$lineSequence");
        return b(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    public static /* synthetic */ String a(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return b(str, str2, str3);
    }

    public static String b(String str, char c, String str2) {
        C7471uYa.b(str, "$this$substringAfterLast");
        C7471uYa.b(str2, "missingDelimiterValue");
        int b = b((CharSequence) str, c, 0, false, 6, (Object) null);
        if (b == -1) {
            return str2;
        }
        String substring = str.substring(b + 1, str.length());
        C7471uYa.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static String a(String str, CharSequence charSequence) {
        C7471uYa.b(str, "$this$removePrefix");
        C7471uYa.b(charSequence, "prefix");
        if (!c((CharSequence) str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C7471uYa.a((Object) substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static /* synthetic */ String c(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return d(str, str2, str3);
    }

    public static String b(String str, CharSequence charSequence) {
        C7471uYa.b(str, "$this$removeSuffix");
        C7471uYa.b(charSequence, "suffix");
        if (!b((CharSequence) str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        C7471uYa.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ boolean c(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c(charSequence, c, z);
    }

    public static final boolean a(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C7471uYa.b(charSequence, "$this$regionMatchesImpl");
        C7471uYa.b(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C6343dxb.a(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean c(CharSequence charSequence, char c, boolean z) {
        C7471uYa.b(charSequence, "$this$startsWith");
        return charSequence.length() > 0 && C6343dxb.a(charSequence.charAt(0), c, z);
    }

    public static /* synthetic */ boolean b(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return b(charSequence, c, z);
    }

    public static /* synthetic */ boolean c(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c(charSequence, charSequence2, z);
    }

    public static final int a(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        C7471uYa.b(charSequence, "$this$indexOfAny");
        C7471uYa.b(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int a = C7265rZa.a(i, 0);
            int c = c(charSequence);
            if (a <= c) {
                while (true) {
                    char charAt = charSequence.charAt(a);
                    int length = cArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z2 = false;
                            break;
                        } else if (C6343dxb.a(cArr[i2], charAt, z)) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z2) {
                        if (a == c) {
                            break;
                        }
                        a++;
                    } else {
                        return a;
                    }
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(C6578hWa.a(cArr), i);
    }

    public static final boolean b(CharSequence charSequence, char c, boolean z) {
        C7471uYa.b(charSequence, "$this$endsWith");
        return charSequence.length() > 0 && C6343dxb.a(charSequence.charAt(c(charSequence)), c, z);
    }

    public static final boolean c(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C7471uYa.b(charSequence, "$this$startsWith");
        C7471uYa.b(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return Cxb.b((String) charSequence, (String) charSequence2, false, 2, null);
        }
        return a(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean b(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return b(charSequence, charSequence2, z);
    }

    public static final boolean b(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C7471uYa.b(charSequence, "$this$endsWith");
        C7471uYa.b(charSequence2, "suffix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return Cxb.a((String) charSequence, (String) charSequence2, false, 2, null);
        }
        return a(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    public static final int b(CharSequence charSequence, char[] cArr, int i, boolean z) {
        C7471uYa.b(charSequence, "$this$lastIndexOfAny");
        C7471uYa.b(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int b = C7265rZa.b(i, c(charSequence)); b >= 0; b--) {
                char charAt = charSequence.charAt(b);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C6343dxb.a(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return b;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C6578hWa.a(cArr), i);
    }

    static /* synthetic */ int a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return a(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    private static final int a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C6649iZa iza;
        if (!z2) {
            iza = new C6785kZa(C7265rZa.a(i, 0), C7265rZa.b(i2, charSequence.length()));
        } else {
            iza = C7265rZa.c(C7265rZa.b(i, c(charSequence)), C7265rZa.a(i2, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int first = iza.getFirst();
            int last = iza.getLast();
            int h = iza.h();
            if (h < 0 ? first >= last : first <= last) {
                while (true) {
                    if (!a(charSequence2, 0, charSequence, first, charSequence2.length(), z)) {
                        if (first == last) {
                            break;
                        }
                        first += h;
                    } else {
                        return first;
                    }
                }
            }
        } else {
            int first2 = iza.getFirst();
            int last2 = iza.getLast();
            int h2 = iza.h();
            if (h2 < 0 ? first2 >= last2 : first2 <= last2) {
                while (true) {
                    if (!Cxb.a((String) charSequence2, 0, (String) charSequence, first2, charSequence2.length(), z)) {
                        if (first2 == last2) {
                            break;
                        }
                        first2 += h2;
                    } else {
                        return first2;
                    }
                }
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public static final HVa<Integer, String> b(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        Object obj;
        Object obj2;
        HVa<Integer, String> hVa = null;
        if (z || collection.size() != 1) {
            C6649iZa kza = !z2 ? new C6785kZa(C7265rZa.a(i, 0), charSequence.length()) : C7265rZa.c(C7265rZa.b(i, c(charSequence)), 0);
            if (charSequence instanceof String) {
                int first = kza.getFirst();
                int last = kza.getLast();
                int h = kza.h();
                if (h < 0 ? first >= last : first <= last) {
                    while (true) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = (String) obj2;
                            if (Cxb.a(str, 0, (String) charSequence, first, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            if (first == last) {
                                break;
                            }
                            first += h;
                        } else {
                            return NVa.a(Integer.valueOf(first), str2);
                        }
                    }
                }
            } else {
                int first2 = kza.getFirst();
                int last2 = kza.getLast();
                int h2 = kza.h();
                if (h2 < 0 ? first2 >= last2 : first2 <= last2) {
                    while (true) {
                        Iterator it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str3 = (String) obj;
                            if (a((CharSequence) str3, 0, charSequence, first2, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 == null) {
                            if (first2 == last2) {
                                break;
                            }
                            first2 += h2;
                        } else {
                            return NVa.a(Integer.valueOf(first2), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) C7676xWa.m(collection);
        int a = !z2 ? a(charSequence, str5, i, false, 4, (Object) null) : b(charSequence, str5, i, false, 4, (Object) null);
        if (a >= 0) {
            hVa = NVa.a(Integer.valueOf(a), str5);
        }
        return hVa;
    }

    public static /* synthetic */ int a(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return a(charSequence, c, i, z);
    }

    public static final int a(CharSequence charSequence, char c, int i, boolean z) {
        C7471uYa.b(charSequence, "$this$indexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return a(charSequence, new char[]{c}, i, z);
    }

    public static /* synthetic */ int a(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return a(charSequence, str, i, z);
    }

    public static final int a(CharSequence charSequence, String str, int i, boolean z) {
        C7471uYa.b(charSequence, "$this$indexOf");
        C7471uYa.b(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return a(charSequence, str, i, charSequence.length(), z, false, 16, null);
    }

    public static /* synthetic */ boolean a(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return a(charSequence, charSequence2, z);
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C7471uYa.b(charSequence, "$this$contains");
        C7471uYa.b(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (a(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (a(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ int b(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = c(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return b(charSequence, c, i, z);
    }

    public static /* synthetic */ boolean a(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return a(charSequence, c, z);
    }

    public static final int b(CharSequence charSequence, char c, int i, boolean z) {
        C7471uYa.b(charSequence, "$this$lastIndexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return b(charSequence, new char[]{c}, i, z);
    }

    public static final boolean a(CharSequence charSequence, char c, boolean z) {
        C7471uYa.b(charSequence, "$this$contains");
        return a(charSequence, c, 0, z, 2, (Object) null) >= 0;
    }

    static /* synthetic */ Iwb a(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return a(charSequence, cArr, i, z, i2);
    }

    private static final Iwb<C6785kZa> a(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        if (i2 >= 0) {
            return new C6547gxb(charSequence, i, i2, new Dxb(cArr, z));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ int b(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = c(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return b(charSequence, str, i, z);
    }

    public static final int b(CharSequence charSequence, String str, int i, boolean z) {
        C7471uYa.b(charSequence, "$this$lastIndexOf");
        C7471uYa.b(str, "string");
        if (z || !(charSequence instanceof String)) {
            return a(charSequence, (CharSequence) str, i, 0, z, true);
        }
        return ((String) charSequence).lastIndexOf(str, i);
    }

    static /* synthetic */ Iwb a(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return a(charSequence, strArr, i, z, i2);
    }

    private static final Iwb<C6785kZa> a(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        if (i2 >= 0) {
            return new C6547gxb(charSequence, i, i2, new Exb(C6374eWa.a((Object[]) strArr), z));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ Iwb b(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return b(charSequence, strArr, z, i);
    }

    public static final Iwb<String> b(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C7471uYa.b(charSequence, "$this$splitToSequence");
        C7471uYa.b(strArr, "delimiters");
        return Ywb.d(a(charSequence, strArr, 0, z, i, 2, (Object) null), new Fxb(charSequence));
    }

    public static /* synthetic */ List a(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return a(charSequence, strArr, z, i);
    }

    public static final List<String> a(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C7471uYa.b(charSequence, "$this$split");
        C7471uYa.b(strArr, "delimiters");
        if (strArr.length == 1) {
            boolean z2 = false;
            String str = strArr[0];
            if (str.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                return a(charSequence, str, z, i);
            }
        }
        Iterable<C6785kZa> c = Ywb.c(a(charSequence, strArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) c, 10));
        for (C6785kZa a : c) {
            arrayList.add(a(charSequence, a));
        }
        return arrayList;
    }

    public static /* synthetic */ Iwb a(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return a(charSequence, cArr, z, i);
    }

    public static final Iwb<String> a(CharSequence charSequence, char[] cArr, boolean z, int i) {
        C7471uYa.b(charSequence, "$this$splitToSequence");
        C7471uYa.b(cArr, "delimiters");
        return Ywb.d(a(charSequence, cArr, 0, z, i, 2, (Object) null), new Gxb(charSequence));
    }

    private static final List<String> a(CharSequence charSequence, String str, boolean z, int i) {
        int i2 = 0;
        if (i >= 0) {
            int a = a(charSequence, str, 0, z);
            if (a == -1 || i == 1) {
                return C6850lWa.a(charSequence.toString());
            }
            boolean z2 = i > 0;
            int i3 = 10;
            if (z2) {
                i3 = C7265rZa.b(i, 10);
            }
            ArrayList arrayList = new ArrayList(i3);
            do {
                arrayList.add(charSequence.subSequence(i2, a).toString());
                i2 = str.length() + a;
                if (z2 && arrayList.size() == i - 1) {
                    break;
                }
                a = a(charSequence, str, i2, z);
            } while (a != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
