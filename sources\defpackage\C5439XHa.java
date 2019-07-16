package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: XHa reason: default package and case insensitive filesystem */
/* compiled from: TryWithBackOff */
public class C5439XHa<T> {
    private final C5323THa a;
    private final long b;
    private final TimeUnit c;
    private final int d;
    private final int e;

    /* renamed from: XHa$a */
    /* compiled from: TryWithBackOff */
    public static class a {
        private final C5323THa a;

        public a(C5323THa tHa) {
            this.a = tHa;
        }

        public <T> C5439XHa<T> a() {
            return a(1, TimeUnit.SECONDS, 2, 3);
        }

        public <T> C5439XHa<T> a(long j, TimeUnit timeUnit, int i, int i2) {
            C5439XHa xHa = new C5439XHa(this.a, j, timeUnit, i, i2);
            return xHa;
        }
    }

    C5439XHa(C5323THa tHa, long j, TimeUnit timeUnit, int i, int i2) {
        if (i2 > 0) {
            this.a = tHa;
            this.b = j;
            this.c = timeUnit;
            this.d = i;
            this.e = i2;
            return;
        }
        throw new IllegalArgumentException("Must have max attempts > 0");
    }

    public T a(Callable<T> callable) throws Exception {
        long j = this.b;
        int i = 1;
        Exception e2 = null;
        while (i <= this.e) {
            try {
                return callable.call();
            } catch (Exception e3) {
                e2 = e3;
                e2.printStackTrace();
                this.a.a(j, this.c);
                j *= (long) this.d;
                i++;
            }
        }
        throw e2;
    }
}
