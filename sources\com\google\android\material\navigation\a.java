package com.google.android.material.navigation;

import android.view.MenuItem;
import androidx.appcompat.view.menu.l;

/* compiled from: NavigationView */
class a implements androidx.appcompat.view.menu.l.a {
    final /* synthetic */ NavigationView a;

    a(NavigationView navigationView) {
        this.a = navigationView;
    }

    public void a(l lVar) {
    }

    public boolean a(l lVar, MenuItem menuItem) {
        com.google.android.material.navigation.NavigationView.a aVar = this.a.h;
        return aVar != null && aVar.a(menuItem);
    }
}
