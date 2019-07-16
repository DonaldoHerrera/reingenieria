package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: Xq reason: default package */
/* compiled from: SystemHandlerWrapper */
final class Xq implements Hq {
    private final Handler a;

    public Xq(Handler handler) {
        this.a = handler;
    }

    public Looper a() {
        return this.a.getLooper();
    }

    public void b(int i) {
        this.a.removeMessages(i);
    }

    public Message a(int i, Object obj) {
        return this.a.obtainMessage(i, obj);
    }

    public Message a(int i, int i2, int i3) {
        return this.a.obtainMessage(i, i2, i3);
    }

    public Message a(int i, int i2, int i3, Object obj) {
        return this.a.obtainMessage(i, i2, i3, obj);
    }

    public boolean a(int i) {
        return this.a.sendEmptyMessage(i);
    }

    public boolean a(int i, long j) {
        return this.a.sendEmptyMessageAtTime(i, j);
    }
}
