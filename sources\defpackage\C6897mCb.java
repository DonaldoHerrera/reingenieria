package defpackage;

import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.text.ParseException;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: mCb reason: default package and case insensitive filesystem */
/* compiled from: HijrahDate */
public final class C6897mCb extends VBb<C6897mCb> implements Serializable {
    private static final int[] b = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};
    private static final int[] c = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};
    private static final int[] d = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29};
    private static final int[] e = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30};
    private static final int[] f = {0, 1, 0, 1, 0, 1, 1};
    private static final int[] g = {1, 9999, 11, 51, 5, 29, 354};
    private static final int[] h = {1, 9999, 11, 52, 6, 30, 355};
    private static final int[] i = {0, 354, 709, 1063, 1417, 1772, 2126, 2481, 2835, 3189, 3544, 3898, 4252, 4607, 4961, 5315, 5670, 6024, 6379, 6733, 7087, 7442, 7796, 8150, 8505, 8859, 9214, 9568, 9922, 10277};
    private static final char j = File.separatorChar;
    private static final String k = File.pathSeparator;
    private static final String l;
    private static final HashMap<Integer, Integer[]> m = new HashMap<>();
    private static final HashMap<Integer, Integer[]> n = new HashMap<>();
    private static final HashMap<Integer, Integer[]> o = new HashMap<>();
    private static final Long[] p = new Long[334];
    private static final Integer[] q = new Integer[f.length];
    private static final Integer[] r = new Integer[g.length];
    private static final Integer[] s = new Integer[h.length];
    private static final Integer[] t = new Integer[b.length];
    private static final Integer[] u = new Integer[c.length];
    private static final Integer[] v = new Integer[d.length];
    private static final Integer[] w = new Integer[e.length];
    private static final Integer[] x = new Integer[i.length];
    private final transient int A;
    private final transient int B;
    private final transient int C;
    private final transient C6351eBb D;
    private final long E;
    private final transient boolean F = isLeapYear((long) this.z);
    private final transient C6965nCb y;
    private final transient int z;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("org");
        sb.append(j);
        sb.append("threeten");
        sb.append(j);
        sb.append("bp");
        sb.append(j);
        sb.append("chrono");
        l = sb.toString();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = b;
            if (i3 >= iArr.length) {
                break;
            }
            t[i3] = Integer.valueOf(iArr[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            int[] iArr2 = c;
            if (i4 >= iArr2.length) {
                break;
            }
            u[i4] = Integer.valueOf(iArr2[i4]);
            i4++;
        }
        int i5 = 0;
        while (true) {
            int[] iArr3 = d;
            if (i5 >= iArr3.length) {
                break;
            }
            v[i5] = Integer.valueOf(iArr3[i5]);
            i5++;
        }
        int i6 = 0;
        while (true) {
            int[] iArr4 = e;
            if (i6 >= iArr4.length) {
                break;
            }
            w[i6] = Integer.valueOf(iArr4[i6]);
            i6++;
        }
        int i7 = 0;
        while (true) {
            int[] iArr5 = i;
            if (i7 >= iArr5.length) {
                break;
            }
            x[i7] = Integer.valueOf(iArr5[i7]);
            i7++;
        }
        int i8 = 0;
        while (true) {
            Long[] lArr = p;
            if (i8 >= lArr.length) {
                break;
            }
            lArr[i8] = Long.valueOf((long) (i8 * 10631));
            i8++;
        }
        int i9 = 0;
        while (true) {
            int[] iArr6 = f;
            if (i9 >= iArr6.length) {
                break;
            }
            q[i9] = Integer.valueOf(iArr6[i9]);
            i9++;
        }
        int i10 = 0;
        while (true) {
            int[] iArr7 = g;
            if (i10 >= iArr7.length) {
                break;
            }
            r[i10] = Integer.valueOf(iArr7[i10]);
            i10++;
        }
        while (true) {
            int[] iArr8 = h;
            if (i2 < iArr8.length) {
                s[i2] = Integer.valueOf(iArr8[i2]);
                i2++;
            } else {
                try {
                    M();
                    return;
                } catch (IOException | ParseException unused) {
                    return;
                }
            }
        }
    }

    private C6897mCb(long j2) {
        int[] f2 = f(j2);
        e(f2[1]);
        d(f2[2]);
        b(f2[3]);
        c(f2[4]);
        this.y = C6965nCb.a(f2[0]);
        this.z = f2[1];
        this.A = f2[2];
        this.B = f2[3];
        this.C = f2[4];
        this.D = C6351eBb.a(f2[5]);
        this.E = j2;
    }

    static int J() {
        return s[5].intValue();
    }

    static int K() {
        return s[6].intValue();
    }

    private static InputStream L() throws IOException {
        ZipFile zipFile;
        String property = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigFile");
        if (property == null) {
            property = "hijrah_deviation.cfg";
        }
        String property2 = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigDir");
        if (property2 != null) {
            String str = "file.separator";
            if (property2.length() != 0 || !property2.endsWith(System.getProperty(str))) {
                StringBuilder sb = new StringBuilder();
                sb.append(property2);
                sb.append(System.getProperty(str));
                property2 = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(property2);
            sb2.append(j);
            sb2.append(property);
            File file = new File(sb2.toString());
            if (!file.exists()) {
                return null;
            }
            try {
                return new FileInputStream(file);
            } catch (IOException e2) {
                throw e2;
            }
        } else {
            StringTokenizer stringTokenizer = new StringTokenizer(System.getProperty("java.class.path"), k);
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                File file2 = new File(nextToken);
                if (file2.exists()) {
                    if (file2.isDirectory()) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(nextToken);
                        sb3.append(j);
                        sb3.append(l);
                        if (new File(sb3.toString(), property).exists()) {
                            try {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(nextToken);
                                sb4.append(j);
                                sb4.append(l);
                                sb4.append(j);
                                sb4.append(property);
                                return new FileInputStream(sb4.toString());
                            } catch (IOException e3) {
                                throw e3;
                            }
                        }
                    } else {
                        try {
                            zipFile = new ZipFile(file2);
                        } catch (IOException unused) {
                            zipFile = null;
                        }
                        if (zipFile != null) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(l);
                            sb5.append(j);
                            sb5.append(property);
                            String sb6 = sb5.toString();
                            ZipEntry entry = zipFile.getEntry(sb6);
                            if (entry == null) {
                                char c2 = j;
                                if (c2 == '/') {
                                    sb6 = sb6.replace('/', '\\');
                                } else if (c2 == '\\') {
                                    sb6 = sb6.replace('\\', '/');
                                }
                                entry = zipFile.getEntry(sb6);
                            }
                            if (entry != null) {
                                try {
                                    return zipFile.getInputStream(entry);
                                } catch (IOException e4) {
                                    throw e4;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    private static void M() throws IOException, ParseException {
        InputStream L = L();
        if (L != null) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(L));
                int i2 = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            i2++;
                            a(readLine.trim(), i2);
                        } else {
                            bufferedReader2.close();
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader != null) {
                }
                throw th;
            }
        }
    }

    private static void d(int i2) {
        if (i2 < 1 || i2 > 12) {
            throw new C5687cBb("Invalid month of Hijrah date");
        }
    }

    private static void e(int i2) {
        if (i2 < 1 || i2 > 9999) {
            throw new C5687cBb("Invalid year of Hijrah Era");
        }
    }

    private static int[] f(long j2) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j3 = j2 - -492148;
        if (j3 >= 0) {
            int e2 = e(j3);
            int a = a(j3, e2);
            int a2 = a(e2, (long) a);
            i5 = c(e2, a, a2);
            i6 = (e2 * 30) + a2 + 1;
            i4 = c(i5, i6);
            i3 = b(i5, i4, i6) + 1;
            i2 = C6965nCb.AH.getValue();
        } else {
            int i7 = (int) j3;
            int i8 = i7 / 10631;
            int i9 = i7 % 10631;
            if (i9 == 0) {
                i9 = -10631;
                i8++;
            }
            int a3 = a(i8, (long) i9);
            int c2 = c(i8, i9, a3);
            int i10 = 1 - ((i8 * 30) - a3);
            int i11 = isLeapYear((long) i10) ? c2 + 355 : c2 + 354;
            i4 = c(i11, i10);
            i3 = b(i11, i4, i10) + 1;
            i2 = C6965nCb.BEFORE_AH.getValue();
            int i12 = i10;
            i5 = i11;
            i6 = i12;
        }
        int i13 = (int) ((j3 + 5) % 7);
        return new int[]{i2, i6, i4 + 1, i3, i5 + 1, i13 + (i13 <= 0 ? 7 : 0)};
    }

    private static Integer[] g(int i2) {
        Integer[] numArr;
        try {
            numArr = (Integer[]) m.get(Integer.valueOf(i2));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr != null) {
            return numArr;
        }
        if (isLeapYear((long) i2)) {
            return u;
        }
        return t;
    }

    private static Integer[] h(int i2) {
        Integer[] numArr;
        try {
            numArr = (Integer[]) n.get(Integer.valueOf(i2));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr != null) {
            return numArr;
        }
        if (isLeapYear((long) i2)) {
            return w;
        }
        return v;
    }

    private static long i(int i2) {
        Long l2;
        int i3 = i2 - 1;
        int i4 = i3 / 30;
        int i5 = i3 % 30;
        int intValue = f(i4)[Math.abs(i5)].intValue();
        if (i5 < 0) {
            intValue = -intValue;
        }
        try {
            l2 = p[i4];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l2 = null;
        }
        if (l2 == null) {
            l2 = Long.valueOf((long) (i4 * 10631));
        }
        return ((l2.longValue() + ((long) intValue)) - 492148) - 1;
    }

    static boolean isLeapYear(long j2) {
        if (j2 <= 0) {
            j2 = -j2;
        }
        return ((j2 * 11) + 14) % 30 < 11;
    }

    private Object readResolve() {
        return new C6897mCb(this.E);
    }

    private Object writeReplace() {
        return new ACb(3, this);
    }

    public int lengthOfMonth() {
        return a(this.A - 1, this.z);
    }

    public int lengthOfYear() {
        return a(this.z);
    }

    public long toEpochDay() {
        return d(this.z, this.A, this.B);
    }

    private static void c(int i2) {
        if (i2 < 1 || i2 > K()) {
            throw new C5687cBb("Invalid day of year of Hijrah date");
        }
    }

    static C6897mCb d(long j2) {
        return new C6897mCb(j2);
    }

    private static C6897mCb e(int i2, int i3, int i4) {
        int b2 = b(i3 - 1, i2);
        if (i4 > b2) {
            i4 = b2;
        }
        return a(i2, i3, i4);
    }

    public C6761kCb getChronology() {
        return C6761kCb.e;
    }

    public C6965nCb getEra() {
        return this.y;
    }

    public long d(C7381tDb tdb) {
        int i2;
        int i3;
        if (!(tdb instanceof C6423fDb)) {
            return tdb.c(this);
        }
        switch (C6829lCb.a[((C6423fDb) tdb).ordinal()]) {
            case 1:
                i2 = this.B;
                break;
            case 2:
                i2 = this.C;
                break;
            case 3:
                i3 = (this.B - 1) / 7;
                break;
            case 4:
                i2 = this.z;
                break;
            case 5:
                i2 = this.D.getValue();
                break;
            case 6:
                i3 = (this.B - 1) % 7;
                break;
            case 7:
                i3 = (this.C - 1) % 7;
                break;
            case 8:
                return toEpochDay();
            case 9:
                i3 = (this.C - 1) / 7;
                break;
            case 10:
                i2 = this.A;
                break;
            case 11:
                i2 = this.z;
                break;
            case 12:
                i2 = this.y.getValue();
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported field: ");
                sb.append(tdb);
                throw new EDb(sb.toString());
        }
        i2 = i3 + 1;
        return (long) i2;
    }

    private static int e(long j2) {
        int i2;
        Long[] lArr = p;
        int i3 = 0;
        while (i3 < lArr.length) {
            try {
                if (j2 < lArr[i3].longValue()) {
                    return i3 - 1;
                }
                i3++;
            } catch (ArrayIndexOutOfBoundsException unused) {
                i2 = ((int) j2) / 10631;
            }
        }
        i2 = ((int) j2) / 10631;
        return i2;
    }

    /* access modifiers changed from: 0000 */
    public C6897mCb c(long j2) {
        if (j2 == 0) {
            return this;
        }
        return a(this.y, C6355eDb.d(this.z, (int) j2), this.A, this.B);
    }

    private static void b(int i2) {
        if (i2 < 1 || i2 > J()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid day of month of Hijrah date, day ");
            sb.append(i2);
            sb.append(" greater than ");
            sb.append(J());
            sb.append(" or less than 1");
            throw new C5687cBb(sb.toString());
        }
    }

    private static int c(int i2, int i3, int i4) {
        Integer[] f2 = f(i2);
        if (i3 > 0) {
            return i3 - f2[i4].intValue();
        }
        return f2[i4].intValue() + i3;
    }

    public C6897mCb b(long j2, DDb dDb) {
        return (C6897mCb) super.b(j2, dDb);
    }

    public static C6897mCb a(int i2, int i3, int i4) {
        if (i2 >= 1) {
            return a(C6965nCb.AH, i2, i3, i4);
        }
        return a(C6965nCb.BEFORE_AH, 1 - i2, i3, i4);
    }

    private static int c(int i2, int i3) {
        Integer[] g2 = g(i3);
        int i4 = 0;
        if (i2 >= 0) {
            while (i4 < g2.length) {
                if (i2 < g2[i4].intValue()) {
                    return i4 - 1;
                }
                i4++;
            }
            return 11;
        }
        int i5 = isLeapYear((long) i3) ? i2 + 355 : i2 + 354;
        while (i4 < g2.length) {
            if (i5 < g2[i4].intValue()) {
                return i4 - 1;
            }
            i4++;
        }
        return 11;
    }

    /* access modifiers changed from: 0000 */
    public C6897mCb b(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i2 = (this.A - 1) + ((int) j2);
        int i3 = i2 / 12;
        int i4 = i2 % 12;
        while (i4 < 0) {
            i4 += 12;
            i3 = C6355eDb.e(i3, 1);
        }
        return a(this.y, C6355eDb.d(this.z, i3), i4 + 1, this.B);
    }

    static C6897mCb a(C6965nCb ncb, int i2, int i3, int i4) {
        C6355eDb.a(ncb, "era");
        e(i2);
        d(i3);
        b(i4);
        return new C6897mCb(d(ncb.b(i2), i3, i4));
    }

    private static int b(int i2, int i3, int i4) {
        int intValue;
        Integer[] g2 = g(i4);
        if (i2 >= 0) {
            if (i3 > 0) {
                intValue = g2[i3].intValue();
            }
            return i2;
        }
        i2 = isLeapYear((long) i4) ? i2 + 355 : i2 + 354;
        if (i3 <= 0) {
            return i2;
        }
        intValue = g2[i3].intValue();
        i2 -= intValue;
        return i2;
    }

    public FDb a(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return tdb.b(this);
        }
        if (b(tdb)) {
            C6423fDb fdb = (C6423fDb) tdb;
            int i2 = C6829lCb.a[fdb.ordinal()];
            if (i2 == 1) {
                return FDb.a(1, (long) lengthOfMonth());
            }
            if (i2 == 2) {
                return FDb.a(1, (long) lengthOfYear());
            }
            if (i2 == 3) {
                return FDb.a(1, 5);
            }
            if (i2 != 4) {
                return getChronology().a(fdb);
            }
            return FDb.a(1, 1000);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(tdb);
        throw new EDb(sb.toString());
    }

    private static Integer[] f(int i2) {
        Integer[] numArr;
        try {
            numArr = (Integer[]) o.get(Integer.valueOf(i2));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? x : numArr;
    }

    private static int b(int i2, int i3) {
        return g(i3)[i2].intValue();
    }

    private static long d(int i2, int i3, int i4) {
        return i(i2) + ((long) b(i3 - 1, i2)) + ((long) i4);
    }

    public C6897mCb a(C7105pDb pdb) {
        return (C6897mCb) super.a(pdb);
    }

    public C6897mCb a(C7381tDb tdb, long j2) {
        if (!(tdb instanceof C6423fDb)) {
            return (C6897mCb) tdb.a(this, j2);
        }
        C6423fDb fdb = (C6423fDb) tdb;
        fdb.b(j2);
        int i2 = (int) j2;
        switch (C6829lCb.a[fdb.ordinal()]) {
            case 1:
                return e(this.z, this.A, i2);
            case 2:
                int i3 = i2 - 1;
                return e(this.z, (i3 / 30) + 1, (i3 % 30) + 1);
            case 3:
                return a((j2 - d((C7381tDb) C6423fDb.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                if (this.z < 1) {
                    i2 = 1 - i2;
                }
                return e(i2, this.A, this.B);
            case 5:
                return a(j2 - ((long) this.D.getValue()));
            case 6:
                return a(j2 - d((C7381tDb) C6423fDb.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return a(j2 - d((C7381tDb) C6423fDb.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return new C6897mCb((long) i2);
            case 9:
                return a((j2 - d((C7381tDb) C6423fDb.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 10:
                return e(this.z, i2, this.B);
            case 11:
                return e(i2, this.A, this.B);
            case 12:
                return e(1 - this.z, this.A, this.B);
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported field: ");
                sb.append(tdb);
                throw new EDb(sb.toString());
        }
    }

    public C6897mCb a(C7312sDb sdb) {
        return (C6897mCb) super.a(sdb);
    }

    public C6897mCb a(long j2, DDb dDb) {
        return (C6897mCb) super.a(j2, dDb);
    }

    public final ZBb<C6897mCb> a(C7239rBb rbb) {
        return super.a(rbb);
    }

    /* access modifiers changed from: 0000 */
    public C6897mCb a(long j2) {
        return new C6897mCb(this.E + j2);
    }

    private static int a(long j2, int i2) {
        Long l2;
        try {
            l2 = p[i2];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l2 = null;
        }
        if (l2 == null) {
            l2 = Long.valueOf((long) (i2 * 10631));
        }
        return (int) (j2 - l2.longValue());
    }

    private static int a(int i2, long j2) {
        Integer[] f2 = f(i2);
        int i3 = 0;
        int i4 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i4 == 0) {
            return 0;
        }
        if (i4 > 0) {
            while (i3 < f2.length) {
                if (j2 < ((long) f2[i3].intValue())) {
                    return i3 - 1;
                }
                i3++;
            }
            return 29;
        }
        long j3 = -j2;
        while (i3 < f2.length) {
            if (j3 <= ((long) f2[i3].intValue())) {
                return i3 - 1;
            }
            i3++;
        }
        return 29;
    }

    static int a(int i2, int i3) {
        return h(i3)[i2].intValue();
    }

    static int a(int i2) {
        Integer[] numArr;
        int intValue;
        int intValue2;
        int i3 = i2 - 1;
        int i4 = i3 / 30;
        try {
            numArr = (Integer[]) o.get(Integer.valueOf(i4));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr != null) {
            int i5 = i3 % 30;
            if (i5 == 29) {
                intValue = p[i4 + 1].intValue() - p[i4].intValue();
                intValue2 = numArr[i5].intValue();
            } else {
                intValue = numArr[i5 + 1].intValue();
                intValue2 = numArr[i5].intValue();
            }
            return intValue - intValue2;
        }
        return isLeapYear((long) i2) ? 355 : 354;
    }

    private static void a(int i2, int i3, int i4, int i5, int i6) {
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        int i10 = i5;
        int i11 = i6;
        if (i7 < 1) {
            throw new IllegalArgumentException("startYear < 1");
        } else if (i9 < 1) {
            throw new IllegalArgumentException("endYear < 1");
        } else if (i8 < 0 || i8 > 11) {
            throw new IllegalArgumentException("startMonth < 0 || startMonth > 11");
        } else if (i10 < 0 || i10 > 11) {
            throw new IllegalArgumentException("endMonth < 0 || endMonth > 11");
        } else if (i9 > 9999) {
            throw new IllegalArgumentException("endYear > 9999");
        } else if (i9 < i7) {
            throw new IllegalArgumentException("startYear > endYear");
        } else if (i9 != i7 || i10 >= i8) {
            boolean isLeapYear = isLeapYear((long) i7);
            Integer[] numArr = (Integer[]) m.get(Integer.valueOf(i2));
            if (numArr == null) {
                if (!isLeapYear) {
                    numArr = new Integer[b.length];
                    int i12 = 0;
                    while (true) {
                        int[] iArr = b;
                        if (i12 >= iArr.length) {
                            break;
                        }
                        numArr[i12] = Integer.valueOf(iArr[i12]);
                        i12++;
                    }
                } else {
                    numArr = new Integer[c.length];
                    int i13 = 0;
                    while (true) {
                        int[] iArr2 = c;
                        if (i13 >= iArr2.length) {
                            break;
                        }
                        numArr[i13] = Integer.valueOf(iArr2[i13]);
                        i13++;
                    }
                }
            }
            Integer[] numArr2 = new Integer[numArr.length];
            for (int i14 = 0; i14 < 12; i14++) {
                if (i14 > i8) {
                    numArr2[i14] = Integer.valueOf(numArr[i14].intValue() - i11);
                } else {
                    numArr2[i14] = Integer.valueOf(numArr[i14].intValue());
                }
            }
            m.put(Integer.valueOf(i2), numArr2);
            Integer[] numArr3 = (Integer[]) n.get(Integer.valueOf(i2));
            if (numArr3 == null) {
                if (!isLeapYear) {
                    numArr3 = new Integer[d.length];
                    int i15 = 0;
                    while (true) {
                        int[] iArr3 = d;
                        if (i15 >= iArr3.length) {
                            break;
                        }
                        numArr3[i15] = Integer.valueOf(iArr3[i15]);
                        i15++;
                    }
                } else {
                    numArr3 = new Integer[e.length];
                    int i16 = 0;
                    while (true) {
                        int[] iArr4 = e;
                        if (i16 >= iArr4.length) {
                            break;
                        }
                        numArr3[i16] = Integer.valueOf(iArr4[i16]);
                        i16++;
                    }
                }
            }
            Integer[] numArr4 = new Integer[numArr3.length];
            for (int i17 = 0; i17 < 12; i17++) {
                if (i17 == i8) {
                    numArr4[i17] = Integer.valueOf(numArr3[i17].intValue() - i11);
                } else {
                    numArr4[i17] = Integer.valueOf(numArr3[i17].intValue());
                }
            }
            n.put(Integer.valueOf(i2), numArr4);
            if (i7 != i9) {
                int i18 = i7 - 1;
                int i19 = i18 / 30;
                int i20 = i18 % 30;
                Integer[] numArr5 = (Integer[]) o.get(Integer.valueOf(i19));
                if (numArr5 == null) {
                    numArr5 = new Integer[i.length];
                    for (int i21 = 0; i21 < numArr5.length; i21++) {
                        numArr5[i21] = Integer.valueOf(i[i21]);
                    }
                }
                for (int i22 = i20 + 1; i22 < i.length; i22++) {
                    numArr5[i22] = Integer.valueOf(numArr5[i22].intValue() - i11);
                }
                o.put(Integer.valueOf(i19), numArr5);
                int i23 = i9 - 1;
                int i24 = i23 / 30;
                if (i19 != i24) {
                    int i25 = i19 + 1;
                    while (true) {
                        Long[] lArr = p;
                        if (i25 >= lArr.length) {
                            break;
                        }
                        lArr[i25] = Long.valueOf(lArr[i25].longValue() - ((long) i11));
                        i25++;
                    }
                    int i26 = i24 + 1;
                    while (true) {
                        Long[] lArr2 = p;
                        if (i26 >= lArr2.length) {
                            break;
                        }
                        int i27 = i24;
                        lArr2[i26] = Long.valueOf(lArr2[i26].longValue() + ((long) i11));
                        i26++;
                        i24 = i27;
                    }
                }
                int i28 = i24;
                int i29 = i23 % 30;
                Integer[] numArr6 = (Integer[]) o.get(Integer.valueOf(i28));
                if (numArr6 == null) {
                    numArr6 = new Integer[i.length];
                    for (int i30 = 0; i30 < numArr6.length; i30++) {
                        numArr6[i30] = Integer.valueOf(i[i30]);
                    }
                }
                for (int i31 = i29 + 1; i31 < i.length; i31++) {
                    numArr6[i31] = Integer.valueOf(numArr6[i31].intValue() + i11);
                }
                o.put(Integer.valueOf(i28), numArr6);
            }
            boolean isLeapYear2 = isLeapYear((long) i9);
            Integer[] numArr7 = (Integer[]) m.get(Integer.valueOf(i4));
            if (numArr7 == null) {
                if (!isLeapYear2) {
                    numArr7 = new Integer[b.length];
                    int i32 = 0;
                    while (true) {
                        int[] iArr5 = b;
                        if (i32 >= iArr5.length) {
                            break;
                        }
                        numArr7[i32] = Integer.valueOf(iArr5[i32]);
                        i32++;
                    }
                } else {
                    numArr7 = new Integer[c.length];
                    int i33 = 0;
                    while (true) {
                        int[] iArr6 = c;
                        if (i33 >= iArr6.length) {
                            break;
                        }
                        numArr7[i33] = Integer.valueOf(iArr6[i33]);
                        i33++;
                    }
                }
            }
            Integer[] numArr8 = new Integer[numArr7.length];
            for (int i34 = 0; i34 < 12; i34++) {
                if (i34 > i10) {
                    numArr8[i34] = Integer.valueOf(numArr7[i34].intValue() + i11);
                } else {
                    numArr8[i34] = Integer.valueOf(numArr7[i34].intValue());
                }
            }
            m.put(Integer.valueOf(i4), numArr8);
            Integer[] numArr9 = (Integer[]) n.get(Integer.valueOf(i4));
            if (numArr9 == null) {
                if (!isLeapYear2) {
                    numArr9 = new Integer[d.length];
                    int i35 = 0;
                    while (true) {
                        int[] iArr7 = d;
                        if (i35 >= iArr7.length) {
                            break;
                        }
                        numArr9[i35] = Integer.valueOf(iArr7[i35]);
                        i35++;
                    }
                } else {
                    numArr9 = new Integer[e.length];
                    int i36 = 0;
                    while (true) {
                        int[] iArr8 = e;
                        if (i36 >= iArr8.length) {
                            break;
                        }
                        numArr9[i36] = Integer.valueOf(iArr8[i36]);
                        i36++;
                    }
                }
            }
            Integer[] numArr10 = new Integer[numArr9.length];
            for (int i37 = 0; i37 < 12; i37++) {
                if (i37 == i10) {
                    numArr10[i37] = Integer.valueOf(numArr9[i37].intValue() + i11);
                } else {
                    numArr10[i37] = Integer.valueOf(numArr9[i37].intValue());
                }
            }
            n.put(Integer.valueOf(i4), numArr10);
            Integer[] numArr11 = (Integer[]) n.get(Integer.valueOf(i2));
            Integer[] numArr12 = (Integer[]) n.get(Integer.valueOf(i4));
            Integer[] numArr13 = (Integer[]) m.get(Integer.valueOf(i2));
            Integer[] numArr14 = (Integer[]) m.get(Integer.valueOf(i4));
            int intValue = numArr11[i8].intValue();
            int intValue2 = numArr12[i10].intValue();
            int intValue3 = numArr13[11].intValue() + numArr11[11].intValue();
            int intValue4 = numArr14[11].intValue() + numArr12[11].intValue();
            int intValue5 = s[5].intValue();
            int intValue6 = r[5].intValue();
            if (intValue5 < intValue) {
                intValue5 = intValue;
            }
            if (intValue5 < intValue2) {
                intValue5 = intValue2;
            }
            s[5] = Integer.valueOf(intValue5);
            if (intValue6 <= intValue) {
                intValue = intValue6;
            }
            if (intValue > intValue2) {
                intValue = intValue2;
            }
            r[5] = Integer.valueOf(intValue);
            int intValue7 = s[6].intValue();
            int intValue8 = r[6].intValue();
            if (intValue7 < intValue3) {
                intValue7 = intValue3;
            }
            if (intValue7 < intValue4) {
                intValue7 = intValue4;
            }
            s[6] = Integer.valueOf(intValue7);
            if (intValue8 <= intValue3) {
                intValue3 = intValue8;
            }
            if (intValue3 > intValue4) {
                intValue3 = intValue4;
            }
            r[6] = Integer.valueOf(intValue3);
        } else {
            throw new IllegalArgumentException("startYear == endYear && endMonth < startMonth");
        }
    }

    private static void a(String str, int i2) throws ParseException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(58);
            String str2 = ".";
            if (indexOf != -1) {
                try {
                    int parseInt = Integer.parseInt(nextToken.substring(indexOf + 1, nextToken.length()));
                    int indexOf2 = nextToken.indexOf(45);
                    if (indexOf2 != -1) {
                        String substring = nextToken.substring(0, indexOf2);
                        String substring2 = nextToken.substring(indexOf2 + 1, indexOf);
                        int indexOf3 = substring.indexOf(47);
                        int indexOf4 = substring2.indexOf(47);
                        if (indexOf3 != -1) {
                            String substring3 = substring.substring(0, indexOf3);
                            String substring4 = substring.substring(indexOf3 + 1, substring.length());
                            try {
                                int parseInt2 = Integer.parseInt(substring3);
                                try {
                                    int parseInt3 = Integer.parseInt(substring4);
                                    if (indexOf4 != -1) {
                                        String substring5 = substring2.substring(0, indexOf4);
                                        String substring6 = substring2.substring(indexOf4 + 1, substring2.length());
                                        try {
                                            int parseInt4 = Integer.parseInt(substring5);
                                            try {
                                                int parseInt5 = Integer.parseInt(substring6);
                                                if (parseInt2 == -1 || parseInt3 == -1 || parseInt4 == -1 || parseInt5 == -1) {
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("Unknown error at line ");
                                                    sb.append(i2);
                                                    sb.append(str2);
                                                    throw new ParseException(sb.toString(), i2);
                                                }
                                                a(parseInt2, parseInt3, parseInt4, parseInt5, parseInt);
                                            } catch (NumberFormatException unused) {
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("End month is not properly set at line ");
                                                sb2.append(i2);
                                                sb2.append(str2);
                                                throw new ParseException(sb2.toString(), i2);
                                            }
                                        } catch (NumberFormatException unused2) {
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append("End year is not properly set at line ");
                                            sb3.append(i2);
                                            sb3.append(str2);
                                            throw new ParseException(sb3.toString(), i2);
                                        }
                                    } else {
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("End year/month has incorrect format at line ");
                                        sb4.append(i2);
                                        sb4.append(str2);
                                        throw new ParseException(sb4.toString(), i2);
                                    }
                                } catch (NumberFormatException unused3) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("Start month is not properly set at line ");
                                    sb5.append(i2);
                                    sb5.append(str2);
                                    throw new ParseException(sb5.toString(), i2);
                                }
                            } catch (NumberFormatException unused4) {
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("Start year is not properly set at line ");
                                sb6.append(i2);
                                sb6.append(str2);
                                throw new ParseException(sb6.toString(), i2);
                            }
                        } else {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("Start year/month has incorrect format at line ");
                            sb7.append(i2);
                            sb7.append(str2);
                            throw new ParseException(sb7.toString(), i2);
                        }
                    } else {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("Start and end year/month has incorrect format at line ");
                        sb8.append(i2);
                        sb8.append(str2);
                        throw new ParseException(sb8.toString(), i2);
                    }
                } catch (NumberFormatException unused5) {
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append("Offset is not properly set at line ");
                    sb9.append(i2);
                    sb9.append(str2);
                    throw new ParseException(sb9.toString(), i2);
                }
            } else {
                StringBuilder sb10 = new StringBuilder();
                sb10.append("Offset has incorrect format at line ");
                sb10.append(i2);
                sb10.append(str2);
                throw new ParseException(sb10.toString(), i2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(c(C6423fDb.YEAR));
        dataOutput.writeByte(c(C6423fDb.MONTH_OF_YEAR));
        dataOutput.writeByte(c(C6423fDb.DAY_OF_MONTH));
    }

    static XBb a(DataInput dataInput) throws IOException {
        return C6761kCb.e.date(dataInput.readInt(), (int) dataInput.readByte(), (int) dataInput.readByte());
    }
}
