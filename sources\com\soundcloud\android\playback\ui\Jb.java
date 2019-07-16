package com.soundcloud.android.playback.ui;

import com.soundcloud.android.playback.C4518wb;
import com.soundcloud.android.playback.ui.view.PlayerTrackPager;

/* compiled from: PlayerPagerPresenter */
class Jb implements Xb {
    final /* synthetic */ PlayerTrackPager a;
    final /* synthetic */ PlayerPagerPresenter b;

    Jb(PlayerPagerPresenter playerPagerPresenter, PlayerTrackPager playerTrackPager) {
        this.b = playerPagerPresenter;
        this.a = playerTrackPager;
    }

    public void a() {
        this.b.m.b(C4518wb.FULL);
        PlayerTrackPager playerTrackPager = this.a;
        playerTrackPager.setCurrentItem(playerTrackPager.getCurrentItem() + 1);
    }

    public void b() {
        this.b.m.a(C4518wb.FULL);
        PlayerTrackPager playerTrackPager = this.a;
        playerTrackPager.setCurrentItem(playerTrackPager.getCurrentItem() - 1);
    }
}
