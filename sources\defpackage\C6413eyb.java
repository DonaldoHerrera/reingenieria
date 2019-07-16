package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: eyb reason: default package and case insensitive filesystem */
/* compiled from: Cookie */
public final class C6413eyb {
    private static final Pattern a = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern c = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    private final String e;
    private final String f;
    private final long g;
    private final String h;
    private final String i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;

    private C6413eyb(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.e = str;
        this.f = str2;
        this.g = j2;
        this.h = str3;
        this.i = str4;
        this.j = z;
        this.k = z2;
        this.m = z3;
        this.l = z4;
    }

    public String a() {
        return this.e;
    }

    public String b() {
        return this.f;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C6413eyb)) {
            return false;
        }
        C6413eyb eyb = (C6413eyb) obj;
        if (eyb.e.equals(this.e) && eyb.f.equals(this.f) && eyb.h.equals(this.h) && eyb.i.equals(this.i) && eyb.g == this.g && eyb.j == this.j && eyb.k == this.k && eyb.l == this.l && eyb.m == this.m) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = (((((((527 + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31;
        long j2 = this.g;
        return ((((((((hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.j ^ true ? 1 : 0)) * 31) + (this.k ^ true ? 1 : 0)) * 31) + (this.l ^ true ? 1 : 0)) * 31) + (this.m ^ true ? 1 : 0);
    }

    public String toString() {
        return a(false);
    }

    private static boolean a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (!str.endsWith(str2) || str.charAt((str.length() - str2.length()) - 1) != '.' || Kyb.c(str)) {
            return false;
        }
        return true;
    }

    private static long b(String str) {
        long j2 = Long.MIN_VALUE;
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 0) {
                j2 = parseLong;
            }
            return j2;
        } catch (NumberFormatException e2) {
            if (str.matches("-?\\d+")) {
                if (!str.startsWith("-")) {
                    j2 = Long.MAX_VALUE;
                }
                return j2;
            }
            throw e2;
        }
    }

    public static C6413eyb a(C7095oyb oyb, String str) {
        return a(System.currentTimeMillis(), oyb, str);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0131  */
    static C6413eyb a(long j2, C7095oyb oyb, String str) {
        long j3;
        String g2;
        String str2;
        C6413eyb eyb;
        String str3;
        String str4;
        String str5;
        int lastIndexOf;
        String str6 = str;
        int length = str.length();
        char c2 = ';';
        int a2 = Kyb.a(str6, 0, length, ';');
        char c3 = '=';
        int a3 = Kyb.a(str6, 0, a2, '=');
        if (a3 == a2) {
            return null;
        }
        String c4 = Kyb.c(str6, 0, a3);
        if (c4.isEmpty() || Kyb.b(c4) != -1) {
            return null;
        }
        String c5 = Kyb.c(str6, a3 + 1, a2);
        if (Kyb.b(c5) != -1) {
            return null;
        }
        int i2 = a2 + 1;
        String str7 = null;
        String str8 = null;
        long j4 = -1;
        long j5 = 253402300799999L;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = false;
        while (i2 < length) {
            int a4 = Kyb.a(str6, i2, length, c2);
            int a5 = Kyb.a(str6, i2, a4, c3);
            String c6 = Kyb.c(str6, i2, a5);
            String c7 = a5 < a4 ? Kyb.c(str6, a5 + 1, a4) : "";
            if (c6.equalsIgnoreCase("expires")) {
                try {
                    j5 = a(c7, 0, c7.length());
                } catch (IllegalArgumentException unused) {
                }
            } else if (c6.equalsIgnoreCase("max-age")) {
                j4 = b(c7);
            } else {
                if (c6.equalsIgnoreCase("domain")) {
                    str7 = a(c7);
                    z3 = false;
                } else if (c6.equalsIgnoreCase("path")) {
                    str8 = c7;
                } else if (c6.equalsIgnoreCase("secure")) {
                    z = true;
                } else if (c6.equalsIgnoreCase("httponly")) {
                    z2 = true;
                }
                i2 = a4 + 1;
                c2 = ';';
                c3 = '=';
            }
            z4 = true;
            i2 = a4 + 1;
            c2 = ';';
            c3 = '=';
        }
        long j6 = Long.MIN_VALUE;
        if (j4 != Long.MIN_VALUE) {
            if (j4 != -1) {
                j6 = j2 + (j4 <= 9223372036854775L ? j4 * 1000 : Long.MAX_VALUE);
                if (j6 < j2 || j6 > 253402300799999L) {
                    j3 = 253402300799999L;
                }
            } else {
                j3 = j5;
            }
            g2 = oyb.g();
            if (str7 != null) {
                str2 = g2;
                eyb = null;
            } else if (!a(g2, str7)) {
                return null;
            } else {
                eyb = null;
                str2 = str7;
            }
            if (g2.length() == str2.length() && PublicSuffixDatabase.a().a(str2) == null) {
                return eyb;
            }
            str3 = "/";
            str4 = str8;
            if (str4 != null || !str4.startsWith(str3)) {
                String c8 = oyb.c();
                lastIndexOf = c8.lastIndexOf(47);
                if (lastIndexOf != 0) {
                    str3 = c8.substring(0, lastIndexOf);
                }
                str5 = str3;
            } else {
                str5 = str4;
            }
            C6413eyb eyb2 = new C6413eyb(c4, c5, j3, str2, str5, z, z2, z3, z4);
            return eyb2;
        }
        j3 = j6;
        g2 = oyb.g();
        if (str7 != null) {
        }
        if (g2.length() == str2.length()) {
        }
        str3 = "/";
        str4 = str8;
        if (str4 != null) {
        }
        String c82 = oyb.c();
        lastIndexOf = c82.lastIndexOf(47);
        if (lastIndexOf != 0) {
        }
        str5 = str3;
        C6413eyb eyb22 = new C6413eyb(c4, c5, j3, str2, str5, z, z2, z3, z4);
        return eyb22;
    }

    private static long a(String str, int i2, int i3) {
        int a2 = a(str, i2, i3, false);
        Matcher matcher = d.matcher(str);
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        while (a2 < i3) {
            int a3 = a(str, a2 + 1, i3, true);
            matcher.region(a2, a3);
            if (i5 == -1 && matcher.usePattern(d).matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                int parseInt2 = Integer.parseInt(matcher.group(2));
                i9 = Integer.parseInt(matcher.group(3));
                i8 = parseInt2;
                i5 = parseInt;
            } else if (i6 == -1 && matcher.usePattern(c).matches()) {
                i6 = Integer.parseInt(matcher.group(1));
            } else if (i7 == -1 && matcher.usePattern(b).matches()) {
                i7 = b.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
            } else if (i4 == -1 && matcher.usePattern(a).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            }
            a2 = a(str, a3 + 1, i3, false);
        }
        if (i4 >= 70 && i4 <= 99) {
            i4 += 1900;
        }
        if (i4 >= 0 && i4 <= 69) {
            i4 += 2000;
        }
        if (i4 < 1601) {
            throw new IllegalArgumentException();
        } else if (i7 == -1) {
            throw new IllegalArgumentException();
        } else if (i6 < 1 || i6 > 31) {
            throw new IllegalArgumentException();
        } else if (i5 < 0 || i5 > 23) {
            throw new IllegalArgumentException();
        } else if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        } else if (i9 < 0 || i9 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Kyb.i);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i4);
            gregorianCalendar.set(2, i7 - 1);
            gregorianCalendar.set(5, i6);
            gregorianCalendar.set(11, i5);
            gregorianCalendar.set(12, i8);
            gregorianCalendar.set(13, i9);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    private static int a(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    private static String a(String str) {
        String str2 = ".";
        if (!str.endsWith(str2)) {
            if (str.startsWith(str2)) {
                str = str.substring(1);
            }
            String a2 = Kyb.a(str);
            if (a2 != null) {
                return a2;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public static List<C6413eyb> a(C7095oyb oyb, C7026nyb nyb) {
        List c2 = nyb.c("Set-Cookie");
        int size = c2.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            C6413eyb a2 = a(oyb, (String) c2.get(i2));
            if (a2 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a2);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    /* access modifiers changed from: 0000 */
    public String a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append('=');
        sb.append(this.f);
        if (this.l) {
            if (this.g == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C6891lzb.a(new Date(this.g)));
            }
        }
        if (!this.m) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.h);
        }
        sb.append("; path=");
        sb.append(this.i);
        if (this.j) {
            sb.append("; secure");
        }
        if (this.k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
