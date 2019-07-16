package com.google.android.material.bottomnavigation;

import android.view.MenuItem;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.l.a;

/* compiled from: BottomNavigationView */
class d implements a {
    final /* synthetic */ BottomNavigationView a;

    d(BottomNavigationView bottomNavigationView) {
        this.a = bottomNavigationView;
    }

    public void a(l lVar) {
    }

    public boolean a(l lVar, MenuItem menuItem) {
        boolean z = true;
        if (this.a.f == null || menuItem.getItemId() != this.a.getSelectedItemId()) {
            if (this.a.e == null || this.a.e.a(menuItem)) {
                z = false;
            }
            return z;
        }
        this.a.f.a(menuItem);
        return true;
    }
}
