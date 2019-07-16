package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.customtabs.IPostMessageService.Stub;

public class PostMessageService extends Service {
    private Stub a = new h(this);

    public IBinder onBind(Intent intent) {
        return this.a;
    }
}
