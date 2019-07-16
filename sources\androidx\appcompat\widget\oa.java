package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView.d;
import androidx.appcompat.widget.Toolbar.b;

/* compiled from: Toolbar */
class oa implements d {
    final /* synthetic */ Toolbar a;

    oa(Toolbar toolbar) {
        this.a = toolbar;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        b bVar = this.a.G;
        if (bVar != null) {
            return bVar.onMenuItemClick(menuItem);
        }
        return false;
    }
}
