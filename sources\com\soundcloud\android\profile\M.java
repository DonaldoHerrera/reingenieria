package com.soundcloud.android.profile;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.soundcloud.android.ia.j;

/* compiled from: ProfileBucketsFragment.kt */
final class M extends C7540vYa implements PXa<StaggeredGridLayoutManager> {
    final /* synthetic */ ProfileBucketsFragment a;

    M(ProfileBucketsFragment profileBucketsFragment) {
        this.a = profileBucketsFragment;
        super(0);
    }

    public final StaggeredGridLayoutManager d() {
        return new StaggeredGridLayoutManager(this.a.getResources().getInteger(j.user_profile_card_grid_span_count), 1);
    }
}
