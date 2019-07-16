package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.LifecycleService;
import androidx.work.i;
import androidx.work.impl.utils.n;

public class SystemAlarmService extends LifecycleService implements b {
    private static final String b = i.a("SystemAlarmService");
    private g c;
    private boolean d;

    private void b() {
        this.c = new g(this);
        this.c.a((b) this);
    }

    public void a() {
        this.d = true;
        i.a().a(b, "All commands completed in dispatcher", new Throwable[0]);
        n.a();
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        b();
        this.d = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.d = true;
        this.c.f();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.d) {
            i.a().c(b, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.c.f();
            b();
            this.d = false;
        }
        if (intent != null) {
            this.c.a(intent, i2);
        }
        return 3;
    }
}
