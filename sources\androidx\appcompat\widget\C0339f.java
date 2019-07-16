package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.f reason: case insensitive filesystem */
/* compiled from: ActionBarOverlayLayout */
class C0339f implements Runnable {
    final /* synthetic */ ActionBarOverlayLayout a;

    C0339f(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public void run() {
        this.a.h();
        ActionBarOverlayLayout actionBarOverlayLayout = this.a;
        actionBarOverlayLayout.x = actionBarOverlayLayout.e.animate().translationY((float) (-this.a.e.getHeight())).setListener(this.a.y);
    }
}
