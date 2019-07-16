package com.google.android.material.internal;

import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.v;

/* compiled from: NavigationMenuPresenter */
class j implements OnClickListener {
    final /* synthetic */ NavigationMenuPresenter a;

    j(NavigationMenuPresenter navigationMenuPresenter) {
        this.a = navigationMenuPresenter;
    }

    public void onClick(View view) {
        NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
        this.a.b(true);
        p itemData = navigationMenuItemView.getItemData();
        NavigationMenuPresenter navigationMenuPresenter = this.a;
        boolean a2 = navigationMenuPresenter.d.a((MenuItem) itemData, (v) navigationMenuPresenter, 0);
        if (itemData != null && itemData.isCheckable() && a2) {
            this.a.f.a(itemData);
        }
        this.a.b(false);
        this.a.a(false);
    }
}
