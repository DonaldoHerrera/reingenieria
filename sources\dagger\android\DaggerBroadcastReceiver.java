package dagger.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public abstract class DaggerBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        a.a(this, context);
    }
}
