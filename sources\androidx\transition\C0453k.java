package androidx.transition;

import android.view.ViewGroup;
import androidx.transition.Transition.c;

/* renamed from: androidx.transition.k reason: case insensitive filesystem */
/* compiled from: ChangeBounds */
class C0453k extends C0440ba {
    boolean a = false;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ ChangeBounds c;

    C0453k(ChangeBounds changeBounds, ViewGroup viewGroup) {
        this.c = changeBounds;
        this.b = viewGroup;
    }

    public void a(Transition transition) {
        na.a(this.b, true);
    }

    public void c(Transition transition) {
        na.a(this.b, false);
    }

    public void d(Transition transition) {
        if (!this.a) {
            na.a(this.b, false);
        }
        transition.b((c) this);
    }
}
