package defpackage;

import java.util.concurrent.Callable;

/* renamed from: Mda reason: default package */
/* compiled from: ResponseMappings.kt */
final class Mda<T, R> implements C7118pQa<T, C7669xPa<? extends R>> {
    public static final Mda a = new Mda();

    Mda() {
    }

    /* renamed from: a */
    public final C7531vPa<T> apply(Pda<T> pda) {
        C7471uYa.b(pda, "it");
        return C7531vPa.b((Callable<? extends T>) new Lda<Object>(pda));
    }
}
