package androidx.appcompat.app;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar.b;

/* compiled from: ToolbarActionBar */
class E implements b {
    final /* synthetic */ F a;

    E(F f) {
        this.a = f;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        return this.a.c.onMenuItemSelected(0, menuItem);
    }
}
