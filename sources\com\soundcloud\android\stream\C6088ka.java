package com.soundcloud.android.stream;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.soundcloud.android.ia.j;

/* renamed from: com.soundcloud.android.stream.ka reason: case insensitive filesystem */
/* compiled from: StreamFragment.kt */
final class C6088ka extends C7540vYa implements PXa<StaggeredGridLayoutManager> {
    final /* synthetic */ StreamFragment a;

    C6088ka(StreamFragment streamFragment) {
        this.a = streamFragment;
        super(0);
    }

    public final StaggeredGridLayoutManager d() {
        return new StaggeredGridLayoutManager(this.a.getResources().getInteger(j.grids_num_columns), 1);
    }
}
