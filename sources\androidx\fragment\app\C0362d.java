package androidx.fragment.app;

/* renamed from: androidx.fragment.app.d reason: case insensitive filesystem */
/* compiled from: Fragment */
class C0362d implements Runnable {
    final /* synthetic */ Fragment a;

    C0362d(Fragment fragment) {
        this.a = fragment;
    }

    public void run() {
        this.a.callStartTransitionListener();
    }
}
