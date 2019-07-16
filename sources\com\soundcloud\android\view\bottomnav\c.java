package com.soundcloud.android.view.bottomnav;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.p;

/* compiled from: ScBottomNavigationMenu */
public final class c extends l {
    c(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        s();
        MenuItem a = super.a(i, i2, i3, charSequence);
        if (a instanceof p) {
            ((p) a).c(true);
        }
        r();
        return a;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}
