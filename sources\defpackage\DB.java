package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: DB reason: default package */
final class DB extends BroadcastReceiver {
    private final /* synthetic */ CB a;

    private DB(CB cb) {
        this.a = cb;
    }

    /* synthetic */ DB(CB cb, byte b) {
        this(cb);
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.a(context, intent);
    }
}
