package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.adjust.sdk.Constants;
import com.facebook.AccessToken;
import com.facebook.B;
import com.facebook.C0594t;
import com.facebook.GraphRequest;
import com.facebook.L;
import com.facebook.M;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: Utility */
public final class ia {
    private static int a = 0;
    private static long b = -1;
    private static long c = -1;
    private static long d = -1;
    private static String e = "";
    private static String f = "";
    private static String g = "NoCarrier";

    /* compiled from: Utility */
    public interface a {
        void a(C0594t tVar);

        void a(JSONObject jSONObject);
    }

    /* compiled from: Utility */
    public static class b {
        List<String> a;
        List<String> b;
        List<String> c;

        public b(List<String> list, List<String> list2, List<String> list3) {
            this.a = list;
            this.b = list2;
            this.c = list3;
        }

        public List<String> a() {
            return this.b;
        }

        public List<String> b() {
            return this.c;
        }

        public List<String> c() {
            return this.a;
        }
    }

    public static <T> boolean a(Collection<T> collection) {
        return collection == null || collection.size() == 0;
    }

    public static boolean b(String str) {
        return str == null || str.length() == 0;
    }

    public static String c(String str) {
        return c(Constants.MD5, str);
    }

    public static Bundle d(String str) {
        Bundle bundle = new Bundle();
        if (!b(str)) {
            for (String split : str.split("&")) {
                String[] split2 = split.split("=");
                try {
                    String str2 = "UTF-8";
                    if (split2.length == 2) {
                        bundle.putString(URLDecoder.decode(split2[0], str2), URLDecoder.decode(split2[1], str2));
                    } else if (split2.length == 1) {
                        bundle.putString(URLDecoder.decode(split2[0], str2), "");
                    }
                } catch (UnsupportedEncodingException e2) {
                    a("FacebookSDK", (Exception) e2);
                }
            }
        }
        return bundle;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        return c(Constants.SHA256, str);
    }

    private static GraphRequest f(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
        bundle.putString("access_token", str);
        GraphRequest graphRequest = new GraphRequest(null, "me", bundle, M.GET, null);
        return graphRequest;
    }

    private static void g(Context context) {
        if (g.equals("NoCarrier")) {
            try {
                g = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
            } catch (Exception unused) {
            }
        }
    }

    private static void h(Context context) {
        if (b == -1 || System.currentTimeMillis() - b >= 1800000) {
            b = System.currentTimeMillis();
            e();
            g(context);
            f();
            c();
        }
    }

    public static String a(String str, String str2) {
        return b(str) ? str2 : str;
    }

    public static <T> Collection<T> b(T... tArr) {
        return Collections.unmodifiableCollection(Arrays.asList(tArr));
    }

    private static String c(String str, String str2) {
        return a(str, str2.getBytes());
    }

    private static void e() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            e = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            f = timeZone.getID();
        } catch (AssertionError | Exception unused) {
        }
    }

    public static String a(byte[] bArr) {
        return a(Constants.SHA1, bArr);
    }

    public static void b(String str, String str2) {
        if (B.r() && str != null && str2 != null) {
            Log.d(str, str2);
        }
    }

    public static String c(Context context) {
        ja.a((Object) context, "context");
        B.c(context);
        return B.f();
    }

    private static String a(String str, byte[] bArr) {
        try {
            return a(MessageDigest.getInstance(str), bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static JSONArray b(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    private static void f() {
        try {
            if (b()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            c = a((double) c);
        } catch (Exception unused) {
        }
    }

    private static String a(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b2 : digest) {
            sb.append(Integer.toHexString((b2 >> 4) & 15));
            sb.append(Integer.toHexString((b2 >> 0) & 15));
        }
        return sb.toString();
    }

    public static String b(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        return context.getClass().getSimpleName();
    }

    public static JSONObject c(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    public static boolean c(Uri uri) {
        if (uri != null) {
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Context context) {
        if (VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        return str != null && str.matches(".+_cheets|cheets_.+");
    }

    public static boolean b(Uri uri) {
        if (uri != null) {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return true;
            }
        }
        return false;
    }

    private static void c() {
        try {
            if (b()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                d = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            d = a((double) d);
        } catch (Exception unused) {
        }
    }

    private static boolean b() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static boolean f(Context context) {
        return d(context);
    }

    public static Uri a(String str, String str2, Bundle bundle) {
        Builder builder = new Builder();
        builder.scheme(Constants.SCHEME);
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        return builder.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        if ("fbstaging".equalsIgnoreCase(r2.getScheme()) != false) goto L_0x0026;
     */
    public static boolean d(Uri uri) {
        if (uri != null) {
            if (!"http".equalsIgnoreCase(uri.getScheme())) {
                if (!Constants.SCHEME.equalsIgnoreCase(uri.getScheme())) {
                }
            }
            return true;
        }
        return false;
    }

    private static int d() {
        int i = a;
        if (i > 0) {
            return i;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new ha());
            if (listFiles != null) {
                a = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (a <= 0) {
            a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return a;
    }

    public static void a(Bundle bundle, String str, String str2) {
        if (!b(str2)) {
            bundle.putString(str, str2);
        }
    }

    public static void a(Bundle bundle, String str, Uri uri) {
        if (uri != null) {
            a(bundle, str, uri.toString());
        }
    }

    public static boolean a(Bundle bundle, String str, Object obj) {
        if (obj == null) {
            bundle.remove(str);
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
        } else if (obj instanceof JSONArray) {
            bundle.putString(str, obj.toString());
        } else if (!(obj instanceof JSONObject)) {
            return false;
        } else {
            bundle.putString(str, obj.toString());
        }
        return true;
    }

    public static boolean d(Context context) {
        boolean z = false;
        if (VERSION.SDK_INT < 26) {
            return false;
        }
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled()) {
            z = true;
        }
        return z;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static Object a(JSONObject jSONObject, String str, String str2) throws JSONException {
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new C0594t("Got an unexpected non-JSON object.");
    }

    public static String a(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb.append(cArr, 0, read);
                        } else {
                            String sb2 = sb.toString();
                            a((Closeable) bufferedInputStream);
                            a((Closeable) inputStreamReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    a((Closeable) bufferedInputStream);
                    a((Closeable) inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
                a((Closeable) bufferedInputStream);
                a((Closeable) inputStreamReader);
                throw th;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
            a((Closeable) bufferedInputStream);
            a((Closeable) inputStreamReader);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c  */
    public static int a(InputStream inputStream, OutputStream outputStream) throws IOException {
        BufferedInputStream bufferedInputStream;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i = 0;
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    i += read;
                }
                bufferedInputStream.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i;
            } catch (Throwable th) {
                th = th;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = null;
            if (bufferedInputStream != null) {
            }
            if (inputStream != null) {
            }
            throw th;
        }
    }

    private static void a(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            for (String split : cookie.split(";")) {
                String[] split2 = split.split("=");
                if (split2.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(split2[0].trim());
                    sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                    instance.setCookie(str, sb.toString());
                }
            }
            instance.removeExpiredCookie();
        }
    }

    public static void a(Context context) {
        a(context, "facebook.com");
        a(context, ".facebook.com");
        a(context, "https://facebook.com");
        a(context, "https://.facebook.com");
    }

    public static void a(String str, Exception exc) {
        if (B.r() && str != null && exc != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(exc.getClass().getSimpleName());
            sb.append(": ");
            sb.append(exc.getMessage());
            Log.d(str, sb.toString());
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (B.r() && !b(str)) {
            Log.d(str, str2, th);
        }
    }

    public static <T> boolean a(T t, T t2) {
        if (t != null) {
            return t.equals(t2);
        }
        return t2 == null;
    }

    public static String a(JSONObject jSONObject, String str) {
        String str2 = "";
        return jSONObject != null ? jSONObject.optString(str, str2) : str2;
    }

    public static <T> List<T> a(T... tArr) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static List<String> a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    public static void a(JSONObject jSONObject, C0542c cVar, String str, boolean z) throws JSONException {
        if (!(cVar == null || cVar.c() == null)) {
            jSONObject.put("attribution", cVar.c());
        }
        if (!(cVar == null || cVar.a() == null)) {
            jSONObject.put("advertiser_id", cVar.a());
            jSONObject.put("advertiser_tracking_enabled", !cVar.d());
        }
        if (!(cVar == null || cVar.b() == null)) {
            jSONObject.put("installer_package", cVar.b());
        }
        jSONObject.put("anon_id", str);
        jSONObject.put("application_tracking_enabled", !z);
    }

    public static void a(JSONObject jSONObject, Context context) throws JSONException {
        String str;
        Locale locale;
        int i;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        h(context);
        String packageName = context.getPackageName();
        int i2 = 0;
        int i3 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            i3 = packageInfo.versionCode;
            str = packageInfo.versionName;
        } catch (NameNotFoundException unused) {
            str = "";
        }
        jSONArray.put(packageName);
        jSONArray.put(i3);
        jSONArray.put(str);
        jSONArray.put(VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        sb.append("_");
        sb.append(locale.getCountry());
        jSONArray.put(sb.toString());
        jSONArray.put(e);
        jSONArray.put(g);
        double d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                i = displayMetrics.widthPixels;
                try {
                    i2 = displayMetrics.heightPixels;
                    d2 = (double) displayMetrics.density;
                } catch (Exception unused3) {
                }
                jSONArray.put(i);
                jSONArray.put(i2);
                jSONArray.put(new DecimalFormat("#.##").format(d2));
                jSONArray.put(d());
                jSONArray.put(c);
                jSONArray.put(d);
                jSONArray.put(f);
                jSONObject.put("extinfo", jSONArray.toString());
            }
        } catch (Exception unused4) {
        }
        i = 0;
        jSONArray.put(i);
        jSONArray.put(i2);
        jSONArray.put(new DecimalFormat("#.##").format(d2));
        jSONArray.put(d());
        jSONArray.put(c);
        jSONArray.put(d);
        jSONArray.put(f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method a(String str, String str2, Class<?>... clsArr) {
        try {
            return a(Class.forName(str), str2, clsArr);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Object a(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static long a(Uri uri) {
        Cursor cursor = null;
        try {
            cursor = B.e().getContentResolver().query(uri, null, null, null, null);
            int columnIndex = cursor.getColumnIndex("_size");
            cursor.moveToFirst();
            return cursor.getLong(columnIndex);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public static Date a(Bundle bundle, String str, Date date) {
        long j;
        Date date2 = null;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            j = ((Long) obj).longValue();
        } else {
            if (obj instanceof String) {
                try {
                    j = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return date2;
        }
        if (j == 0) {
            return new Date(Long.MAX_VALUE);
        }
        date2 = new Date(date.getTime() + (j * 1000));
        return date2;
    }

    public static void a(Parcel parcel, Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public static Map<String, String> a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    public static boolean a(AccessToken accessToken) {
        return accessToken != null && accessToken.equals(AccessToken.c());
    }

    public static void a(String str, a aVar) {
        JSONObject a2 = ca.a(str);
        if (a2 != null) {
            aVar.a(a2);
            return;
        }
        ga gaVar = new ga(aVar, str);
        GraphRequest f2 = f(str);
        f2.a((com.facebook.GraphRequest.b) gaVar);
        f2.c();
    }

    public static JSONObject a(String str) {
        JSONObject a2 = ca.a(str);
        if (a2 != null) {
            return a2;
        }
        L b2 = f(str).b();
        if (b2.a() != null) {
            return null;
        }
        return b2.b();
    }

    private static long a(double d2) {
        return Math.round(d2 / 1.073741824E9d);
    }

    public static b a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        ArrayList arrayList3 = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("permission");
            if (optString != null && !optString.equals("installed")) {
                String optString2 = optJSONObject.optString("status");
                if (optString2 != null) {
                    if (optString2.equals("granted")) {
                        arrayList.add(optString);
                    } else if (optString2.equals("declined")) {
                        arrayList2.add(optString);
                    } else if (optString2.equals("expired")) {
                        arrayList3.add(optString);
                    }
                }
            }
        }
        return new b(arrayList, arrayList2, arrayList3);
    }

    public static String a(int i) {
        return new BigInteger(i * 5, new Random()).toString(32);
    }

    public static Locale a() {
        try {
            return B.e().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return Locale.getDefault();
        }
    }
}
