package com.soundcloud.android.playback.ui;

import androidx.viewpager.widget.ViewPager.e;
import com.soundcloud.android.ads.Na;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.playback.ui.view.PlayerTrackPager;
import com.soundcloud.android.playback.ui.view.g;

/* compiled from: PlayerPagerScrollListener */
public class Lb implements e {
    private final C6849lVa<Integer> a = C6849lVa.d(1);
    private final g b;
    private final C3814lca c;
    private final Na d;
    private UPa e;
    private PlayerTrackPager f;
    private PlayerPagerPresenter g;
    private boolean h;

    Lb(C3814lca lca, g gVar, Na na) {
        this.c = lca;
        this.b = gVar;
        this.d = na;
    }

    private void c(int i) {
        if (i == 0) {
            this.h = false;
        }
    }

    public void a(int i, float f2, int i2) {
    }

    public void a(PlayerTrackPager playerTrackPager, PlayerPagerPresenter playerPagerPresenter) {
        this.f = playerTrackPager;
        this.g = playerPagerPresenter;
        this.f.setOnPageChangeListener(this);
        c();
    }

    public void b(int i) {
        q b2 = this.g.b(i);
        this.f.setPagingEnabled((b2.e() ^ true) || this.c.b(b2));
        this.h = true;
    }

    private void c() {
        this.e = new UPa();
        this.e.b((VPa) this.a.a((C7256rQa<? super T>) new H<Object>(this)).c(C5220Pua.a((C6776kQa<T>) new G<T>(this))));
    }

    public void a(int i) {
        this.a.a(Integer.valueOf(i));
        c(i);
    }

    public /* synthetic */ boolean b(Integer num) throws Exception {
        return !this.h && num.intValue() == 0 && this.d.d();
    }

    /* access modifiers changed from: 0000 */
    public APa<Integer> a() {
        return this.a.a((C7256rQa<? super T>) new I<Object>(this));
    }

    public void b() {
        this.e.dispose();
    }

    public /* synthetic */ void c(Integer num) throws Exception {
        this.b.b();
    }

    public /* synthetic */ boolean a(Integer num) throws Exception {
        return this.h && num.intValue() == 0;
    }
}
