package defpackage;

import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.B;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: Sj reason: default package */
/* compiled from: AnalyticsUserIDStore */
class Sj {
    private static final String a = "Sj";
    private static ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    private static String c;
    private static volatile boolean d = false;

    public static String b() {
        if (!d) {
            Log.w(a, "initStore should have been called before calling setUserID");
            d();
        }
        b.readLock().lock();
        try {
            return c;
        } finally {
            b.readLock().unlock();
        }
    }

    public static void c() {
        if (!d) {
            C1452kk.b().execute(new Rj());
        }
    }

    /* access modifiers changed from: private */
    public static void d() {
        if (!d) {
            b.writeLock().lock();
            try {
                if (!d) {
                    c = PreferenceManager.getDefaultSharedPreferences(B.e()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                    d = true;
                    b.writeLock().unlock();
                }
            } finally {
                b.writeLock().unlock();
            }
        }
    }
}
