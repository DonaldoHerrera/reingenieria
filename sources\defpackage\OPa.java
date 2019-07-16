package defpackage;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: OPa reason: default package */
/* compiled from: MainThreadDisposable */
public abstract class OPa implements VPa {
    private final AtomicBoolean a = new AtomicBoolean();

    public final boolean a() {
        return this.a.get();
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    public final void dispose() {
        if (!this.a.compareAndSet(false, true)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b();
        } else {
            RPa.a().a(new NPa(this));
        }
    }
}
