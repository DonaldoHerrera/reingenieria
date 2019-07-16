package com.adjust.sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectInputStream.GetField;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;

public class Util {
    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'Z";
    public static final DecimalFormat SecondsDisplayFormat = newLocalDecimalFormat();
    public static final SimpleDateFormat dateFormatter = new SimpleDateFormat(DATE_FORMAT, Locale.US);
    private static final String fieldReadErrorMessage = "Unable to read '%s' field in migration device with message (%s)";

    public static boolean checkPermission(Context context, String str) {
        boolean z = true;
        try {
            if (context.checkCallingOrSelfPermission(str) != 0) {
                z = false;
            }
            return z;
        } catch (Exception e) {
            getLogger().debug("Unable to check permission '%s' with message (%s)", str, e.getMessage());
            return false;
        }
    }

    public static String convertToHex(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        StringBuilder sb = new StringBuilder();
        sb.append("%0");
        sb.append(bArr.length << 1);
        sb.append("x");
        return formatString(sb.toString(), bigInteger);
    }

    protected static String createUuid() {
        return UUID.randomUUID().toString();
    }

    public static boolean equalBoolean(Boolean bool, Boolean bool2) {
        return equalObject(bool, bool2);
    }

    public static boolean equalEnum(Enum enumR, Enum enumR2) {
        return equalObject(enumR, enumR2);
    }

    public static boolean equalInt(Integer num, Integer num2) {
        return equalObject(num, num2);
    }

    public static boolean equalLong(Long l, Long l2) {
        return equalObject(l, l2);
    }

    public static boolean equalObject(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            return obj.equals(obj2);
        }
        return obj == null && obj2 == null;
    }

    public static boolean equalString(String str, String str2) {
        return equalObject(str, str2);
    }

    public static boolean equalsDouble(Double d, Double d2) {
        boolean z = true;
        if (d == null || d2 == null) {
            if (!(d == null && d2 == null)) {
                z = false;
            }
            return z;
        }
        if (Double.doubleToLongBits(d.doubleValue()) != Double.doubleToLongBits(d2.doubleValue())) {
            z = false;
        }
        return z;
    }

    public static String formatString(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String getAndroidId(Context context) {
        return AndroidIdUtil.getAndroidId(context);
    }

    public static int getConnectivityType(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo().getType();
        } catch (Exception e) {
            getLogger().warn("Couldn't read connectivity type (%s)", e.getMessage());
            return -1;
        }
    }

    public static String getCpuAbi() {
        if (VERSION.SDK_INT < 21) {
            return Build.CPU_ABI;
        }
        return null;
    }

    public static String getFireAdvertisingId(ContentResolver contentResolver) {
        if (contentResolver == null) {
            return null;
        }
        try {
            return Secure.getString(contentResolver, "advertising_id");
        } catch (Exception unused) {
            return null;
        }
    }

    public static Boolean getFireTrackingEnabled(ContentResolver contentResolver) {
        try {
            return Boolean.valueOf(Secure.getInt(contentResolver, "limit_ad_tracking") == 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void getGoogleAdId(Context context, final OnDeviceIdsRead onDeviceIdsRead) {
        ILogger logger = AdjustFactory.getLogger();
        if (Looper.myLooper() != Looper.getMainLooper()) {
            logger.debug("GoogleAdId being read in the background", new Object[0]);
            String playAdId = getPlayAdId(context);
            StringBuilder sb = new StringBuilder();
            sb.append("GoogleAdId read ");
            sb.append(playAdId);
            logger.debug(sb.toString(), new Object[0]);
            onDeviceIdsRead.onGoogleAdIdRead(playAdId);
            return;
        }
        logger.debug("GoogleAdId being read in the foreground", new Object[0]);
        new AsyncTask<Context, Void, String>() {
            /* access modifiers changed from: protected */
            public String doInBackground(Context... contextArr) {
                ILogger logger = AdjustFactory.getLogger();
                String playAdId = Util.getPlayAdId(contextArr[0]);
                StringBuilder sb = new StringBuilder();
                sb.append("GoogleAdId read ");
                sb.append(playAdId);
                logger.debug(sb.toString(), new Object[0]);
                return playAdId;
            }

            /* access modifiers changed from: protected */
            public void onPostExecute(String str) {
                AdjustFactory.getLogger();
                onDeviceIdsRead.onGoogleAdIdRead(str);
            }
        }.execute(new Context[]{context});
    }

    public static Locale getLocale(Configuration configuration) {
        if (VERSION.SDK_INT >= 24) {
            LocaleList locales = configuration.getLocales();
            if (locales != null && !locales.isEmpty()) {
                return locales.get(0);
            }
        }
        if (VERSION.SDK_INT < 24) {
            return configuration.locale;
        }
        return null;
    }

    private static ILogger getLogger() {
        return AdjustFactory.getLogger();
    }

    public static String getMacAddress(Context context) {
        return MacAddressUtil.getMacAddress(context);
    }

    public static String getMcc(Context context) {
        try {
            String networkOperator = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator)) {
                return networkOperator.substring(0, 3);
            }
            AdjustFactory.getLogger().warn("Couldn't receive networkOperator string to read MCC", new Object[0]);
            return null;
        } catch (Exception unused) {
            AdjustFactory.getLogger().warn("Couldn't return mcc", new Object[0]);
            return null;
        }
    }

    public static String getMnc(Context context) {
        try {
            String networkOperator = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator)) {
                return networkOperator.substring(3);
            }
            AdjustFactory.getLogger().warn("Couldn't receive networkOperator string to read MNC", new Object[0]);
            return null;
        } catch (Exception unused) {
            AdjustFactory.getLogger().warn("Couldn't return mnc", new Object[0]);
            return null;
        }
    }

    public static int getNetworkType(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
        } catch (Exception e) {
            getLogger().warn("Couldn't read network type (%s)", e.getMessage());
            return -1;
        }
    }

    public static String getPlayAdId(Context context) {
        return Reflection.getPlayAdId(context);
    }

    public static String getReasonString(String str, Throwable th) {
        if (th != null) {
            return formatString("%s: %s", str, th);
        }
        return formatString("%s", str);
    }

    public static String getRootCause(Exception exc) {
        if (!hasRootCause(exc)) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        int indexOf = stringWriter2.indexOf("Caused by:");
        return stringWriter2.substring(indexOf, stringWriter2.indexOf("\n", indexOf));
    }

    private static String getSdkPrefix(String str) {
        if (str == null) {
            return null;
        }
        String str2 = "@";
        if (!str.contains(str2)) {
            return null;
        }
        String[] split = str.split(str2);
        if (split != null && split.length == 2) {
            return split[0];
        }
        return null;
    }

    public static String getSdkPrefixPlatform(String str) {
        String sdkPrefix = getSdkPrefix(str);
        if (sdkPrefix == null) {
            return null;
        }
        String[] split = sdkPrefix.split("\\d+", 2);
        if (split == null || split.length == 0) {
            return null;
        }
        return split[0];
    }

    public static String getSdkVersion() {
        return Constants.CLIENT_SDK;
    }

    public static String[] getSupportedAbis() {
        if (VERSION.SDK_INT >= 21) {
            return Build.SUPPORTED_ABIS;
        }
        return null;
    }

    public static long getWaitingTime(int i, BackoffStrategy backoffStrategy) {
        int i2 = backoffStrategy.minRetries;
        if (i < i2) {
            return 0;
        }
        return (long) (((double) Math.min(((long) Math.pow(2.0d, (double) (i - i2))) * backoffStrategy.milliSecondMultiplier, backoffStrategy.maxWait)) * randomInRange(backoffStrategy.minRange, backoffStrategy.maxRange));
    }

    public static boolean hasRootCause(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString().contains("Caused by:");
    }

    public static String hash(String str, String str2) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            MessageDigest instance = MessageDigest.getInstance(str2);
            instance.update(bytes, 0, bytes.length);
            return convertToHex(instance.digest());
        } catch (Exception unused) {
            return null;
        }
    }

    public static int hashBoolean(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public static int hashEnum(Enum enumR) {
        if (enumR == null) {
            return 0;
        }
        return enumR.hashCode();
    }

    public static int hashLong(Long l) {
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public static int hashObject(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static int hashString(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public static Boolean isPlayTrackingEnabled(Context context) {
        return Reflection.isPlayTrackingEnabled(context);
    }

    public static boolean isUrlFilteredOut(Uri uri) {
        if (uri == null) {
            return true;
        }
        String uri2 = uri.toString();
        if (uri2 == null || uri2.length() == 0 || uri2.matches(Constants.FB_AUTH_REGEX)) {
            return true;
        }
        return false;
    }

    public static boolean isValidParameter(String str, String str2, String str3) {
        if (str == null) {
            getLogger().error("%s parameter %s is missing", str3, str2);
            return false;
        } else if (!str.equals("")) {
            return true;
        } else {
            getLogger().error("%s parameter %s is empty", str3, str2);
            return false;
        }
    }

    public static String md5(String str) {
        return hash(str, Constants.MD5);
    }

    public static Map<String, String> mergeParameters(Map<String, String> map, Map<String, String> map2, String str) {
        if (map == null) {
            return map2;
        }
        if (map2 == null) {
            return map;
        }
        HashMap hashMap = new HashMap(map);
        ILogger logger = getLogger();
        for (Entry entry : map2.entrySet()) {
            String str2 = (String) hashMap.put(entry.getKey(), entry.getValue());
            if (str2 != null) {
                logger.warn("Key %s with value %s from %s parameter was replaced by value %s", entry.getKey(), str2, str, entry.getValue());
            }
        }
        return hashMap;
    }

    private static DecimalFormat newLocalDecimalFormat() {
        return new DecimalFormat("0.0", new DecimalFormatSymbols(Locale.US));
    }

    public static String quote(String str) {
        if (str == null) {
            return null;
        }
        if (!Pattern.compile("\\s").matcher(str).find()) {
            return str;
        }
        return formatString("'%s'", str);
    }

    private static double randomInRange(double d, double d2) {
        return (new Random().nextDouble() * (d2 - d)) + d;
    }

    public static boolean readBooleanField(GetField getField, String str, boolean z) {
        try {
            return getField.get(str, z);
        } catch (Exception e) {
            getLogger().debug(fieldReadErrorMessage, str, e.getMessage());
            return z;
        }
    }

    public static int readIntField(GetField getField, String str, int i) {
        try {
            return getField.get(str, i);
        } catch (Exception e) {
            getLogger().debug(fieldReadErrorMessage, str, e.getMessage());
            return i;
        }
    }

    public static long readLongField(GetField getField, String str, long j) {
        try {
            return getField.get(str, j);
        } catch (Exception e) {
            getLogger().debug(fieldReadErrorMessage, str, e.getMessage());
            return j;
        }
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r8v7, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14, types: [java.io.ObjectInputStream] */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: type inference failed for: r7v20 */
    /* JADX WARNING: type inference failed for: r7v21 */
    /* JADX WARNING: type inference failed for: r7v22 */
    /* JADX WARNING: type inference failed for: r7v23 */
    /* JADX WARNING: type inference failed for: r7v24 */
    /* JADX WARNING: type inference failed for: r7v25 */
    /* JADX WARNING: type inference failed for: r7v26 */
    /* JADX WARNING: type inference failed for: r7v27 */
    /* JADX WARNING: type inference failed for: r7v28 */
    /* JADX WARNING: type inference failed for: r7v29 */
    /* JADX WARNING: type inference failed for: r7v30 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v4
  assigns: []
  uses: []
  mth insns count: 85
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095 A[SYNTHETIC, Splitter:B:29:0x0095] */
    /* JADX WARNING: Unknown variable types count: 9 */
    public static <T> T readObject(Context context, String str, String str2, Class<T> cls) {
        ? r7;
        ? r72;
        ? r73;
        ? r74;
        ? r75;
        T t = null;
        try {
            ? openFileInput = context.openFileInput(str);
            try {
                r74 = openFileInput;
                r75 = openFileInput;
                ? bufferedInputStream = new BufferedInputStream(openFileInput);
                r74 = openFileInput;
                r75 = openFileInput;
                try {
                    ? objectInputStream = new ObjectInputStream(bufferedInputStream);
                    try {
                        r74 = objectInputStream;
                        r75 = objectInputStream;
                        t = cls.cast(objectInputStream.readObject());
                        getLogger().debug("Read %s: %s", str2, t);
                        r7 = objectInputStream;
                    } catch (ClassNotFoundException e) {
                        getLogger().error("Failed to find %s class (%s)", str2, e.getMessage());
                        r7 = objectInputStream;
                    } catch (ClassCastException e2) {
                        getLogger().error("Failed to cast %s object (%s)", str2, e2.getMessage());
                        r7 = objectInputStream;
                    } catch (Exception e3) {
                        r74 = objectInputStream;
                        r75 = objectInputStream;
                        getLogger().error("Failed to read %s object (%s)", str2, e3.getMessage());
                        r7 = objectInputStream;
                    }
                } catch (FileNotFoundException unused) {
                    r72 = bufferedInputStream;
                    getLogger().debug("%s file not found", str2);
                    r7 = r72;
                    if (r7 != 0) {
                    }
                    return t;
                } catch (Exception e4) {
                    ? r6 = bufferedInputStream;
                    e = e4;
                    r73 = r6;
                    getLogger().error("Failed to open %s file for reading (%s)", str2, e);
                    r7 = r73;
                    if (r7 != 0) {
                    }
                    return t;
                }
            } catch (FileNotFoundException unused2) {
                r72 = r74;
                getLogger().debug("%s file not found", str2);
                r7 = r72;
                if (r7 != 0) {
                }
                return t;
            } catch (Exception e5) {
                e = e5;
                r73 = r75;
                getLogger().error("Failed to open %s file for reading (%s)", str2, e);
                r7 = r73;
                if (r7 != 0) {
                }
                return t;
            }
        } catch (FileNotFoundException unused3) {
            r72 = 0;
            getLogger().debug("%s file not found", str2);
            r7 = r72;
            if (r7 != 0) {
            }
            return t;
        } catch (Exception e6) {
            e = e6;
            r73 = 0;
            getLogger().error("Failed to open %s file for reading (%s)", str2, e);
            r7 = r73;
            if (r7 != 0) {
            }
            return t;
        }
        if (r7 != 0) {
            try {
                r7.close();
            } catch (Exception e7) {
                getLogger().error("Failed to close %s file for reading (%s)", str2, e7);
            }
        }
        return t;
    }

    public static <T> T readObjectField(GetField getField, String str, T t) {
        try {
            return getField.get(str, t);
        } catch (Exception e) {
            getLogger().debug(fieldReadErrorMessage, str, e.getMessage());
            return t;
        }
    }

    public static String readStringField(GetField getField, String str, String str2) {
        return (String) readObjectField(getField, str, str2);
    }

    public static void runInBackground(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            runnable.run();
            return;
        }
        new AsyncTask<Object, Void, Void>() {
            /* access modifiers changed from: protected */
            public Void doInBackground(Object... objArr) {
                objArr[0].run();
                return null;
            }
        }.execute(new Object[]{runnable});
    }

    public static String sha1(String str) {
        return hash(str, Constants.SHA1);
    }

    public static String sha256(String str) {
        return hash(str, Constants.SHA256);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r7v3, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8, types: [java.io.ObjectOutputStream] */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* JADX WARNING: type inference failed for: r6v16 */
    /* JADX WARNING: type inference failed for: r6v17 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0024 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v3
  assigns: []
  uses: []
  mth insns count: 48
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a A[SYNTHETIC, Splitter:B:18:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 7 */
    public static <T> void writeObject(T t, Context context, String str, String str2) {
        ? r6;
        ? r62;
        ? r63;
        ? bufferedOutputStream;
        try {
            ? openFileOutput = context.openFileOutput(str, 0);
            try {
                r63 = openFileOutput;
                bufferedOutputStream = new BufferedOutputStream(openFileOutput);
                r63 = openFileOutput;
            } catch (Exception e) {
                e = e;
                r62 = r63;
            }
            try {
                ? objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
                objectOutputStream.writeObject(t);
                getLogger().debug("Wrote %s: %s", str2, t);
                r6 = objectOutputStream;
                r63 = objectOutputStream;
                getLogger().error("Failed to serialize %s", str2);
                r63 = objectOutputStream;
                r6 = objectOutputStream;
            } catch (Exception e2) {
                e = e2;
                r62 = bufferedOutputStream;
                getLogger().error("Failed to open %s for writing (%s)", str2, e);
                r6 = r62;
                if (r6 != 0) {
                }
            }
        } catch (Exception e3) {
            e = e3;
            r62 = 0;
            getLogger().error("Failed to open %s for writing (%s)", str2, e);
            r6 = r62;
            if (r6 != 0) {
            }
        }
        if (r6 != 0) {
            try {
                r6.close();
            } catch (Exception e4) {
                getLogger().error("Failed to close %s file for writing (%s)", str2, e4);
            }
        }
    }
}
