package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: iUa reason: default package and case insensitive filesystem */
/* compiled from: RxThreadFactory */
public final class C6644iUa extends AtomicLong implements ThreadFactory {
    final String a;
    final int b;
    final boolean c;

    /* renamed from: iUa$a */
    /* compiled from: RxThreadFactory */
    static final class a extends Thread implements C6576hUa {
        a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public C6644iUa(String str) {
        this(str, 5, false);
    }

    public Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder(this.a);
        sb.append('-');
        sb.append(incrementAndGet());
        String sb2 = sb.toString();
        Thread aVar = this.c ? new a(runnable, sb2) : new Thread(runnable, sb2);
        aVar.setPriority(this.b);
        aVar.setDaemon(true);
        return aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RxThreadFactory[");
        sb.append(this.a);
        sb.append("]");
        return sb.toString();
    }

    public C6644iUa(String str, int i) {
        this(str, i, false);
    }

    public C6644iUa(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }
}
