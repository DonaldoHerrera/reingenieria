package defpackage;

import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.tracks.C6158da;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.upsell.a;
import java.util.List;

/* renamed from: Hsa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistUpsellOperations */
public class C4972Hsa {
    private final C2526g a;
    private final a b;

    C4972Hsa(C2526g gVar, a aVar) {
        this.a = gVar;
        this.b = aVar;
    }

    private boolean b() {
        return this.b.d();
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<f> a(C3863rda rda, List<C6185ma> list) {
        boolean equals = rda.e().equals(this.a.c());
        if (!b() || equals) {
            return C4928GKa.a();
        }
        C4928GKa a2 = a(list);
        if (a2.c()) {
            return C4928GKa.c(new f((C6185ma) a2.b(), rda.a()));
        }
        return C4928GKa.a();
    }

    private C4928GKa<C6185ma> a(List<C6185ma> list) {
        for (C6185ma maVar : list) {
            if (C6158da.b(maVar)) {
                return C4928GKa.c(maVar);
            }
        }
        return C4928GKa.a();
    }

    public void a() {
        this.b.b();
    }
}
