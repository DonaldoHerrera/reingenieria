package androidx.work.impl.background.systemalarm;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: WorkTimer */
class i implements ThreadFactory {
    private int a = 0;
    final /* synthetic */ j b;

    i(j jVar) {
        this.b = jVar;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        StringBuilder sb = new StringBuilder();
        sb.append("WorkManager-WorkTimer-thread-");
        sb.append(this.a);
        newThread.setName(sb.toString());
        this.a++;
        return newThread;
    }
}
