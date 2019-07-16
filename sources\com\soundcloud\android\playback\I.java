package com.soundcloud.android.playback;

import java.util.HashSet;

/* compiled from: AudioPortTracker.kt */
public final class I extends HashSet<C4415ra> {
    public static final I a = new I();

    private I() {
    }

    public /* bridge */ boolean a(C4415ra raVar) {
        return super.contains(raVar);
    }

    public /* bridge */ boolean b(C4415ra raVar) {
        return super.remove(raVar);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C4415ra) {
            return a((C4415ra) obj);
        }
        return false;
    }

    public /* bridge */ int i() {
        return super.size();
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C4415ra) {
            return b((C4415ra) obj);
        }
        return false;
    }

    public final /* bridge */ int size() {
        return i();
    }
}
