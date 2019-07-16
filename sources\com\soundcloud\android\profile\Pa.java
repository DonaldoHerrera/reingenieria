package com.soundcloud.android.profile;

import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.main.FragmentEnterScreenDispatcher;

/* compiled from: ProfilePresenter_Factory */
public final class Pa implements C4961HMa<ProfilePresenter> {
    private final C7054oVa<ProfileScrollHelper> a;
    private final C7054oVa<HPa> b;
    private final C7054oVa<C5836qa> c;
    private final C7054oVa<C5875ya> d;
    private final C7054oVa<C5604aua> e;
    private final C7054oVa<C2526g> f;
    private final C7054oVa<C3700b> g;
    private final C7054oVa<FragmentEnterScreenDispatcher> h;
    private final C7054oVa<C5606ava> i;

    public static ProfilePresenter a(Object obj, HPa hPa, Object obj2, C5875ya yaVar, C5604aua aua, C2526g gVar, C3700b bVar, FragmentEnterScreenDispatcher fragmentEnterScreenDispatcher, C5606ava ava) {
        ProfilePresenter profilePresenter = new ProfilePresenter((ProfileScrollHelper) obj, hPa, (C5836qa) obj2, yaVar, aua, gVar, bVar, fragmentEnterScreenDispatcher, ava);
        return profilePresenter;
    }

    public ProfilePresenter get() {
        ProfilePresenter profilePresenter = new ProfilePresenter((ProfileScrollHelper) this.a.get(), (HPa) this.b.get(), (C5836qa) this.c.get(), (C5875ya) this.d.get(), (C5604aua) this.e.get(), (C2526g) this.f.get(), (C3700b) this.g.get(), (FragmentEnterScreenDispatcher) this.h.get(), (C5606ava) this.i.get());
        return profilePresenter;
    }
}
