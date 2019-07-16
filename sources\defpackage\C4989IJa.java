package defpackage;

import android.view.View;

/* renamed from: IJa reason: default package and case insensitive filesystem */
/* compiled from: CommentsFeedbackController.kt */
public final class C4989IJa {
    private View a;
    private final C5175OJa b;

    public C4989IJa(C5175OJa oJa) {
        C7471uYa.b(oJa, "snackbarWrapper");
        this.b = oJa;
    }

    public final void a(View view) {
        C7471uYa.b(view, "snackbarHolder");
        this.a = view;
    }

    public final void a() {
        this.a = null;
    }

    public final void a(Fca fca) {
        C7471uYa.b(fca, "feedback");
        View view = this.a;
        if (view != null) {
            C5175OJa.b(this.b, view, fca, null, 4, null);
            return;
        }
        throw new IllegalStateException("Snackbar holder must not be null");
    }
}
