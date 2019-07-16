package androidx.transition;

import android.view.View;
import androidx.transition.Transition.c;

/* renamed from: androidx.transition.t reason: case insensitive filesystem */
/* compiled from: Fade */
class C0461t extends C0440ba {
    final /* synthetic */ View a;
    final /* synthetic */ Fade b;

    C0461t(Fade fade, View view) {
        this.b = fade;
        this.a = view;
    }

    public void d(Transition transition) {
        wa.a(this.a, 1.0f);
        wa.a(this.a);
        transition.b((c) this);
    }
}
