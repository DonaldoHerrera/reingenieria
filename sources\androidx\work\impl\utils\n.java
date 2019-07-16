package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import androidx.work.i;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: WakeLocks */
public class n {
    private static final String a = i.a("WakeLocks");
    private static final WeakHashMap<WakeLock, String> b = new WeakHashMap<>();

    public static WakeLock a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        StringBuilder sb = new StringBuilder();
        sb.append("WorkManager: ");
        sb.append(str);
        String sb2 = sb.toString();
        WakeLock newWakeLock = powerManager.newWakeLock(1, sb2);
        synchronized (b) {
            b.put(newWakeLock, sb2);
        }
        return newWakeLock;
    }

    public static void a() {
        HashMap hashMap = new HashMap();
        synchronized (b) {
            hashMap.putAll(b);
        }
        for (WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                i.a().e(a, String.format("WakeLock held for %s", new Object[]{hashMap.get(wakeLock)}), new Throwable[0]);
            }
        }
    }
}
