package com.soundcloud.android.playback.players;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: ListenerBridge.kt */
public final class c implements k {
    private static final Set<k> a = new LinkedHashSet();
    public static final c b = new c();

    private c() {
    }

    public final void a(k kVar) {
        C7471uYa.b(kVar, "playbackListener");
        a.add(kVar);
    }

    public void a(Ela ela) {
        C7471uYa.b(ela, "audioPerformanceEvent");
        for (k a2 : a) {
            a2.a(ela);
        }
    }

    public void a(Fla fla) {
        C7471uYa.b(fla, "error");
        for (k a2 : a) {
            a2.a(fla);
        }
    }

    public void a(Gla gla) {
        C7471uYa.b(gla, "playerNotFoundDiagnostics");
        for (k a2 : a) {
            a2.a(gla);
        }
    }
}
