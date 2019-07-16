package androidx.appcompat.view.menu;

import android.view.MenuItem;

/* compiled from: CascadingMenuPopup */
class g implements Runnable {
    final /* synthetic */ a a;
    final /* synthetic */ MenuItem b;
    final /* synthetic */ l c;
    final /* synthetic */ h d;

    g(h hVar, a aVar, MenuItem menuItem, l lVar) {
        this.d = hVar;
        this.a = aVar;
        this.b = menuItem;
        this.c = lVar;
    }

    public void run() {
        a aVar = this.a;
        if (aVar != null) {
            this.d.a.B = true;
            aVar.b.a(false);
            this.d.a.B = false;
        }
        if (this.b.isEnabled() && this.b.hasSubMenu()) {
            this.c.a(this.b, 4);
        }
    }
}
