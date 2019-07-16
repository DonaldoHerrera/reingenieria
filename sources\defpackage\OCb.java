package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;

/* renamed from: OCb reason: default package */
/* compiled from: DateTimeFormatterBuilder */
public final class OCb {
    private static final CDb<NBb> a = new KCb();
    private static final Map<Character, C7381tDb> b = new HashMap();
    static final Comparator<String> c = new MCb();
    private OCb d;
    private final OCb e;
    private final List<c> f;
    private final boolean g;
    private int h;
    private char i;
    private int j;

    /* renamed from: OCb$a */
    /* compiled from: DateTimeFormatterBuilder */
    static final class a implements c {
        private final char a;

        a(char c) {
            this.a = c;
        }

        public boolean a(UCb uCb, StringBuilder sb) {
            sb.append(this.a);
            return true;
        }

        public String toString() {
            if (this.a == '\'') {
                return "''";
            }
            StringBuilder sb = new StringBuilder();
            String str = "'";
            sb.append(str);
            sb.append(this.a);
            sb.append(str);
            return sb.toString();
        }

        public int a(RCb rCb, CharSequence charSequence, int i) {
            if (i == charSequence.length()) {
                return ~i;
            }
            return !rCb.a(this.a, charSequence.charAt(i)) ? ~i : i + 1;
        }
    }

    /* renamed from: OCb$b */
    /* compiled from: DateTimeFormatterBuilder */
    static final class b implements c {
        private final c[] a;
        private final boolean b;

        b(List<c> list, boolean z) {
            this((c[]) list.toArray(new c[list.size()]), z);
        }

        public b a(boolean z) {
            if (z == this.b) {
                return this;
            }
            return new b(this.a, z);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.a != null) {
                sb.append(this.b ? "[" : "(");
                for (c append : this.a) {
                    sb.append(append);
                }
                sb.append(this.b ? "]" : ")");
            }
            return sb.toString();
        }

        b(c[] cVarArr, boolean z) {
            this.a = cVarArr;
            this.b = z;
        }

        public boolean a(UCb uCb, StringBuilder sb) {
            int length = sb.length();
            if (this.b) {
                uCb.e();
            }
            try {
                for (c a2 : this.a) {
                    if (!a2.a(uCb, sb)) {
                        sb.setLength(length);
                        return true;
                    }
                }
                if (this.b) {
                    uCb.a();
                }
                return true;
            } finally {
                if (this.b) {
                    uCb.a();
                }
            }
        }

        public int a(RCb rCb, CharSequence charSequence, int i) {
            if (this.b) {
                rCb.h();
                int i2 = i;
                for (c a2 : this.a) {
                    i2 = a2.a(rCb, charSequence, i2);
                    if (i2 < 0) {
                        rCb.a(false);
                        return i;
                    }
                }
                rCb.a(true);
                return i2;
            }
            for (c a3 : this.a) {
                i = a3.a(rCb, charSequence, i);
                if (i < 0) {
                    break;
                }
            }
            return i;
        }
    }

    /* renamed from: OCb$c */
    /* compiled from: DateTimeFormatterBuilder */
    interface c {
        int a(RCb rCb, CharSequence charSequence, int i);

        boolean a(UCb uCb, StringBuilder sb);
    }

    /* renamed from: OCb$d */
    /* compiled from: DateTimeFormatterBuilder */
    static final class d implements c {
        private final C7381tDb a;
        private final int b;
        private final int c;
        private final boolean d;

        d(C7381tDb tdb, int i, int i2, boolean z) {
            C6355eDb.a(tdb, "field");
            if (!tdb.range().c()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Field must have a fixed set of values: ");
                sb.append(tdb);
                throw new IllegalArgumentException(sb.toString());
            } else if (i < 0 || i > 9) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Minimum width must be from 0 to 9 inclusive but was ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
            } else if (i2 < 1 || i2 > 9) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Maximum width must be from 1 to 9 inclusive but was ");
                sb3.append(i2);
                throw new IllegalArgumentException(sb3.toString());
            } else if (i2 >= i) {
                this.a = tdb;
                this.b = i;
                this.c = i2;
                this.d = z;
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Maximum width must exceed or equal the minimum width but ");
                sb4.append(i2);
                sb4.append(" < ");
                sb4.append(i);
                throw new IllegalArgumentException(sb4.toString());
            }
        }

        public boolean a(UCb uCb, StringBuilder sb) {
            Long a2 = uCb.a(this.a);
            if (a2 == null) {
                return false;
            }
            WCb c2 = uCb.c();
            BigDecimal a3 = a(a2.longValue());
            if (a3.scale() != 0) {
                String a4 = c2.a(a3.setScale(Math.min(Math.max(a3.scale(), this.b), this.c), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.d) {
                    sb.append(c2.a());
                }
                sb.append(a4);
            } else if (this.b > 0) {
                if (this.d) {
                    sb.append(c2.a());
                }
                for (int i = 0; i < this.b; i++) {
                    sb.append(c2.d());
                }
            }
            return true;
        }

        public String toString() {
            String str = this.d ? ",DecimalPoint" : "";
            StringBuilder sb = new StringBuilder();
            sb.append("Fraction(");
            sb.append(this.a);
            String str2 = ",";
            sb.append(str2);
            sb.append(this.b);
            sb.append(str2);
            sb.append(this.c);
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public int a(RCb rCb, CharSequence charSequence, int i) {
            int i2;
            int i3 = rCb.f() ? this.b : 0;
            int i4 = rCb.f() ? this.c : 9;
            int length = charSequence.length();
            if (i == length) {
                if (i3 > 0) {
                    i = ~i;
                }
                return i;
            }
            if (this.d) {
                if (charSequence.charAt(i) != rCb.d().a()) {
                    if (i3 > 0) {
                        i = ~i;
                    }
                    return i;
                }
                i++;
            }
            int i5 = i;
            int i6 = i3 + i5;
            if (i6 > length) {
                return ~i5;
            }
            int min = Math.min(i4 + i5, length);
            int i7 = i5;
            int i8 = 0;
            while (true) {
                if (i7 >= min) {
                    i2 = i7;
                    break;
                }
                int i9 = i7 + 1;
                int a2 = rCb.d().a(charSequence.charAt(i7));
                if (a2 >= 0) {
                    i8 = (i8 * 10) + a2;
                    i7 = i9;
                } else if (i9 < i6) {
                    return ~i5;
                } else {
                    i2 = i9 - 1;
                }
            }
            return rCb.a(this.a, a(new BigDecimal(i8).movePointLeft(i2 - i5)), i5, i2);
        }

        private BigDecimal a(long j) {
            FDb range = this.a.range();
            range.b(j, this.a);
            BigDecimal valueOf = BigDecimal.valueOf(range.b());
            BigDecimal divide = BigDecimal.valueOf(j).subtract(valueOf).divide(BigDecimal.valueOf(range.a()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            return divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        }

        private long a(BigDecimal bigDecimal) {
            FDb range = this.a.range();
            BigDecimal valueOf = BigDecimal.valueOf(range.b());
            return bigDecimal.multiply(BigDecimal.valueOf(range.a()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact();
        }
    }

    /* renamed from: OCb$e */
    /* compiled from: DateTimeFormatterBuilder */
    static final class e implements c {
        private final int a;

        e(int i) {
            this.a = i;
        }

        public boolean a(UCb uCb, StringBuilder sb) {
            StringBuilder sb2 = sb;
            Long a2 = uCb.a((C7381tDb) C6423fDb.INSTANT_SECONDS);
            Long valueOf = Long.valueOf(0);
            if (uCb.d().b(C6423fDb.NANO_OF_SECOND)) {
                valueOf = Long.valueOf(uCb.d().d(C6423fDb.NANO_OF_SECOND));
            }
            int i = 0;
            if (a2 == null) {
                return false;
            }
            long longValue = a2.longValue();
            int a3 = C6423fDb.NANO_OF_SECOND.a(valueOf.longValue());
            String str = ":00";
            if (longValue >= -62167219200L) {
                long j = (longValue - 315569520000L) + 62167219200L;
                long b = C6355eDb.b(j, 315569520000L) + 1;
                C7032oBb a4 = C7032oBb.a(C6355eDb.c(j, 315569520000L) - 62167219200L, 0, PBb.f);
                if (b > 0) {
                    sb2.append('+');
                    sb2.append(b);
                }
                sb2.append(a4);
                if (a4.K() == 0) {
                    sb2.append(str);
                }
            } else {
                long j2 = longValue + 62167219200L;
                long j3 = j2 / 315569520000L;
                long j4 = j2 % 315569520000L;
                C7032oBb a5 = C7032oBb.a(j4 - 62167219200L, 0, PBb.f);
                int length = sb.length();
                sb2.append(a5);
                if (a5.K() == 0) {
                    sb2.append(str);
                }
                if (j3 < 0) {
                    if (a5.L() == -10000) {
                        sb2.replace(length, length + 2, Long.toString(j3 - 1));
                    } else if (j4 == 0) {
                        sb2.insert(length, j3);
                    } else {
                        sb2.insert(length + 1, Math.abs(j3));
                    }
                }
            }
            int i2 = this.a;
            if (i2 == -2) {
                if (a3 != 0) {
                    sb2.append('.');
                    if (a3 % 1000000 == 0) {
                        sb2.append(Integer.toString((a3 / 1000000) + 1000).substring(1));
                    } else if (a3 % 1000 == 0) {
                        sb2.append(Integer.toString((a3 / 1000) + 1000000).substring(1));
                    } else {
                        sb2.append(Integer.toString(a3 + 1000000000).substring(1));
                    }
                }
            } else if (i2 > 0 || (i2 == -1 && a3 > 0)) {
                sb2.append('.');
                int i3 = 100000000;
                while (true) {
                    if ((this.a != -1 || a3 <= 0) && i >= this.a) {
                        break;
                    }
                    int i4 = a3 / i3;
                    sb2.append((char) (i4 + 48));
                    a3 -= i4 * i3;
                    i3 /= 10;
                    i++;
                }
            }
            sb2.append('Z');
            return true;
        }

        public String toString() {
            return "Instant()";
        }

        public int a(RCb rCb, CharSequence charSequence, int i) {
            int i2;
            int i3 = i;
            RCb a2 = rCb.a();
            int i4 = this.a;
            int i5 = 0;
            if (i4 < 0) {
                i4 = 0;
            }
            int i6 = this.a;
            if (i6 < 0) {
                i6 = 9;
            }
            OCb oCb = new OCb();
            oCb.a(JCb.a);
            oCb.a('T');
            oCb.a((C7381tDb) C6423fDb.HOUR_OF_DAY, 2);
            oCb.a(':');
            oCb.a((C7381tDb) C6423fDb.MINUTE_OF_HOUR, 2);
            oCb.a(':');
            oCb.a((C7381tDb) C6423fDb.SECOND_OF_MINUTE, 2);
            oCb.a((C7381tDb) C6423fDb.NANO_OF_SECOND, i4, i6, true);
            oCb.a('Z');
            int a3 = oCb.j().a(false).a(a2, charSequence, i3);
            if (a3 < 0) {
                return a3;
            }
            long longValue = a2.a((C7381tDb) C6423fDb.YEAR).longValue();
            int intValue = a2.a((C7381tDb) C6423fDb.MONTH_OF_YEAR).intValue();
            int intValue2 = a2.a((C7381tDb) C6423fDb.DAY_OF_MONTH).intValue();
            int intValue3 = a2.a((C7381tDb) C6423fDb.HOUR_OF_DAY).intValue();
            int intValue4 = a2.a((C7381tDb) C6423fDb.MINUTE_OF_HOUR).intValue();
            Long a4 = a2.a((C7381tDb) C6423fDb.SECOND_OF_MINUTE);
            Long a5 = a2.a((C7381tDb) C6423fDb.NANO_OF_SECOND);
            int intValue5 = a4 != null ? a4.intValue() : 0;
            int intValue6 = a5 != null ? a5.intValue() : 0;
            int i7 = ((int) longValue) % 10000;
            if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
                i2 = intValue5;
                intValue3 = 0;
                i5 = 1;
            } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
                rCb.g();
                i2 = 59;
            } else {
                i2 = intValue5;
            }
            try {
                int i8 = intValue6;
                RCb rCb2 = rCb;
                int i9 = i;
                return rCb2.a((C7381tDb) C6423fDb.NANO_OF_SECOND, (long) i8, i9, rCb2.a((C7381tDb) C6423fDb.INSTANT_SECONDS, C7032oBb.a(i7, intValue, intValue2, intValue3, intValue4, i2, 0).a((long) i5).a(PBb.f) + C6355eDb.e(longValue / 10000, 315569520000L), i9, a3));
            } catch (RuntimeException unused) {
                return ~i3;
            }
        }
    }

    /* renamed from: OCb$f */
    /* compiled from: DateTimeFormatterBuilder */
    static final class f implements c {
        private final C5555aDb a;

        public f(C5555aDb adb) {
            this.a = adb;
        }

        public boolean a(UCb uCb, StringBuilder sb) {
            Long a2 = uCb.a((C7381tDb) C6423fDb.OFFSET_SECONDS);
            if (a2 == null) {
                return false;
            }
            sb.append("GMT");
            if (this.a == C5555aDb.FULL) {
                return new h("", "+HH:MM:ss").a(uCb, sb);
            }
            int a3 = C6355eDb.a(a2.longValue());
            if (a3 != 0) {
                int abs = Math.abs((a3 / 3600) % 100);
                int abs2 = Math.abs((a3 / 60) % 60);
                int abs3 = Math.abs(a3 % 60);
                sb.append(a3 < 0 ? "-" : "+");
                sb.append(abs);
                if (abs2 > 0 || abs3 > 0) {
                    String str = ":";
                    sb.append(str);
                    sb.append((char) ((abs2 / 10) + 48));
                    sb.append((char) ((abs2 % 10) + 48));
                    if (abs3 > 0) {
                        sb.append(str);
                        sb.append((char) ((abs3 / 10) + 48));
                        sb.append((char) ((abs3 % 10) + 48));
                    }
                }
            }
            return true;
        }

        public int a(RCb rCb, CharSequence charSequence, int i) {
            CharSequence charSequence2 = charSequence;
            int i2 = i;
            if (!rCb.a(charSequence, i, "GMT", 0, 3)) {
                return ~i2;
            }
            int i3 = i2 + 3;
            if (this.a == C5555aDb.FULL) {
                RCb rCb2 = rCb;
                return new h("", "+HH:MM:ss").a(rCb, charSequence2, i3);
            }
            RCb rCb3 = rCb;
            int length = charSequence.length();
            if (i3 == length) {
                return rCb.a((C7381tDb) C6423fDb.OFFSET_SECONDS, 0, i3, i3);
            }
            char charAt = charSequence2.charAt(i3);
            if (charAt != '+' && charAt != '-') {
                return rCb.a((C7381tDb) C6423fDb.OFFSET_SECONDS, 0, i3, i3);
            }
            int i4 = charAt == '-' ? -1 : 1;
            if (i3 == length) {
                return ~i3;
            }
            int i5 = i3 + 1;
            char charAt2 = charSequence2.charAt(i5);
            if (charAt2 < '0' || charAt2 > '9') {
                return ~i5;
            }
            int i6 = i5 + 1;
            int i7 = charAt2 - '0';
            if (i6 != length) {
                char charAt3 = charSequence2.charAt(i6);
                if (charAt3 >= '0' && charAt3 <= '9') {
                    i7 = (i7 * 10) + (charAt3 - '0');
                    if (i7 > 23) {
                        return ~i6;
                    }
                    i6++;
                }
            }
            int i8 = i6;
            if (i8 == length || charSequence2.charAt(i8) != ':') {
                return rCb.a((C7381tDb) C6423fDb.OFFSET_SECONDS, (long) (i4 * 3600 * i7), i8, i8);
            }
            int i9 = i8 + 1;
            int i10 = length - 2;
            if (i9 > i10) {
                return ~i9;
            }
            char charAt4 = charSequence2.charAt(i9);
            if (charAt4 < '0' || charAt4 > '9') {
                return ~i9;
            }
            int i11 = i9 + 1;
            int i12 = charAt4 - '0';
            char charAt5 = charSequence2.charAt(i11);
            if (charAt5 < '0' || charAt5 > '9') {
                return ~i11;
            }
            int i13 = i11 + 1;
            int i14 = (i12 * 10) + (charAt5 - '0');
            if (i14 > 59) {
                return ~i13;
            }
            if (i13 == length || charSequence2.charAt(i13) != ':') {
                return rCb.a((C7381tDb) C6423fDb.OFFSET_SECONDS, (long) (i4 * ((i7 * 3600) + (i14 * 60))), i13, i13);
            }
            int i15 = i13 + 1;
            if (i15 > i10) {
                return ~i15;
            }
            char charAt6 = charSequence2.charAt(i15);
            if (charAt6 < '0' || charAt6 > '9') {
                return ~i15;
            }
            int i16 = i15 + 1;
            int i17 = charAt6 - '0';
            char charAt7 = charSequence2.charAt(i16);
            if (charAt7 < '0' || charAt7 > '9') {
                return ~i16;
            }
            int i18 = i16 + 1;
            int i19 = (i17 * 10) + (charAt7 - '0');
            if (i19 > 59) {
                return ~i18;
            }
            return rCb.a((C7381tDb) C6423fDb.OFFSET_SECONDS, (long) (i4 * ((i7 * 3600) + (i14 * 60) + i19)), i18, i18);
        }
    }

    /* renamed from: OCb$g */
    /* compiled from: DateTimeFormatterBuilder */
    static class g implements c {
        static final int[] a = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        final C7381tDb b;
        final int c;
        final int d;
        final YCb e;
        final int f;

        /* synthetic */ g(C7381tDb tdb, int i, int i2, YCb yCb, int i3, KCb kCb) {
            this(tdb, i, i2, yCb, i3);
        }

        /* access modifiers changed from: 0000 */
        public long a(UCb uCb, long j) {
            return j;
        }

        /* access modifiers changed from: 0000 */
        public g a() {
            if (this.f == -1) {
                return this;
            }
            g gVar = new g(this.b, this.c, this.d, this.e, -1);
            return gVar;
        }

        public String toString() {
            String str = ")";
            String str2 = "Value(";
            if (this.c == 1 && this.d == 19 && this.e == YCb.NORMAL) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(this.b);
                sb.append(str);
                return sb.toString();
            }
            String str3 = ",";
            if (this.c == this.d && this.e == YCb.NOT_NEGATIVE) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(this.b);
                sb2.append(str3);
                sb2.append(this.c);
                sb2.append(str);
                return sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(this.b);
            sb3.append(str3);
            sb3.append(this.c);
            sb3.append(str3);
            sb3.append(this.d);
            sb3.append(str3);
            sb3.append(this.e);
            sb3.append(str);
            return sb3.toString();
        }

        g(C7381tDb tdb, int i, int i2, YCb yCb) {
            this.b = tdb;
            this.c = i;
            this.d = i2;
            this.e = yCb;
            this.f = 0;
        }

        /* access modifiers changed from: 0000 */
        public g a(int i) {
            g gVar = new g(this.b, this.c, this.d, this.e, this.f + i);
            return gVar;
        }

        public boolean a(UCb uCb, StringBuilder sb) {
            String str;
            Long a2 = uCb.a(this.b);
            if (a2 == null) {
                return false;
            }
            long a3 = a(uCb, a2.longValue());
            WCb c2 = uCb.c();
            if (a3 == Long.MIN_VALUE) {
                str = "9223372036854775808";
            } else {
                str = Long.toString(Math.abs(a3));
            }
            String str2 = " cannot be printed as the value ";
            String str3 = "Field ";
            if (str.length() <= this.d) {
                String a4 = c2.a(str);
                if (a3 >= 0) {
                    int i = NCb.a[this.e.ordinal()];
                    if (i == 1) {
                        int i2 = this.c;
                        if (i2 < 19 && a3 >= ((long) a[i2])) {
                            sb.append(c2.c());
                        }
                    } else if (i == 2) {
                        sb.append(c2.c());
                    }
                } else {
                    int i3 = NCb.a[this.e.ordinal()];
                    if (i3 == 1 || i3 == 2 || i3 == 3) {
                        sb.append(c2.b());
                    } else if (i3 == 4) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str3);
                        sb2.append(this.b);
                        sb2.append(str2);
                        sb2.append(a3);
                        sb2.append(" cannot be negative according to the SignStyle");
                        throw new C5687cBb(sb2.toString());
                    }
                }
                for (int i4 = 0; i4 < this.c - a4.length(); i4++) {
                    sb.append(c2.d());
                }
                sb.append(a4);
                return true;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(this.b);
            sb3.append(str2);
            sb3.append(a3);
            sb3.append(" exceeds the maximum print width of ");
            sb3.append(this.d);
            throw new C5687cBb(sb3.toString());
        }

        private g(C7381tDb tdb, int i, int i2, YCb yCb, int i3) {
            this.b = tdb;
            this.c = i;
            this.d = i2;
            this.e = yCb;
            this.f = i3;
        }

        /* access modifiers changed from: 0000 */
        public boolean a(RCb rCb) {
            int i = this.f;
            return i == -1 || (i > 0 && this.c == this.d && this.e == YCb.NOT_NEGATIVE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:107:0x015f  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x017d  */
        public int a(RCb rCb, CharSequence charSequence, int i) {
            int i2;
            boolean z;
            boolean z2;
            BigInteger bigInteger;
            int i3;
            long j;
            long j2;
            BigInteger bigInteger2;
            int i4;
            int i5;
            int i6;
            int i7 = i;
            int length = charSequence.length();
            if (i7 == length) {
                return ~i7;
            }
            char charAt = charSequence.charAt(i);
            int i8 = 0;
            if (charAt == rCb.d().c()) {
                if (!this.e.a(true, rCb.f(), this.c == this.d)) {
                    return ~i7;
                }
                i2 = i7 + 1;
                z2 = false;
                z = true;
            } else {
                if (charAt == rCb.d().b()) {
                    if (!this.e.a(false, rCb.f(), this.c == this.d)) {
                        return ~i7;
                    }
                    i2 = i7 + 1;
                    z2 = true;
                } else if (this.e == YCb.ALWAYS && rCb.f()) {
                    return ~i7;
                } else {
                    i2 = i7;
                    z2 = false;
                }
                z = false;
            }
            int i9 = (rCb.f() || a(rCb)) ? this.c : 1;
            int i10 = i2 + i9;
            if (i10 > length) {
                return ~i2;
            }
            int max = ((rCb.f() || a(rCb)) ? this.d : 9) + Math.max(this.f, 0);
            while (true) {
                bigInteger = null;
                if (i8 >= 2) {
                    i3 = i2;
                    j = 0;
                    break;
                }
                int min = Math.min(max + i2, length);
                bigInteger2 = null;
                j = 0;
                i4 = i2;
                while (true) {
                    if (i4 >= min) {
                        CharSequence charSequence2 = charSequence;
                        break;
                    }
                    int i11 = i4 + 1;
                    int a2 = rCb.d().a(charSequence.charAt(i4));
                    if (a2 < 0) {
                        i4 = i11 - 1;
                        if (i4 < i10) {
                            return ~i2;
                        }
                    } else {
                        if (i11 - i2 > 18) {
                            if (bigInteger2 == null) {
                                bigInteger2 = BigInteger.valueOf(j);
                            }
                            bigInteger2 = bigInteger2.multiply(BigInteger.TEN).add(BigInteger.valueOf((long) a2));
                            i6 = i10;
                            i5 = min;
                        } else {
                            i6 = i10;
                            i5 = min;
                            j = (j * 10) + ((long) a2);
                        }
                        min = i5;
                        i10 = i6;
                        i4 = i11;
                    }
                }
                int i12 = i10;
                int i13 = this.f;
                if (i13 <= 0 || i8 != 0) {
                    i3 = i4;
                    bigInteger = bigInteger2;
                } else {
                    max = Math.max(i9, (i4 - i2) - i13);
                    i8++;
                    i10 = i12;
                }
            }
            i3 = i4;
            bigInteger = bigInteger2;
            if (z2) {
                if (bigInteger != null) {
                    if (bigInteger.equals(BigInteger.ZERO) && rCb.f()) {
                        return ~(i2 - 1);
                    }
                    bigInteger = bigInteger.negate();
                } else if (j == 0 && rCb.f()) {
                    return ~(i2 - 1);
                } else {
                    j2 = -j;
                    if (bigInteger != null) {
                        return a(rCb, j2, i2, i3);
                    }
                    if (bigInteger.bitLength() > 63) {
                        bigInteger = bigInteger.divide(BigInteger.TEN);
                        i3--;
                    }
                    return a(rCb, bigInteger.longValue(), i2, i3);
                }
            } else if (this.e == YCb.EXCEEDS_PAD && rCb.f()) {
                int i14 = i3 - i2;
                if (z) {
                    if (i14 <= this.c) {
                        return ~(i2 - 1);
                    }
                } else if (i14 > this.c) {
                    return ~i2;
                }
            }
            j2 = j;
            if (bigInteger != null) {
            }
        }

        /* access modifiers changed from: 0000 */
        public int a(RCb rCb, long j, int i, int i2) {
            return rCb.a(this.b, j, i, i2);
        }
    }

    /* renamed from: OCb$h */
    /* compiled from: DateTimeFormatterBuilder */
    static final class h implements c {
        static final String[] a = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};
        static final h b = new h("Z", "+HH:MM:ss");
        private final String c;
        private final int d;

        h(String str, String str2) {
            C6355eDb.a(str, "noOffsetText");
            C6355eDb.a(str2, "pattern");
            this.c = str;
            this.d = a(str2);
        }

        private int a(String str) {
            int i = 0;
            while (true) {
                String[] strArr = a;
                if (i >= strArr.length) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid zone offset pattern: ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                } else if (strArr[i].equals(str)) {
                    return i;
                } else {
                    i++;
                }
            }
        }

        public String toString() {
            String replace = this.c.replace("'", "''");
            StringBuilder sb = new StringBuilder();
            sb.append("Offset(");
            sb.append(a[this.d]);
            sb.append(",'");
            sb.append(replace);
            sb.append("')");
            return sb.toString();
        }

        public boolean a(UCb uCb, StringBuilder sb) {
            Long a2 = uCb.a((C7381tDb) C6423fDb.OFFSET_SECONDS);
            if (a2 == null) {
                return false;
            }
            int a3 = C6355eDb.a(a2.longValue());
            if (a3 == 0) {
                sb.append(this.c);
            } else {
                int abs = Math.abs((a3 / 3600) % 100);
                int abs2 = Math.abs((a3 / 60) % 60);
                int abs3 = Math.abs(a3 % 60);
                int length = sb.length();
                sb.append(a3 < 0 ? "-" : "+");
                sb.append((char) ((abs / 10) + 48));
                sb.append((char) ((abs % 10) + 48));
                int i = this.d;
                if (i >= 3 || (i >= 1 && abs2 > 0)) {
                    String str = ":";
                    String str2 = "";
                    sb.append(this.d % 2 == 0 ? str : str2);
                    sb.append((char) ((abs2 / 10) + 48));
                    sb.append((char) ((abs2 % 10) + 48));
                    abs += abs2;
                    int i2 = this.d;
                    if (i2 >= 7 || (i2 >= 5 && abs3 > 0)) {
                        if (this.d % 2 != 0) {
                            str = str2;
                        }
                        sb.append(str);
                        sb.append((char) ((abs3 / 10) + 48));
                        sb.append((char) ((abs3 % 10) + 48));
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                    sb.append(this.c);
                }
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
        public int a(RCb rCb, CharSequence charSequence, int i) {
            boolean z;
            CharSequence charSequence2 = charSequence;
            int i2 = i;
            int length = charSequence.length();
            int length2 = this.c.length();
            if (length2 == 0) {
                if (i2 == length) {
                    return rCb.a((C7381tDb) C6423fDb.OFFSET_SECONDS, 0, i, i);
                }
            } else if (i2 == length) {
                return ~i2;
            } else {
                if (rCb.a(charSequence, i, this.c, 0, length2)) {
                    return rCb.a((C7381tDb) C6423fDb.OFFSET_SECONDS, 0, i, i2 + length2);
                }
            }
            char charAt = charSequence.charAt(i);
            if (charAt == '+' || charAt == '-') {
                int i3 = charAt == '-' ? -1 : 1;
                int[] iArr = new int[4];
                iArr[0] = i2 + 1;
                if (!a(iArr, 1, charSequence2, true)) {
                    if (!a(iArr, 2, charSequence2, this.d >= 3) && !a(iArr, 3, charSequence2, false)) {
                        z = false;
                        if (!z) {
                            return rCb.a((C7381tDb) C6423fDb.OFFSET_SECONDS, ((long) i3) * ((((long) iArr[1]) * 3600) + (((long) iArr[2]) * 60) + ((long) iArr[3])), i, iArr[0]);
                        }
                    }
                }
                z = true;
                if (!z) {
                }
            }
            if (length2 != 0) {
                return ~i2;
            }
            return rCb.a((C7381tDb) C6423fDb.OFFSET_SECONDS, 0, i, i2 + length2);
        }

        private boolean a(int[] iArr, int i, CharSequence charSequence, boolean z) {
            int i2;
            int i3 = this.d;
            if ((i3 + 3) / 2 < i) {
                return false;
            }
            int i4 = iArr[0];
            if (i3 % 2 != 0 || i <= 1) {
                i2 = i4;
            } else {
                i2 = i4 + 1;
                if (i2 > charSequence.length() || charSequence.charAt(i4) != ':') {
                    return z;
                }
            }
            if (i2 + 2 > charSequence.length()) {
                return z;
            }
            int i5 = i2 + 1;
            char charAt = charSequence.charAt(i2);
            int i6 = i5 + 1;
            char charAt2 = charSequence.charAt(i5);
            if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
                int i7 = ((charAt - '0') * 10) + (charAt2 - '0');
                if (i7 >= 0 && i7 <= 59) {
                    iArr[i] = i7;
                    iArr[0] = i6;
                    return false;
                }
            }
            return z;
        }
    }

    /* renamed from: OCb$i */
    /* compiled from: DateTimeFormatterBuilder */
    static final class i implements c {
        private final c a;
        private final int b;
        private final char c;

        i(c cVar, int i, char c2) {
            this.a = cVar;
            this.b = i;
            this.c = c2;
        }

        public boolean a(UCb uCb, StringBuilder sb) {
            int length = sb.length();
            if (!this.a.a(uCb, sb)) {
                return false;
            }
            int length2 = sb.length() - length;
            if (length2 <= this.b) {
                for (int i = 0; i < this.b - length2; i++) {
                    sb.insert(length, this.c);
                }
                return true;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot print as output of ");
            sb2.append(length2);
            sb2.append(" characters exceeds pad width of ");
            sb2.append(this.b);
            throw new C5687cBb(sb2.toString());
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("Pad(");
            sb.append(this.a);
            sb.append(",");
            sb.append(this.b);
            if (this.c == ' ') {
                str = ")";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(",'");
                sb2.append(this.c);
                sb2.append("')");
                str = sb2.toString();
            }
            sb.append(str);
            return sb.toString();
        }

        public int a(RCb rCb, CharSequence charSequence, int i) {
            boolean f = rCb.f();
            boolean e = rCb.e();
            if (i > charSequence.length()) {
                throw new IndexOutOfBoundsException();
            } else if (i == charSequence.length()) {
                return ~i;
            } else {
                int i2 = this.b + i;
                if (i2 > charSequence.length()) {
                    if (f) {
                        return ~i;
                    }
                    i2 = charSequence.length();
                }
                int i3 = i;
                while (i3 < i2) {
                    if (!e) {
                        if (!rCb.a(charSequence.charAt(i3), this.c)) {
                            break;
                        }
                    } else if (charSequence.charAt(i3) != this.c) {
                        break;
                    }
                    i3++;
                }
                int a2 = this.a.a(rCb, charSequence.subSequence(0, i2), i3);
                if (a2 != i2 && f) {
                    a2 = ~(i + i3);
                }
                return a2;
            }
        }
    }

    /* renamed from: OCb$j */
    /* compiled from: DateTimeFormatterBuilder */
    static final class j extends g {
        static final C6827lBb g = C6827lBb.a(2000, 1, 1);
        private final int h;
        private final XBb i;

        j(C7381tDb tdb, int i2, int i3, int i4, XBb xBb) {
            super(tdb, i2, i3, YCb.NOT_NEGATIVE);
            if (i2 < 1 || i2 > 10) {
                StringBuilder sb = new StringBuilder();
                sb.append("The width must be from 1 to 10 inclusive but was ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else if (i3 < 1 || i3 > 10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("The maxWidth must be from 1 to 10 inclusive but was ");
                sb2.append(i3);
                throw new IllegalArgumentException(sb2.toString());
            } else if (i3 >= i2) {
                if (xBb == null) {
                    long j = (long) i4;
                    if (!tdb.range().b(j)) {
                        throw new IllegalArgumentException("The base value must be within the range of the field");
                    } else if (j + ((long) g.a[i2]) > 2147483647L) {
                        throw new C5687cBb("Unable to add printer-parser as the range exceeds the capacity of an int");
                    }
                }
                this.h = i4;
                this.i = xBb;
            } else {
                throw new IllegalArgumentException("The maxWidth must be greater than the width");
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ReducedValue(");
            sb.append(this.b);
            String str = ",";
            sb.append(str);
            sb.append(this.c);
            sb.append(str);
            sb.append(this.d);
            sb.append(str);
            Object obj = this.i;
            if (obj == null) {
                obj = Integer.valueOf(this.h);
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        public long a(UCb uCb, long j) {
            long abs = Math.abs(j);
            int i2 = this.h;
            if (this.i != null) {
                i2 = C6625iCb.b(uCb.d()).a((C7036oDb) this.i).c(this.b);
            }
            if (j >= ((long) i2)) {
                int[] iArr = g.a;
                int i3 = this.c;
                if (j < ((long) (i2 + iArr[i3]))) {
                    return abs % ((long) iArr[i3]);
                }
            }
            return abs % ((long) g.a[this.d]);
        }

        /* access modifiers changed from: 0000 */
        public int a(RCb rCb, long j, int i2, int i3) {
            int i4 = this.h;
            if (this.i != null) {
                i4 = rCb.b().a((C7036oDb) this.i).c(this.b);
                rCb.a(this, j, i2, i3);
            }
            int i5 = i3 - i2;
            int i6 = this.c;
            if (i5 == i6 && j >= 0) {
                long j2 = (long) g.a[i6];
                long j3 = (long) i4;
                long j4 = j3 - (j3 % j2);
                j = i4 > 0 ? j4 + j : j4 - j;
                if (j < j3) {
                    j += j2;
                }
            }
            return rCb.a(this.b, j, i2, i3);
        }

        private j(C7381tDb tdb, int i2, int i3, int i4, XBb xBb, int i5) {
            super(tdb, i2, i3, YCb.NOT_NEGATIVE, i5, null);
            this.h = i4;
            this.i = xBb;
        }

        /* access modifiers changed from: 0000 */
        public g a() {
            if (this.f == -1) {
                return this;
            }
            j jVar = new j(this.b, this.c, this.d, this.h, this.i, -1);
            return jVar;
        }

        /* access modifiers changed from: 0000 */
        public j a(int i2) {
            j jVar = new j(this.b, this.c, this.d, this.h, this.i, this.f + i2);
            return jVar;
        }

        /* access modifiers changed from: 0000 */
        public boolean a(RCb rCb) {
            if (!rCb.f()) {
                return false;
            }
            return super.a(rCb);
        }
    }

    /* renamed from: OCb$k */
    /* compiled from: DateTimeFormatterBuilder */
    enum k implements c {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        public int a(RCb rCb, CharSequence charSequence, int i) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                rCb.b(true);
            } else if (ordinal == 1) {
                rCb.b(false);
            } else if (ordinal == 2) {
                rCb.c(true);
            } else if (ordinal == 3) {
                rCb.c(false);
            }
            return i;
        }

        public boolean a(UCb uCb, StringBuilder sb) {
            return true;
        }

        public String toString() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (ordinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (ordinal == 2) {
                return "ParseStrict(true)";
            }
            if (ordinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    /* renamed from: OCb$l */
    /* compiled from: DateTimeFormatterBuilder */
    static final class l implements c {
        private final String a;

        l(String str) {
            this.a = str;
        }

        public boolean a(UCb uCb, StringBuilder sb) {
            sb.append(this.a);
            return true;
        }

        public String toString() {
            String str = "'";
            String replace = this.a.replace(str, "''");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(replace);
            sb.append(str);
            return sb.toString();
        }

        public int a(RCb rCb, CharSequence charSequence, int i) {
            if (i > charSequence.length() || i < 0) {
                throw new IndexOutOfBoundsException();
            }
            String str = this.a;
            if (!rCb.a(charSequence, i, str, 0, str.length())) {
                return ~i;
            }
            return i + this.a.length();
        }
    }

    /* renamed from: OCb$m */
    /* compiled from: DateTimeFormatterBuilder */
    static final class m implements c {
        private final C7381tDb a;
        private final C5555aDb b;
        private final VCb c;
        private volatile g d;

        m(C7381tDb tdb, C5555aDb adb, VCb vCb) {
            this.a = tdb;
            this.b = adb;
            this.c = vCb;
        }

        public boolean a(UCb uCb, StringBuilder sb) {
            Long a2 = uCb.a(this.a);
            if (a2 == null) {
                return false;
            }
            String a3 = this.c.a(this.a, a2.longValue(), this.b, uCb.b());
            if (a3 == null) {
                return a().a(uCb, sb);
            }
            sb.append(a3);
            return true;
        }

        public String toString() {
            String str = ")";
            String str2 = "Text(";
            if (this.b == C5555aDb.FULL) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(this.a);
                sb.append(str);
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(this.a);
            sb2.append(",");
            sb2.append(this.b);
            sb2.append(str);
            return sb2.toString();
        }

        public int a(RCb rCb, CharSequence charSequence, int i) {
            int length = charSequence.length();
            if (i < 0 || i > length) {
                throw new IndexOutOfBoundsException();
            }
            Iterator a2 = this.c.a(this.a, rCb.f() ? this.b : null, rCb.c());
            if (a2 != null) {
                while (a2.hasNext()) {
                    Entry entry = (Entry) a2.next();
                    String str = (String) entry.getKey();
                    if (rCb.a(str, 0, charSequence, i, str.length())) {
                        return rCb.a(this.a, ((Long) entry.getValue()).longValue(), i, i + str.length());
                    }
                }
                if (rCb.f()) {
                    return ~i;
                }
            }
            return a().a(rCb, charSequence, i);
        }

        private g a() {
            if (this.d == null) {
                this.d = new g(this.a, 1, 19, YCb.NORMAL);
            }
            return this.d;
        }
    }

    /* renamed from: OCb$n */
    /* compiled from: DateTimeFormatterBuilder */
    static final class n implements c {
        private final char a;
        private final int b;

        public n(char c, int i) {
            this.a = c;
            this.b = i;
        }

        public boolean a(UCb uCb, StringBuilder sb) {
            return a(GDb.a(uCb.b())).a(uCb, sb);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Localized(");
            char c = this.a;
            String str = ",";
            if (c == 'Y') {
                int i = this.b;
                if (i == 1) {
                    sb.append("WeekBasedYear");
                } else if (i == 2) {
                    sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
                } else {
                    sb.append("WeekBasedYear,");
                    sb.append(this.b);
                    sb.append(str);
                    sb.append(19);
                    sb.append(str);
                    sb.append(this.b < 4 ? YCb.NORMAL : YCb.EXCEEDS_PAD);
                }
            } else {
                if (c == 'c' || c == 'e') {
                    sb.append("DayOfWeek");
                } else if (c == 'w') {
                    sb.append("WeekOfWeekBasedYear");
                } else if (c == 'W') {
                    sb.append("WeekOfMonth");
                }
                sb.append(str);
                sb.append(this.b);
            }
            sb.append(")");
            return sb.toString();
        }

        public int a(RCb rCb, CharSequence charSequence, int i) {
            return a(GDb.a(rCb.c())).a(rCb, charSequence, i);
        }

        private c a(GDb gDb) {
            char c = this.a;
            if (c == 'W') {
                return new g(gDb.e(), 1, 2, YCb.NOT_NEGATIVE);
            }
            if (c != 'Y') {
                if (c == 'c') {
                    return new g(gDb.a(), this.b, 2, YCb.NOT_NEGATIVE);
                }
                if (c == 'e') {
                    return new g(gDb.a(), this.b, 2, YCb.NOT_NEGATIVE);
                }
                if (c != 'w') {
                    return null;
                }
                return new g(gDb.f(), this.b, 2, YCb.NOT_NEGATIVE);
            } else if (this.b == 2) {
                j jVar = new j(gDb.d(), 2, 2, 0, j.g);
                return jVar;
            } else {
                C7381tDb d = gDb.d();
                int i = this.b;
                g gVar = new g(d, i, 19, i < 4 ? YCb.NORMAL : YCb.EXCEEDS_PAD, -1, null);
                return gVar;
            }
        }
    }

    /* renamed from: OCb$o */
    /* compiled from: DateTimeFormatterBuilder */
    static final class o implements c {
        private static volatile Entry<Integer, a> a;
        private final CDb<NBb> b;
        private final String c;

        /* renamed from: OCb$o$a */
        /* compiled from: DateTimeFormatterBuilder */
        private static final class a {
            final int a;
            private final Map<CharSequence, a> b;
            private final Map<String, a> c;

            /* synthetic */ a(int i, KCb kCb) {
                this(i);
            }

            private a(int i) {
                this.b = new HashMap();
                this.c = new HashMap();
                this.a = i;
            }

            /* access modifiers changed from: private */
            public a a(CharSequence charSequence, boolean z) {
                if (z) {
                    return (a) this.b.get(charSequence);
                }
                return (a) this.c.get(charSequence.toString().toLowerCase(Locale.ENGLISH));
            }

            /* access modifiers changed from: private */
            public void a(String str) {
                int length = str.length();
                int i = this.a;
                if (length == i) {
                    this.b.put(str, null);
                    this.c.put(str.toLowerCase(Locale.ENGLISH), null);
                } else if (length > i) {
                    String substring = str.substring(0, i);
                    a aVar = (a) this.b.get(substring);
                    if (aVar == null) {
                        aVar = new a(length);
                        this.b.put(substring, aVar);
                        this.c.put(substring.toLowerCase(Locale.ENGLISH), aVar);
                    }
                    aVar.a(str);
                }
            }
        }

        o(CDb<NBb> cDb, String str) {
            this.b = cDb;
            this.c = str;
        }

        public boolean a(UCb uCb, StringBuilder sb) {
            NBb nBb = (NBb) uCb.a(this.b);
            if (nBb == null) {
                return false;
            }
            sb.append(nBb.getId());
            return true;
        }

        public String toString() {
            return this.c;
        }

        public int a(RCb rCb, CharSequence charSequence, int i) {
            int length = charSequence.length();
            if (i > length) {
                throw new IndexOutOfBoundsException();
            } else if (i == length) {
                return ~i;
            } else {
                char charAt = charSequence.charAt(i);
                if (charAt == '+' || charAt == '-') {
                    RCb a2 = rCb.a();
                    int a3 = h.b.a(a2, charSequence, i);
                    if (a3 < 0) {
                        return a3;
                    }
                    rCb.a((NBb) PBb.a((int) a2.a((C7381tDb) C6423fDb.OFFSET_SECONDS).longValue()));
                    return a3;
                }
                int i2 = i + 2;
                if (length >= i2) {
                    char charAt2 = charSequence.charAt(i + 1);
                    if (rCb.a(charAt, 'U') && rCb.a(charAt2, 'T')) {
                        int i3 = i + 3;
                        if (length < i3 || !rCb.a(charSequence.charAt(i2), 'C')) {
                            return a(rCb, charSequence, i, i2);
                        }
                        return a(rCb, charSequence, i, i3);
                    } else if (rCb.a(charAt, 'G')) {
                        int i4 = i + 3;
                        if (length >= i4 && rCb.a(charAt2, 'M') && rCb.a(charSequence.charAt(i2), 'T')) {
                            return a(rCb, charSequence, i, i4);
                        }
                    }
                }
                Set a4 = QDb.a();
                int size = a4.size();
                Entry<Integer, a> entry = a;
                if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
                    synchronized (this) {
                        entry = a;
                        if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
                            entry = new SimpleImmutableEntry<>(Integer.valueOf(size), a(a4));
                            a = entry;
                        }
                    }
                }
                a aVar = (a) entry.getValue();
                String str = null;
                String str2 = null;
                while (aVar != null) {
                    int i5 = aVar.a + i;
                    if (i5 > length) {
                        break;
                    }
                    String charSequence2 = charSequence.subSequence(i, i5).toString();
                    aVar = aVar.a((CharSequence) charSequence2, rCb.e());
                    String str3 = charSequence2;
                    str2 = str;
                    str = str3;
                }
                NBb a5 = a(a4, str, rCb.e());
                if (a5 == null) {
                    a5 = a(a4, str2, rCb.e());
                    if (a5 != null) {
                        str = str2;
                    } else if (!rCb.a(charAt, 'Z')) {
                        return ~i;
                    } else {
                        rCb.a((NBb) PBb.f);
                        return i + 1;
                    }
                }
                rCb.a(a5);
                return i + str.length();
            }
        }

        private NBb a(Set<String> set, String str, boolean z) {
            NBb nBb = null;
            if (str == null) {
                return null;
            }
            if (z) {
                if (set.contains(str)) {
                    nBb = NBb.of(str);
                }
                return nBb;
            }
            for (String str2 : set) {
                if (str2.equalsIgnoreCase(str)) {
                    return NBb.of(str2);
                }
            }
            return null;
        }

        private int a(RCb rCb, CharSequence charSequence, int i, int i2) {
            String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
            RCb a2 = rCb.a();
            if (i2 >= charSequence.length() || !rCb.a(charSequence.charAt(i2), 'Z')) {
                int a3 = h.b.a(a2, charSequence, i2);
                if (a3 < 0) {
                    rCb.a(NBb.a(upperCase, PBb.f));
                    return i2;
                }
                rCb.a(NBb.a(upperCase, PBb.a((int) a2.a((C7381tDb) C6423fDb.OFFSET_SECONDS).longValue())));
                return a3;
            }
            rCb.a(NBb.a(upperCase, PBb.f));
            return i2;
        }

        private static a a(Set<String> set) {
            ArrayList<String> arrayList = new ArrayList<>(set);
            Collections.sort(arrayList, OCb.c);
            a aVar = new a(((String) arrayList.get(0)).length(), null);
            for (String a2 : arrayList) {
                aVar.a(a2);
            }
            return aVar;
        }
    }

    /* renamed from: OCb$p */
    /* compiled from: DateTimeFormatterBuilder */
    static final class p implements c {
        private static final Comparator<String> a = new PCb();
        private final C5555aDb b;

        p(C5555aDb adb) {
            C6355eDb.a(adb, "textStyle");
            this.b = adb;
        }

        public boolean a(UCb uCb, StringBuilder sb) {
            boolean z;
            NBb nBb = (NBb) uCb.a(BDb.g());
            int i = 0;
            if (nBb == null) {
                return false;
            }
            if (nBb.c() instanceof PBb) {
                sb.append(nBb.getId());
                return true;
            }
            C7036oDb d = uCb.d();
            if (d.b(C6423fDb.INSTANT_SECONDS)) {
                z = nBb.b().b(C6623iBb.b(d.d(C6423fDb.INSTANT_SECONDS)));
            } else {
                z = false;
            }
            TimeZone timeZone = TimeZone.getTimeZone(nBb.getId());
            if (this.b.a() == C5555aDb.FULL) {
                i = 1;
            }
            sb.append(timeZone.getDisplayName(z, i, uCb.b()));
            return true;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ZoneText(");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }

        public int a(RCb rCb, CharSequence charSequence, int i) {
            TreeMap treeMap = new TreeMap(a);
            for (String str : NBb.a()) {
                treeMap.put(str, str);
                TimeZone timeZone = TimeZone.getTimeZone(str);
                int i2 = this.b.a() == C5555aDb.FULL ? 1 : 0;
                String displayName = timeZone.getDisplayName(false, i2, rCb.c());
                String str2 = "Etc/";
                String str3 = "GMT+";
                if (str.startsWith(str2) || (!displayName.startsWith(str3) && !displayName.startsWith(str3))) {
                    treeMap.put(displayName, str);
                }
                String displayName2 = timeZone.getDisplayName(true, i2, rCb.c());
                if (str.startsWith(str2) || (!displayName2.startsWith(str3) && !displayName2.startsWith(str3))) {
                    treeMap.put(displayName2, str);
                }
            }
            for (Entry entry : treeMap.entrySet()) {
                String str4 = (String) entry.getKey();
                if (rCb.a(charSequence, i, str4, 0, str4.length())) {
                    rCb.a(NBb.of((String) entry.getValue()));
                    return i + str4.length();
                }
            }
            return ~i;
        }
    }

    static {
        b.put(Character.valueOf('G'), C6423fDb.ERA);
        b.put(Character.valueOf('y'), C6423fDb.YEAR_OF_ERA);
        b.put(Character.valueOf('u'), C6423fDb.YEAR);
        b.put(Character.valueOf('Q'), C6899mDb.b);
        b.put(Character.valueOf('q'), C6899mDb.b);
        b.put(Character.valueOf('M'), C6423fDb.MONTH_OF_YEAR);
        b.put(Character.valueOf('L'), C6423fDb.MONTH_OF_YEAR);
        b.put(Character.valueOf('D'), C6423fDb.DAY_OF_YEAR);
        b.put(Character.valueOf('d'), C6423fDb.DAY_OF_MONTH);
        b.put(Character.valueOf('F'), C6423fDb.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        b.put(Character.valueOf('E'), C6423fDb.DAY_OF_WEEK);
        b.put(Character.valueOf('c'), C6423fDb.DAY_OF_WEEK);
        b.put(Character.valueOf('e'), C6423fDb.DAY_OF_WEEK);
        b.put(Character.valueOf('a'), C6423fDb.AMPM_OF_DAY);
        b.put(Character.valueOf('H'), C6423fDb.HOUR_OF_DAY);
        b.put(Character.valueOf('k'), C6423fDb.CLOCK_HOUR_OF_DAY);
        b.put(Character.valueOf('K'), C6423fDb.HOUR_OF_AMPM);
        b.put(Character.valueOf('h'), C6423fDb.CLOCK_HOUR_OF_AMPM);
        b.put(Character.valueOf('m'), C6423fDb.MINUTE_OF_HOUR);
        b.put(Character.valueOf('s'), C6423fDb.SECOND_OF_MINUTE);
        b.put(Character.valueOf('S'), C6423fDb.NANO_OF_SECOND);
        b.put(Character.valueOf('A'), C6423fDb.MILLI_OF_DAY);
        b.put(Character.valueOf('n'), C6423fDb.NANO_OF_SECOND);
        b.put(Character.valueOf('N'), C6423fDb.NANO_OF_DAY);
    }

    public OCb() {
        this.d = this;
        this.f = new ArrayList();
        this.j = -1;
        this.e = null;
        this.g = false;
    }

    public OCb a(C7381tDb tdb) {
        C6355eDb.a(tdb, "field");
        a(new g(tdb, 1, 19, YCb.NORMAL));
        return this;
    }

    public OCb b() {
        a((c) h.b);
        return this;
    }

    public OCb c() {
        a((c) new o(BDb.g(), "ZoneId()"));
        return this;
    }

    public OCb d() {
        a((c) new o(a, "ZoneRegionId()"));
        return this;
    }

    public OCb e() {
        OCb oCb = this.d;
        if (oCb.e != null) {
            if (oCb.f.size() > 0) {
                OCb oCb2 = this.d;
                b bVar = new b(oCb2.f, oCb2.g);
                this.d = this.d.e;
                a((c) bVar);
            } else {
                this.d = this.d.e;
            }
            return this;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    public OCb f() {
        OCb oCb = this.d;
        oCb.j = -1;
        this.d = new OCb(oCb, true);
        return this;
    }

    public OCb g() {
        a((c) k.INSENSITIVE);
        return this;
    }

    public OCb h() {
        a((c) k.SENSITIVE);
        return this;
    }

    public OCb i() {
        a((c) k.LENIENT);
        return this;
    }

    public JCb j() {
        return a(Locale.getDefault());
    }

    /* JADX WARNING: Removed duplicated region for block: B:160:0x0064 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005f  */
    private void c(String str) {
        int i2;
        int i3 = 0;
        while (i3 < str.length()) {
            char charAt = str.charAt(i3);
            if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                String str2 = "'";
                if (charAt == '\'') {
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (i5 < str.length()) {
                        if (str.charAt(i5) == '\'') {
                            int i6 = i5 + 1;
                            if (i6 >= str.length() || str.charAt(i6) != '\'') {
                                break;
                            }
                            i5 = i6;
                        }
                        i5++;
                    }
                    if (i5 < str.length()) {
                        String substring = str.substring(i4, i5);
                        if (substring.length() == 0) {
                            a('\'');
                        } else {
                            a(substring.replace("''", str2));
                        }
                        i3 = i5;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Pattern ends with an incomplete string literal: ");
                        sb.append(str);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else if (charAt == '[') {
                    f();
                } else if (charAt == ']') {
                    if (this.d.e != null) {
                        e();
                    } else {
                        throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                    }
                } else if (charAt == '{' || charAt == '}' || charAt == '#') {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Pattern includes reserved character: '");
                    sb2.append(charAt);
                    sb2.append(str2);
                    throw new IllegalArgumentException(sb2.toString());
                } else {
                    a(charAt);
                }
            } else {
                int i7 = i3 + 1;
                while (i7 < str.length() && str.charAt(i7) == charAt) {
                    i7++;
                }
                int i8 = i7 - i3;
                if (charAt == 'p') {
                    if (i7 < str.length()) {
                        charAt = str.charAt(i7);
                        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                            int i9 = i7 + 1;
                            while (i9 < str.length() && str.charAt(i9) == charAt) {
                                i9++;
                            }
                            i2 = i9 - i7;
                            i7 = i9;
                            if (i8 == 0) {
                                a(i8);
                                i8 = i2;
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Pad letter 'p' must be followed by valid pad pattern: ");
                                sb3.append(str);
                                throw new IllegalArgumentException(sb3.toString());
                            }
                        }
                    }
                    i2 = i8;
                    i8 = 0;
                    if (i8 == 0) {
                    }
                }
                C7381tDb tdb = (C7381tDb) b.get(Character.valueOf(charAt));
                if (tdb != null) {
                    a(charAt, i8, tdb);
                } else {
                    String str3 = "Too many pattern letters: ";
                    if (charAt == 'z') {
                        if (i8 > 4) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(str3);
                            sb4.append(charAt);
                            throw new IllegalArgumentException(sb4.toString());
                        } else if (i8 == 4) {
                            b(C5555aDb.FULL);
                        } else {
                            b(C5555aDb.SHORT);
                        }
                    } else if (charAt != 'V') {
                        String str4 = "Z";
                        String str5 = "+0000";
                        if (charAt == 'Z') {
                            if (i8 < 4) {
                                a("+HHMM", str5);
                            } else if (i8 == 4) {
                                a(C5555aDb.FULL);
                            } else if (i8 == 5) {
                                a("+HH:MM:ss", str4);
                            } else {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(str3);
                                sb5.append(charAt);
                                throw new IllegalArgumentException(sb5.toString());
                            }
                        } else if (charAt == 'O') {
                            if (i8 == 1) {
                                a(C5555aDb.SHORT);
                            } else if (i8 == 4) {
                                a(C5555aDb.FULL);
                            } else {
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("Pattern letter count must be 1 or 4: ");
                                sb6.append(charAt);
                                throw new IllegalArgumentException(sb6.toString());
                            }
                        } else if (charAt == 'X') {
                            if (i8 <= 5) {
                                a(h.a[i8 + (i8 == 1 ? 0 : 1)], str4);
                            } else {
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append(str3);
                                sb7.append(charAt);
                                throw new IllegalArgumentException(sb7.toString());
                            }
                        } else if (charAt == 'x') {
                            if (i8 <= 5) {
                                if (i8 == 1) {
                                    str5 = "+00";
                                } else if (i8 % 2 != 0) {
                                    str5 = "+00:00";
                                }
                                a(h.a[i8 + (i8 == 1 ? 0 : 1)], str5);
                            } else {
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append(str3);
                                sb8.append(charAt);
                                throw new IllegalArgumentException(sb8.toString());
                            }
                        } else if (charAt == 'W') {
                            if (i8 <= 1) {
                                a((c) new n('W', i8));
                            } else {
                                StringBuilder sb9 = new StringBuilder();
                                sb9.append(str3);
                                sb9.append(charAt);
                                throw new IllegalArgumentException(sb9.toString());
                            }
                        } else if (charAt == 'w') {
                            if (i8 <= 2) {
                                a((c) new n('w', i8));
                            } else {
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append(str3);
                                sb10.append(charAt);
                                throw new IllegalArgumentException(sb10.toString());
                            }
                        } else if (charAt == 'Y') {
                            a((c) new n('Y', i8));
                        } else {
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append("Unknown pattern letter: ");
                            sb11.append(charAt);
                            throw new IllegalArgumentException(sb11.toString());
                        }
                    } else if (i8 == 2) {
                        c();
                    } else {
                        StringBuilder sb12 = new StringBuilder();
                        sb12.append("Pattern letter count must be 2: ");
                        sb12.append(charAt);
                        throw new IllegalArgumentException(sb12.toString());
                    }
                }
                i3 = i7 - 1;
            }
            i3++;
        }
    }

    public OCb b(C5555aDb adb) {
        a((c) new p(adb));
        return this;
    }

    public OCb a(C7381tDb tdb, int i2) {
        C6355eDb.a(tdb, "field");
        if (i2 < 1 || i2 > 19) {
            StringBuilder sb = new StringBuilder();
            sb.append("The width must be from 1 to 19 inclusive but was ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        a(new g(tdb, i2, i2, YCb.NOT_NEGATIVE));
        return this;
    }

    public OCb b(String str) {
        C6355eDb.a(str, "pattern");
        c(str);
        return this;
    }

    private OCb(OCb oCb, boolean z) {
        this.d = this;
        this.f = new ArrayList();
        this.j = -1;
        this.e = oCb;
        this.g = z;
    }

    public OCb a(C7381tDb tdb, int i2, int i3, YCb yCb) {
        if (i2 == i3 && yCb == YCb.NOT_NEGATIVE) {
            a(tdb, i3);
            return this;
        }
        C6355eDb.a(tdb, "field");
        C6355eDb.a(yCb, "signStyle");
        if (i2 < 1 || i2 > 19) {
            StringBuilder sb = new StringBuilder();
            sb.append("The minimum width must be from 1 to 19 inclusive but was ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i3 < 1 || i3 > 19) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The maximum width must be from 1 to 19 inclusive but was ");
            sb2.append(i3);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i3 >= i2) {
            a(new g(tdb, i2, i3, yCb));
            return this;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("The maximum width must exceed or equal the minimum width but ");
            sb3.append(i3);
            sb3.append(" < ");
            sb3.append(i2);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public OCb a(C7381tDb tdb, int i2, int i3, XBb xBb) {
        C6355eDb.a(tdb, "field");
        C6355eDb.a(xBb, "baseDate");
        j jVar = new j(tdb, i2, i3, 0, xBb);
        a((g) jVar);
        return this;
    }

    private OCb a(g gVar) {
        g gVar2;
        OCb oCb = this.d;
        int i2 = oCb.j;
        if (i2 < 0 || !(oCb.f.get(i2) instanceof g)) {
            this.d.j = a((c) gVar);
        } else {
            OCb oCb2 = this.d;
            int i3 = oCb2.j;
            g gVar3 = (g) oCb2.f.get(i3);
            int i4 = gVar.c;
            int i5 = gVar.d;
            if (i4 == i5 && gVar.e == YCb.NOT_NEGATIVE) {
                gVar2 = gVar3.a(i5);
                a((c) gVar.a());
                this.d.j = i3;
            } else {
                gVar2 = gVar3.a();
                this.d.j = a((c) gVar);
            }
            this.d.f.set(i3, gVar2);
        }
        return this;
    }

    public OCb a(C7381tDb tdb, int i2, int i3, boolean z) {
        a((c) new d(tdb, i2, i3, z));
        return this;
    }

    public OCb a(C7381tDb tdb, C5555aDb adb) {
        C6355eDb.a(tdb, "field");
        C6355eDb.a(adb, "textStyle");
        a((c) new m(tdb, adb, VCb.b()));
        return this;
    }

    public OCb a(C7381tDb tdb, Map<Long, String> map) {
        C6355eDb.a(tdb, "field");
        C6355eDb.a(map, "textLookup");
        a((c) new m(tdb, C5555aDb.FULL, new LCb(this, new a(Collections.singletonMap(C5555aDb.FULL, new LinkedHashMap(map))))));
        return this;
    }

    public OCb a() {
        a((c) new e(-2));
        return this;
    }

    public OCb a(String str, String str2) {
        a((c) new h(str2, str));
        return this;
    }

    public OCb a(C5555aDb adb) {
        C6355eDb.a(adb, "style");
        if (adb == C5555aDb.FULL || adb == C5555aDb.SHORT) {
            a((c) new f(adb));
            return this;
        }
        throw new IllegalArgumentException("Style must be either full or short");
    }

    public OCb a(char c2) {
        a((c) new a(c2));
        return this;
    }

    public OCb a(String str) {
        C6355eDb.a(str, "literal");
        if (str.length() > 0) {
            if (str.length() == 1) {
                a((c) new a(str.charAt(0)));
            } else {
                a((c) new l(str));
            }
        }
        return this;
    }

    public OCb a(JCb jCb) {
        C6355eDb.a(jCb, "formatter");
        a((c) jCb.a(false));
        return this;
    }

    private void a(char c2, int i2, C7381tDb tdb) {
        String str = "Too many pattern letters: ";
        if (c2 != 'Q') {
            if (c2 == 'S') {
                a((C7381tDb) C6423fDb.NANO_OF_SECOND, i2, i2, false);
                return;
            } else if (c2 != 'a') {
                if (!(c2 == 'h' || c2 == 'k' || c2 == 'm')) {
                    if (c2 != 'q') {
                        if (c2 != 's') {
                            if (c2 != 'u' && c2 != 'y') {
                                switch (c2) {
                                    case 'D':
                                        if (i2 == 1) {
                                            a(tdb);
                                            return;
                                        } else if (i2 <= 3) {
                                            a(tdb, i2);
                                            return;
                                        } else {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(str);
                                            sb.append(c2);
                                            throw new IllegalArgumentException(sb.toString());
                                        }
                                    case 'E':
                                    case 'G':
                                        if (i2 == 1 || i2 == 2 || i2 == 3) {
                                            a(tdb, C5555aDb.SHORT);
                                            return;
                                        } else if (i2 == 4) {
                                            a(tdb, C5555aDb.FULL);
                                            return;
                                        } else if (i2 == 5) {
                                            a(tdb, C5555aDb.NARROW);
                                            return;
                                        } else {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(str);
                                            sb2.append(c2);
                                            throw new IllegalArgumentException(sb2.toString());
                                        }
                                    case 'F':
                                        if (i2 == 1) {
                                            a(tdb);
                                            return;
                                        }
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(str);
                                        sb3.append(c2);
                                        throw new IllegalArgumentException(sb3.toString());
                                    case 'H':
                                        break;
                                    default:
                                        switch (c2) {
                                            case 'K':
                                                break;
                                            case 'L':
                                                break;
                                            case 'M':
                                                break;
                                            default:
                                                switch (c2) {
                                                    case 'c':
                                                        if (i2 == 1) {
                                                            a((c) new n('c', i2));
                                                            return;
                                                        } else if (i2 == 2) {
                                                            StringBuilder sb4 = new StringBuilder();
                                                            sb4.append("Invalid number of pattern letters: ");
                                                            sb4.append(c2);
                                                            throw new IllegalArgumentException(sb4.toString());
                                                        } else if (i2 == 3) {
                                                            a(tdb, C5555aDb.SHORT_STANDALONE);
                                                            return;
                                                        } else if (i2 == 4) {
                                                            a(tdb, C5555aDb.FULL_STANDALONE);
                                                            return;
                                                        } else if (i2 == 5) {
                                                            a(tdb, C5555aDb.NARROW_STANDALONE);
                                                            return;
                                                        } else {
                                                            StringBuilder sb5 = new StringBuilder();
                                                            sb5.append(str);
                                                            sb5.append(c2);
                                                            throw new IllegalArgumentException(sb5.toString());
                                                        }
                                                    case 'd':
                                                        break;
                                                    case 'e':
                                                        if (i2 == 1 || i2 == 2) {
                                                            a((c) new n('e', i2));
                                                            return;
                                                        } else if (i2 == 3) {
                                                            a(tdb, C5555aDb.SHORT);
                                                            return;
                                                        } else if (i2 == 4) {
                                                            a(tdb, C5555aDb.FULL);
                                                            return;
                                                        } else if (i2 == 5) {
                                                            a(tdb, C5555aDb.NARROW);
                                                            return;
                                                        } else {
                                                            StringBuilder sb6 = new StringBuilder();
                                                            sb6.append(str);
                                                            sb6.append(c2);
                                                            throw new IllegalArgumentException(sb6.toString());
                                                        }
                                                    default:
                                                        if (i2 == 1) {
                                                            a(tdb);
                                                            return;
                                                        } else {
                                                            a(tdb, i2);
                                                            return;
                                                        }
                                                }
                                        }
                                }
                            } else if (i2 == 2) {
                                a(tdb, 2, 2, (XBb) j.g);
                                return;
                            } else if (i2 < 4) {
                                a(tdb, i2, 19, YCb.NORMAL);
                                return;
                            } else {
                                a(tdb, i2, 19, YCb.EXCEEDS_PAD);
                                return;
                            }
                        }
                    }
                    if (i2 == 1) {
                        a(tdb);
                        return;
                    } else if (i2 == 2) {
                        a(tdb, 2);
                        return;
                    } else if (i2 == 3) {
                        a(tdb, C5555aDb.SHORT_STANDALONE);
                        return;
                    } else if (i2 == 4) {
                        a(tdb, C5555aDb.FULL_STANDALONE);
                        return;
                    } else if (i2 == 5) {
                        a(tdb, C5555aDb.NARROW_STANDALONE);
                        return;
                    } else {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(str);
                        sb7.append(c2);
                        throw new IllegalArgumentException(sb7.toString());
                    }
                }
                if (i2 == 1) {
                    a(tdb);
                    return;
                } else if (i2 == 2) {
                    a(tdb, i2);
                    return;
                } else {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(str);
                    sb8.append(c2);
                    throw new IllegalArgumentException(sb8.toString());
                }
            } else if (i2 == 1) {
                a(tdb, C5555aDb.SHORT);
                return;
            } else {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(c2);
                throw new IllegalArgumentException(sb9.toString());
            }
        }
        if (i2 == 1) {
            a(tdb);
        } else if (i2 == 2) {
            a(tdb, 2);
        } else if (i2 == 3) {
            a(tdb, C5555aDb.SHORT);
        } else if (i2 == 4) {
            a(tdb, C5555aDb.FULL);
        } else if (i2 == 5) {
            a(tdb, C5555aDb.NARROW);
        } else {
            StringBuilder sb10 = new StringBuilder();
            sb10.append(str);
            sb10.append(c2);
            throw new IllegalArgumentException(sb10.toString());
        }
    }

    public OCb a(int i2) {
        a(i2, ' ');
        return this;
    }

    public OCb a(int i2, char c2) {
        if (i2 >= 1) {
            OCb oCb = this.d;
            oCb.h = i2;
            oCb.i = c2;
            oCb.j = -1;
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The pad width must be at least one but was ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    private int a(c cVar) {
        C6355eDb.a(cVar, "pp");
        OCb oCb = this.d;
        int i2 = oCb.h;
        if (i2 > 0) {
            if (cVar != null) {
                cVar = new i(cVar, i2, oCb.i);
            }
            OCb oCb2 = this.d;
            oCb2.h = 0;
            oCb2.i = 0;
        }
        this.d.f.add(cVar);
        OCb oCb3 = this.d;
        oCb3.j = -1;
        return oCb3.f.size() - 1;
    }

    public JCb a(Locale locale) {
        C6355eDb.a(locale, "locale");
        while (this.d.e != null) {
            e();
        }
        JCb jCb = new JCb(new b(this.f, false), locale, WCb.a, XCb.SMART, null, null, null);
        return jCb;
    }

    /* access modifiers changed from: 0000 */
    public JCb a(XCb xCb) {
        return j().a(xCb);
    }
}
