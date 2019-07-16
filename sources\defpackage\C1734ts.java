package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: ts reason: default package and case insensitive filesystem */
final class C1734ts implements C1645qs {
    private C1734ts() {
    }

    public final ExecutorService a(int i, ThreadFactory threadFactory, int i2) {
        return Executors.newFixedThreadPool(2, threadFactory);
    }
}
