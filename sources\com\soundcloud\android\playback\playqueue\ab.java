package com.soundcloud.android.playback.playqueue;

import com.soundcloud.android.view.SmoothScrollLinearLayoutManager;

/* compiled from: PlayQueueView_Factory */
public final class ab implements C4961HMa<PlayQueueView> {
    private final C7054oVa<Pa> a;
    private final C7054oVa<Sa> b;
    private final C7054oVa<C5052KJa> c;
    private final C7054oVa<SmoothScrollLinearLayoutManager> d;
    private final C7054oVa<C2014EO> e;
    private final C7054oVa<fb> f;
    private final C7054oVa<C4378ja> g;
    private final C7054oVa<C4384ma> h;

    public static PlayQueueView a(Object obj, Object obj2, C5052KJa kJa, SmoothScrollLinearLayoutManager smoothScrollLinearLayoutManager, C2014EO eo, Object obj3, Object obj4, Object obj5) {
        PlayQueueView playQueueView = new PlayQueueView((Pa) obj, (Sa) obj2, kJa, smoothScrollLinearLayoutManager, eo, (fb) obj3, (C4378ja) obj4, (C4384ma) obj5);
        return playQueueView;
    }

    public PlayQueueView get() {
        PlayQueueView playQueueView = new PlayQueueView((Pa) this.a.get(), (Sa) this.b.get(), (C5052KJa) this.c.get(), (SmoothScrollLinearLayoutManager) this.d.get(), (C2014EO) this.e.get(), (fb) this.f.get(), (C4378ja) this.g.get(), (C4384ma) this.h.get());
        return playQueueView;
    }
}
