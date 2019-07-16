package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: THa reason: default package and case insensitive filesystem */
/* compiled from: Sleeper */
public class C5323THa {
    public void a(long j, TimeUnit timeUnit) {
        a(timeUnit.toMillis(j));
    }

    public void a(long j) {
        SystemClock.sleep(j);
    }
}
