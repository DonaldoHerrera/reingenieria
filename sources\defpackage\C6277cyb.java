package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: cyb reason: default package and case insensitive filesystem */
/* compiled from: ConnectionPool */
public final class C6277cyb {
    final C5683bzb a;

    public C6277cyb() {
        this(5, 5, TimeUnit.MINUTES);
    }

    public C6277cyb(int i, long j, TimeUnit timeUnit) {
        this.a = new C5683bzb(i, j, timeUnit);
    }
}
