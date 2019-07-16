package com.soundcloud.android.profile;

import com.soundcloud.android.profile.Lc.a;
import com.soundcloud.android.tracks.C6185ma;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: UserProfileOperations.kt */
final class Qc extends C7540vYa implements C6376eYa<Map<C3508cda, ? extends C6185ma>, Map<C3508cda, ? extends C4954HFa>, Map<C3508cda, ? extends C3863rda>, List<? extends a>> {
    final /* synthetic */ Pca a;

    Qc(Pca pca) {
        this.a = pca;
        super(3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064 A[SYNTHETIC] */
    public final List<a> a(Map<C3508cda, ? extends C6185ma> map, Map<C3508cda, C4954HFa> map2, Map<C3508cda, ? extends C3863rda> map3) {
        Object obj;
        C7471uYa.b(map, "tracks");
        C7471uYa.b(map2, "<anonymous parameter 1>");
        C7471uYa.b(map3, "playlists");
        Pca pca = this.a;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object next : pca) {
            int i2 = i + 1;
            if (i >= 0) {
                C5775e eVar = (C5775e) next;
                Yda c = eVar.c();
                if (c != null) {
                    C6185ma maVar = (C6185ma) map.get(c.w());
                    if (maVar != null) {
                        obj = new a(maVar, null, 2, null);
                        if (obj != null) {
                            arrayList.add(obj);
                        }
                        i = i2;
                    }
                }
                C3927zda b = eVar.b();
                if (b != null) {
                    C3863rda rda = (C3863rda) map3.get(b.a());
                    if (rda != null) {
                        obj = new a(null, rda, 1, null);
                        if (obj != null) {
                        }
                        i = i2;
                    }
                }
                obj = null;
                if (obj != null) {
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
