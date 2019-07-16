package defpackage;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.Snackbar.a;

/* renamed from: MJa reason: default package and case insensitive filesystem */
/* compiled from: SnackbarWrapper.kt */
public final class C5114MJa extends a {
    final /* synthetic */ C5175OJa a;
    final /* synthetic */ View b;
    final /* synthetic */ Fca c;
    final /* synthetic */ Integer d;

    C5114MJa(C5175OJa oJa, View view, Fca fca, Integer num) {
        this.a = oJa;
        this.b = view;
        this.c = fca;
        this.d = num;
    }

    public void a(Snackbar snackbar, int i) {
        super.a(snackbar, i);
        this.a.b(this.b, this.c, this.d);
    }
}
