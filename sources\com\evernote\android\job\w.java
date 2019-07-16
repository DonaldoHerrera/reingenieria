package com.evernote.android.job;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.SparseArray;
import java.util.concurrent.TimeUnit;

/* compiled from: WakeLockUtil */
final class w {
    private static final Dj a = new Dj("WakeLockUtil");
    private static final SparseArray<WakeLock> b = new SparseArray<>();
    private static int c = 1;

    static WakeLock a(Context context, String str, long j) {
        WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, str);
        newWakeLock.setReferenceCounted(false);
        if (a(context, newWakeLock, j)) {
            return newWakeLock;
        }
        return null;
    }

    static boolean a(Context context, WakeLock wakeLock, long j) {
        if (wakeLock != null && !wakeLock.isHeld() && Gj.b(context)) {
            try {
                wakeLock.acquire(j);
                return true;
            } catch (Exception e) {
                a.a((Throwable) e);
            }
        }
        return false;
    }

    static void a(WakeLock wakeLock) {
        if (wakeLock != null) {
            try {
                if (wakeLock.isHeld()) {
                    wakeLock.release();
                }
            } catch (Exception e) {
                a.a((Throwable) e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        return r7;
     */
    public static ComponentName a(Context context, Intent intent) {
        synchronized (b) {
            int i = c;
            c++;
            if (c <= 0) {
                c = 1;
            }
            intent.putExtra("com.evernote.android.job.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("wake:");
            sb.append(startService.flattenToShortString());
            WakeLock a2 = a(context, sb.toString(), TimeUnit.MINUTES.toMillis(3));
            if (a2 != null) {
                b.put(i, a2);
            }
        }
    }

    public static boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("com.evernote.android.job.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (b) {
            a((WakeLock) b.get(intExtra));
            b.remove(intExtra);
        }
        return true;
    }
}
