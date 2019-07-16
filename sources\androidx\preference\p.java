package androidx.preference;

import android.os.Handler;
import android.os.Message;

/* compiled from: PreferenceFragmentCompat */
class p extends Handler {
    final /* synthetic */ s a;

    p(s sVar) {
        this.a = sVar;
    }

    public void handleMessage(Message message) {
        if (message.what == 1) {
            this.a.bindPreferences();
        }
    }
}
