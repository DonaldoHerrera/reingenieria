package defpackage;

import java.util.concurrent.Callable;

/* renamed from: dKa reason: default package and case insensitive filesystem */
/* compiled from: WaveformOperations.kt */
final class C6294dKa<V> implements Callable<T> {
    final /* synthetic */ C5630bKa a;

    C6294dKa(C5630bKa bka) {
        this.a = bka;
    }

    public final C5325TJa call() {
        return this.a.d.a(this.a.e.b("default_waveform.json"));
    }
}
