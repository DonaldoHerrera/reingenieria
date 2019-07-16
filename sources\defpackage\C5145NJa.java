package defpackage;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.Snackbar.a;

/* renamed from: NJa reason: default package and case insensitive filesystem */
/* compiled from: SnackbarWrapper.kt */
public final class C5145NJa extends a {
    final /* synthetic */ _Xa a;

    C5145NJa(_Xa _xa) {
        this.a = _xa;
    }

    public void a(Snackbar snackbar, int i) {
        Hca hca;
        _Xa _xa = this.a;
        if (i == 0) {
            hca = Hca.SWIPE;
        } else if (i == 1) {
            hca = Hca.ACTION;
        } else if (i == 2) {
            hca = Hca.TIMEOUT;
        } else if (i == 3) {
            hca = Hca.MANUAL;
        } else if (i == 4) {
            hca = Hca.CONSECUTIVE;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to map Snackbar event ");
            sb.append(i);
            sb.append(" to FeedbackDismissSource");
            throw new IllegalStateException(sb.toString());
        }
        _xa.invoke(hca);
    }
}
