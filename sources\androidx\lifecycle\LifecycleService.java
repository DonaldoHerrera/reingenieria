package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LifecycleService extends Service implements h {
    private final s a = new s(this);

    public f getLifecycle() {
        return this.a.a();
    }

    public IBinder onBind(Intent intent) {
        this.a.b();
        return null;
    }

    public void onCreate() {
        this.a.c();
        super.onCreate();
    }

    public void onDestroy() {
        this.a.d();
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        this.a.e();
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
