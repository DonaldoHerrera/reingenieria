package com.soundcloud.android.profile;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import androidx.fragment.app.Fragment;

/* renamed from: com.soundcloud.android.profile.i reason: case insensitive filesystem */
/* compiled from: BannerProfileScrollHelper */
class C5795i implements OnGlobalLayoutListener {
    final /* synthetic */ Fragment a;
    final /* synthetic */ BannerProfileScrollHelper b;

    C5795i(BannerProfileScrollHelper bannerProfileScrollHelper, Fragment fragment) {
        this.b = bannerProfileScrollHelper;
        this.a = fragment;
    }

    public void onGlobalLayout() {
        this.b.e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.b.a(this.a.getActivity());
    }
}
