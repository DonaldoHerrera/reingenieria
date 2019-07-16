package com.soundcloud.android.playback.ui.view;

import com.soundcloud.android.ia.p;
import com.soundcloud.android.playback.C4416rb;
import com.soundcloud.android.playback.C4536zc.a;

/* compiled from: PlaybackFeedbackHelper */
public class g {
    private final C4416rb a;
    private final C5052KJa b;

    public g(C4416rb rbVar, C5052KJa kJa) {
        this.a = rbVar;
        this.b = kJa;
    }

    private void c() {
        this.b.a(new Fca(p.playback_missing_playable_tracks));
    }

    private void d() {
        this.b.a(new Fca(p.offline_track_not_available));
    }

    private void e() {
        this.b.a(new Fca(p.cast_unable_play_track));
    }

    public void a(a aVar) {
        int i = f.a[aVar.ordinal()];
        if (i == 1) {
            b();
        } else if (i == 2) {
            d();
        } else if (i == 3) {
            c();
        } else if (i == 4) {
            e();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown error reason: ");
            sb.append(aVar);
            throw new IllegalStateException(sb.toString());
        }
    }

    public void b() {
        this.b.a(new Fca(this.a.isPlaying() ? p.ads_ad_in_progress : p.ads_resume_playing_ad_to_continue));
    }

    public void a() {
        this.b.a(new Fca(p.concurrent_streaming_stopped));
    }
}
