package defpackage;

import com.soundcloud.android.foundation.playqueue.F;
import com.soundcloud.android.foundation.playqueue.q;

/* renamed from: ica reason: default package and case insensitive filesystem */
/* compiled from: PlayQueueItemVerifier */
class C3790ica {
    private final C6834lGa a;
    private final C3815lda b;

    C3790ica(C6834lGa lga, C3815lda lda) {
        this.a = lga;
        this.b = lda;
    }

    private boolean b(q qVar) {
        return qVar.e() || (qVar.j() && !((F) qVar).s());
    }

    private boolean c(q qVar) {
        return this.b.a().a(qVar.c()) == C3823mda.DOWNLOADED;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(q qVar) {
        return b(qVar) && (this.a.d() || c(qVar));
    }
}
