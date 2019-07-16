package androidx.transition;

import java.util.ArrayList;

/* renamed from: androidx.transition.ca reason: case insensitive filesystem */
/* compiled from: TransitionManager */
class C0442ca extends C0440ba {
    final /* synthetic */ T a;
    final /* synthetic */ a b;

    C0442ca(a aVar, T t) {
        this.b = aVar;
        this.a = t;
    }

    public void d(Transition transition) {
        ((ArrayList) this.a.get(this.b.b)).remove(transition);
    }
}
