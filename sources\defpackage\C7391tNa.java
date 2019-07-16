package defpackage;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

/* renamed from: tNa reason: default package and case insensitive filesystem */
/* compiled from: CommonUtils */
public class C7391tNa {
    private static Boolean a;
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static long c = -1;
    public static final Comparator<File> d = new C7322sNa();

    /* renamed from: tNa$a */
    /* compiled from: CommonUtils */
    enum a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        private static final Map<String, a> k = null;

        static {
            k = new HashMap(4);
            k.put("armeabi-v7a", ARMV7);
            k.put("armeabi", ARMV6);
            k.put("arm64-v8a", ARM64);
            k.put("x86", X86_32);
        }

        static a a() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                C5328TMa.e().d("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            a aVar = (a) k.get(str.toLowerCase(Locale.US));
            if (aVar == null) {
                aVar = UNKNOWN;
            }
            return aVar;
        }
    }

    public static String a(int i) {
        switch (i) {
            case 2:
                return "V";
            case 3:
                return "D";
            case 4:
                return "I";
            case 5:
                return "W";
            case 6:
                return "E";
            case 7:
                return "A";
            default:
                return "?";
        }
    }

    public static String a(File file, String str) {
        BufferedReader bufferedReader;
        String str2 = "Failed to close system file reader.";
        String str3 = null;
        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file), 1024);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String[] split = Pattern.compile("\\s*:\\s*").split(readLine, 2);
                        if (split.length > 1 && split[0].equals(str)) {
                            str3 = split[1];
                            break;
                        }
                    } catch (Exception e) {
                        e = e;
                        try {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Error parsing ");
                            sb.append(file);
                            C5328TMa.e().e("Fabric", sb.toString(), e);
                            a((Closeable) bufferedReader, str2);
                            return str3;
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                }
            } catch (Exception e2) {
                e = e2;
                bufferedReader = null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error parsing ");
                sb2.append(file);
                C5328TMa.e().e("Fabric", sb2.toString(), e);
                a((Closeable) bufferedReader, str2);
                return str3;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                a((Closeable) bufferedReader, str2);
                throw th;
            }
            a((Closeable) bufferedReader, str2);
        }
        return str3;
    }

    public static synchronized long b() {
        long j;
        synchronized (C7391tNa.class) {
            if (c == -1) {
                long j2 = 0;
                String a2 = a(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(a2)) {
                    String upperCase = a2.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j2 = a(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j2 = a(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j2 = a(upperCase, "GB", 1073741824);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unexpected meminfo format while computing RAM: ");
                            sb.append(upperCase);
                            C5328TMa.e().d("Fabric", sb.toString());
                        }
                    } catch (NumberFormatException e) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unexpected meminfo format while computing RAM: ");
                        sb2.append(upperCase);
                        C5328TMa.e().e("Fabric", sb2.toString(), e);
                    }
                }
                c = j2;
            }
            j = c;
        }
        return j;
    }

    public static String c(String str) {
        return a(str, Constants.SHA1);
    }

    public static String d(String str) {
        return a(str, Constants.SHA256);
    }

    public static Float e(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return null;
        }
        return Float.valueOf(((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
    }

    public static int f(Context context) {
        int i = l(context) ? 1 : 0;
        if (m(context)) {
            i |= 2;
        }
        return c() ? i | 4 : i;
    }

    public static boolean g(Context context) {
        boolean z = false;
        if (l(context)) {
            return false;
        }
        if (((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z = true;
        }
        return z;
    }

    public static String h(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i <= 0) {
            return context.getPackageName();
        }
        try {
            return context.getResources().getResourcePackageName(i);
        } catch (NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static SharedPreferences i(Context context) {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    public static boolean j(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean k(Context context) {
        if (a == null) {
            a = Boolean.valueOf(a(context, "com.crashlytics.Trace", false));
        }
        return a.booleanValue();
    }

    public static boolean l(Context context) {
        String string = Secure.getString(context.getContentResolver(), "android_id");
        if (!"sdk".equals(Build.PRODUCT)) {
            if (!"google_sdk".equals(Build.PRODUCT) && string != null) {
                return false;
            }
        }
        return true;
    }

    public static boolean m(Context context) {
        boolean l = l(context);
        String str = Build.TAGS;
        if ((!l && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (l || !file.exists()) {
            return false;
        }
        return true;
    }

    public static String n(Context context) {
        String str = "string";
        int a2 = a(context, "io.fabric.android.build_id", str);
        if (a2 == 0) {
            a2 = a(context, "com.crashlytics.android.build_id", str);
        }
        if (a2 == 0) {
            return null;
        }
        String string = context.getResources().getString(a2);
        C5701cNa e = C5328TMa.e();
        StringBuilder sb = new StringBuilder();
        sb.append("Build ID is: ");
        sb.append(string);
        e.d("Fabric", sb.toString());
        return string;
    }

    public static String o(Context context) {
        int a2 = a(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (a2 == 0) {
            return null;
        }
        String string = context.getResources().getString(a2);
        C5701cNa e = C5328TMa.e();
        StringBuilder sb = new StringBuilder();
        sb.append("Unity Editor version is: ");
        sb.append(string);
        e.d("Fabric", sb.toString());
        return string;
    }

    public static void c(Context context, String str) {
        if (k(context)) {
            C5328TMa.e().d("Fabric", str);
        }
    }

    public static int d(Context context) {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    public static boolean c() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    public static String c(Context context) {
        InputStream inputStream;
        String str = "Failed to close icon input stream.";
        String str2 = null;
        try {
            inputStream = context.getResources().openRawResource(d(context));
            try {
                String a2 = a(inputStream);
                if (!b(a2)) {
                    str2 = a2;
                }
                a((Closeable) inputStream, str);
                return str2;
            } catch (Exception e) {
                e = e;
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not calculate hash for app icon:");
                    sb.append(e.getMessage());
                    C5328TMa.e().w("Fabric", sb.toString());
                    a((Closeable) inputStream, str);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    a((Closeable) inputStream, str);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            inputStream = null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not calculate hash for app icon:");
            sb2.append(e.getMessage());
            C5328TMa.e().w("Fabric", sb2.toString());
            a((Closeable) inputStream, str);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            a((Closeable) inputStream, str);
            throw th;
        }
    }

    public static int a() {
        return a.a().ordinal();
    }

    static long a(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    public static RunningAppProcessInfo a(String str, Context context) {
        List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    public static String b(InputStream inputStream) throws IOException {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    public static String b(Context context, String str) {
        int a2 = a(context, str, "string");
        return a2 > 0 ? context.getString(a2) : "";
    }

    public static String a(InputStream inputStream) {
        return a(inputStream, Constants.SHA1);
    }

    private static String a(String str, String str2) {
        return a(str.getBytes(), str2);
    }

    public static boolean b(String str) {
        return str == null || str.length() == 0;
    }

    private static String a(InputStream inputStream, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return a(instance.digest());
                }
                instance.update(bArr, 0, read);
            }
        } catch (Exception e) {
            C5328TMa.e().e("Fabric", "Could not calculate hash for app icon.", e);
            return "";
        }
    }

    public static String b(int i) {
        if (i >= 0) {
            return String.format(Locale.US, "%1$10s", new Object[]{Integer.valueOf(i)}).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    @SuppressLint({"MissingPermission"})
    public static boolean b(Context context) {
        if (!a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return false;
        }
        return true;
    }

    private static String a(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return a(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            C5701cNa e2 = C5328TMa.e();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not create hashing algorithm: ");
            sb.append(str);
            sb.append(", returning empty string.");
            e2.e("Fabric", sb.toString(), e);
            return "";
        }
    }

    public static String a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String append : arrayList) {
            sb.append(append);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return c(sb2);
        }
        return null;
    }

    public static long a(Context context) {
        MemoryInfo memoryInfo = new MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static long a(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    public static void a(Context context, String str, Throwable th) {
        if (k(context)) {
            C5328TMa.e().e("Fabric", str);
        }
    }

    public static void a(Context context, int i, String str, String str2) {
        if (k(context)) {
            C5328TMa.e().log(i, "Fabric", str2);
        }
    }

    public static boolean a(Context context, String str, boolean z) {
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                int a2 = a(context, str, "bool");
                if (a2 > 0) {
                    return resources.getBoolean(a2);
                }
                int a3 = a(context, str, "string");
                if (a3 > 0) {
                    return Boolean.parseBoolean(context.getString(a3));
                }
            }
        }
        return z;
    }

    public static int a(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, h(context));
    }

    public static int a(Context context, boolean z) {
        Float e = e(context);
        if (!z || e == null) {
            return 1;
        }
        if (((double) e.floatValue()) >= 99.0d) {
            return 3;
        }
        return ((double) e.floatValue()) < 99.0d ? 2 : 0;
    }

    public static String a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = b;
            cArr[i2] = cArr2[b2 >>> 4];
            cArr[i2 + 1] = cArr2[b2 & Ascii.SI];
        }
        return new String(cArr);
    }

    public static void a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C5328TMa.e().e("Fabric", str, e);
            }
        }
    }

    public static void a(Flushable flushable, String str) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (IOException e) {
                C5328TMa.e().e("Fabric", str, e);
            }
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
