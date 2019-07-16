package com.soundcloud.android.stations;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.soundcloud.android.stations.fa reason: case insensitive filesystem */
/* compiled from: DefaultStationsRepository.kt */
final class C6006fa<V> implements Callable<T> {
    final /* synthetic */ T a;
    final /* synthetic */ List b;

    C6006fa(T t, List list) {
        this.a = t;
        this.b = list;
    }

    public final List<C6043s> call() {
        return this.a.e.a(this.b);
    }
}
