package com.soundcloud.android.view.bottomnav;

import android.view.MenuItem;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.l.a;

/* compiled from: ScBottomNavigationView */
class e implements a {
    final /* synthetic */ ScBottomNavigationView a;

    e(ScBottomNavigationView scBottomNavigationView) {
        this.a = scBottomNavigationView;
    }

    public void a(l lVar) {
    }

    public boolean a(l lVar, MenuItem menuItem) {
        boolean z = true;
        if (this.a.e == null || menuItem.getItemId() != this.a.getSelectedItemId()) {
            if (this.a.d == null || this.a.d.a(menuItem)) {
                z = false;
            }
            return z;
        }
        this.a.e.a(menuItem);
        return true;
    }
}
