package defpackage;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: Gj reason: default package */
/* compiled from: JobUtil */
public final class Gj {
    private static final ThreadLocal<SimpleDateFormat> a = new ThreadLocal<>();
    private static final long b = TimeUnit.DAYS.toMillis(1);
    private static final Dj c = new Dj("JobUtil");

    public static String a(long j) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) a.get();
        if (simpleDateFormat == null) {
            simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);
            a.set(simpleDateFormat);
        }
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String format = simpleDateFormat.format(new Date(j));
        long j2 = j / b;
        int i = (j2 > 1 ? 1 : (j2 == 1 ? 0 : -1));
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(format);
            sb.append(" (+1 day)");
            return sb.toString();
        } else if (i <= 0) {
            return format;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(format);
            sb2.append(" (+");
            sb2.append(j2);
            sb2.append(" days)");
            return sb2.toString();
        }
    }

    public static boolean b(Context context) {
        return a(context, "android.permission.WAKE_LOCK", 0);
    }

    public static boolean a(Context context) {
        return a(context, "android.permission.RECEIVE_BOOT_COMPLETED", 0);
    }

    private static boolean a(Context context, String str, int i) {
        boolean z = false;
        try {
            if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            c.a((Throwable) e);
            if (i < 1 && a(context.getApplicationContext(), str, i + 1)) {
                z = true;
            }
            return z;
        }
    }
}
