package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.e reason: case insensitive filesystem */
/* compiled from: ActionBarOverlayLayout */
class C0338e implements Runnable {
    final /* synthetic */ ActionBarOverlayLayout a;

    C0338e(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public void run() {
        this.a.h();
        ActionBarOverlayLayout actionBarOverlayLayout = this.a;
        actionBarOverlayLayout.x = actionBarOverlayLayout.e.animate().translationY(0.0f).setListener(this.a.y);
    }
}
