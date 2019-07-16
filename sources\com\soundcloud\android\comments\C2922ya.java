package com.soundcloud.android.comments;

import com.soundcloud.android.foundation.events.C3702d;
import com.soundcloud.android.foundation.events.C3702d.e.b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;

/* renamed from: com.soundcloud.android.comments.ya reason: case insensitive filesystem */
/* compiled from: CommentsPresenter.kt */
final class C2922ya<T> implements C6776kQa<Pa> {
    final /* synthetic */ Z a;

    C2922ya(Z z) {
        this.a = z;
    }

    /* renamed from: a */
    public final void accept(Pa pa) {
        this.a.n.a((C3702d) b.c);
        this.a.n.a((J) K.a.a(pa.d(), pa.c(), pa.e()));
        mb c = this.a.o;
        C7471uYa.a((Object) pa, "newComment");
        c.a(pa, pa.d(), pa.b());
    }
}
