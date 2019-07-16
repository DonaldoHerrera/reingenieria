package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.z;

/* renamed from: androidx.appcompat.widget.g reason: case insensitive filesystem */
/* compiled from: ActionMenuPresenter */
class C0340g extends H {
    final /* synthetic */ ActionMenuPresenter j;
    final /* synthetic */ d k;

    C0340g(d dVar, View view, ActionMenuPresenter actionMenuPresenter) {
        this.k = dVar;
        this.j = actionMenuPresenter;
        super(view);
    }

    public z a() {
        e eVar = ActionMenuPresenter.this.z;
        if (eVar == null) {
            return null;
        }
        return eVar.b();
    }

    public boolean b() {
        ActionMenuPresenter.this.j();
        return true;
    }

    public boolean c() {
        ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
        if (actionMenuPresenter.B != null) {
            return false;
        }
        actionMenuPresenter.f();
        return true;
    }
}
