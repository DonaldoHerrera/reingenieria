package com.soundcloud.android.playback.ui;

import com.soundcloud.android.foundation.events.C3708j;

/* compiled from: PlayerTrackStateExtensions.kt */
public final class Qb {
    public static final C3708j a(Pb pb) {
        C7471uYa.b(pb, "$this$toEntityMetadata");
        String n = pb.n();
        C7471uYa.a((Object) n, "userName");
        C3508cda o = pb.o();
        C7471uYa.a((Object) o, "userUrn");
        String title = pb.getTitle();
        C7471uYa.a((Object) title, "title");
        C3508cda f = pb.f();
        C7471uYa.a((Object) f, "trackUrn");
        return new C3708j(n, o, title, f);
    }
}
