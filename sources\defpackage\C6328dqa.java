package defpackage;

import com.soundcloud.android.foundation.playqueue.u;
import com.soundcloud.android.playback.Db.a;
import com.soundcloud.android.tracks.C6185ma;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: dqa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistDetailViewMapper.kt */
public final class C6328dqa {
    private final C4972Hsa a;
    private final C6600hqa b;

    public C6328dqa(C4972Hsa hsa, C6600hqa hqa) {
        C7471uYa.b(hsa, "playlistUpsellOperations");
        C7471uYa.b(hqa, "playlistDetailsMetadataBuilder");
        this.a = hsa;
        this.b = hqa;
    }

    private final d b(C6464fqa fqa) {
        List b2 = fqa.b();
        if (b2 == null || b2.isEmpty()) {
            return null;
        }
        C3863rda c = fqa.c();
        if (c != null) {
            String d = c.d();
            C7471uYa.a((Object) d, "requireNotNull(playlistW…s.playlist).creatorName()");
            return new d(d, fqa.b(), fqa.c().F());
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final C7218qra a(C6464fqa fqa) {
        C7471uYa.b(fqa, "featureModel");
        C3863rda c = fqa.c();
        List<C6185ma> d = fqa.d();
        if (d == null) {
            d = Collections.emptyList();
            C7471uYa.a((Object) d, "emptyList()");
        }
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) d, 10));
        for (C6185ma maVar : d) {
            arrayList.add(u.a(maVar.a(), C4928GKa.b(maVar.y())));
        }
        C6532gqa a2 = this.b.a(c, d, fqa.e());
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) d, 10));
        int i = 0;
        for (Object next : d) {
            int i2 = i + 1;
            if (i >= 0) {
                C6185ma maVar2 = (C6185ma) next;
                C3508cda a3 = c.a();
                C7471uYa.a((Object) a3, "playlist.urn");
                C3508cda e = c.e();
                C7471uYa.a((Object) e, "playlist.creatorUrn()");
                e eVar = new e(a3, e, a2.k().h(), maVar2, false, new a(arrayList, i, a2.k()));
                arrayList2.add(eVar);
                i = i2;
            } else {
                C6782kWa.c();
                throw null;
            }
        }
        C7218qra qra = new C7218qra(a2, arrayList2, (f) this.a.a(c, d).d(), b(fqa), C4891FEa.a.a(fqa.a(), fqa.d() == null));
        return qra;
    }
}
