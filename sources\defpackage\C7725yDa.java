package defpackage;

import java.util.concurrent.Callable;

/* renamed from: yDa reason: default package and case insensitive filesystem */
/* compiled from: MediaStreamsRepository.kt */
final class C7725yDa<V> implements Callable<C7669xPa<? extends T>> {
    final /* synthetic */ C4735ADa a;
    final /* synthetic */ C3508cda b;

    C7725yDa(C4735ADa aDa, C3508cda cda) {
        this.a = aDa;
        this.b = cda;
    }

    public final C7531vPa<String> call() {
        return this.a.d(this.b);
    }
}
