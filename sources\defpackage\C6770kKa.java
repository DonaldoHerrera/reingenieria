package defpackage;

import java.util.concurrent.Callable;

/* renamed from: kKa reason: default package and case insensitive filesystem */
/* compiled from: WaveformStorage.kt */
final class C6770kKa<V> implements Callable<T> {
    final /* synthetic */ C6838lKa a;
    final /* synthetic */ C3508cda b;

    C6770kKa(C6838lKa lka, C3508cda cda) {
        this.a = lka;
        this.b = cda;
    }

    public final C5325TJa call() {
        try {
            return (C5325TJa) this.a.a.b(this.a.c(this.b));
        } catch (Exception e) {
            a.a(this.a.b, e, null, 2, null);
            return null;
        }
    }
}
