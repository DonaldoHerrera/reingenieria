package dagger.android;

import android.app.IntentService;
import android.app.Service;

public abstract class DaggerIntentService extends IntentService {
    public void onCreate() {
        a.a((Service) this);
        super.onCreate();
    }
}
