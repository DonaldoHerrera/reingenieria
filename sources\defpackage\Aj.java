package defpackage;

import android.os.SystemClock;

/* renamed from: Aj reason: default package */
/* compiled from: Clock */
class Aj implements Bj {
    Aj() {
    }

    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
