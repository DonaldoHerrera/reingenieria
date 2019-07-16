package com.soundcloud.android.playback.playqueue;

import java.util.Collections;
import java.util.List;

/* compiled from: PlayQueueUIItemsUpdate */
public abstract class Za {
    public static Za a() {
        return new C4372ga(Collections.emptyList(), 1);
    }

    public static Za b() {
        return new C4372ga(Collections.emptyList(), 0);
    }

    public static Za c() {
        return new C4372ga(Collections.emptyList(), 2);
    }

    public static Za d() {
        return new C4372ga(Collections.emptyList(), 3);
    }

    public boolean e() {
        return g() == 2;
    }

    public abstract List<Va> f();

    public abstract int g();

    public Za a(List<Va> list) {
        return new C4372ga(list, g());
    }
}
