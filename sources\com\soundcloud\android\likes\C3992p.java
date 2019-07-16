package com.soundcloud.android.likes;

import com.soundcloud.android.collections.data.J;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.soundcloud.android.likes.p reason: case insensitive filesystem */
/* compiled from: LikesStateProvider.kt */
final class C3992p<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ _Xa a;

    C3992p(_Xa _xa) {
        this.a = _xa;
    }

    /* renamed from: a */
    public final Map<C3508cda, J> apply(Map<C3508cda, J> map) {
        C7471uYa.b(map, "it");
        _Xa _xa = this.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            if (((Boolean) _xa.invoke(entry)).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
