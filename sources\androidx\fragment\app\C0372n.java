package androidx.fragment.app;

/* renamed from: androidx.fragment.app.n reason: case insensitive filesystem */
/* compiled from: FragmentManagerImpl */
class C0372n implements Runnable {
    final /* synthetic */ C0373o a;

    C0372n(C0373o oVar) {
        this.a = oVar;
    }

    public void run() {
        if (this.a.c.getAnimatingAway() != null) {
            this.a.c.setAnimatingAway(null);
            C0373o oVar = this.a;
            C0377t tVar = oVar.d;
            Fragment fragment = oVar.c;
            tVar.a(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
        }
    }
}
