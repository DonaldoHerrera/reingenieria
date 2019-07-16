package defpackage;

import android.view.View;

/* renamed from: Ql reason: default package */
/* compiled from: ViewTapTarget */
class Ql extends C1907zl {
    final View C;

    Ql(View view, CharSequence charSequence, CharSequence charSequence2) {
        super(charSequence, charSequence2);
        if (view != null) {
            this.C = view;
            return;
        }
        throw new IllegalArgumentException("Given null view to target");
    }

    public void a(Runnable runnable) {
        Sl.a(this.C, (Runnable) new Pl(this, runnable));
    }
}
