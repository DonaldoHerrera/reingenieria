package defpackage;

import android.os.Process;

/* renamed from: rNa reason: default package and case insensitive filesystem */
/* compiled from: BackgroundPriorityRunnable */
public abstract class C7253rNa implements Runnable {
    /* access modifiers changed from: protected */
    public abstract void a();

    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
