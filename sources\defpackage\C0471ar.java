package defpackage;

import android.annotation.TargetApi;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Parcel;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.exoplayer2.T;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: ar reason: default package and case insensitive filesystem */
/* compiled from: Util */
public final class C0471ar {
    public static final int a = VERSION.SDK_INT;
    public static final String b = Build.DEVICE;
    public static final String c = Build.MANUFACTURER;
    public static final String d = Build.MODEL;
    public static final String e;
    public static final byte[] f = new byte[0];
    private static final Pattern g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
    private static final Pattern h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    private static final Pattern i = Pattern.compile("%([A-Fa-f0-9]{2})");
    private static final int[] j = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        String str = ", ";
        sb.append(str);
        sb.append(d);
        sb.append(str);
        sb.append(c);
        sb.append(str);
        sb.append(a);
        e = sb.toString();
    }

    public static int a(long j2, long j3) {
        int i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        return i2 == 0 ? 0 : 1;
    }

    public static long a(long j2, long j3, long j4) {
        long j5 = j2 + j3;
        return ((j2 ^ j5) & (j3 ^ j5)) < 0 ? j4 : j5;
    }

    public static ComponentName a(Context context, Intent intent) {
        if (a >= 26) {
            return context.startForegroundService(intent);
        }
        return context.startService(intent);
    }

    public static <T> T a(T t) {
        return t;
    }

    public static <T> T[] a(T[] tArr) {
        return tArr;
    }

    public static boolean b(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static int c(int i2) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 2;
        }
        if (i2 != 24) {
            return i2 != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    public static byte[] c(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    public static int d(int i2) {
        switch (i2) {
            case 1:
            case 12:
            case 14:
                return 3;
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 13:
                return 1;
            default:
                return 3;
        }
    }

    public static int d(String str) {
        String g2 = g(str);
        if (g2.endsWith(".mpd")) {
            return 0;
        }
        if (g2.endsWith(".m3u8")) {
            return 2;
        }
        return g2.matches(".*\\.ism(l)?(/manifest(\\(.+\\))?)?") ? 1 : 3;
    }

    public static long d(long j2, long j3, long j4) {
        long j5 = j2 - j3;
        return ((j2 ^ j5) & (j3 ^ j2)) < 0 ? j4 : j5;
    }

    public static ExecutorService e(String str) {
        return Executors.newSingleThreadExecutor(new C1822wq(str));
    }

    public static boolean e(int i2) {
        return i2 == Integer.MIN_VALUE || i2 == 1073741824;
    }

    public static String f(String str) {
        if (str == null) {
            return null;
        }
        try {
            Locale i2 = i(str);
            int length = i2.getLanguage().length();
            String iSO3Language = i2.getISO3Language();
            if (iSO3Language.isEmpty()) {
                return g(str);
            }
            String a2 = a(i2);
            StringBuilder sb = new StringBuilder();
            sb.append(iSO3Language);
            sb.append(a2.substring(length));
            return g(sb.toString());
        } catch (MissingResourceException unused) {
            return g(str);
        }
    }

    public static boolean f(int i2) {
        return i2 == 3 || i2 == 2 || i2 == Integer.MIN_VALUE || i2 == 1073741824 || i2 == 4;
    }

    public static String g(String str) {
        return str == null ? str : str.toLowerCase(Locale.US);
    }

    public static boolean g(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static String h(String str) {
        return str == null ? str : str.toUpperCase(Locale.US);
    }

    private static Locale i(String str) {
        return a >= 21 ? j(str) : new Locale(str);
    }

    @TargetApi(21)
    private static Locale j(String str) {
        return Locale.forLanguageTag(str);
    }

    public static long c(long j2, long j3, long j4) {
        int i2 = (j4 > j3 ? 1 : (j4 == j3 ? 0 : -1));
        if (i2 >= 0 && j4 % j3 == 0) {
            return j2 / (j4 / j3);
        }
        if (i2 < 0 && j3 % j4 == 0) {
            return j2 * (j3 / j4);
        }
        return (long) (((double) j2) * (((double) j3) / ((double) j4)));
    }

    public static String[] b(String str, String str2) {
        return str.split(str2, 2);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static long b(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static <T> T[] a(T[] tArr, int i2) {
        C1852xq.a(i2 <= tArr.length);
        return Arrays.copyOf(tArr, i2);
    }

    public static int b(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j2);
            i2 = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    @TargetApi(24)
    private static String[] d() {
        return a(Resources.getSystem().getConfiguration().getLocales().toLanguageTags(), ",");
    }

    public static Handler a(Looper looper, Callback callback) {
        return new Handler(looper, callback);
    }

    public static boolean c(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static Looper a() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static long b(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(((double) j2) / ((double) f2));
    }

    public static int b(String str) {
        int length = str.length();
        C1852xq.a(length <= 4);
        char c2 = 0;
        for (int i2 = 0; i2 < length; i2++) {
            c2 = (c2 << 8) | str.charAt(i2);
        }
        return c2;
    }

    private static String[] c() {
        if (a >= 24) {
            return d();
        }
        return new String[]{a(Resources.getSystem().getConfiguration().locale)};
    }

    static /* synthetic */ Thread a(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static void a(Zp zp) {
        if (zp != null) {
            try {
                zp.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static String b(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < objArr.length; i2++) {
            sb.append(objArr[i2].getClass().getSimpleName());
            if (i2 < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static String a(byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    public static String a(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, Charset.forName("UTF-8"));
    }

    public static String[] a(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static int a(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static int b(int i2, int i3) {
        if (i2 == Integer.MIN_VALUE) {
            return i3 * 3;
        }
        if (i2 != 1073741824) {
            if (i2 == 2) {
                return i3 * 2;
            }
            if (i2 == 3) {
                return i3;
            }
            if (i2 != 4) {
                throw new IllegalArgumentException();
            }
        }
        return i3 * 4;
    }

    public static int a(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static int b(int i2) {
        switch (i2) {
            case 0:
                return 16777216;
            case 1:
                return 3538944;
            case 2:
                return 13107200;
            case 3:
            case 4:
            case 5:
                return 131072;
            case 6:
                return 0;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static float a(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static int b(Context context) {
        if (context == null) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return 0;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return 1;
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            if (type == 1) {
                return 2;
            }
            if (!(type == 4 || type == 5)) {
                if (type != 6) {
                    return type != 9 ? 8 : 7;
                }
                return 5;
            }
        }
        return a(activeNetworkInfo);
    }

    public static int a(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = ~binarySearch;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j2);
            i2 = z ? binarySearch - 1 : binarySearch;
        }
        return z2 ? Math.min(jArr.length - 1, i2) : i2;
    }

    public static void a(long[] jArr, long j2, long j3) {
        int i2 = 0;
        int i3 = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i3 >= 0 && j3 % j2 == 0) {
            long j4 = j3 / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j4;
                i2++;
            }
        } else if (i3 >= 0 || j2 % j3 != 0) {
            double d2 = ((double) j2) / ((double) j3);
            while (i2 < jArr.length) {
                jArr[i2] = (long) (((double) jArr[i2]) * d2);
                i2++;
            }
        } else {
            long j5 = j2 / j3;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j5;
                i2++;
            }
        }
    }

    public static String[] b() {
        String[] c2 = c();
        for (int i2 = 0; i2 < c2.length; i2++) {
            c2[i2] = f(c2[i2]);
        }
        return c2;
    }

    @TargetApi(21)
    private static String b(Locale locale) {
        return locale.toLanguageTag();
    }

    public static long a(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(((double) j2) * ((double) f2));
    }

    public static long a(long j2, T t, long j3, long j4) {
        if (T.a.equals(t)) {
            return j2;
        }
        long d2 = d(j2, t.f, Long.MIN_VALUE);
        long a2 = a(j2, t.g, Long.MAX_VALUE);
        boolean z = true;
        boolean z2 = d2 <= j3 && j3 <= a2;
        if (d2 > j4 || j4 > a2) {
            z = false;
        }
        if (z2 && z) {
            return Math.abs(j3 - j2) <= Math.abs(j4 - j2) ? j3 : j4;
        }
        if (z2) {
            return j3;
        }
        return z ? j4 : d2;
    }

    public static int[] a(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) list.get(i2)).intValue();
        }
        return iArr;
    }

    public static byte[] a(String str) {
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) ((Character.digit(str.charAt(i3), 16) << 4) + Character.digit(str.charAt(i3 + 1), 16));
        }
        return bArr;
    }

    public static int a(int i2) {
        switch (i2) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i3 = a;
                return (i3 < 23 && i3 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static int a(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return 3;
        }
        return d(path);
    }

    public static int a(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = j[((i4 >>> 24) ^ (bArr[i2] & 255)) & 255] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static String a(Context context) {
        if (context != null) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (!TextUtils.isEmpty(networkCountryIso)) {
                    return h(networkCountryIso);
                }
            }
        }
        return h(Locale.getDefault().getCountry());
    }

    public static boolean a(Pq pq, Pq pq2, Inflater inflater) {
        if (pq.a() <= 0) {
            return false;
        }
        byte[] bArr = pq2.a;
        if (bArr.length < pq.a()) {
            bArr = new byte[(pq.a() * 2)];
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(pq.a, pq.c(), pq.a());
        int i2 = 0;
        while (true) {
            try {
                i2 += inflater.inflate(bArr, i2, bArr.length - i2);
                if (inflater.finished()) {
                    pq2.a(bArr, i2);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary()) {
                    break;
                } else if (inflater.needsInput()) {
                    break;
                } else if (i2 == bArr.length) {
                    bArr = Arrays.copyOf(bArr, bArr.length * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    private static String a(Locale locale) {
        return a >= 21 ? b(locale) : locale.toString();
    }

    private static int a(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 18:
                return 2;
            default:
                return 6;
        }
    }
}
