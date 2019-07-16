package com.soundcloud.android.collection.recentlyplayed;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.s;

/* compiled from: RecentlyPlayedItemDecoration.kt */
public final class F extends h {
    private final int a;

    public F(int i) {
        this.a = i;
    }

    public void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
        int i;
        int i2;
        C7471uYa.b(rect, "outRect");
        C7471uYa.b(view, "view");
        C7471uYa.b(recyclerView, "parent");
        C7471uYa.b(sVar, "state");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof GridLayoutManager.LayoutParams) {
            boolean z = true;
            int i3 = 0;
            if (((GridLayoutManager.LayoutParams) layoutParams).f() != 1) {
                z = false;
            }
            if (z) {
                i = 0;
            } else {
                i = -this.a;
            }
            rect.left = i;
            if (z) {
                i2 = 0;
            } else {
                i2 = -this.a;
            }
            rect.right = i2;
            rect.bottom = z ? this.a : 0;
            if (z) {
                i3 = this.a;
            }
            rect.top = i3;
        }
    }
}
