package defpackage;

import com.soundcloud.android.likes.C3988l;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: yra reason: default package and case insensitive filesystem */
/* compiled from: Observables.kt */
public final class C7770yra<T1, T2, T3, T4, R> implements C6912mQa<T1, T2, T3, T4, R> {
    final /* synthetic */ C4785Bra a;

    public C7770yra(C4785Bra bra) {
        this.a = bra;
    }

    public final R a(T1 t1, T2 t2, T3 t3, T4 t4) {
        C3807kda kda = (C3807kda) t4;
        C2057GR gr = (C2057GR) t3;
        C3988l lVar = (C3988l) t2;
        Map map = (Map) t1;
        R linkedHashMap = new LinkedHashMap(LWa.a(map.size()));
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), this.a.b.a((Eda) entry.getValue(), lVar, gr, kda));
        }
        return linkedHashMap;
    }
}
