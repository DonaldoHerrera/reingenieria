package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: Wq reason: default package */
/* compiled from: SystemClock */
final class Wq implements C1882yq {
    Wq() {
    }

    public long a() {
        return SystemClock.uptimeMillis();
    }

    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    public Hq a(Looper looper, Callback callback) {
        return new Xq(new Handler(looper, callback));
    }
}
