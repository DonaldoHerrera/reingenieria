package defpackage;

import android.view.View;

/* renamed from: Hea reason: default package */
/* compiled from: IntroductoryOverlayPresenter */
class Hea extends a {
    final /* synthetic */ View a;
    final /* synthetic */ Iea b;

    Hea(Iea iea, View view) {
        this.b = iea;
        this.a = view;
    }

    public void a(Nl nl) {
        super.a(nl);
        nl.a(false);
    }

    public void c(Nl nl) {
        super.c(nl);
        this.a.performClick();
    }
}
