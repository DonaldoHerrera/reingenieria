package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.l.a;
import androidx.appcompat.widget.O.b;

/* compiled from: PopupMenu */
class M implements a {
    final /* synthetic */ O a;

    M(O o) {
        this.a = o;
    }

    public void a(l lVar) {
    }

    public boolean a(l lVar, MenuItem menuItem) {
        b bVar = this.a.e;
        if (bVar != null) {
            return bVar.onMenuItemClick(menuItem);
        }
        return false;
    }
}
