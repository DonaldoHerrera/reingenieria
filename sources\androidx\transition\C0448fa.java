package androidx.transition;

import androidx.transition.Transition.c;

/* renamed from: androidx.transition.fa reason: case insensitive filesystem */
/* compiled from: TransitionSet */
class C0448fa extends C0440ba {
    final /* synthetic */ Transition a;
    final /* synthetic */ TransitionSet b;

    C0448fa(TransitionSet transitionSet, Transition transition) {
        this.b = transitionSet;
        this.a = transition;
    }

    public void d(Transition transition) {
        this.a.B();
        transition.b((c) this);
    }
}
