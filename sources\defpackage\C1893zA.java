package defpackage;

import android.os.Build.VERSION;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: zA reason: default package and case insensitive filesystem */
public class C1893zA {
    private final String a;

    public C1893zA(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        String valueOf2 = String.valueOf(str);
        this.a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private int a(int i, String str, Object[] objArr) {
        String str2 = "PlayCore";
        if (Log.isLoggable(str2, i)) {
            return Log.i(str2, a(this.a, str, objArr));
        }
        return 0;
    }

    public static AA a() {
        if (VERSION.SDK_INT >= 23 && VERSION.PREVIEW_SDK_INT != 0) {
            int i = VERSION.SDK_INT;
            if (i == 27) {
                return new SA();
            }
            if (i == 28) {
                return new RA();
            }
        }
        int i2 = VERSION.SDK_INT;
        if (i2 >= 21) {
            switch (i2) {
                case 21:
                    return new CA();
                case 22:
                    return new FA();
                case 23:
                    return new IA();
                case 24:
                    return new MA();
                case 25:
                    return new LA();
                case 26:
                    return new OA();
                case 27:
                    return new PA();
                case 28:
                    if (!VERSION.CODENAME.equalsIgnoreCase("Q")) {
                        return new SA();
                    }
                    break;
            }
            return new RA();
        }
        throw new AssertionError("Unsupported Android Version");
    }

    private static String a(String str, String str2, Object... objArr) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" : ");
        sb.append(str2);
        String sb2 = sb.toString();
        if (objArr == null || objArr.length <= 0) {
            return sb2;
        }
        try {
            return String.format(Locale.US, sb2, objArr);
        } catch (IllegalFormatException e) {
            String str3 = "Unable to format ";
            String valueOf = String.valueOf(sb2);
            Log.e("PlayCore", valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), e);
            String valueOf2 = String.valueOf(sb2);
            String join = TextUtils.join(", ", objArr);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 3 + String.valueOf(join).length());
            sb3.append(valueOf2);
            sb3.append(" [");
            sb3.append(join);
            sb3.append("]");
            return sb3.toString();
        }
    }

    public int a(String str, Object... objArr) {
        return a(4, str, objArr);
    }

    public int a(Throwable th, String str, Object... objArr) {
        String str2 = "PlayCore";
        if (Log.isLoggable(str2, 6)) {
            return Log.e(str2, a(this.a, str, objArr), th);
        }
        return 0;
    }

    public int b(String str, Object... objArr) {
        return a(3, str, objArr);
    }

    public int c(String str, Object... objArr) {
        return a(5, str, objArr);
    }

    public int d(String str, Object... objArr) {
        return a(6, str, objArr);
    }
}
