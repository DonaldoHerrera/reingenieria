package com.soundcloud.android.likes;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: TrackLikeOperations.kt */
final class A<T, R> implements C7118pQa<T, R> {
    public static final A a = new A();

    A() {
    }

    public final int a(C3988l lVar) {
        C7471uYa.b(lVar, "likedStatuses");
        Set a2 = lVar.a();
        ArrayList arrayList = new ArrayList();
        for (Object next : a2) {
            if (((C3508cda) next).x()) {
                arrayList.add(next);
            }
        }
        return arrayList.size();
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        return Integer.valueOf(a((C3988l) obj));
    }
}
