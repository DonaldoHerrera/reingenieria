package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: Tta reason: default package and case insensitive filesystem */
/* compiled from: Observables.kt */
public final class C5338Tta<T1, T2, R> implements C6504gQa<T1, T2, R> {
    public final R apply(T1 t1, T2 t2) {
        Map map = (Map) t2;
        List<C3508cda> list = (List) t1;
        C7471uYa.a((Object) list, "items");
        R arrayList = new ArrayList();
        for (C3508cda cda : list) {
            C4954HFa hFa = (C4954HFa) map.get(cda);
            if (hFa != null) {
                arrayList.add(hFa);
            }
        }
        return arrayList;
    }
}
