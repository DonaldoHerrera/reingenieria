package com.soundcloud.android.offline;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: DownloadOperations.kt */
final class Zb<V> implements Callable<T> {
    final /* synthetic */ Vb a;
    final /* synthetic */ Collection b;

    Zb(Vb vb, Collection collection) {
        this.a = vb;
        this.b = collection;
    }

    public final List<C3508cda> call() {
        Collection collection = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object next : collection) {
            if (this.a.c.c((C3508cda) next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
