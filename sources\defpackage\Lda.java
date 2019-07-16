package defpackage;

import java.util.concurrent.Callable;

/* renamed from: Lda reason: default package */
/* compiled from: ResponseMappings.kt */
final class Lda<V> implements Callable<T> {
    final /* synthetic */ Pda a;

    Lda(Pda pda) {
        this.a = pda;
    }

    public final T call() {
        Pda pda = this.a;
        if (pda instanceof b) {
            return ((b) pda).a();
        }
        if (pda instanceof a) {
            return ((a) pda).a();
        }
        if (!(pda instanceof c)) {
            throw new FVa();
        } else if (((c) pda).a() == null) {
            return null;
        } else {
            throw ((c) this.a).a();
        }
    }
}
