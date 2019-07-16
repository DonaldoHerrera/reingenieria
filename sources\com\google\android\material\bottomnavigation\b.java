package com.google.android.material.bottomnavigation;

import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.v;

/* compiled from: BottomNavigationMenuView */
class b implements OnClickListener {
    final /* synthetic */ BottomNavigationMenuView a;

    b(BottomNavigationMenuView bottomNavigationMenuView) {
        this.a = bottomNavigationMenuView;
    }

    public void onClick(View view) {
        p itemData = ((BottomNavigationItemView) view).getItemData();
        if (!this.a.z.a((MenuItem) itemData, (v) this.a.y, 0)) {
            itemData.setChecked(true);
        }
    }
}
