package com.soundcloud.android.comments;

import com.soundcloud.android.ia.p;

/* compiled from: ConfirmPrimaryEmailDialogFragment.kt */
public final class Ia extends C4943Gua {
    final /* synthetic */ Ga d;

    Ia(Ga ga) {
        this.d = ga;
    }

    public void a(Throwable th) {
        C7471uYa.b(th, "e");
        super.a(th);
        C5052KJa Sb = this.d.Sb();
        Fca fca = new Fca(p.confirm_primary_email_error, 0, 0, null, null, null, 62, null);
        Sb.a(fca);
    }

    public void onComplete() {
        super.onComplete();
        C5052KJa Sb = this.d.Sb();
        Fca fca = new Fca(p.confirm_primary_email_sent, 0, 0, null, null, null, 62, null);
        Sb.a(fca);
    }
}
