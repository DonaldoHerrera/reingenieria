package com.soundcloud.android.collection;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager.LayoutParams;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.s;

/* compiled from: CollectionItemDecoration */
public class C extends h {
    private final int a;

    public C(int i) {
        this.a = i;
    }

    public void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
        int i;
        boolean z = true;
        if (((LayoutParams) view.getLayoutParams()).f() != 1) {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            i = -this.a;
        }
        rect.left = i;
        rect.right = 0;
        rect.bottom = 0;
        rect.top = 0;
    }
}
