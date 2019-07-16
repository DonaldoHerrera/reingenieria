package com.soundcloud.android.profile;

import com.soundcloud.android.profile.P.d;
import com.soundcloud.android.profile.P.e;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ProfileBucketsDataSource.kt */
public final class J {
    public static final List<P> a(List<? extends P> list) {
        C7471uYa.b(list, "$this$playables");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            P p = (P) next;
            if ((p instanceof e) || (p instanceof d)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
