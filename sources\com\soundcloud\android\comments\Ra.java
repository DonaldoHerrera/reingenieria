package com.soundcloud.android.comments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PlayerCommentOperations.kt */
final class Ra extends C7540vYa implements PXa<List<? extends C3508cda>> {
    final /* synthetic */ Collection a;

    Ra(Collection collection) {
        this.a = collection;
        super(0);
    }

    public final List<C3508cda> d() {
        Collection<C3791ida> collection = this.a;
        C7471uYa.a((Object) collection, "it");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) collection, 10));
        for (C3791ida b : collection) {
            arrayList.add(b.b());
        }
        return arrayList;
    }
}
