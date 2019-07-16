package com.soundcloud.android.main;

import com.soundcloud.android.deeplinks.i;

/* compiled from: MainNavigationPresenter_Factory */
public final class V implements C4961HMa<MainNavigationPresenter> {
    private final C7054oVa<C4834DJa> a;
    private final C7054oVa<C4581ija> b;
    private final C7054oVa<i> c;
    private final C7054oVa<C2436_U> d;
    private final C7054oVa<MainNavigationView> e;

    public static MainNavigationPresenter a(C4834DJa dJa, C4581ija ija, i iVar, C2436_U _u, MainNavigationView mainNavigationView) {
        MainNavigationPresenter mainNavigationPresenter = new MainNavigationPresenter(dJa, ija, iVar, _u, mainNavigationView);
        return mainNavigationPresenter;
    }

    public MainNavigationPresenter get() {
        MainNavigationPresenter mainNavigationPresenter = new MainNavigationPresenter((C4834DJa) this.a.get(), (C4581ija) this.b.get(), (i) this.c.get(), (C2436_U) this.d.get(), (MainNavigationView) this.e.get());
        return mainNavigationPresenter;
    }
}
