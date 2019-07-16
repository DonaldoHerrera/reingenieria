package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: Fb reason: default package and case insensitive filesystem */
/* compiled from: SelfDestructiveThread */
class C0205Fb implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ Callable b;
    final /* synthetic */ ReentrantLock c;
    final /* synthetic */ AtomicBoolean d;
    final /* synthetic */ Condition e;
    final /* synthetic */ C0208Gb f;

    C0205Fb(C0208Gb gb, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
        this.f = gb;
        this.a = atomicReference;
        this.b = callable;
        this.c = reentrantLock;
        this.d = atomicBoolean;
        this.e = condition;
    }

    public void run() {
        try {
            this.a.set(this.b.call());
        } catch (Exception unused) {
        }
        this.c.lock();
        try {
            this.d.set(false);
            this.e.signal();
        } finally {
            this.c.unlock();
        }
    }
}
