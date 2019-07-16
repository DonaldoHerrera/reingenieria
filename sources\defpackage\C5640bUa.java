package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bUa reason: default package and case insensitive filesystem */
/* compiled from: DisposeOnCancel */
final class C5640bUa implements Future<Object> {
    final VPa a;

    C5640bUa(VPa vPa) {
        this.a = vPa;
    }

    public boolean cancel(boolean z) {
        this.a.dispose();
        return false;
    }

    public Object get() throws InterruptedException, ExecutionException {
        return null;
    }

    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return false;
    }
}
