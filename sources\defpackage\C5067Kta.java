package defpackage;

import com.soundcloud.android.tracks.C6185ma;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: Kta reason: default package and case insensitive filesystem */
/* compiled from: Observables.kt */
public final class C5067Kta<T1, T2, T3, T4, R> implements C6912mQa<T1, T2, T3, T4, R> {
    public final R a(T1 t1, T2 t2, T3 t3, T4 t4) {
        Map map = (Map) t4;
        Map map2 = (Map) t3;
        Map map3 = (Map) t2;
        List<C3508cda> list = (List) t1;
        C7471uYa.a((Object) list, "items");
        R arrayList = new ArrayList();
        for (C3508cda cda : list) {
            Wca wca = (C6185ma) map3.get(cda);
            if (wca == null) {
                wca = (Wca) map2.get(cda);
            }
            if (wca == null) {
                wca = (Wca) map.get(cda);
            }
            if (wca != null) {
                arrayList.add(wca);
            }
        }
        return arrayList;
    }
}
