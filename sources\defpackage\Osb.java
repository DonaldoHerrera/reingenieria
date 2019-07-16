package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: Osb reason: default package */
/* compiled from: NoLock */
class Osb implements Lock {
    public static final Lock a = new Osb();

    private Osb() {
    }

    private static /* synthetic */ void a(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"unit", "kotlin/reflect/jvm/internal/impl/storage/NoLock", "tryLock"}));
    }

    public void lock() {
    }

    public void lockInterruptibly() throws InterruptedException {
        throw new UnsupportedOperationException("Should not be called");
    }

    public Condition newCondition() {
        throw new UnsupportedOperationException("Should not be called");
    }

    public boolean tryLock() {
        throw new UnsupportedOperationException("Should not be called");
    }

    public void unlock() {
    }

    public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
        if (timeUnit == null) {
            a(0);
            throw null;
        }
        throw new UnsupportedOperationException("Should not be called");
    }
}
