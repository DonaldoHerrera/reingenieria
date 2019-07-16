package com.soundcloud.android.collection.recentlyplayed;

import androidx.recyclerview.widget.GridLayoutManager.b;
import com.soundcloud.android.collection.recentlyplayed.E.a;

/* renamed from: com.soundcloud.android.collection.recentlyplayed.y reason: case insensitive filesystem */
/* compiled from: RecentlyPlayedFragment.kt */
public final class C2835y extends b {
    final /* synthetic */ RecentlyPlayedFragment c;
    final /* synthetic */ int d;

    C2835y(RecentlyPlayedFragment recentlyPlayedFragment, int i) {
        this.c = recentlyPlayedFragment;
        this.d = i;
    }

    public int b(int i) {
        if (((E) this.c.m.g(i)).f() == a.HEADER) {
            return this.d;
        }
        return 1;
    }
}
