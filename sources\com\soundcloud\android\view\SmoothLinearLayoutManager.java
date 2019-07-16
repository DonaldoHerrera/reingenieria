package com.soundcloud.android.view;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.r;
import androidx.recyclerview.widget.RecyclerView.s;

public class SmoothLinearLayoutManager extends LinearLayoutManager {
    public SmoothLinearLayoutManager(Context context) {
        super(context);
    }

    public void a(RecyclerView recyclerView, s sVar, int i) {
        O o = new O(this, recyclerView.getContext());
        o.c(i);
        b((r) o);
    }
}
