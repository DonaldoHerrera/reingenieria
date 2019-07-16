package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: androidx.appcompat.view.menu.e reason: case insensitive filesystem */
/* compiled from: CascadingMenuPopup */
class C0330e implements OnGlobalLayoutListener {
    final /* synthetic */ i a;

    C0330e(i iVar) {
        this.a = iVar;
    }

    public void onGlobalLayout() {
        if (this.a.d() && this.a.j.size() > 0 && !((a) this.a.j.get(0)).a.k()) {
            View view = this.a.q;
            if (view == null || !view.isShown()) {
                this.a.dismiss();
                return;
            }
            for (a aVar : this.a.j) {
                aVar.a.c();
            }
        }
    }
}
