package androidx.core.app;

import android.os.Build.VERSION;

public abstract class SafeJobIntentService extends JobIntentService {
    /* access modifiers changed from: 0000 */
    public e a() {
        try {
            return super.a();
        } catch (SecurityException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void onCreate() {
        super.onCreate();
        if (VERSION.SDK_INT >= 26) {
            this.c = new p(this);
        } else {
            this.c = null;
        }
    }
}
