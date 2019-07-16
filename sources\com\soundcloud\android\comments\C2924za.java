package com.soundcloud.android.comments;

import com.soundcloud.android.comments.mb.a;
import com.soundcloud.android.comments.mb.a.C0062a;
import com.soundcloud.android.comments.mb.a.b;

/* renamed from: com.soundcloud.android.comments.za reason: case insensitive filesystem */
/* compiled from: CommentsPresenter.kt */
final class C2924za extends C7540vYa implements _Xa<a, RVa> {
    final /* synthetic */ Z a;
    final /* synthetic */ Da b;

    C2924za(Z z, Da da) {
        this.a = z;
        this.b = da;
        super(1);
    }

    public final void a(a aVar) {
        if (aVar instanceof b) {
            this.a.b(this.b);
        } else if (aVar instanceof C0062a) {
            this.a.a((C0062a) aVar, this.b);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((a) obj);
        return RVa.a;
    }
}
