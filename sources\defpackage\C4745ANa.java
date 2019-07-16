package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ANa reason: default package and case insensitive filesystem */
/* compiled from: ExecutorUtils */
class C4745ANa implements ThreadFactory {
    final /* synthetic */ String a;
    final /* synthetic */ AtomicLong b;

    C4745ANa(String str, AtomicLong atomicLong) {
        this.a = str;
        this.b = atomicLong;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new C7805zNa(this, runnable));
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(this.b.getAndIncrement());
        newThread.setName(sb.toString());
        return newThread;
    }
}
