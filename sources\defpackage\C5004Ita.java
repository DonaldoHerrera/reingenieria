package defpackage;

import com.soundcloud.android.tracks.C6185ma;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: Ita reason: default package and case insensitive filesystem */
/* compiled from: Observables.kt */
public final class C5004Ita<T1, T2, T3, T4, R> implements C6912mQa<T1, T2, T3, T4, R> {
    final /* synthetic */ C6376eYa a;
    final /* synthetic */ C6376eYa b;
    final /* synthetic */ C6376eYa c;

    public C5004Ita(C6376eYa eya, C6376eYa eya2, C6376eYa eya3) {
        this.a = eya;
        this.b = eya2;
        this.c = eya3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        if (r5 != null) goto L_0x006b;
     */
    public final R a(T1 t1, T2 t2, T3 t3, T4 t4) {
        Object obj;
        Map map = (Map) t4;
        Map map2 = (Map) t3;
        Map map3 = (Map) t2;
        List list = (List) t1;
        C7471uYa.a((Object) list, "items");
        R arrayList = new ArrayList();
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            Object obj2 = null;
            if (i >= 0) {
                C3759eda eda = (C3759eda) next;
                C6185ma maVar = (C6185ma) map3.get(eda.c());
                String str = "Required value was null.";
                if (maVar != null) {
                    C6376eYa eya = this.a;
                    if (eya != null) {
                        obj = eya.a(maVar, eda, Integer.valueOf(i));
                    } else {
                        throw new IllegalArgumentException(str);
                    }
                }
                C4954HFa hFa = (C4954HFa) map2.get(eda.c());
                if (hFa != null) {
                    C6376eYa eya2 = this.b;
                    if (eya2 != null) {
                        obj = eya2.a(hFa, eda, Integer.valueOf(i));
                    } else {
                        throw new IllegalArgumentException(str);
                    }
                } else {
                    obj = null;
                }
                if (obj != null) {
                    obj2 = obj;
                } else {
                    C3863rda rda = (C3863rda) map.get(eda.c());
                    if (rda != null) {
                        C6376eYa eya3 = this.c;
                        if (eya3 != null) {
                            obj2 = eya3.a(rda, eda, Integer.valueOf(i));
                        } else {
                            throw new IllegalArgumentException(str);
                        }
                    }
                }
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
                i = i2;
            } else {
                C6782kWa.c();
                throw null;
            }
        }
        return arrayList;
    }
}
